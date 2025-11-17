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

package uk.gov.hmrc.test.ui.helper

import org.scalatest.Assertion
import org.scalatest.matchers.should.Matchers
import uk.gov.hmrc.test.ui.driver.BrowserDriver

object Check extends BrowserDriver with Matchers {

  def checkH1(h1: String): Assertion = Find.findByTagName("h1").getText should include(h1)

  def checkUrlContains(url: String): Assertion = Find.findURL() should include(url)

  def checkBodyText(t: String): Assertion = Find.findByTagName("body").getText should include(t)

  def assertNavigationToPage(page: PageObject): Boolean =
    Wait.waitForUrlToBeVisible(page.url)

  def assertNavigationUrl(page: PageObject): Boolean =
    Wait.waitForUrl(page.url)

  def checkAnswerSelection(option: String): Boolean = {
    option match {
      case "Yes" => Find.findByCss("#value_0").isSelected
      case "No"  => Find.findByCss("#value_1").isSelected
    }
  }

  def checkOptionSelected(option: String): Boolean = {
    option match {
      case "UK limited company"            => Find.findByCss("#value_0").isSelected
      case "Limited liability partnership" => Find.findByCss("#value_1").isSelected
      case "In the UK and outside the UK"  => Find.findByCss("#value_0").isSelected
      case "Only in the UK"                => Find.findByCss("#value_1").isSelected
      case "UPE"                           => Find.findByCss("#value_0").isSelected
    }
  }
}
