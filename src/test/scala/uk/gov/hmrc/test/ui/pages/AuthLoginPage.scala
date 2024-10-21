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

package uk.gov.hmrc.test.ui.pages

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber._

object AuthLoginPage extends BasePage with PageObject {
  val url: String = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val frontEndUrl: String = TestConfiguration.url("pillar2-frontend")
  val incorrectUrl: String =
    TestConfiguration.url("pillar2-frontend") + "randomUrl"
  val submissionFrontEndUrl: String =
    TestConfiguration.url("pillar2-submission-frontend")
  val frontEndSubscribeUrl: String =
    s"$rootUrl" + "check-progress/register-your-group"
  val frontEndBtaUrl: String = s"$rootUrl" + "bta/pillar2-id"
  val frontEndUPEUrl: String =
    s"$rootUrl" + "business-matching/ultimate-parent/registered-in-uk"
  val frontEndUPEOrgTypeUrl: String =
    s"$rootUrl" + "business-matching/ultimate-parent/uk-based/entity-type"
  val redirectUrlField: String    = "redirectionUrl"
  val redirectionUrlField: String = "#redirectionUrl"
  val credIdField: String         = "authorityId"
  val frontEndNameUrl: String =
    s"$rootUrl" + "business-matching/ultimate-parent/no-id/input-name"
  val frontEndCAUrl: String =
    s"$rootUrl" + "business-matching/ultimate-parent/no-id/check-answers"
  val frontEndUPERegTypeUrl: String =
    s"$rootUrl" + "business-matching/ultimate-parent/registered-in-uk"
  val frontEndNFMNameUrl: String =
    s"$rootUrl" + "business-matching/filing-member/no-id/input-name"
  val frontEndNFMOrgTypeUrl: String =
    s"$rootUrl" + "business-matching/filing-member/uk-based/entity-type"
  val frontEndNFMAddressUrl: String =
    s"$rootUrl" + "business-matching/filing-member/no-id/input-address "
  val frontEndNFMContactNameUrl: String =
    s"$rootUrl" + "business-matching/filing-member/no-id/input-business-name"
  val frontEndNFMContactEmailUrl: String =
    s"$rootUrl" + "business-matching/filing-member/no-id/input-email"
  val frontEndNFMTelephoneUrl: String =
    s"$rootUrl" + "business-matching/filing-member/no-id/telephone"
  val frontEndNFMTelephoneInputUrl: String =
    s"$rootUrl" + "business-matching/filing-member/no-id/input-telephone"
  val frontEndFDGroupStatusUrl: String =
    s"$rootUrl" + "further-details/group-status"
  val frontEndFDAccountPeriod: String =
    s"$rootUrl" + "further-details/accounting-period"
  val frontEndCDAddressUrl: String =
    s"$rootUrl" + "contact-details/address/input"
  val frontEndNFMCAUrl: String =
    s"$rootUrl" + "business-matching/filing-member/no-id/check-answers"
  val frontEndFDCAUrl: String = s"$rootUrl" + "further-details/check-answers"
  val frontEndCDCAUrl: String = s"$rootUrl" + "contact-details/check-answers"
  val frontEndFinalReviewCAUrl: String =
    s"$rootUrl" + "review-submit/check-answers"
  val frontEndSubUrl: String       = s"$rootUrl" + "review-submit/confirmation"
  val frontEndDashboardUrl: String = s"$rootUrl" + "pillar2-top-up-tax-home"
  val frontEndASAUrl: String       = s"$rootUrl" + "asa/input-pillar-2-id"
  val rfmUrl: String =
    s"$rootUrl" + "replace-filing-member/security/enter-pillar2-id"
  val enrolmentKeyField: String             = "enrolment[0].name"
  val identifierNameField: String           = "input-0-0-name"
  val identifierValueField: String          = "input-0-0-value"
  val delegatedEnrolmentKeyField: String    = "delegatedEnrolment[0].key"
  val delegatedIdentifierNameField: String  = "input-delegated-0-0-name"
  val delegatedIdentifierValueField: String = "input-delegated-0-0-value"
  val delegatedAuthRuleField: String = "delegatedEnrolment[0].delegatedAuthRule"
  val addDelegatedEnrolmentCTA: String = "[onclick='addDelegatedEnrolment()']"

