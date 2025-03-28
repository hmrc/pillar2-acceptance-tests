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

package uk.gov.hmrc.test.ui.cucumber.stepdefs

import io.cucumber.scala.{EN, ScalaDsl, Scenario}
import org.apache.commons.io.FileUtils
import org.openqa.selenium.{OutputType, TakesScreenshot}
import uk.gov.hmrc.selenium.webdriver.{Browser, Driver}
import uk.gov.hmrc.test.ui.cucumber.Nav
import java.io.File

object Hooks extends ScalaDsl with EN with Browser {

  BeforeAll {
    startBrowser()
    Driver.instance.manage().deleteAllCookies()
    Nav.clearCollections()
  }

  After { scenario: Scenario =>
    if (scenario.isFailed) {
      val screenshotName = scenario.getName.replaceAll(" ", "_") + ".png"
      val screenshot     = Driver.instance.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.FILE)

      val destinationFile = new File(s"target/screenshots/$screenshotName")
      FileUtils.copyFile(screenshot, destinationFile)

      val screenshotBytes = Driver.instance.asInstanceOf[TakesScreenshot].getScreenshotAs(OutputType.BYTES)
      scenario.attach(screenshotBytes, "image/png", screenshotName)
    }
  }

  AfterAll {
    quitBrowser()
  }
}
