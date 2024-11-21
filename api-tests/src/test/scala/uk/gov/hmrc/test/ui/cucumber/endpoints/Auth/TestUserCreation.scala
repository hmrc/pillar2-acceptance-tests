/*
 * Copyright 2023 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package uk.gov.hmrc.test.ui.cucumber.endpoints.Auth

import play.api.libs.json.Json
import AgentAuthorisation.{acceptAgentAuthorisationInvite, createAgentAuthorisationInvite}
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage.{AffinityGroup, TaxPayer, randomNino}
import AuthLoginApi._
import CreateTestUser.createTestUser
import OAuth.{grantAuthorityToVendorWithLoginStub, grantAuthorityToVendorWithPassword, requestAccessToken}
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage._
import uk.gov.hmrc.test.ui.cucumber.utils.Json.JsonTools

object TestUserCreation extends JsonTools {

  /** ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒    Local user setup    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ */
  def createLocalTestUser(affinityGroup: String, supportingAgentEnrolment: Boolean = false): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup, supportingAgentEnrolment = supportingAgentEnrolment)
    TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
  }

  def createLocalTestUserWithInvalidNino(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup)
    if (affinityGroup != AffinityGroup.Agent) TaxPayer(randomNino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
    else TaxPayer(randomNino, newTaxPayer.mtditid, newTaxPayer.accessToken, newTaxPayer.agentReferenceNumber)
  }

  def createLocalTestUserWithNoMatchingMtditid(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup, invalidMtditid = true)
    if (affinityGroup != AffinityGroup.Agent) TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
    else TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, newTaxPayer.agentReferenceNumber)
  }

  def createLocalTestUserWithInvalidBearerToken(affinityGroup: String): TaxPayer = {
    val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup)
    if (affinityGroup != AffinityGroup.Agent) TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, "Bearer invalid", None)
    else TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, "Bearer invalid", newTaxPayer.agentReferenceNumber)
  }

  def createLocalTestUserWithInvalidEnrolment(affinityGroup: String): TaxPayer = {
    if (affinityGroup != AffinityGroup.Agent) {
      val newTaxPayer = createLocalTestUserWithAuthLoginApi(affinityGroup, clientEnrolled = false)
      TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, None)
    } else {
      val newTaxPayer = createLocalTestUserWithAuthLoginApi(AffinityGroup.Agent, agentEnrolled = false)
      TaxPayer(newTaxPayer.nino, newTaxPayer.mtditid, newTaxPayer.accessToken, newTaxPayer.agentReferenceNumber)
    }
  }

  def createLocalAgentNotAuthorisedForClient(): TaxPayer = {
    val agent           = createLocalTestUserWithAuthLoginApi(AffinityGroup.Agent)
    val unrelatedClient = createLocalTestUserWithAuthLoginApi(AffinityGroup.Organisation)
    TaxPayer(unrelatedClient.nino, unrelatedClient.mtditid, agent.accessToken, agent.agentReferenceNumber)
  }

  /** ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ Api Platform user setup ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ */
  def createUserAuthorisedOnApiPlatform(affinityGroup: String): TaxPayer = {
    val clientCreateTestUser = createTestUser(affinityGroup)
    val userId               = retrieveJsonValue(clientCreateTestUser, "userId")
    val password             = retrieveJsonValue(clientCreateTestUser, "password")
    val nino                 = retrieveJsonValue(clientCreateTestUser, "nino")
    val mtditid              = retrieveJsonValue(clientCreateTestUser, "mtdItId")
    val oauthCode =
      if (env == "development" || env == "externaltest") {
        grantAuthorityToVendorWithPassword(userId, password)
      } else {
        grantAuthorityToVendorWithLoginStub(affinityGroup, nino, mtditid)
      }
    val accessToken = requestAccessToken(oauthCode)

    TaxPayer(nino, mtditid, accessToken, None)
  }

  def createAgentUserAuthorisedOnApiPlatform(supportingAgentEnrolment: Boolean = false): TaxPayer = {
    val agentCreateTestUser = createTestUser(AffinityGroup.Agent)
    val userId              = retrieveJsonValue(agentCreateTestUser, "userId")
    val password            = retrieveJsonValue(agentCreateTestUser, "password")
    val arn                 = retrieveJsonValue(agentCreateTestUser, "agentServicesAccountNumber")
    val oauthCode =
      if (env == "development" || env == "externaltest") {
        grantAuthorityToVendorWithPassword(userId, password)
      } else {
        grantAuthorityToVendorWithLoginStub(AffinityGroup.Agent, arn)
      }
    val accessToken          = requestAccessToken(oauthCode)
    val clientCreateTestUser = createTestUser(AffinityGroup.Individual)
    val nino                 = retrieveJsonValue(clientCreateTestUser, "nino")
    val mtditid              = retrieveJsonValue(clientCreateTestUser, "mtdItId")
    val individualDetails    = retrieveJsonValue(clientCreateTestUser, "individualDetails")
    val knownFact            = individualDetails.split("postcode:")(1).split("}")(0)
    val inviteId             = createAgentAuthorisationInvite(arn, accessToken, nino, knownFact, supportingAgentEnrolment)

    acceptAgentAuthorisationInvite(inviteId)
    TaxPayer(nino, mtditid, accessToken, Some(arn))
  }

  def generateAccessTokenOnApiPlatform(affinityGroup: String, nino: String, mtditid: String): TaxPayer = {
    val oauthCode   = grantAuthorityToVendorWithLoginStub(affinityGroup, nino, mtditid)
    val accessToken = requestAccessToken(oauthCode)

    TaxPayer(nino, mtditid, accessToken, None)
  }

  def retrieveMtditid(nino: String): String = {
    val ifsUrl = s"https://admin.qa.tax.service.gov.uk/ifs/registration/business-details/nino/$nino" // API #5 Get Business Details
    val headers = Map(
      "Authorization" -> "Bearer gKkhp6kNODVyLmTxKjzXqMll6ZmQR8gV",
      "Environment"   -> "ist0"
    )
    val response = getHttpWithTimeout(ifsUrl).headers(headers).asString
    withClue(s"Call to IFS API failed - $ifsUrl -") {
      response.code shouldBe 200
    }
    val mtditid = (Json.parse(response.body) \ "taxPayerDisplayResponse" \ "mtdId").get.toString.replaceAll("\"", "")
    mtditid
  }

  /** ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒     Print config    ▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒ */
  def printTaxPayer(): Unit = {
    if (printConfig)
      println(
        "\n\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" +
          "\nTax Payer" +
          s"\n  nino: ${taxPayer.nino}" +
          s"\n  mtditid: ${taxPayer.mtditid}" +
          s"\n  accessToken: ${taxPayer.accessToken}" +
          s"\n  agentReferenceNumber: ${taxPayer.agentReferenceNumber}" +
          "\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░")
  }

}
