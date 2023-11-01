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
import uk.gov.hmrc.test.ui.cucumber.{Find, Input, Nav, PageObject}


object AuthLoginPage extends BasePage with PageObject {
  val url: String                         = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val frontEndUrl: String                 = TestConfiguration.url("pillar2-frontend")
  val frontEndSubscribeUrl: String        = s"$rootUrl"+"task-list/register-for-global-minimum-tax"
  val frontEndUPEUrl: String              = s"$rootUrl"+"business-matching/ultimate-parent/registered-in-uk"
  val frontEndUPEOrgTypeUrl: String       = s"$rootUrl"+"business-matching/ultimate-parent/uk-based/org-type"
  val redirectUrlField: String            = "redirectionUrl"
  val credIdField: String                 = "authorityId"
  val frontEndNameUrl: String             = s"$rootUrl"+"business-matching/ultimate-parent/no-id/input-name"
  val frontEndCAUrl: String               =s"$rootUrl"+"business-matching/ultimate-parent/no-id/check-answers"
  val frontEndUPERegTypeUrl: String       = s"$rootUrl"+"business-matching/ultimate-parent/registered-in-uk"
  val frontEndNFMNameUrl: String          = s"$rootUrl"+"business-matching/filing-member/no-id/input-name"
  val frontEndNFMOrgTypeUrl: String       = s"$rootUrl"+"business-matching/filing-member/uk-based/org-type"
  val frontEndNFMAddressUrl: String       = s"$rootUrl"+"business-matching/filing-member/no-id/input-address "
  val frontEndNFMContactNameUrl: String   = s"$rootUrl"+"business-matching/filing-member/no-id/input-business-name"
  val frontEndNFMContactEmailUrl: String  = s"$rootUrl"+"business-matching/filing-member/no-id/input-email"
  val frontEndNFMTelephoneUrl: String     = s"$rootUrl"+"business-matching/filing-member/no-id/telephone"
  val frontEndNFMTelephoneInputUrl: String= s"$rootUrl"+"business-matching/filing-member/no-id/input-telephone"
  val frontEndFDGroupStatusUrl: String    = s"$rootUrl"+"further-details/group-status"
  val frontEndNFMCAUrl: String            =s"$rootUrl"+"business-matching/filing-member/no-id/check-answers"
  val frontEndFDCAUrl: String             =s"$rootUrl"+"further-details/check-answers"
  val frontEndSubUrl: String              =s"$rootUrl"+"review-submit/confirmation"
  val frontEndDashboardUrl: String        =s"$rootUrl"+"pillar2-top-up-tax-home"

  def loginWithUser(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginAsUserWithCredId(name: String,credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToOrgWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndUPEOrgTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }
  def loginToNfmOrgWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndNFMOrgTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }
  def loginToRegWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndUPERegTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }
  def loginToSubscribe(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndSubscribeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToUPE(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUPEUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToUPEAs(): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUPEOrgTypeUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToUPEName(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToNFMNameWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndNFMNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToCA(name: String,credId: String): Unit={
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToNFMCA(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndNFMCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToFDCA(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndFDCAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToUPEWithCredID(name: String,credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndUPEUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginAsInd(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    clickSubmitButton
  }

  def loginAssistant(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton
  }

  def loginToSubWithCredID(name: String, credId: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysById(credId, credIdField)
    Input.sendKeysByName(frontEndSubUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToNFMName(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToDashboard(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndDashboardUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToNFMAddress(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMAddressUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToNFMContactName(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMContactNameUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToNFMContactEmail(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMContactEmailUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }
  def loginToNFMTelephone(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMTelephoneUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }
  def loginToNFMTelephoneInput(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndNFMTelephoneInputUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  def loginToFDGroupStatus(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(frontEndFDGroupStatusUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton
  }

  private def selectAffinityGroupOrg() =
    new Select(findAffinityGroup()).selectByVisibleText("Organisation")

  private def selectCredRoleAssistant() =
    new Select(findCredentialRole()).selectByVisibleText("Assistant")

  private def findAffinityGroup() = Find.findByName("affinityGroup")

  private def findCredentialRole() = Find.findByName("credentialRole")

  def clickSubmitButton = Find.findById("submit").click()

}
