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
import uk.gov.hmrc.test.ui.helper.Input.*
import uk.gov.hmrc.test.ui.helper.{Find, Input, Nav}
import uk.gov.hmrc.test.ui.pages.BasePage
import uk.gov.hmrc.test.ui.pages.asa.ASAPillar2InputPage
import uk.gov.hmrc.test.ui.pages.bta.BTAPillar2IDCheckPage
import uk.gov.hmrc.test.ui.pages.btn.BtnStartPage
import uk.gov.hmrc.test.ui.pages.dashboard.DashboardPage
import uk.gov.hmrc.test.ui.pages.rfm.RFMStartPage


object AuthLoginPage extends BrowserDriver with BasePage {

  val url: String         = s"${TestConfiguration.url("auth-login-stub")}/gg-sign-in"
  val frontEndUrl: String = TestConfiguration.url("pillar2-frontend")

  object Fields {
    val redirectUrl = "redirectionUrl"
    val credId      = "authorityId"
    val groupId     = "groupIdentifier"

    val enrolmentKey    = "enrolment[0].name"
    val identifierName  = "input-0-0-name"
    val identifierValue = "input-0-0-value"

    def delegatedKey(i: Int)      = s"delegatedEnrolment[$i].key"
    def delegatedName(i: Int)     = s"input-delegated-$i-0-name"
    def delegatedValue(i: Int)    = s"input-delegated-$i-0-value"
    def delegatedAuthRule(i: Int) = s"delegatedEnrolment[$i].delegatedAuthRule"
  }

  val addDelegatedEnrolmentCTA = "#js-add-delegated-enrolment"

  case class Enrolment(key: String, name: String, value: String)
  case class DelegatedEnrolment(key: String, name: String, value: String, authRule: String)

  private val redirectUrls: Map[String, String] = Map(
    "asa"              -> ASAPillar2InputPage.url,
    "bta"              -> BTAPillar2IDCheckPage.url,
    "btn"              -> BtnStartPage.url,
    "dashboard"        -> DashboardPage.url,
    "rfm"              -> RFMStartPage.url,
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

    Nav.navigateTo(url)

    Input.sendKeysByName(credId, Fields.credId)
    Input.sendKeysByName(resolveRedirect(page), Fields.redirectUrl)

    selectAffinityGroup(userType)
    selectCredRole(credRole)
    Input.sendKeysById(Fields.groupId, groupId)

    enrolment.foreach(addEnrolment)

    delegatedEnrolments.zipWithIndex.foreach {
      case (e, i) => addDelegatedEnrolment(e, i)
    }

    clickSubmitButton()
  }

  private def addEnrolment(e: Enrolment): Unit = {
    sendKeysById(Fields.enrolmentKey, e.key)
    sendKeysById(Fields.identifierName, e.name)
    sendKeysById(Fields.identifierValue, e.value)
  }

  private def addDelegatedEnrolment(e: DelegatedEnrolment, index: Int): Unit = {
    clickAddDelegatedEnrolmentCTA()
    sendKeysByName(e.key, Fields.delegatedKey(index))
    sendKeysById(Fields.delegatedName(index), e.name)
    sendKeysById(Fields.delegatedValue(index), e.value)
    sendKeysById(Fields.delegatedAuthRule(index), e.authRule)
  }

  private def selectAffinityGroup(userType: String): Unit = new Select(findAffinityGroup()).selectByVisibleText(userType)

  private def selectCredRole(role: String): Unit = new Select(findCredentialRole()).selectByVisibleText(role)

  private def findAffinityGroup() = Find.findByName("affinityGroup")

  private def findCredentialRole() = Find.findByName("credentialRole")

  private def clickAddDelegatedEnrolmentCTA(): Unit = Find.findByCss(addDelegatedEnrolmentCTA).click()

  def clickSubmitButton(): Unit = Find.findById("submit").click()
}
