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

import org.openqa.selenium.By

object NFMUKCompanyGRSPage extends BasePage {
  override val url: String = s"$baseUrl" + "test-only/stub-grs-journey-data?continueUrl=normalmode/fm&entityType=ukLimitedCompany"

  private val registrationSuccessBvDisabled: By           = By.id("registrationSuccessBvDisabled")
  private val registrationSuccessBvEnabled: By            = By.id("registrationSuccessBvEnabled")
  private val registrationFailedPartyTypeMismatch: By     = By.id("registrationFailedPartyTypeMismatch")
  private val registrationFailedGeneric: By               = By.id("registrationFailedGeneric")
  private val registrationNotCalledIdentifierMismatch: By = By.id("registrationNotCalledIdentifierMismatch")
  private val registrationNotCalledBvFailed: By           = By.id("registrationNotCalledBvFailed")

  def clickRegistrationSuccessBvDisabled(): Unit = {
    onPage()
    click(registrationSuccessBvDisabled)
    clickButtonByText(buttonSaveAndContinue)
  }

  def clickRegistrationSuccessBvEnabled(): Unit = {
    onPage()
    click(registrationSuccessBvEnabled)
    clickButtonByText(buttonSaveAndContinue)
  }

  def clickRegistrationFailedPartyTypeMismatch(): Unit = {
    onPage()
    click(registrationFailedPartyTypeMismatch)
    clickButtonByText(buttonSaveAndContinue)
  }

  def clickRegistrationFailedGeneric(): Unit = {
    onPage()
    click(registrationFailedGeneric)
    clickButtonByText(buttonSaveAndContinue)
  }

  def clickRegistrationNotCalledIdentifierMismatch(): Unit = {
    onPage()
    click(registrationNotCalledIdentifierMismatch)
    clickButtonByText(buttonSaveAndContinue)
  }

  def clickRegistrationNotCalledBvFailed(): Unit = {
    onPage()
    click(registrationNotCalledBvFailed)
    clickButtonByText(buttonSaveAndContinue)
  }
}
