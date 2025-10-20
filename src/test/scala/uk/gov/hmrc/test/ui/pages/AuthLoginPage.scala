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
import uk.gov.hmrc.test.ui.driver.BrowserDriver

object AuthLoginPage extends BrowserDriver with PageObject {
  val url: String                           = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val frontEndUrl: String                   = TestConfiguration.url("pillar2-frontend")
  val incorrectUrl: String                  = TestConfiguration.url("pillar2-frontend") + "randomUrl"
  val frontEndSubscribeUrl: String          = s"$rootUrl" + "check-progress/register-your-group"
  val frontEndBtaUrl: String                = s"$rootUrl" + "bta/pillar2-id"
  val frontEndUPEUrl: String                = s"$rootUrl" + "business-matching/ultimate-parent/registered-in-uk"
  val frontEndUPEOrgTypeUrl: String         = s"$rootUrl" + "business-matching/ultimate-parent/uk-based/entity-type"
  val redirectUrlField: String              = "redirectionUrl"
  val redirectionUrlField: String           = "#redirectionUrl"
  val credIdField: String                   = "authorityId"
  val groupIdField: String                  = "groupIdentifier"
  val frontEndNameUrl: String               = s"$rootUrl" + "business-matching/ultimate-parent/no-id/input-name"
  val frontEndCAUrl: String                 = s"$rootUrl" + "business-matching/ultimate-parent/no-id/check-answers"
  val frontEndUPERegTypeUrl: String         = s"$rootUrl" + "business-matching/ultimate-parent/registered-in-uk"
  val frontEndNFMNameUrl: String            = s"$rootUrl" + "business-matching/filing-member/no-id/input-name"
  val frontEndNFMOrgTypeUrl: String         = s"$rootUrl" + "business-matching/filing-member/uk-based/entity-type"
  val frontEndNFMAddressUrl: String         = s"$rootUrl" + "business-matching/filing-member/no-id/input-address "
  val frontEndNFMContactNameUrl: String     = s"$rootUrl" + "business-matching/filing-member/no-id/input-business-name"
  val frontEndNFMContactEmailUrl: String    = s"$rootUrl" + "business-matching/filing-member/no-id/input-email"
  val frontEndNFMTelephoneUrl: String       = s"$rootUrl" + "business-matching/filing-member/no-id/phone"
  val frontEndNFMTelephoneInputUrl: String  = s"$rootUrl" + "business-matching/filing-member/no-id/input-phone"
  val frontEndFDGroupStatusUrl: String      = s"$rootUrl" + "further-details/group-status"
  val frontEndFDAccountPeriod: String       = s"$rootUrl" + "further-details/accounting-period"
  val frontEndCDAddressUrl: String          = s"$rootUrl" + "contact-details/address/input"
  val frontEndNFMCAUrl: String              = s"$rootUrl" + "business-matching/filing-member/no-id/check-answers"
  val frontEndFDCAUrl: String               = s"$rootUrl" + "further-details/check-answers"
  val frontEndCDCAUrl: String               = s"$rootUrl" + "contact-details/check-answers"
  val frontEndFinalReviewCAUrl: String      = s"$rootUrl" + "review-submit/check-answers"
  val frontEndSubUrl: String                = s"$rootUrl" + "review-submit/confirmation"
  val frontEndDashboardUrl: String          = s"$rootUrl" + "pillar2-top-up-tax-home"
  val frontEndASAUrl: String                = s"$rootUrl" + "asa/input-pillar-2-id"
  val rfmUrl: String                        = s"$rootUrl" + "replace-filing-member/security/enter-pillar2-id"
  val enrolmentKeyField: String             = "enrolment[0].name"
  val identifierNameField: String           = "input-0-0-name"
  val identifierValueField: String          = "input-0-0-value"
  val delegatedEnrolmentKeyField: String    = "delegatedEnrolment[0].key"
  val delegatedIdentifierNameField: String  = "input-delegated-0-0-name"
  val delegatedIdentifierValueField: String = "input-delegated-0-0-value"
  val delegatedAuthRuleField: String        = "delegatedEnrolment[0].delegatedAuthRule"
  val addDelegatedEnrolmentCTA: String      = "#js-add-delegated-enrolment"

  def loginWithUser(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginWithUserToRFM(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginWithUserToRFMWithCredId(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginAsUserWithCredId(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToOrgWithCredID(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUPEOrgTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNfmOrgWithCredID(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMOrgTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToRegWithCredID(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUPERegTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToSubscribe(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndSubscribeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  private def selectAffinityGroupOrg(): Unit =
    new Select(findAffinityGroup()).selectByVisibleText("Organisation")

  private def findAffinityGroup() = Find.findByName("affinityGroup")

  def clickSubmitButton(): Unit = Find.findById("submit").click()

  def loginUsingBta(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndBtaUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToUPE(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUPEUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToRFMWithGroupId(groupId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupOrg()
    Input.sendKeysById(groupIdField, groupId)
    clickSubmitButton()
  }

  def loginToUPEName(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMNameWithCredID(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToCA(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMCA(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndNFMCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToFDCA(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndFDCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToCDCA(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndCDCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToFinalCA(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndFinalReviewCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToUPEWithCredID(credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credIdField, credId)
    Input.sendKeysByName(frontEndUPEUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginAsInd(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    clickSubmitButton()
  }

  def loginAsOrgToASA(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginAsIndToASA(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    selectAffinityGroupIndividual()
    clickSubmitButton()
  }

  private def selectAffinityGroupIndividual(): Unit =
    new Select(findAffinityGroup()).selectByVisibleText("Individual")

  def loginAsAssistantToASA(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndASAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton()
  }

  def loginAsIndToRFM(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    clickSubmitButton()
  }

  def loginAsAgent(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupAgent()
    clickSubmitButton()
  }

  private def selectAffinityGroupAgent(): Unit =
    new Select(findAffinityGroup()).selectByVisibleText("Agent")

  def loginAsAgentToRFM(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupAgent()
    clickSubmitButton()
  }

  def loginAssistant(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton()
  }

  private def selectCredRoleAssistant(): Unit =
    new Select(findCredentialRole()).selectByVisibleText("Assistant")

  private def findCredentialRole() = Find.findByName("credentialRole")

  def loginAssistantToRFM(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton()
  }

  def loginToNFMName(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMAddress(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMAddressUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMContactName(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMContactNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToNFMContactEmail(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMContactEmailUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

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

  def loginWithExistingEntityWithRFM(enrolmentKey: String, identifierName: String, identifierValue: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(rfmUrl, redirectUrlField)
    Input.sendKeysById(enrolmentKeyField, enrolmentKey)
    Input.sendKeysById(identifierNameField, identifierName)
    Input.sendKeysById(identifierValueField, identifierValue)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def addDelegatedEnrolment(enrolmentKey: String, identifierName: String, identifierValue: String, authRule: String): Unit = {
    clickAddDelegatedEnrolmentCTA()
    Input.sendKeysByName(enrolmentKey, delegatedEnrolmentKeyField)
    Input.sendKeysById(delegatedIdentifierNameField, identifierName)
    Input.sendKeysById(delegatedIdentifierValueField, identifierValue)
    Input.sendKeysById(delegatedAuthRuleField, authRule)
    clickSubmitButton()
  }

  def clickAddDelegatedEnrolmentCTA(): Unit = Find.findByCss(addDelegatedEnrolmentCTA).click()

}
