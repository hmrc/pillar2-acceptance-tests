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

package uk.gov.hmrc.test.ui.specpages

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.Input.{sendKeysById, sendKeysByName}
import uk.gov.hmrc.test.ui.cucumber._
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.specpages.btn.BtnStartPage
import uk.gov.hmrc.test.ui.specpages.eligibility.EligibilityUPEPage
import uk.gov.hmrc.test.ui.specpages.rfm.RFMStartPage

object AuthLoginPage extends BrowserDriver with PageObject {
  val url: String                           = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val frontEndUrl: String                   = TestConfiguration.url("pillar2-frontend")
  val incorrectUrl: String                  = TestConfiguration.url("pillar2-frontend") + "randomUrl"
  val redirectUrlField: String              = "redirectionUrl"
  val redirectionUrlField: String           = "#redirectionUrl"
  val credIdField: String                   = "authorityId"
  val groupIdField: String                  = "groupIdentifier"
  val frontEndDashboardUrl: String          = s"$rootUrl" + "pillar2-top-up-tax-home"
  val frontEndASAUrl: String                = s"$rootUrl" + "asa/input-pillar-2-id"
  val enrolmentKeyField: String             = "enrolment[0].name"
  val identifierNameField: String           = "input-0-0-name"
  val identifierValueField: String          = "input-0-0-value"
  val delegatedEnrolmentKeyField: String    = "delegatedEnrolment[0].key"
  val delegatedIdentifierNameField: String  = "input-delegated-0-0-name"
  val delegatedIdentifierValueField: String = "input-delegated-0-0-value"
  val delegatedAuthRuleField: String        = "delegatedEnrolment[0].delegatedAuthRule"
  val addDelegatedEnrolmentCTA: String      = "#js-add-delegated-enrolment"

  case class Enrolment(enrolmentKey: String, identifierName: String, identifierValue: String)
  case class DelegatedEnrolment(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String)

  def login(
      userType: String,
      pageUrl: String,
      enrolment: Option[Enrolment] = None,
      delegatedEnrolment: Option[DelegatedEnrolment] = None,
      credId: String = "",
      credRole: String = "User",
      groupId: String = ""
  ): Unit = {
    val matchedUrl = urlMatch(pageUrl)
    Nav.navigateTo(url)
    Input.sendKeysByName(credId, credIdField)
    Input.sendKeysByName(matchedUrl, redirectUrlField)
    selectAffinityGroup(userType)
    selectCredRole(credRole)
    addGroupId(groupId)
    enrolment.foreach { e =>
      addEnrolment(e.enrolmentKey, e.identifierName, e.identifierValue)
    }
    delegatedEnrolment.foreach { e =>
      addDelegatedEnrolment(e.enrolmentKey, e.identifierName, e.identifierValue, e.authRule)
    }

    clickSubmitButton()
  }

  def urlMatch(page: String): String = {
    page match {
      case "asa"              => s"${rootUrl}asa/input-pillar-2-id"
      case "bta"              => s"${rootUrl}bta/pillar2-id"
      case "btn"              => BtnStartPage.url
      case "eligibility"      => EligibilityUPEPage.url
      case "pillar2-frontend" => TestConfiguration.url("pillar2-frontend")
//      case "rfm"                 => s"${rootUrl}replace-filing-member/security/enter-pillar2-id"
      case "rfm"                 => RFMStartPage.url
      case "register"            => TaskListPage.url
      case "upe"                 => s"${rootUrl}business-matching/ultimate-parent/registered-in-uk"
      case "dashboard"           => s"${rootUrl}pillar2-top-up-tax-home"
      case "further-details-cya" => s"${rootUrl}further-details/check-answers"
      case "contact-details-cya" => s"${rootUrl}contact-details/check-answers"
    }
  }

  def addEnrolment(enrolmentKey: String, identifierName: String, identifierValue: String): Unit = {
    sendKeysById(enrolmentKeyField, enrolmentKey)
    sendKeysById(identifierNameField, identifierName)
    sendKeysById(identifierValueField, identifierValue)
  }

  def addDelegatedEnrolment(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String): Unit = {
    clickAddDelegatedEnrolmentCTA()
    sendKeysByName(enrolmentKey, delegatedEnrolmentKeyField)
    sendKeysById(delegatedIdentifierNameField, identifierName)
    sendKeysById(delegatedIdentifierValueField, identifierValue)
    sendKeysById(delegatedAuthRuleField, authRule)
  }

  private def addGroupId(groupId: String): Unit = {
    Input.sendKeysById(groupIdField, groupId)
  }
  private def selectAffinityGroup(userType: String): Unit =
    new Select(findAffinityGroup()).selectByVisibleText(userType)

  private def selectCredRole(role: String): Unit =
    new Select(findCredentialRole()).selectByVisibleText(role)

  private def selectAffinityGroupOrg(): Unit =
    new Select(findAffinityGroup()).selectByVisibleText("Organisation")

  private def findAffinityGroup() = Find.findByName("affinityGroup")

  def clickSubmitButton(): Unit = Find.findById("submit").click()

  private def selectAffinityGroupAgent(): Unit =
    new Select(findAffinityGroup()).selectByVisibleText("Agent")

  private def findCredentialRole() = Find.findByName("credentialRole")

  def loginWithExistingEntity(enrolmentKey: String, identifierName: String, identifierValue: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndDashboardUrl, redirectUrlField)
    Input.sendKeysById(enrolmentKeyField, enrolmentKey)
    Input.sendKeysById(identifierNameField, identifierName)
    Input.sendKeysById(identifierValueField, identifierValue)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def agentLoginWithExistingEntity(enrolmentKey: String, identifierName: String, identifierValue: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    Input.sendKeysById(enrolmentKeyField, enrolmentKey)
    Input.sendKeysById(identifierNameField, identifierName)
    Input.sendKeysById(identifierValueField, identifierValue)
    selectAffinityGroupAgent()
  }

  def addDelegatedEnrolmentOld(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String): Unit = {
    clickAddDelegatedEnrolmentCTA()
    Input.sendKeysByName(enrolmentKey, delegatedEnrolmentKeyField)
    Input.sendKeysById(delegatedIdentifierNameField, identifierName)
    Input.sendKeysById(delegatedIdentifierValueField, identifierValue)
    Input.sendKeysById(delegatedAuthRuleField, authRule)
    clickSubmitButton()
  }

  def clickAddDelegatedEnrolmentCTA(): Unit = Find.findByCss(addDelegatedEnrolmentCTA).click()

}
