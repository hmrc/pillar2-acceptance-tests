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

package uk.gov.hmrc.test.ui.specs

import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.specpages.AuthLoginPage.login
import uk.gov.hmrc.test.ui.specpages.upe._
import uk.gov.hmrc.test.ui.tags.Tests

class UPENoIDFLowPageSpec extends BaseSpec with Matchers {

  Feature("UPE NO ID journey") {

    Scenario("User adds a Non-UK UPE and then makes amendments on the check your answers page", Tests) {
      Given("Organisation User logs in without enrollment")
      login(
        userType = "Organisation",
        pageUrl = "upe"
      )

      And("The user adds an Ultimate Parent Entity with a non-UK Address")
      UPERegisteredInUkPage.registeredInUkNo()
      UPENamePage.enterName()
      UPEAddressPage.enterAddressNonUK()
      UPEContactNamePage.enterName()
      UPEEmailPage.enterEmail()
      UPEPhoneAsContactPage.selectYes()
      UPEPhoneInputPage.enterPhoneNumber()

      And("The user amends Entity name via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeName)
      UPENamePage.updateName()

      And("The user amends Address town via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeAddress)
      UPEAddressPage.updateAddressNonUK()

      And("The user amends contact name via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeContactName)
      UPEContactNamePage.updateName()

      And("The user amends email address via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changeEmailAddress)
      UPEEmailPage.updateEmail()

      And("The user amends contact phone number via the Check your answers page")
      UPECheckYourAnswersPage.clickChangeLink(UPECheckYourAnswersPage.changePhoneNumber)
      UPEPhoneInputPage.updatePhoneNumber()

      Then("The user continues to the task list")
      UPECheckYourAnswersPage.continueToNextPage()
    }
  }
}