  def loginWithUser(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginWithUserToRFM(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginWithUserToRFMWithCredId(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginAsUserWithCredId(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToOrgWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUPEOrgTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }
  def loginToNfmOrgWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMOrgTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }
  def loginToRegWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUPERegTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }
  def loginToSubscribe(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndSubscribeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginUsingBta(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndBtaUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToUPE(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUPEUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToUPEName(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMNameWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToCA(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMCA(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToFDCA(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndFDCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToCDCA(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndCDCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToFinalCA(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndFinalReviewCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToUPEWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUPEUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginAsInd(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    clickSubmitButton()
  }

  def loginAsOrgToASA(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginAsIndToASA(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    selectAffinityGroupIndividual()
    clickSubmitButton()
  }

  def loginAsAssistantToASA(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton()
  }

  def loginAsIndToRFM(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    clickSubmitButton()
  }

  def loginAsAgent(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupAgent()
    clickSubmitButton()
  }

  def loginAsAgentToRFM(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupAgent()
    clickSubmitButton()
  }

  def loginAssistant(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton()
  }

  def loginAssistantToRFM(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton()
  }

  def loginToNFMName(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToDashboard(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndDashboardUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMAddress(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMAddressUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMInputAddress(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMAddressUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMContactName(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMContactNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMContactEmail(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMContactEmailUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }
  def loginToNFMEmail(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMContactEmailUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }
  def loginToNFMTelephone(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMTelephoneUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }
  def loginToNFMTelephoneInput(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMTelephoneInputUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToFDGroupStatus(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndFDGroupStatusUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginWithExistingEntity(
      enrolmentKey: String,
      identifierName: String,
      identifierValue: String
  ): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndDashboardUrl, redirectUrlField)
    Input.sendKeysById(enrolmentKeyField, enrolmentKey)
    Input.sendKeysById(identifierNameField, identifierName)
    Input.sendKeysById(identifierValueField, identifierValue)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def agentLoginWithExistingEntity(
      enrolmentKey: String,
      identifierName: String,
      identifierValue: String
  ): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    Input.sendKeysById(enrolmentKeyField, enrolmentKey)
    Input.sendKeysById(identifierNameField, identifierName)
    Input.sendKeysById(identifierValueField, identifierValue)
    selectAffinityGroupAgent()
  }

  def loginWithExistingEntityWithRFM(
      enrolmentKey: String,
      identifierName: String,
      identifierValue: String
  ): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    Input.sendKeysById(enrolmentKeyField, enrolmentKey)
    Input.sendKeysById(identifierNameField, identifierName)
    Input.sendKeysById(identifierValueField, identifierValue)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def addDelegatedEnrolment(
      enrolmentkey: String,
      identifiername: String,
      identifiervalue: String,
      authRule: String
  ): Unit = {
    clickAddDelegatedEnrolmentCTA()
    Input.sendKeysByName(enrolmentkey, delegatedEnrolmentKeyField)
    Input.sendKeysById(delegatedIdentifierNameField, identifiername)
    Input.sendKeysById(delegatedIdentifierValueField, identifiervalue)
    Input.sendKeysById(delegatedAuthRuleField, authRule)
    clickSubmitButton()
  }

  private def selectAffinityGroupOrg() =
    new Select(findAffinityGroup()).selectByVisibleText("Organisation")

  private def selectAffinityGroupAgent() =
    new Select(findAffinityGroup()).selectByVisibleText("Agent")

  private def selectAffinityGroupIndividual() =
    new Select(findAffinityGroup()).selectByVisibleText("Individual")

  private def selectCredRoleAssistant() =
    new Select(findCredentialRole()).selectByVisibleText("Assistant")

  private def findAffinityGroup() = Find.findByName("affinityGroup")

  private def findCredentialRole() = Find.findByName("credentialRole")

  def clickSubmitButton(): Unit = Find.findById("submit").click()

  def clickAddDelegatedEnrolmentCTA(): Unit =
    Find.findByCss(addDelegatedEnrolmentCTA).click()

}
