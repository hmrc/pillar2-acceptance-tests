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

package uk.gov.hmrc.test.ui.pages.nfm

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.pages.BasePage

object NFMUKCompanyGRSPage extends BasePage {
  override val url: String = s"${baseUrl}test-only/stub-grs-journey-data?continueUrl=normalmode/fm&entityType=ukLimitedCompany"

  private val registrationSuccessBvDisabledButton: By           = By.id("registrationSuccessBvDisabled")
  private val registrationSuccessBvEnabledButton: By            = By.id("registrationSuccessBvEnabled")
  private val registrationFailedPartyTypeMismatchButton: By     = By.id("registrationFailedPartyTypeMismatch")
  private val registrationFailedGenericButton: By               = By.id("registrationFailedGeneric")
  private val registrationNotCalledIdentifierMismatchButton: By = By.id("registrationNotCalledIdentifierMismatch")
  private val registrationNotCalledBvFailedButton: By           = By.id("registrationNotCalledBvFailed")

  def clickButtonRegistrationSuccessBvDisabled(): Unit           = clickButton(registrationSuccessBvDisabledButton)
  def clickButtonRegistrationSuccessBvEnabled(): Unit            = clickButton(registrationSuccessBvEnabledButton)
  def clickButtonRegistrationFailedPartyTypeMismatch(): Unit     = clickButton(registrationFailedPartyTypeMismatchButton)
  def clickButtonRegistrationFailedGeneric(): Unit               = clickButton(registrationFailedGenericButton)
  def clickButtonRegistrationNotCalledIdentifierMismatch(): Unit = clickButton(registrationNotCalledIdentifierMismatchButton)
  def clickButtonRegistrationNotCalledBvFailed(): Unit           = clickButton(registrationNotCalledBvFailedButton)
}