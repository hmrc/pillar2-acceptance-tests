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

package uk.gov.hmrc.test.ui.cucumber.utils.Json

import org.scalatest.matchers.should.Matchers
import play.api.libs.json.{JsArray, JsObject, JsValue, Json, Reads}

trait JsonTools extends Matchers {

  /** Method for comparing actual response bodies to expected response bodies.
    *
    * @param actual
    *   The actual JSON body returned from an API service.
    * @param expected
    *   The JSON body which is expected to be returned from an API service.
    * @return
    *   Unit - When the actual, and expected JSON bodies match each other.
    * @throws TestFailedException
    *   The actual, and expected bodies do not match each other.
    * @throws JsResultException
    *   Either of the JSON bodies is formatted incorrectly.
    * @throws IOException
    *   An error occurs while trying to parse JSON.
    * @throws JsonMappingException
    *   An error occurs while trying to parse JSON.
    * @throws JsonParseException
    *   An error occurs while trying to parse JSON.
    */
  def compareResponseAsJson(actual: String, expected: String): Unit = {
    val actualJson: JsValue = Json.parse(actual)

    // Checks to see if a certain top-level field exists in the 'actual' response JSON.
    def checkActualFieldExists(field: String): Boolean = (actualJson \ field).isDefined

    // Extracts the 'paths' array from some JSON, and converts it into a Set.
    def getPathsSet(responseObj: JsObject): Set[String] = (responseObj \ "paths")
      .validate[Set[String]]
      .getOrElse(Set.empty[String])

    // Removes the 'paths' array from some JSON, converts it into a Set, and zips it with the remaining JSON.
    def zipJsonWithPathsSet(response: String): (JsValue, Set[String]) = {
      val responseObj: JsObject = Json.parse(response).as[JsObject]
      (responseObj - "paths", getPathsSet(responseObj))
    }

    // Compares two JSON bodies which have a top-level 'paths' array.
    def compareJsonWithPaths(actual: String, expected: String): Unit = {
      zipJsonWithPathsSet(actual) shouldBe zipJsonWithPathsSet(expected)
    }

    /* Extracts the 'errors' array from some JSON, and converts it into a Set. For each item in the 'errors' Set
    also extracts 'paths' array and converts into sub-Set. */
    def getErrorsSet(responseObj: JsObject): Set[(JsValue, Set[String])] = (responseObj \ "errors").toOption
      .fold(Set.empty[(JsValue, Set[String])])(errors => errors.as[Set[JsValue]].map(a => zipJsonWithPathsSet(a.toString())))

    // Compares two JSON bodies which have a top-level 'errors' array.
    def compareJsonWithSubErrors(actual: String, expected: String): Unit = {
      def zipJsonWithErrorsSet(response: String): (JsValue, Set[(JsValue, Set[String])]) = {
        val responseObj: JsObject = Json.parse(response).as[JsObject]
        (responseObj - "errors", getErrorsSet(responseObj))
      }

      zipJsonWithErrorsSet(actual) shouldBe zipJsonWithErrorsSet(expected)
    }

    // Compares two JSON bodies which have both a top-level 'errors', and 'paths' array.
    def compareJsonWithPathsAndSubErrors(actual: String, expected: String): Unit = {
      def zipJsonWithPathsAndErrorsSets(response: String): (JsValue, Set[String], Set[(JsValue, Set[String])]) = {
        val responseObj: JsObject = Json.parse(response).as[JsObject]
        ((responseObj - "errors") - "paths", getPathsSet(responseObj), getErrorsSet(responseObj))
      }

      zipJsonWithPathsAndErrorsSets(actual) shouldBe zipJsonWithPathsAndErrorsSets(expected)
    }

    (checkActualFieldExists(field = "paths"), checkActualFieldExists(field = "errors")) match {
      case (false, false) => actualJson shouldBe Json.parse(expected)
      case (true, false)  => compareJsonWithPaths(actual, expected)
      case (false, true)  => compareJsonWithSubErrors(actual, expected)
      case (true, true)   => compareJsonWithPathsAndSubErrors(actual, expected)
    }
  }

  def compareResponseAsJsonIgnoring(actual: String, expected: String, ignored: Seq[String]): Unit = {
    def removeIgnored[T <: JsValue: Reads](json: T): T = {
      json match {
        case obj: JsObject =>
          JsObject(obj.fields.collect {
            case (name, value) if !ignored.contains(name) => name -> removeIgnored(value)
          }).as[T]
        case arr: JsArray => JsArray(arr.value.map(item => removeIgnored(item))).as[T]
        case other        => other
      }
    }

    val actualJson   = removeIgnored(Json.parse(actual))
    val expectedJson = Json.parse(expected)

    actualJson shouldBe expectedJson
  }

  def retrieveJsonValue(body: String, key: String): String = {
    (Json.parse(body) \\ s"$key").head.toString.replace("\"", "")
  }

  def pathsFor(jsObject: JsObject): Seq[String] =
    pathsAndValues(jsObject, Nil).map(_._1)

  def pathsAndValues(jsObject: JsObject, ignored: Seq[String]): Seq[(String, JsValue)] = {

    def loop(path: String, jsValue: JsValue): Seq[(String, JsValue)] =
      jsValue match {
        case JsObject(fields) =>
          fields.foldLeft(Seq.empty[(String, JsValue)]) { case (acc, (fieldName, fieldValue)) =>
            if (ignored.contains(fieldName))
              acc
            else
              acc ++ loop(s"$path/$fieldName", fieldValue)
          }
        case JsArray(elements) => elements.flatMap(elem => loop(path + "[]", elem)).toList
        case leafValue         => List((path, leafValue))
      }

    loop("", jsObject)
  }

}

object JsonTools extends JsonTools
