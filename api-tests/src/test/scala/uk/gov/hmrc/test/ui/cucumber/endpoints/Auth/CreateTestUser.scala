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

package uk.gov.hmrc.test.ui.cucumber.endpoints.Auth

import play.api.libs.json.Json
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage._
import OAuth.setupVendorAccessToken
import AuthLoginApi.withClue

object CreateTestUser {

  def createTestUser(affinityGroup: String): String = {

    val accessToken: String = if (env == "local") "" else setupVendorAccessToken

    val url: String = s"$apiPlatformTestUserUrl/${affinityGroup.toLowerCase}s"

    val body: String =
      if (affinityGroup.equals(AffinityGroup.Agent)) Json.parse("""{"serviceNames":["agent-services"]}""").toString
      else Json.parse("""{"serviceNames":["mtd-income-tax"]}""").toString

    val headers: Map[String, String] = Map(
      "Accept"        -> "application/vnd.hmrc.1.0+json",
      "Authorization" -> accessToken,
      "Content-Type"  -> "application/json"
    )

    val response = getHttpWithTimeout(url).postData(body).headers(headers).asString

    withClue(
      "\n\n▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒" +
        s"\n\nCALL TO CREATE A TEST USER FAILED\n\nurl: $url\n\nbody:\n${Json.prettyPrint(Json.parse(body))}" +
        s"\n\nresponse body:\n${response.body}\n" +
        "\n\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░\n\n") {

      response.code shouldBe 201
    }

    response.body
  }

}
