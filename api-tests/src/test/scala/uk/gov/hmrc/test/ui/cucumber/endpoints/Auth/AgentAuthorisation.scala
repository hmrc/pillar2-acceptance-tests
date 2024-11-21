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

import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage._
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage.apiPlatformAgentsAuthUrl

object AgentAuthorisation {

  def createAgentAuthorisationInvite(arn: String,
                                     accessToken: String,
                                     clientNino: String,
                                     clientKnownFact: String,
                                     supportingAgentEnrolment: Boolean = false): String = {

    val url = s"$apiPlatformAgentsAuthUrl/$arn/invitations"
    val service = "MTD-IT"
    val agentType = if (supportingAgentEnrolment) "supporting" else "main"

    val body =
      s"""
         |{
         |  "service": ["$service"],
         |  "agentType":"$agentType",
         |  "clientType":"personal",
         |  "clientIdType": "ni",
         |  "clientId": "$clientNino",
         |  "knownFact": "$clientKnownFact"
         |}
      """.stripMargin

    val headers: Map[String, String] = Map(
      "Accept"        -> "application/vnd.hmrc.1.0+json",
      "Authorization" -> s"$accessToken",
      "Content-Type"  -> "application/json"
    )

    val response = getHttpWithTimeout(url).postData(body).headers(headers).asString
    response.code shouldBe 204

    response.header("Location").get.split("invitations/")(1)
  }

  def acceptAgentAuthorisationInvite(inviteId: String): Unit = {

    val url: String = s"$apiPlatformAgentsAuthTestUrl/invitations/$inviteId"

    val headers: Map[String, String] = Map("Accept" -> "application/vnd.hmrc.1.0+json")

    val response = getHttpWithTimeout(url).put("").headers(headers).asString
    response.code shouldBe 204
  }

}
