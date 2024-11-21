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

import io.cucumber.datatable.DataTable
import play.api.libs.json.{JsArray, JsValue, Json}
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage.{apiVersion, errorLog, newSource, requestDELETE, requestDELETEWithState, requestEmptyPOST, requestGET, requestGETWithQueryParams, requestHeaders, requestHeadersTestSupportApiLocal, requestPOST, requestPUT, requestStatefulDELETE, requestStatefulEmptyPOST, requestStatefulGET, requestStatefulListGET, requestStatefulPOST, requestStatefulPUT, response, scenarioContext, selfEmploymentId, selfEmploymentId2nd}
import uk.gov.hmrc.test.ui.cucumber.endpoints.RequestBodies.retrieveRequestBody
import uk.gov.hmrc.test.ui.cucumber.endpoints.ResponseBodies.{findKeyAndMatchValue, findKeysAndMatchValues, getTaxYearFromDate, retrieveExpectedResponse}
import uk.gov.hmrc.test.ui.cucumber.endpoints.ResponseModels.checkAgainstExpectedModel
import uk.gov.hmrc.test.ui.cucumber.utils.Json.{JsonTools, TaxYear}
//import io.cucumber.scala

import java.time.{Instant, LocalDate}
import scala.jdk.CollectionConverters.CollectionHasAsScala
import scala.math.Ordering.Implicits.infixOrderingOps

class CommonStepDef extends BaseStepDef with JsonTools {

  Then("""^I set the API version to (.*)$""") { version: Double =>
    apiVersion = version.toString
  }

  Then("""^the response (.*) is (.*)$""") { (item: String, value: String) =>
    item match {
      case "code" =>
        withClue(errorLog()) {
          response.code shouldBe value.toInt
        }
      case "body" =>
        value match {
          case "empty" => response.body.isEmpty
          case _ =>
            val expectedBody = retrieveExpectedResponse(value)
            withClue(errorLog(Some(expectedBody))) {
              compareResponseAsJson(response.body, expectedBody)
            }
        }
      case "model" =>
        checkAgainstExpectedModel(value)
      case "message" =>
        (Json.parse(response.body) \ "message").get.toString shouldBe value
      case "error" =>
        (Json.parse(response.body) \ "code").get.as[String] shouldBe value
    }
  }

  Then("""^the response body contains (.*) from value stored as (\S*) as a (.*)$""") { (fieldName: String, contextKey: String, t: String) =>
    checkFieldValue(fieldName, scenarioContext(contextKey), t)
  }

  Then("""^the response body contains (.*) - (.*) as a (.*)$""") { (fieldName: String, value: String, t: String) =>
    checkFieldValue(fieldName, value, t)
  }

  private def checkFieldValue(fieldName: String, value: String, t: String) = {
    t match {
      case "String" =>
        assert(response.body.nonEmpty && findKeyAndMatchValue[String](fieldName, value))
      case "Boolean" =>
        assert(response.body.nonEmpty && findKeyAndMatchValue[Boolean](fieldName, value))
      case "Double" =>
        assert(response.body.nonEmpty && findKeyAndMatchValue[BigDecimal](fieldName, value))
      case "StringEnum" =>
        assert(response.body.nonEmpty && findKeysAndMatchValues[String](fieldName, value))
      case "DoubleEnum" =>
        assert(response.body.nonEmpty && findKeysAndMatchValues[BigDecimal](fieldName, value))
    }
  }
/*
  Then("""^the (.*) body contains no empty arrays$""") { endpoint: String =>
    endpoint match {
      case "EOPS" =>
        val model = Json.parse(response.body).as[RetrieveEOPSResponse]
        assert(model.obligations.nonEmpty && model.obligations.forall(_.obligationDetails.nonEmpty))
      case "Periodic" =>
        val model = Json.parse(response.body).as[RetrievePeriodicObligationsResponse]
        assert(model.obligations.nonEmpty && model.obligations.forall(_.obligationDetails.nonEmpty))
    }
  }
*/
  // Used for STATEFUL retrievals where the comparison is against the JSON submitted
  Then("""^the response body matches the submission body (\S+) without:$""") { (value: String, ignoredFields: DataTable) =>
    expectResponseBodyWithout(ignoredFields, retrieveRequestBody(value))
  }

  Then("""^the response body matches (\S+) without:$""") { (value: String, ignoredFields: DataTable) =>
    expectResponseBodyWithout(ignoredFields, retrieveExpectedResponse(value))
  }

