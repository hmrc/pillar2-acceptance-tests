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

package uk.gov.hmrc.test.ui.pages.auth

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.helper.Input._
import uk.gov.hmrc.test.ui.helper.{Find, Input, Nav}
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.asa.ASAPillar2InputPage
import uk.gov.hmrc.test.ui.pages.bta.BTAPillar2IDCheckPage
import uk.gov.hmrc.test.ui.pages.btn.BtnStartPage
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.eligibility.EligibilityUPEPage
import uk.gov.hmrc.test.ui.pages.rfm.RFMStartPage

//import uk.gov.hmrc.test.ui.specpages.rfm.{RFMConfirmationPage, RFMStartPage}
//import uk.gov.hmrc.test.ui.specpages.upe.UPERegisteredInUkPage

object AuthLoginPage extends BrowserDriver with BasePage {
  val url: String                           = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val frontEndUrl: String                   = TestConfiguration.url("pillar2-frontend")
  val incorrectUrl: String                  = TestConfiguration.url("pillar2-frontend") + "randomUrl"
  val redirectUrlField: String              = "redirectionUrl"
  val credIdField: String                   = "authorityId"
  val groupIdField: String                  = "groupIdentifier"
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
      case "asa"              => ASAPillar2InputPage.url
      case "bta"              => BTAPillar2IDCheckPage.url
      case "btn"              => BtnStartPage.url
      case "dashboard"        => DashboardPage.url
      case "eligibility"      => EligibilityUPEPage.url
      case "pillar2-frontend" => TestConfiguration.url("pillar2-frontend")
      case "rfm"              => RFMStartPage.url
//      case "register"            => TaskListPage.url
//      case "upe"                 => UPERegisteredInUkPage.url

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

  private def addGroupId(groupId: String): Unit = { Input.sendKeysById(groupIdField, groupId) }

  private def selectAffinityGroup(userType: String): Unit = new Select(findAffinityGroup()).selectByVisibleText(userType)

  private def selectCredRole(role: String): Unit = new Select(findCredentialRole()).selectByVisibleText(role)

  private def findAffinityGroup() = Find.findByName("affinityGroup")

  private def findCredentialRole() = Find.findByName("credentialRole")

  private def clickAddDelegatedEnrolmentCTA(): Unit = Find.findByCss(addDelegatedEnrolmentCTA).click()

  def clickSubmitButton(): Unit = Find.findById("submit").click()
}
