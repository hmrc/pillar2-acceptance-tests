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

package uk.gov.hmrc.test.ui.pillar2SubmissionPages

import org.openqa.selenium.support.ui.Select
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.cucumber.{Find, Input, Nav, PageObject}
import uk.gov.hmrc.test.ui.pages.BasePage

object Pillar2SubmissionLoginPage extends BasePage with PageObject {

  val url: String                          = TestConfiguration.url("auth-login-stub") + "/gg-sign-in"
  val submissionFrontEndUrl: String        = TestConfiguration.url("pillar2-submission-frontend")
  val redirectUrlField: String             = "redirectionUrl"
  val redirectionUrlField: String          = "#redirectionUrl"
  val credIdField: String                  = "authorityId"
  val submissionFrontEndASAUrl: String     = s"$p2SubRootUrl"+"asa/input-pillar-2-id"
  val enrolmentKeyField: String            = "enrolment[0].name"
  val identifierNameField: String          = "enrolment[0].taxIdentifier[0].name"
  val identifierValueField: String         = "enrolment[0].taxIdentifier[0].value"
  val delegatedEnrolmentKeyField: String   = "delegatedEnrolment[0].key"
  val delegatedIdentifierNameField: String  = "delegatedEnrolment[0].taxIdentifier[0].name"
  val delegatedIdentifierValueField: String = "delegatedEnrolment[0].taxIdentifier[0].value"
  val delegatedAuthRuleField: String       = "delegatedEnrolment[0].delegatedAuthRule"
  val addDelegatedEnrolmentCTA: String     = "[onclick='addDelegatedEnrolment()']"

  def loginToSubscribe(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToP2SubmissionWithUser(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginToP2SubmissionWithAssistantUser(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
    clickSubmitButton()
  }

  def loginToP2SubmissionWithAgentUser(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndUrl, redirectUrlField)
    selectAffinityGroupAgent()
    clickSubmitButton()
  }

  def loginToP2SubmissionWithIndividualUser(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndUrl, redirectUrlField)
    selectAffinityGroupIndividual()
    clickSubmitButton()
  }

  def p2SubAgentLoginWithExistingEntity(enrolmentKey: String, identifierName: String, identifierValue: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndASAUrl, redirectUrlField)
    Input.sendKeysByName(enrolmentKey, enrolmentKeyField)
    Input.sendKeysByName(identifierName, identifierNameField)
    Input.sendKeysByName(identifierValue, identifierValueField)
    selectAffinityGroupAgent()
  }

  def p2SubAddDelegatedEnrolment(enrolmentkey: String, identifiername: String, identifiervalue: String, authRule: String): Unit = {
    clickAddDelegatedEnrolmentCTA()
    Input.sendKeysByName(enrolmentkey, delegatedEnrolmentKeyField)
    Input.sendKeysByName(identifiername, delegatedIdentifierNameField)
    Input.sendKeysByName(identifiervalue, delegatedIdentifierValueField)
    Input.sendKeysByName(authRule, delegatedAuthRuleField)
    clickSubmitButton()
  }

  def loginAsOrgToASA(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndASAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    clickSubmitButton()
  }

  def loginAsIndToASA(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndASAUrl, redirectUrlField)
    selectAffinityGroupIndividual()
    clickSubmitButton()
  }

  def loginAsAssistantToASA(name: String): Unit = {
    Nav.navigateTo(url)
    Input.sendKeysByName(submissionFrontEndASAUrl, redirectUrlField)
    selectAffinityGroupOrg()
    selectCredRoleAssistant()
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

  def clickSubmitButton() = Find.findById("submit").click()

  def clickAddDelegatedEnrolmentCTA() = Find.findByCss(addDelegatedEnrolmentCTA).click()

}
