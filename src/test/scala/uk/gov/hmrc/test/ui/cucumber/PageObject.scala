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
import com.typesafe.config.{Config, ConfigFactory}
import uk.gov.hmrc.test.ui.conf.TestConfiguration

trait PageObject {
  val config: Config        = ConfigFactory.load()
  val env: String           = config.getString("environment")
  val defaultConfig: Config = config.getConfig("local")
  val envConfig: Config     = config.getConfig(env).withFallback(defaultConfig)
  val rootUrl: String       = TestConfiguration.url("pillar2-frontend")
  val p2SubRootUrl: String =
    TestConfiguration.url("pillar2-submission-frontend")
  val back   = "backLink"
  val submit = "submit"
  val url: String

}
