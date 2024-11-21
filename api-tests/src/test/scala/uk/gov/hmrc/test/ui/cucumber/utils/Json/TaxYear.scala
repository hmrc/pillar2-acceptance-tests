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

import org.scalatest.Assertions.fail

import java.time.LocalDate
import scala.math.Ordering.Implicits._

final class TaxYear private (val endYear: Int) {
  def startYear: Int = endYear - 1

  def startDate: LocalDate = TaxYear.startInYear(startYear)
  def endDate: LocalDate   = startDate.plusYears(1).minusDays(1)

  def quarters: Seq[(LocalDate, LocalDate)] = {
    def month(q: Int) = 3 * q

    (0 to 3).map { q =>
      val start = startDate.plusMonths(month(q))
      val end   = startDate.plusMonths(month(q + 1)).minusDays(1)

      (start, end)
    }
  }

  /** The tax year as a string in the format e.g. "23-24".
    */
  val asTys: String = {
    val year2 = endYear - 2000
    val year1 = year2 - 1
    s"$year1-$year2"
  }

  /** The tax year as a string in the format e.g. "2023-24".
    */
  val asMtd: String = {
    val year2 = endYear - 2000
    val year1 = 2000 + (year2 - 1)
    s"$year1-$year2"
  }

  def plusYears(num: Int): TaxYear  = new TaxYear(endYear + num)
  def minusYears(num: Int): TaxYear = plusYears(-num)

  override def toString: String = asMtd

  override def hashCode(): Int = endYear.hashCode

  override def equals(that: Any): Boolean =
    that match {
      case ty: TaxYear => ty.endYear == endYear
      case _           => false
    }

}

object TaxYear extends DateTimeSupport {

  /** UK tax year starts on 6 April.
    */
  private val taxYearMonthStart = 4
  private val taxYearDayStart   = 6

  private val tysRegex = """\d\d-(?<endYear>\d\d)""".r
  private val mtdRegex = """\d\d\d\d-(?<endYear>\d\d)""".r

  def ending(year: Int): TaxYear = new TaxYear(year)

  /** Gets a TaxYear from 22-23 format
    */
  def fromTysFormat(value: String): TaxYear =
    value match {
      case tysRegex(endYear) => TaxYear.ending(2000 + endYear.toInt)
      case _                 => fail("TaxYear provided is not in YY-YY format")
    }

  /** Gets a TaxYear from 2022-23 format
    */
  def fromMtdFormat(value: String): TaxYear =
    value match {
      case mtdRegex(endYear) => TaxYear.ending(2000 + endYear.toInt)
      case _                 => fail("TaxYear provided is not in YYYY-YY format")
    }

  def containing(date: LocalDate): TaxYear = {
    val endYear = if (date < startInYear(date.getYear)) date.getYear else date.getYear + 1

    new TaxYear(endYear)
  }

  private def startInYear(year: Int): LocalDate =
    LocalDate.of(year, taxYearMonthStart, taxYearDayStart)

  def allTaxYearsBetweenDates(from: TaxYear, to: TaxYear): Seq[TaxYear] =
    Range.inclusive(from.endYear, to.endYear).map(year => TaxYear.ending(year))

}
