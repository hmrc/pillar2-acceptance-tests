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

import org.scalatest.concurrent.Eventually
import org.scalatest.time.{Seconds, Span}
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage.thirdPartyApp
import play.api.libs.json.Json
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage._
import AuthLoginStub._
import MultiFactorAuth.completeMultiFactorAuthenticationIfRequired

object OAuth extends Eventually {

  private implicit val patience: PatienceConfig =
    PatienceConfig(timeout = Span(3, Seconds), interval = Span(0.3, Seconds))

  def requestAccessToken(oauthCode: String): String = {

    val jsonBody: String = Json
      .parse(s"""
         |{
         |  "client_id": "${thirdPartyApp.clientId}",
         |  "client_secret": "${thirdPartyApp.clientSecret}",
         |  "grant_type": "authorization_code",
         |  "code": "$oauthCode",
         |  "redirect_uri": "${thirdPartyApp.redirectUrl}"
         |}
      """.stripMargin)
      .toString

    val urlEncodedBody: String =
      s"client_id=${thirdPartyApp.clientId}" +
        s"&client_secret=${thirdPartyApp.clientSecret}" +
        s"&grant_type=authorization_code" +
        s"&code=$oauthCode" +
        s"&redirect_uri=${thirdPartyApp.redirectUrl}"

    response =
      if (env == "qa") getHttpWithTimeout(s"$oauthApiUrl/token").postData(urlEncodedBody).headers(contentTypeUrlEncodedHeader).asString
      else getHttpWithTimeout(s"$oauthApiUrl/token").postData(jsonBody).headers(contentTypeHeader).asString

    val accessToken: String = "Bearer " + response.body.split("\"access_token\":\"")(1).split("\"")(0)

    accessToken
  }

  def grantAuthorityToVendorWithLoginStub(affinityGroup: String, identifier: String, mtditid: String = ""): String = {
    if (affinityGroup == AffinityGroup.Agent) loginAgentUsingAuthLoginStub(identifier)
    else loginClientUsingAuthLoginStub(affinityGroup, identifier, mtditid)

    confirmUrl(s"$oauthFrontendUrl/start")
    findElementByCssSelector("[data-module=govuk-button]").click()

    confirmUrl(s"$oauthFrontendUrl/whatYouWillNeed")
    findElementByCssSelector("[data-module=govuk-button]").click()

    completeMultiFactorAuthenticationIfRequired()

    confirmUrl(s"$oauthFrontendUrl/grantscope")
    findElementById("givePermission").click()
    eventually(oauthCodeFromURL())
  }

  def grantAuthorityToVendorWithPassword(userId: String, password: String): String = {
    navigateTo(oauthAuthorizeUrl)
    confirmUrl(s"$oauthFrontendUrl/start")
    findElementByCssSelector("[data-module=govuk-button]").click()

    confirmUrl(s"$oauthFrontendUrl/whatYouWillNeed")
    findElementByCssSelector("[data-module=govuk-button]").click()

    // Login
    findElementById("userId").sendKeys(userId)
    findElementById("password").sendKeys(password)
    findElementById("submit").click()

    // IV-Stub
    if (driver.getCurrentUrl contains "/iv-stub/confirm/proxy/") {
      findElementById("forNino").sendKeys(randomNino)
      findElementById("submit-continue").click()
    }

    confirmUrl(s"$oauthFrontendUrl/grantscope")

    // Check for agent error
    if (driver.getPageSource contains "You cannot access client data at the moment") {
      println("\n\n⚠️ ⚠️ ⚠️  Agents not working: You cannot access client data at the moment  ⚠️ ⚠️ ⚠️\n\n")
    }
    findElementById("givePermission").click()
    eventually(oauthCodeFromURL())
  }

  def setupVendorAccessToken: String = {

    val jsonBody: String = Json
      .parse(s"""
         |{
         |  "client_id": "${thirdPartyApp.clientId}",
         |  "client_secret": "${thirdPartyApp.clientSecret}",
         |  "grant_type": "client_credentials"
         |}
      """.stripMargin)
      .toString

    val urlEncodedBody: String =
      s"client_id=${thirdPartyApp.clientId}" +
        s"&client_secret=${thirdPartyApp.clientSecret}" +
        s"&grant_type=client_credentials"

    response =
      if (env == "qa") getHttpWithTimeout(s"$oauthApiUrl/token").postData(urlEncodedBody).headers(contentTypeUrlEncodedHeader).asString
      else getHttpWithTimeout(s"$oauthApiUrl/token").postData(jsonBody).headers(contentTypeHeader).asString

    val accessToken: String = "Bearer " + response.body.split("\"access_token\":\"")(1).split("\"")(0)

    accessToken
  }

  private def oauthCodeFromURL(): String =
    driver.getCurrentUrl.split("code=")(1).split("&")(0)

}
