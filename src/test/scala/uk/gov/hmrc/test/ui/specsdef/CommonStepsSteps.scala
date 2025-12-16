/*
 * Copyright 2025 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specsdef

import org.openqa.selenium.By
import org.scalatest.matchers.should.Matchers.shouldBe
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.helper.*
import uk.gov.hmrc.test.ui.helper.Nav.{isVisible, navigateTo}
import uk.gov.hmrc.test.ui.pages.*

object CommonStepsSteps {

  def givenLogsInWithoutPillar2Enrolment(): Unit = {
    AuthLoginOldPage.loginToUPE()
  }

  def whenIClickOnContinueButton(negate: String): Unit = {
    InitialGuidancePage.clickContinue()
  }

  def whenISelectCurrentAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectCurrentAccountingPeriod()
  }

  def whenISelectPreviousAccountingPeriodBTNSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodBTNSubmitted()
  }

  def whenISelectPreviousAccountingPeriodUKTRSubmitted(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriodUKTRSubmitted()
  }

  def thenISelectPreviousAccountingPeriod(): Unit = {
    BtnMultipleAccountingPage.selectPreviousAccountingPeriod()
  }

  def givenIAmOnPage(page: String): Unit = {
    page match {
      case "NFM registration failed error" =>
        navigateTo(NFMGRSRegistrationFailedErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(NFMGRSRegistrationFailedErrorPage.content)
        isVisible(By.cssSelector(NFMGRSRegistrationFailedErrorPage.header)) shouldBe true
      case "NFM registration not called error" =>
        navigateTo(NFMGRSRegistrationNotCalledErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(NFMGRSRegistrationNotCalledErrorPage.content)
        isVisible(By.cssSelector(NFMGRSRegistrationNotCalledErrorPage.header)) shouldBe true
      case "UPE registration failed error" =>
        navigateTo(UPEGRSRegistrationFailedErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(UPEGRSRegistrationFailedErrorPage.content)
        isVisible(By.cssSelector(UPEGRSRegistrationFailedErrorPage.header)) shouldBe true
      case "UPE registration not called error" =>
        navigateTo(UPEGRSRegistrationNotCalledErrorPage.url)
        Wait.waitForElementToPresentByCssSelector(UPEGRSRegistrationNotCalledErrorPage.content)
        isVisible(By.cssSelector(UPEGRSRegistrationNotCalledErrorPage.header)) shouldBe true
    }
  }

  def andIClickLink(linkText: String): Unit = {
    Input.clickByLinkText(linkText)
  }

  def andISelectOptionAndContinueToNext(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("value_0")
      case "No"  => Input.clickById("value_1")
    }
    InitialGuidancePage.clickContinue()
  }

  def andISelectNfmOptionAndContinueToNext(option: String): Unit = {
    option match {
      case "Yes" => Input.clickById("nominateFilingMember_0")
      case "No"  => Input.clickById("nominateFilingMember_1")
    }
    InitialGuidancePage.clickContinue()
  }

  def andIClickTheBrowserBackButton(): Unit = {
    Nav.browserBack()
  }

  def whenUserLogsInWithExistingEntityGroupAndForPillar2Service(
      userType: String,
      enrolmentKey: String,
      identifierName: String,
      identifierValue: String): Unit = {
    userType match {
      case "Organisation" => AuthLoginOldPage.loginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
      case "Agent"        => AuthLoginOldPage.agentLoginWithExistingEntity(enrolmentKey, identifierName, identifierValue)
    }
  }

  def addDelegatedEnrolments(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String): Unit = {
    AuthLoginOldPage.addDelegatedEnrolment(enrolmentKey, identifierName, identifierValue, authRule)
  }
}