  private def expectResponseBodyWithout(ignoredFields: DataTable, expectedResponseBody: String): Unit =
    withClue(errorLog(Some(expectedResponseBody))) {
      compareResponseAsJsonIgnoring(response.body, expectedResponseBody, ignoredFields.asScalaSeq[String])
    }

  Then("""^save the Self-Employment ID$""") { () =>
    selfEmploymentId = response.header("Location").get.split("self-employments/")(1)
  }

  Then("""^save the 2nd Self-Employment ID$""") { () =>
    selfEmploymentId2nd = response.header("Location").get.split("self-employments/")(1)
  }

  Then("""^the (.*) header is not empty$""") { header: String =>
    response.headers(header).head shouldNot be(empty)
  }

  When("""^a request is made to POST to url: (.*), with the JSON body: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, jsonBody: String, scenario: String) =>
      if (scenario != "None") response = requestPOST(url, jsonBody, requestHeaders, Some(scenario))
      else response = requestPOST(url, jsonBody, requestHeaders, None)
  }

  When("""^a request is made to POST Stateful test data to url: (.*), with the JSON body: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, jsonBody: String, scenario: String) =>
      val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
      if (scenario != "None") response = requestPOST(url, jsonBody, headers, Some(scenario))
      else response = requestPOST(url, jsonBody, headers, None)
  }

  When("""^a request is made to POST to url: (.*), with the stateful value: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, stateIdkey: String, scenario: String) =>
      if (scenario != "None") response = requestPOST(url, stateIdkey, requestHeaders, Some(scenario))
      else response = requestPOST(url, stateIdkey, requestHeaders, None)
  }

  When("""^a request is made to POST to url: (.*), with the JSON body: (.*), header: (.*) = (.*) and the gov-test-scenario: (.*)$""") {
    (url: String, jsonBody: String, header: String, headerValue: String, scenario: String) =>
      val headers = requestHeaders + (header -> headerValue)

      if (scenario != "None") response = requestPOST(url, jsonBody, headers, Some(scenario))
      else response = requestPOST(url, jsonBody, headers, None)
  }

  When("""^a request is made to DELETE to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    if (scenario != "None") response = requestDELETE(url, requestHeaders, Some(scenario))
    else response = requestDELETE(url, requestHeaders, None)
  }

  When("""^a request is made to DELETE Stateful test data to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
    if (scenario != "None") response = requestDELETE(url, headers, Some(scenario))
    else response = requestDELETE(url, headers, None)
  }

  When("""^a request is made to GET test data to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
    if (scenario != "None") response = requestGET(url, headers, Some(scenario))
    else response = requestGET(url, headers, None)
  }

  When("""^a request is made to GET to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    if (scenario != "None") response = requestGET(url, requestHeaders, Some(scenario))
    else response = requestGET(url, requestHeaders, None)
  }

  When("""^a request is made to PUT to url: (.*), with the JSON body: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, jsonBody: String, scenario: String) =>
      if (scenario != "None") response = requestPUT(url, jsonBody, requestHeaders, Some(scenario))
      else response = requestPUT(url, jsonBody, requestHeaders, None)
  }

  When("""^a request is made to PUT to url: (.*), with the JSON body: (.*), header: (.*) = (.*) and the gov-test-scenario: (.*)$""") {
    (url: String, jsonBody: String, header: String, headerValue: String, scenario: String) =>
      val headers = requestHeaders + (header -> headerValue)

      if (scenario != "None") response = requestPUT(url, jsonBody, headers, Some(scenario))
      else response = requestPUT(url, jsonBody, headers, None)
  }

  When(
    """^a request is made to PUT Stateful data to url: (.*), with the stateful value: (.*), and the additional url: (.*), and the JSON body: (.*) and the gov-test-scenario: (.*)$""") {
    (baseUrl: String, stateIdKey: String, additionalUrl: String, jsonBody: String, scenario: String) =>
      val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulPUT(baseUrl, stateId, jsonBody, headers, additionalUrl)
  }

  When("""^a request is made to do an empty POST to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    if (scenario != "None") response = requestEmptyPOST(url, requestHeaders, Some(scenario))
    else response = requestEmptyPOST(url, requestHeaders, None)
  }

  When("""^a request is made to do an empty Stateful POST to url: (.*), and the gov-test-scenario: (.*)$""") { (url: String, scenario: String) =>
    val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
    if (scenario != "None") response = requestEmptyPOST(url, headers, Some(scenario))
    else response = requestEmptyPOST(url, headers, None)
  }

  When(
    """^a request with additional url is made to do an empty POST to url:  (.*), with the stateful value: (.*), with the additionalUrl: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String, additionalUrl: String) =>
      val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulEmptyPOST(baseUrl, stateId, headers, additionalUrl)
  }

  When("""^a request is made to do an empty POST to url: (.*), header: (.*) = (.*) and the gov-test-scenario: (.*)$""") {
    (url: String, header: String, headerValue: String, scenario: String) =>
      val headers = requestHeaders + (header -> headerValue)

      if (scenario != "None") response = requestEmptyPOST(url, headers, Some(scenario))
      else response = requestEmptyPOST(url, headers, None)
  }

  When("""^a request is made to do an empty POST to url: (.*), with the header: (.*) = (.*) and the gov-test-scenario: (.*)$""") {
    (url: String, header: String, headerValue: String, scenario: String) =>
      val headers = requestHeaders + (header -> headerValue)

      if (scenario != "None") response = requestEmptyPOST(url, headers, Some(scenario))
      else response = requestEmptyPOST(url, headers, None)
  }

  When("""^an request is made to GET to url: (.*) with FromDate: (.*) & ToDate: (.*) & Source: (.*), and the gov-test-scenario: (.*)$""") {
    (url: String, fromDate: String, toDate: String, source: String, scenario: String) =>
      val sourceParam = if (source == "none") "" else s"&source=$source"
      newSource = source
      val fromDateParam = if (fromDate == "empty") "" else s"fromDate=$fromDate"
      val toDateParam   = if (toDate == "empty") "" else s"toDate=$toDate"
      val params        = s"?$toDateParam&$fromDateParam$sourceParam"
      if (scenario != "None") response = requestGETWithQueryParams(url, params, requestHeaders, Some(scenario))
      else response = requestGETWithQueryParams(url, params, requestHeaders, None)
  }

  And("""^the (.*) array in the response body is empty$""") { (arrayName: String) =>
    val responseBodyJson = Json.parse(response.body)
    (responseBodyJson \ arrayName).as[JsValue] shouldBe JsArray.empty
  }

  And("""^the response body contains (.*) with values:$""") { (key: String, table: DataTable) =>
    val responseBodyJson = Json.parse(response.body)
    (responseBodyJson \\ key).map(_.as[String]) shouldBe table.values().asScala.toList
  }

  And("""^the timestamp (.*) in the response body is no more than (.*) seconds old$""") { (key: String, seconds: Int) =>
    val responseBodyJson = Json.parse(response.body)
    val timestamp        = (responseBodyJson \ key).as[Instant]
    val now              = Instant.now()
    timestamp.plusSeconds(seconds) should be > now
    timestamp should be <= now
  }

  And("""^the context is cleared$""") {
    scenarioContext.clear()
  }

  And("""^(.*) is stored as (\S*)$""") { (value: String, contextKey: String) =>
    scenarioContext += (contextKey -> value)
  }

  Then("""^store the (.*) as (.*) from response$""") { (responseKey: String, contextKey: String) =>
    val responseBodyJson = Json.parse(response.body)
    val value            = (responseBodyJson \ responseKey).as[String]
    scenarioContext += (contextKey -> value)
  }

  When("""^a stateful request is made to GET to url: (.*), with the stateful value: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String) =>
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulGET(baseUrl, stateId, requestHeaders)
  }
/*
  When(
    """^a request is made to PUT to url: (.*), with a JSON body containing a stateful claimId1: (.*), and stateful claimId2: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, claimId1ContextKey: String, claimId2ContextKey: String) =>
      val claimId1             = scenarioContext(claimId1ContextKey)
      val claimId2             = scenarioContext(claimId2ContextKey)
      val jsonBodyWithClaimIds = AMEND_LOSS_CLAIM_ORDER_DYNAMIC(claimId1, claimId2)
      response = requestStatefulBodyPUT(baseUrl, "", body = jsonBodyWithClaimIds)
  }

  When("""^a request is made to PUT to url: (.*), with a JSON body containing a stateful claimId: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, claimId1ContextKey: String) =>
      val claimId1             = scenarioContext(claimId1ContextKey)
      val jsonBodyWithClaimIds = AMEND_LOSS_CLAIM_ORDER_DYNAMIC_1(claimId1)
      response = requestStatefulBodyPUT(baseUrl, "", body = jsonBodyWithClaimIds)
  }
*/
  When("""^a stateful request is made to DELETE to url: (.*), with the stateful value: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String) =>
      val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulDELETE(baseUrl, stateId, headers)
  }

  When("""^a request with stateful value is made to DELETE to url: (.*), with the value: (.*), and the gov-test-scenario: (.*)$""") {
    (baseUrl: String, stateIdKey: String, scenario: String) =>
      val headers = if (env == "local") requestHeadersTestSupportApiLocal else requestHeaders
      val stateId = scenarioContext(stateIdKey)
      if (scenario != "None") response = requestDELETEWithState(baseUrl, stateId, headers, Some(scenario))
      else response = requestDELETEWithState(baseUrl, stateId, headers, None)
  }

  When(
    """^a stateful request is made to PUT to url: (.*), with the stateful value: (.*), with the JSON body: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String, jsonBody: String) =>
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulPUT(baseUrl, stateId, jsonBody, requestHeaders)
  }

  When("""^a stateful request for List scenario is made to GET to url: (.*), with the stateful value: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String) =>
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulListGET(baseUrl, stateId, requestHeaders)
  }

  When(
    """^a stateful request is made to POST to url: (.*), with the stateful value: (.*), with the JSON body: (.*), with the additionalUrl: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String, jsonBody: String, additionalUrl: String) =>
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulPOST(baseUrl, stateId, jsonBody, requestHeaders, additionalUrl)
  }

  When(
    """^a stateful request with additional url is made to PUT to url: (.*), with the stateful value: (.*), with the JSON body: (.*), with the additionalUrl: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String, jsonBody: String, additionalUrl: String) =>
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulPUT(baseUrl, stateId, jsonBody, requestHeaders, additionalUrl)
  }

  When(
    """^a stateful request with additional url is made to DELETE to url: (.*), with the stateful value: (.*), with the additionalUrl: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String, additionalUrl: String) =>
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulDELETE(baseUrl, stateId, requestHeaders, additionalUrl)
  }

  When(
    """^a stateful request with additional url is made to GET to url: (.*), with the stateful value: (.*), with the additionalUrl: (.*), and the gov-test-scenario: STATEFUL$""") {
    (baseUrl: String, stateIdKey: String, additionalUrl: String) =>
      val stateId = scenarioContext(stateIdKey)
      response = requestStatefulGET(baseUrl, stateId, requestHeaders, additionalUrl)
  }

  And("""^the response body has timestamp (.*) pointing to a tax year after the end of taxYear: (.*)$""") {
    (key: String, taxYearBroughtForwardFrom: String) =>
      val taxYearBroughtForwardFromEndYear = taxYearBroughtForwardFrom.substring(0, 4).toInt + 1

      val responseBodyJson           = Json.parse(response.body)
      val timestampDate              = (responseBodyJson \\ key).map(_.as[String]).head.substring(0, 10)
      val localDateFromTimestampDate = LocalDate.parse(timestampDate)
      val taxYearFromTimestamp       = getTaxYearFromDate(localDateFromTimestampDate)

      assert(response.body.nonEmpty && taxYearFromTimestamp > taxYearBroughtForwardFromEndYear)
  }

  And("""^the response body has a (.*) field that contains a date within or after the taxYear - (.*)$""") {
    (submittedOnField: String, taxYearString: String) =>
      val responseBodyJson = Json.parse(response.body)
      val timestampDate    = (responseBodyJson \\ submittedOnField).map(_.as[String]).head.substring(0, 10)
      val year             = TaxYear.fromMtdFormat(taxYearString)
      val timestamp        = LocalDate.parse(timestampDate)

      assert(!timestamp.isBefore(year.startDate))

  }

  And("""^the response body has a (.*) field that contains a date after the taxYear - (.*)$""") { (submittedOnField: String, taxYearString: String) =>
    val responseBodyJson = Json.parse(response.body)
    val timestampDate    = (responseBodyJson \\ submittedOnField).map(_.as[String]).head.substring(0, 10)
    val year             = TaxYear.fromMtdFormat(taxYearString)
    val timestamp        = LocalDate.parse(timestampDate)

    assert(timestamp.isAfter(year.endDate))
  }

  And("""^the response body has a (.*) field that contains a date within the taxYear - (.*)$""") { (timestamp: String, taxYearString: String) =>
    val responseBodyJson = Json.parse(response.body)
    val timestampDates   = (responseBodyJson \\ timestamp).map(_.as[String]).map(_.substring(0, 10))
    val year             = TaxYear.fromMtdFormat(taxYearString)
    val timestamps       = timestampDates.map(LocalDate.parse(_))

    assert(timestamps.map(element => element <= year.endDate).forall(_ == true))
    assert(timestamps.map(element => element >= year.startDate).forall(_ == true))

  }

  And("""^the response body has a (.*) field that contains a time less than the current system time$""") { (submittedOnField: String) =>
    val responseBodyJson = Json.parse(response.body)
    val timestampDate    = (responseBodyJson \\ submittedOnField).map(_.as[String]).head
    val timestamp        = Instant.parse(timestampDate)

    assert(timestamp.isBefore(Instant.now))

  }

  And("""^the response body has a (.*) field that contains a timestamp greater than (.*)$""") {
    (submittedOnField: String, firstSubmittedOnField: String) =>
      val responseBodyJson          = Json.parse(response.body)
      val timestampDate             = (responseBodyJson \\ submittedOnField).map(_.as[String]).head
      val currentTimeStamp          = Instant.parse(timestampDate)
      val firstSubmittedOnTimeStamp = scenarioContext(firstSubmittedOnField)
      val InitialTimeStamp          = Instant.parse(firstSubmittedOnTimeStamp)

      assert(InitialTimeStamp.isBefore(currentTimeStamp))
  }

  And("""^the response body has a (.*) field that contains a date within the current taxYear$""") { (field: String) =>
    val currentTaxYear   = TaxYear.containing(LocalDate.now())
    val responseBodyJson = Json.parse(response.body)
    val dateAsString     = (responseBodyJson \\ field).map(_.as[String]).head.substring(0, 10)
    val date             = LocalDate.parse(dateAsString)

    assert(!date.isBefore(currentTaxYear.startDate))
    assert(!date.isAfter(currentTaxYear.endDate))
  }

  And("""^the response body has a (.*) field containing the current taxYear$""") { (field: String) =>
    val currentTaxYear   = TaxYear.containing(LocalDate.now()).asMtd
    val responseBodyJson = Json.parse(response.body)
    val taxYear          = (responseBodyJson \\ field).map(_.as[String]).head
    assert(taxYear == currentTaxYear)
  }

  And("""^the response body has a (.*) field containing a date in the previous taxYear$""") { (field: String) =>
    val currentTaxYear             = TaxYear.containing(LocalDate.now())
    val mostRecentCompletedTaxYear = TaxYear.containing(currentTaxYear.startDate.minusDays(1))
    val responseBodyJson           = Json.parse(response.body)
    val date                       = (responseBodyJson \\ field).map(_.as[LocalDate]).head
    assert(TaxYear.containing(date) == mostRecentCompletedTaxYear)
  }

  And("""^the response body has a (.*) field that contains a date after the current taxYear$""") { (field: String) =>
    val currentTaxYear   = TaxYear.containing(LocalDate.now())
    val responseBodyJson = Json.parse(response.body)
    val dateAsString     = (responseBodyJson \\ field).map(_.as[String]).head.substring(0, 10)
    val date             = LocalDate.parse(dateAsString)

    assert(date.isAfter(currentTaxYear.endDate))
  }

  And("""^the response body has dates (.*) covering the current and previous (.*) tax years$""") {
    (dateField: String, numberOfPreviousTaxYears: Int) =>
      val responseBodyJson = Json.parse(response.body)
      val taxYearsInResponse = (responseBodyJson \\ dateField)
        .map(date => TaxYear.containing(date.as[LocalDate]))
        .distinct

      val currentTaxYear          = TaxYear.containing(LocalDate.now)
      val expectedRangeOfTaxYears = TaxYear.allTaxYearsBetweenDates(currentTaxYear.minusYears(numberOfPreviousTaxYears), currentTaxYear)

      taxYearsInResponse shouldBe expectedRangeOfTaxYears
  }

  And("""^the response body has a (.*) field that contains a date after the - (.*) field$""") { (toDate: String, fromDate: String) =>
    val responseBodyJson  = Json.parse(response.body)
    val toDateAsString    = (responseBodyJson \\ toDate).map(_.as[String]).head.substring(0, 10)
    val fromDateAsString  = (responseBodyJson \\ fromDate).map(_.as[String]).head.substring(0, 10)
    val toDatetimeStamp   = LocalDate.parse(toDateAsString)
    val fromDatetimeStamp = LocalDate.parse(fromDateAsString)

    assert(toDatetimeStamp.isAfter(fromDatetimeStamp))
  }

  Then("""^the response body contains (.*) fields with values keyed by:$""") { (field: String, keysTable: DataTable) =>
    val responseBodyJson = Json.parse(response.body)

    val expectedValues = keysTable.values.asScala.map(scenarioContext)

    withClue(errorLog()) {
      (responseBodyJson \\ field).map(_.as[String]) should contain allElementsOf expectedValues
    }
  }

  Then("""^the response body must contains (.*) key$""") { (field: String) =>
    assert(response.body contains field)

  }

}
