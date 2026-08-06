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

package uk.gov.hmrc.test.ui.helper

import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.conf.TestConfiguration

import java.net.URI
import java.net.http.{HttpClient, HttpRequest, HttpResponse}

object TestOnlyHelpers {

  private val clearSessionUrl =
    s"${TestConfiguration.url("pillar2-frontend")}test-only/clear-all"

  private val resetPillar2StubStateUrl =
    s"${TestConfiguration.url("pillar2-stubs")}pillar2/subscription/reset"

  def clearSession(): Unit =
    Driver.instance.navigate.to(clearSessionUrl)

  def resetPillar2StubState(): Unit =
    if TestConfiguration.env == "local" then {
      val request = HttpRequest
        .newBuilder(URI.create(resetPillar2StubStateUrl))
        .POST(HttpRequest.BodyPublishers.noBody())
        .build()
      val response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.discarding())

      require(
        response.statusCode() == 200,
        s"Expected Pillar 2 stubs reset to return 200, but received ${response.statusCode()}"
      )
    }
}
