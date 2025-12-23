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

package uk.gov.hmrc.test.ui.pages.auth

import org.openqa.selenium.By
import uk.gov.hmrc.test.ui.conf.TestConfiguration
import uk.gov.hmrc.test.ui.driver.BrowserDriver
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.asa.ASAPillar2InputPage
import uk.gov.hmrc.test.ui.pages.bta.BTAPillar2IDCheckPage
import uk.gov.hmrc.test.ui.pages.btn.BtnStartPage
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.eligibility.EligibilityUPEPage
import uk.gov.hmrc.test.ui.pages.rfm.RFMEnterPillar2IdPage

object AuthLoginPage extends BrowserDriver with BasePage {

  val url: String         = s"${TestConfiguration.url("auth-login-stub")}/gg-sign-in"
  val frontEndUrl: String = TestConfiguration.url("pillar2-frontend")

  object Fields {
    val addDelegatedEnrolmentCTA: By  = By.id("js-add-delegated-enrolment")
    val affinityGroup: By             = By.id("affinityGroupSelect")
    val credentialRole: By            = By.id("credential-role-select")
    val credId: By                    = By.id("authorityId")
    val enrolmentKey: By              = By.id("enrolment[0].name")
    val groupId: By                   = By.id("groupIdentifier")
    val identifierName: By            = By.id("input-0-0-name")
    val identifierValue: By           = By.id("input-0-0-value")
    val redirectUrl: By               = By.id("redirectionUrl")
    def delegatedKey(i: Int): By      = By.id(s"delegatedEnrolment[$i].key")
    def delegatedName(i: Int): By     = By.id(s"input-delegated-$i-0-name")
    def delegatedValue(i: Int): By    = By.id(s"input-delegated-$i-0-value")
    def delegatedAuthRule(i: Int): By = By.id(s"delegatedEnrolment[$i].delegatedAuthRule")
  }

  case class Enrolment(key: String, name: String, value: String)
  case class DelegatedEnrolment(key: String, name: String, value: String, authRule: String)

  private val redirectUrls: Map[String, String] = Map(
    "asa"              -> ASAPillar2InputPage.url,
    "bta"              -> BTAPillar2IDCheckPage.url,
    "btn"              -> BtnStartPage.url,
    "dashboard"        -> DashboardPage.url,
    "eligibility"      -> EligibilityUPEPage.url,
    "rfm"              -> RFMEnterPillar2IdPage.url,
    "pillar2-frontend" -> frontEndUrl
  )

  private def resolveRedirect(page: String): String = {
    redirectUrls.getOrElse(
      page,
      throw new IllegalArgumentException(s"Unknown redirect page: $page")
    )
  }

  def login(
      userType: String,
      page: String,
      enrolment: Option[Enrolment] = None,
      delegatedEnrolments: Seq[DelegatedEnrolment] = Seq.empty,
      credId: String = "",
      credRole: String = "User",
      groupId: String = ""
  ): Unit = {

    navigateTo(url)

    sendKeys(Fields.credId, credId)
    sendKeys(Fields.redirectUrl, resolveRedirect(page))
    selectByValue(Fields.affinityGroup, userType)
    selectByValue(Fields.credentialRole, credRole)
    sendKeys(Fields.groupId, groupId)

    enrolment.foreach(addEnrolment)

    delegatedEnrolments.zipWithIndex.foreach {
      case (e, i) => addDelegatedEnrolment(e, i)
    }

    continue()
  }

  private def addEnrolment(e: Enrolment): Unit = {
    sendKeys(Fields.enrolmentKey, e.key)
    sendKeys(Fields.identifierName, e.name)
    sendKeys(Fields.identifierValue, e.value)
  }

  private def addDelegatedEnrolment(e: DelegatedEnrolment, index: Int): Unit = {
    click(Fields.addDelegatedEnrolmentCTA)
    sendKeys(Fields.delegatedKey(index), e.key)
    sendKeys(Fields.delegatedName(index), e.name)
    sendKeys(Fields.delegatedValue(index), e.value)
    sendKeys(Fields.delegatedAuthRule(index), e.authRule)
  }
}
