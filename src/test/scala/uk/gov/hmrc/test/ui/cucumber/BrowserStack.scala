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

package uk.gov.hmrc.test.ui.cucumber

import java.net.URL

import com.typesafe.config.ConfigFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.{DesiredCapabilities, RemoteWebDriver}

import scala.collection.JavaConversions._

object BrowserStack {

  private val projectName = "Pillar2"
  private val buildName = "Local Build"

  private val defaultCapabilities: DesiredCapabilities = {
    new DesiredCapabilities(
      Map(
        "browserstack.debug" -> "true",
        "browserstack.local" -> "true",
        "project"            -> projectName,
        "build"              -> buildName))
  }

  private val loadedCapabilities: DesiredCapabilities = {
    sys.props.get("testDevice") match {
      case None =>
        sys.error("'testDevice' property must be set to the name of a file in src/test/resources/browserStackData")
      case Some(name) => {
        val deviceConfig = ConfigFactory.parseResources(s"browserStackData/$name.json")
        new DesiredCapabilities(deviceConfig.root().unwrapped())
      }
    }
  }

  def initialise(): WebDriver = {
    val config = ConfigFactory.parseResources("browserConfig.properties")
    val username = config.getString("username")
    val key = config.getString("automatekey")

    val capabilities = loadedCapabilities merge defaultCapabilities

    val url = new URL(s"http://$username:$key@hub-cloud.browserstack.com/wd/hub")

    val driver = new RemoteWebDriver(url, capabilities)
    driver
  }

}
