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

package uk.gov.hmrc.test.ui.cucumber.endpoints

import java.time.LocalDate
import BasePage.subscriptionApiUrl
import uk.gov.hmrc.test.ui.cucumber.utils.Json.TaxYear

object URLs {

  val currentTaxYear: TaxYear = TaxYear.containing(LocalDate.now)

  val nextTaxYear: TaxYear = TaxYear.containing(LocalDate.now.plusYears(1))

  def retrieveRequestUrl(url: String): String = {

    //priti
    val SubscriptionUrl: String                                      = s"$subscriptionApiUrl"

    /*
    val saApiBaseUrl: String                                         = s"$saApiUrl/${taxPayer.nino}"
    val lossesApiBaseUrl: String                                     = s"$individualLossesApiUrl/${taxPayer.nino}"
    val calcApiBaseUrl: String                                       = s"$individualCalculationApiUrl/${taxPayer.nino}"
    val bissApiBaseUrl: String                                       = s"$saBissApiUrl/${taxPayer.nino}"
    val bsasApiBaseUrl: String                                       = s"$saBsasApiUrl/${taxPayer.nino}"
    val accountsApiBaseUrl: String                                   = s"$saAccountsApiUrl/${taxPayer.nino}"
    val businessDetailsApiBaseUrl: String                            = s"$businessDetailsApiUrl/${taxPayer.nino}"
    val individualsOtherExpensesApiBaseUrl: String                   = s"$individualsExpensesApiUrl/other/${taxPayer.nino}"
    val individualsEmploymentExpensesApiBaseUrl: String              = s"$individualsExpensesApiUrl/employments/${taxPayer.nino}"
    val individualsReliefsInvestmentsApiBaseUrl: String              = s"$individualsReliefsApiUrl/investment/${taxPayer.nino}"
    val individualsOtherReliefsApiBaseUrl: String                    = s"$individualsReliefsApiUrl/other/${taxPayer.nino}"
    val individualsDividendsIncomeApiBaseUrl: String                 = s"$individualsDividendsIncomeApiUrl"
    val individualsForeignReliefsApiBaseUrl: String                  = s"$individualsReliefsApiUrl/foreign/${taxPayer.nino}"
    val individualsForeignIncomeApiBaseUrl: String                   = s"$individualsForeignIncomeApiUrl"
    val individualsEmploymentsIncomeApiBaseUrl: String               = s"$individualsEmploymentsIncomeApiUrl"
    val individualsEmploymentsIncomeNonPayeEmploymentBaseUrl: String = s"$individualsEmploymentsIncomeApiBaseUrl/non-paye/${taxPayer.nino}"
    val individualsPensionsIncomeApiBaseUrl: String                  = s"$individualsPensionsIncomeApiUrl"
    val individualsSavingsIncomeApiBaseUrl: String                   = s"$individualsSavingsIncomeApiUrl"
    val individualsOtherIncomeApiBaseUrl: String                     = s"$individualsOtherIncomeApiUrl"
    val individualsPensionsReliefsApiBaseUrl: String                 = s"$individualsReliefsApiUrl/pensions/${taxPayer.nino}"
    val individualsCharitableGivingReliefsApiBaseUrl: String         = s"$individualsReliefsApiUrl/charitable-giving/${taxPayer.nino}"
    val individualIncomeReceivedApiBaseUrl: String                   = s"$individualsIncomeReceivedApiUrl"
    val individualsCapitalGainsIncomeBaseUrl: String                 = s"$individualsCapitalGainsIncomeUrl"
    val individualInsurancePoliciesIncomeBaseUrl: String             = individualsInsurancePoliciesIncomeApiUrl
    val individualIncomeNonPayeEmploymentBaseUrl: String             = s"$individualIncomeReceivedApiBaseUrl/employments/non-paye/${taxPayer.nino}"
    val otherDeductionsApiBaseUrl: String                            = s"$otherDeductionsApiUrl/${taxPayer.nino}"
    val individualsDisclosuresApiBaseUrl: String                     = s"$individualsDisclosuresApiUrl/${taxPayer.nino}"
    val individualsStateBenefitsApiBaseUrl: String                   = s"$individualsStateBenefitsApiUrl"
    val individualsChargesPensionsApiBaseUrl: String                 = s"$individualsChargesApiUrl/pensions"
    val individualsBusinessEOPSSApiBaseUrl: String                   = s"$individualsBusinessEOPSApiUrl"
    val obligationsApiBaseUrl: String                                = s"$obligationsApiUrl/${taxPayer.nino}"
    val selfEmploymentBusinessApiBaseUrl: String                     = s"$selfEmploymentBusinessApiUrl"
    val cisDeductionsApiBaseUrl: String                              = s"$cisDeductionsApiUrl/${taxPayer.nino}"
    val saTestSupportUrl: String                                     = s"$saTestSupportBaseUrl"
    val saIndividualDetailsBaseUrl: String                           = s"$saIndividualDetailsUrl" */

    url match {

      /*
      // ░▒▓▓▓ CIS Deductions API ▓▓▓▒░
      // V1
      case "cisCreateUrl"              => s"$cisDeductionsApiBaseUrl/amendments"
      case "cisRetrieveUrl"            => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05"
      case "cisRetrieveAllUrl"         => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05&source=all"
      case "cisRetrieveCustomerUrl"    => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05&source=customer"
      case "cisRetrieveContractorUrl"  => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2019-04-06&toDate=2020-04-05&source=contractor"
      case "cisAmendOrDeleteUrl"       => s"$cisDeductionsApiBaseUrl/amendments/$randomSubmissionId"
      case "cisDeleteTysUrl"           => s"$cisDeductionsApiBaseUrl/amendments/$randomSubmissionId?taxYear=$taxYear2023"
      case "cisRetrieveTysUrl"         => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2023-04-06&toDate=2024-04-05"
      case "cisRetrieveAllTysUrl"      => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2023-04-06&toDate=2024-04-05&source=all"
      case "cisRetrieveCustomerTysUrl" => s"$cisDeductionsApiBaseUrl/current-position?fromDate=2023-04-06&toDate=2024-04-05&source=customer"
      case "cisRetrieveContractorTysUrl" =>
        s"$cisDeductionsApiBaseUrl/current-position?fromDate=2023-04-06&toDate=2024-04-05&source=contractor"

      // V2
      case "cisRetrieveAllUrlV2"        => s"$cisDeductionsApiBaseUrl/current-position/$taxYear2021/all"
      case "cisRetrieveCustomerUrlV2"   => s"$cisDeductionsApiBaseUrl/current-position/$taxYear2021/customer"
      case "cisRetrieveContractorUrlV2" => s"$cisDeductionsApiBaseUrl/current-position/$taxYear2021/contractor"

      case "cisRetrieveAllTysUrlV2"        => s"$cisDeductionsApiBaseUrl/current-position/$taxYear2023/all"
      case "cisRetrieveCustomerTysUrlV2"   => s"$cisDeductionsApiBaseUrl/current-position/$taxYear2023/customer"
      case "cisRetrieveContractorTysUrlV2" => s"$cisDeductionsApiBaseUrl/current-position/$taxYear2023/contractor"

      // ░▒▓▓▓ Self Employment Business API ▓▓▓▒░
      case "SelfEmploymentBusinessAnnualSubmissionUrl" => s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/annual/$taxYear2024"
      case "SelfEmploymentBusinessAnnualSubmissionFixedIdUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/X9IS98470026982/annual/$taxYear2019"
      case "SelfEmploymentBusinessAnnualSubmissionTysUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/annual/$taxYear2024"
      case "SelfEmploymentBusinessAnnualSubmissionTysFixedIdUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/X9IS98470026982/annual/$taxYear2023"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryTysUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2023-07-06_2023-10-05?taxYear=$taxYear2023"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummary25Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2025-07-06_2025-10-05?taxYear=$taxYear2025"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryCurrentUrl" =>
        val quarter = currentTaxYear.quarters.head
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/${quarter._1}_${quarter._2}?taxYear=$currentTaxYear"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryCurrentIncorrectUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2022-04-06_2023-04-05?taxYear=$currentTaxYear"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2019-07-06_2019-10-05"
      case "RetrieveSelfEmploymentCumulativeBusinessPeriodSummaryUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/cumulative/${scenarioContext("taxYear")}"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryNonTysUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2019-01-25_2021-01-25?taxYear=$taxYear2019"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryNonTysErrorUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2019-04-06_2020-04-05?taxYear=$taxYear2019"
      case "AmendOrRetrieveSelfEmploymentBusinessPeriodSummaryNoYearUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/2022-04-06_2023-04-05"
      case "CreateOrListSelfEmploymentBusinessPeriodSummariesUrl" => s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period"
      case "CreateOrListSelfEmploymentBusinessPeriodSummariesFixedIdUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/X9IS98470026982/period"
      case "CreateOrListSelfEmploymentBusinessPeriodSummariesTysUrl" => s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period"
      case "CreateOrListSelfEmploymentBusinessPeriodSummariesTysFixedIdUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/X9IS98470026982/period"
      case "ListSelfEmploymentBusinessPeriodSummaries24Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period?taxYear=2024-25"
      case "ListSelfEmploymentBusinessPeriodSummariesTysUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period?taxYear=$taxYear2023"
      case "ListSelfEmploymentBusinessPeriodSummaries25Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period?taxYear=$taxYear2025"

      // V4
      case "SelfEmploymentBusinessAnnualSubmissionV4Url" => s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/annual/${scenarioContext("taxYear")}"
      case "ListSelfEmploymentBusinessPeriodSummariesUrl" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/${scenarioContext("taxYear")}"
      case "ListSelfEmploymentBusinessPeriodSummariesTYSV4Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2023"
      case "AmendRetrieveSelfEmploymentBusinessPeriodSummaryV4Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2019/2019-07-06_2019-10-05"
      case "AmendRetrieveSelfEmploymentBusinessPeriodSummaryTYSV4Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2023/2023-07-06_2023-10-05"
      case "AmendRetrieveSelfEmploymentBusinessPeriodSummary25V5Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2025/2025-07-06_2025-10-05"
      case "AmendRetrieveSelfEmploymentBusinessPeriodSummaryIncorrectV4Url" =>
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/$currentTaxYear/2022-04-06_2023-04-05"
      case "AmendRetrieveSelfEmploymentBusinessPeriodSummaryCurrentV4Url" =>
        val quarter = currentTaxYear.quarters.head
        s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/period/$currentTaxYear/${quarter._1}_${quarter._2}"
      case "CreateAmendSelfEmploymentBusinessCumulativePeriodSummariesUrl" => s"$selfEmploymentBusinessApiBaseUrl/${taxPayer.nino}/$randomBusinessId/cumulative/${scenarioContext("taxYear")}"

      // ░▒▓▓▓ Obligations API ▓▓▓▒░
      case "RetrieveCrystallisationObligationsUrl"          => s"$obligationsApiBaseUrl/crystallisation?taxYear=2018-19"
      case "RetrieveCrystallisationObligationsIncorrectUrl" => s"$obligationsApiBaseUrl/crystallisationa?taxYear=2018-19"
      case "RetrieveEOPSUrl"                                => s"$obligationsApiBaseUrl/end-of-period-statement"
      case "RetrieveEOPSFulfilledUrl"                       => s"$obligationsApiBaseUrl/end-of-period-statement?status=Fulfilled"
      case "RetrieveEOPSFulfilledV3Url"                     => s"$obligationsApiBaseUrl/end-of-period-statement?status=fulfilled"
      case "RetrieveEOPSForeignPropertyUrl"                 => s"$obligationsApiBaseUrl/end-of-period-statement?typeOfBusiness=foreign-property"
      case "RetrieveEOPSDynamicDatesPastUrl"                => s"$obligationsApiBaseUrl/end-of-period-statement?fromDate=2020-04-06&toDate=2021-04-05"
      case "RetrieveEOPSDynamicDatesCurrentOpenUrl"         => s"$obligationsApiBaseUrl/end-of-period-statement?status=Open"
      case "RetrieveEOPSOpenV3Url"                          => s"$obligationsApiBaseUrl/end-of-period-statement?status=open"
      case "RetrieveEOPSDynamicTwoYearsUrl" =>
        val from = currentTaxYear.startDate.withMonth(12).withDayOfMonth(6)
        val to   = currentTaxYear.endDate.withMonth(8).withDayOfMonth(5)
        s"$obligationsApiBaseUrl/end-of-period-statement?fromDate=$from&toDate=$to"
      case "RetrieveEOPSDynamicTwoYears30AugUrl" =>
        val from = currentTaxYear.startDate.withMonth(12).withDayOfMonth(6)
        val to   = currentTaxYear.endDate.withMonth(8).withDayOfMonth(30)
        s"$obligationsApiBaseUrl/end-of-period-statement?fromDate=$from&toDate=$to"
      case "RetrieveEOPSDynamicDatesFutureUrl" => s"$obligationsApiBaseUrl/end-of-period-statement?fromDate=2040-04-06&toDate=2041-04-05"
      case "RetrieveEOPSDynamicFutureOpenUrl"  => s"$obligationsApiBaseUrl/end-of-period-statement?fromDate=2041-04-06&toDate=2042-04-05&status=Open"
      case "RetrieveEOPSDynamicPastFulfilledUrl" =>
        s"$obligationsApiBaseUrl/end-of-period-statement?fromDate=2018-04-06&toDate=2019-04-05&status=Fulfilled"

      case "RetrievePeriodicObligationsUrl"                 => s"$obligationsApiBaseUrl/income-and-expenditure"
      case "RetrievePeriodicObligationsUrlNoDatesOpenUrl"   => s"$obligationsApiBaseUrl/income-and-expenditure?status=Open"
      case "RetrievePeriodicObligationsFutureDatesUrl"      => s"$obligationsApiBaseUrl/income-and-expenditure?fromDate=2040-04-06&toDate=2040-07-05"
      case "RetrievePeriodicObligationsUrlDynamicDates2Url" => s"$obligationsApiBaseUrl/income-and-expenditure?fromDate=2020-04-06&toDate=2020-07-05"
      case "RetrievePeriodicObligationsSpanningTwoTaxYearsUrl" =>
        val from = currentTaxYear.startDate.minusMonths(1)
        val to   = currentTaxYear.endDate.minusMonths(1)
        s"$obligationsApiBaseUrl/income-and-expenditure?fromDate=$from&toDate=$to"
      case "RetrievePeriodicObligationsOpenUrl" => s"$obligationsApiBaseUrl/income-and-expenditure?status=Open&fromDate=2042-04-06&toDate=2043-04-05"
      case "RetrievePeriodicObligationsFulfilledUrl" =>
        s"$obligationsApiBaseUrl/income-and-expenditure?status=Fulfilled&fromDate=2019-04-06&toDate=2020-04-05"

      case "RetrieveFinalDeclarationUrl"                        => s"$obligationsApiBaseUrl/crystallisation?taxYear=2018-19"
      case "RetrieveFinalDeclaration1Url"                       => s"$obligationsApiBaseUrl/crystallisation?taxYear=$currentTaxYear"
      case "RetrieveFinalDeclaration2Url"                       => s"$obligationsApiBaseUrl/crystallisation"
      case "RetrieveFinalDeclaration3Url"                       => s"$obligationsApiBaseUrl/crystallisation?taxYear=2018-19&status=Open"
      case "RetrieveFinalDeclaration4Url"                       => s"$obligationsApiBaseUrl/crystallisation?taxYear=$taxYear2021&status=Fulfilled"
      case "RetrieveFinalDeclarationFulfilledV3Url"             => s"$obligationsApiBaseUrl/crystallisation?taxYear=$taxYear2021&status=fulfilled"
      case "RetrieveFinalDeclaration5Url"                       => s"$obligationsApiBaseUrl/crystallisation?taxYear=$taxYear2020"
      case "RetrieveFinalDeclaration6Url"                       => s"$obligationsApiBaseUrl/crystallisation?taxYear=$currentTaxYear&status=Open"
      case "RetrieveFinalDeclarationOpenV3Url"                  => s"$obligationsApiBaseUrl/crystallisation?taxYear=$currentTaxYear&status=open"
      case "RetrieveFinalDeclarationFutureUrl"                  => s"$obligationsApiBaseUrl/crystallisation?taxYear=2040-41"
      case "RetrieveFinalDeclarationStatus1Url"                 => s"$obligationsApiBaseUrl/crystallisation?status=Open"
      case "RetrieveFinalDeclarationStatusOpenV3Url"            => s"$obligationsApiBaseUrl/crystallisation?status=open"
      case "RetrieveFinalDeclarationStatus2Url"                 => s"$obligationsApiBaseUrl/crystallisation?status=Fulfilled"
      case "RetrieveFinalDeclarationStatusStatusFulfilledV3Url" => s"$obligationsApiBaseUrl/crystallisation?status=fulfilled"

      // ░▒▓▓▓ Individuals State Benefits API ▓▓▓▒░

      case "IndividualsStateBenefitsAmountsUrl"    => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomBenefitId/amounts"
      case "IndividualsStateBenefitsAmountsTYSUrl" => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2023/$randomBenefitId/amounts"
      case "IndividualsStateBenefitsAmountsNoIDUrl" =>
        s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2020/123e4567-e89b-12d3-a456-426614174000/amounts"
      case "IndividualsStateBenefitsAmountsTYSNoIDUrl" =>
        s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2023/123e4567-e89b-12d3-a456-426614174000/amounts"
      case "IndividualsStateBenefitsIgnoreUrl"   => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomBenefitId/ignore"
      case "IndividualsStateBenefitsUnignoreUrl" => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomBenefitId/unignore"
      case "IndividualsStateBenefitsPathIdUrl"   => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2020/$randomBenefitId"
      case "IndividualsStateBenefitsQueryIdUrl"  => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2019?benefitId=$randomBenefitId"
      case "IndividualsStateBenefitsUrl"         => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2020"
      case "IndividualsStateBenefitsTysUrl"      => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2023"
      case "IndividualsStateBenefitsQueryUrl"    => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2020?benefitId="
      case "IndividualsStateBenefitsTysQueryUrl" => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2023?benefitId="
      case "IndividualsStateBenefitsUrlTest"     => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2020?benefitId=$randomBenefitId"
      case "IndividualsStateBenefitsTysUrlTest"  => s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2023?benefitId=$randomBenefitId"
      case "IndividualsStateBenefitsQueryId1Url" =>
        s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2019?benefitId=9d51a3eb-e374-5349-aa02-96db92561138"
      case "IndividualsStateBenefitsQueryId2Url" =>
        s"$individualsStateBenefitsApiBaseUrl/${taxPayer.nino}/$taxYear2022?benefitId=61152305-5d52-2329-9b18-7ab8383313bd"

      // ░▒▓▓▓ Individuals Disclosures API ▓▓▓▒░
      case "IndividualsDisclosuresUrl"          => s"$individualsDisclosuresApiBaseUrl/$nextTaxYear"
      case "MarriageAllowanceUrl"               => s"$individualsDisclosuresApiUrl/marriage-allowance/${taxPayer.nino}"
      case "IndividualsDisclosures_dynamicUrl"  => s"$individualsDisclosuresApiBaseUrl/$taxYear2019"
      case "IndividualsDisclosures_dynamic1Url" => s"$individualsDisclosuresApiBaseUrl/$taxYear2020"

      // ░▒▓▓▓ Property Business API ▓▓▓▒░
      // Annual

      case "UKPropertyAnnualSubmissionUrl" => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/annual/${scenarioContext("taxYear")}"

      case "UKPropertyAnnualSubmissionFixedIdUrl"    => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/X9IS98470026982/annual/$taxYear2022"
      case "UKPropertyAnnualSubmissionTysFixedIdUrl" => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/X9IS98470026982/annual/$taxYear2023"

      case "ForeignPropertyAnnualSubmissionTysUrl" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/annual/${scenarioContext("taxYear")}"
      case "ForeignPropertyAnnualSubmissionTysFixedBusinessIdUrl" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/X9IS98470026982/annual/$taxYear2023"
      case "ForeignPropertyAnnualSubmissionUrl" => s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/annual/$taxYear2022"
      case "ForeignPropertyAnnualSubmissionFixedBusinessIdUrl" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/X9IS98470026982/annual/$taxYear2022"

      case "DeletePropertyAnnualSubmissionUrl" => s"$propertyBusinessApiUrl/${taxPayer.nino}/$randomBusinessId/annual/${scenarioContext("taxYear")}"
      case "DeletePropertyAnnualSubmissionTysUrl" => s"$propertyBusinessApiUrl/${taxPayer.nino}/$randomBusinessId/annual/$taxYear2023"

      // Periodic
      case "UKPropertyPeriodSummaryUrl"       => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2022"
      case "UKPropertyPeriodSummaryTysUrl"    => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2023"
      case "UKPropertyPeriodSummaryTy2024Url" => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2024"
      case "UKPropertyPeriodSummaryTy2025Url" => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2025"

      case "UKPropertyPeriodSummaryFixedIdUrl"    => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/X9IS98470026982/period/$taxYear2022"
      case "UKPropertyPeriodSummaryTysFixedIdUrl" => s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/X9IS98470026982/period/$taxYear2023"

      case "RetrieveUKPropertyPeriodSummaryUrl" =>
        s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2022/$randomSubmissionId"
      case "UKPropertyCumulativeSummaryUrl" =>
        s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/cumulative/${scenarioContext("taxYear")}"
      case "RetrieveUKPropertyPeriodSummaryTysUrl" =>
        s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2023/$randomSubmissionId"
      case "RetrieveUKPropertyPeriodSummaryTy2024Url" =>
        s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2024/$randomSubmissionId"
      case "RetrieveUKPropertyPeriodSummaryTy2025Url" =>
        s"$propertyBusinessApiUrl/uk/${taxPayer.nino}/$randomBusinessId/period/$taxYear2025/$randomSubmissionId"

      case "ForeignPropertyPeriodCumulativeSummaryUrl" =>   s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/cumulative/${scenarioContext("taxYear")}"
      case "ForeignPropertyPeriodSummaryUrl" => s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2022"
      case "ForeignPropertyPeriodSummaryTysUrl"    => s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2023"
      case "ForeignPropertyPeriodSummaryTy2425Url" => s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2024"
      case "ForeignPropertyPeriodSummaryTy2526Url" => s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2025"
      case "ForeignPropertyPeriodSummaryFixedBusinessIdUrl" => s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/X9IS98470026982/period/$taxYear2022"
      case "ForeignPropertyPeriodSummaryTysFixedBusinessIdUrl" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/X9IS98470026982/period/$taxYear2023"
      case "RetrieveForeignPropertyPeriodSummaryUrl" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2022/$randomSubmissionId"
      case "RetrieveForeignPropertyPeriodSummaryTysUrl" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2023/$randomSubmissionId"
      case "RetrieveForeignPropertyPeriodSummaryTy2425Url" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2024/$randomSubmissionId"
      case "RetrieveForeignPropertyPeriodSummaryTy2526Url" =>
        s"$propertyBusinessApiUrl/foreign/${taxPayer.nino}/$randomBusinessId/period/$taxYear2025/$randomSubmissionId"

      case "ListPropertyPeriodSummariesUrl"        => s"$propertyBusinessApiUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2022"
      case "ListPropertyPeriodSummariesTysUrl"     => s"$propertyBusinessApiUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2023"
      case "ListPropertyPeriodSummariesTys2425Url" => s"$propertyBusinessApiUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2024"
      case "ListPropertyPeriodSummaries2526Url"    => s"$propertyBusinessApiUrl/${taxPayer.nino}/$randomBusinessId/period/$taxYear2025"

      // ░▒▓▓▓ Historic endpoints within Property Business API V2 ▓▓▓▒░
      case "HistoricFhlUKPropertyAnnualSubmissionUrl" =>
        s"$propertyBusinessApiUrl/uk/annual/furnished-holiday-lettings/${taxPayer.nino}/$taxYear2021"
      case "HistoricNonFhlUKPropertyAnnualSubmissionUrl" =>
        s"$propertyBusinessApiUrl/uk/annual/non-furnished-holiday-lettings/${taxPayer.nino}/$taxYear2021"

      case "HistoricFhlUKPropertyPeriodSummaryUrl"    => s"$propertyBusinessApiUrl/uk/period/furnished-holiday-lettings/${taxPayer.nino}"
      case "HistoricNonFhlUKPropertyPeriodSummaryUrl" => s"$propertyBusinessApiUrl/uk/period/non-furnished-holiday-lettings/${taxPayer.nino}"

      case "HistoricFhlUKPropertyPeriodSummaryPeriodUrl" =>
        s"$propertyBusinessApiUrl/uk/period/furnished-holiday-lettings/${taxPayer.nino}/2017-04-06_2017-07-05"
      case "HistoricFhlUKPropertyPeriodSummaryPeriod2Url" =>
        s"$propertyBusinessApiUrl/uk/period/furnished-holiday-lettings/${taxPayer.nino}/2018-04-06_2018-07-05"
      case "HistoricNonFhlUKPropertyPeriodSummaryPeriodUrl" =>
        s"$propertyBusinessApiUrl/uk/period/non-furnished-holiday-lettings/${taxPayer.nino}/2017-04-06_2017-07-04"
      case "HistoricNonFhlUKPropertyPeriodSummaryPeriod2Url" =>
        s"$propertyBusinessApiUrl/uk/period/non-furnished-holiday-lettings/${taxPayer.nino}/2018-04-06_2018-07-04"

      // ░▒▓▓▓ Other Deductions API ▓▓▓▒░
      case "OtherDeductionsUrl"    => s"$otherDeductionsApiBaseUrl/$taxYear2021"
      case "OtherDeductionsTysUrl" => s"$otherDeductionsApiBaseUrl/$taxYear2023"

      // ░▒▓▓▓ Individual Income Received API ▓▓▓▒░
      // Additional Income
      case "IndividualsIncomeReceivedSavingsUrl"           => s"$individualIncomeReceivedApiBaseUrl/savings/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedSavingsTysUrl"        => s"$individualIncomeReceivedApiBaseUrl/savings/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedInsurancePoliciesUrl" => s"$individualIncomeReceivedApiBaseUrl/insurance-policies/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedInsurancePoliciesTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/insurance-policies/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedForeignUrl"            => s"$individualIncomeReceivedApiBaseUrl/foreign/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedForeignTysUrl"         => s"$individualIncomeReceivedApiBaseUrl/foreign/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedPensionsUrl"           => s"$individualIncomeReceivedApiBaseUrl/pensions/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedPensionsTysUrl"        => s"$individualIncomeReceivedApiBaseUrl/pensions/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedOtherUrl"              => s"$individualIncomeReceivedApiBaseUrl/other/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedOtherTysUrl"           => s"$individualIncomeReceivedApiBaseUrl/other/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedOtherEmploymentUrl"    => s"$individualIncomeReceivedApiBaseUrl/employments/other/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedOtherEmploymentTysUrl" => s"$individualIncomeReceivedApiBaseUrl/employments/other/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedDividendsUrl"          => s"$individualIncomeReceivedApiBaseUrl/dividends/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedDividendsTysUrl"       => s"$individualIncomeReceivedApiBaseUrl/dividends/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedUkDividendsUrl"        => s"$individualIncomeReceivedApiBaseUrl/uk-dividends/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedUkDividendsTysUrl"     => s"$individualIncomeReceivedApiBaseUrl/uk-dividends/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedUkSavingsAccountsUrl"  => s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}"
      case "IndividualsIncomeReceivedUkSavingsAccountsWithIncomeSourceIdUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}?incomeSourceId=123456789012345"
      case "IndividualsIncomeReceivedUkSavingsAccountsSingleRetrieveUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}?savingsAccountId=$randomSavingsAccountId"
      case "IndividualsIncomeReceivedUkSavingsAccountsSingleRetrieveStatefulUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}?savingsAccountId="
      case "IndividualsIncomeReceivedUkSavingsAccountSummaryUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}/$taxYear2019/$randomSavingsAccountId"
      case "IndividualsIncomeReceivedUkSavingsAccountSummaryTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}/$taxYear2023/$randomSavingsAccountId"
      case "IndividualsIncomeReceivedUkSavingsAccountSummaryDummySAIdUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}/$taxYear2019/SAVKB2UVwUTBQGJ"
      case "IndividualsIncomeReceivedUkSavingsAccountSummaryTysDummySAIdUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}/$taxYear2023/SAVKB2UVwUTBQGJ"
      case "IndividualsIncomeReceivedUkSavingsAccountSummaryStatefulUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedUkSavingsAccountSummaryStatefulTYSUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/savings/uk-accounts/${taxPayer.nino}/$taxYear2023"

      // Employments
      case "IndividualsIncomeReceivedEmploymentsUrl"    => s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedEmploymentsTysUrl" => s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedEmploymentsIgnoreUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/ignore"
      case "IndividualsIncomeReceivedEmploymentsIgnoreTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/ignore"
      case "IndividualsIncomeReceivedEmploymentsUnignoreUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/unignore"
      case "IndividualsIncomeReceivedEmploymentsUnignoreTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/unignore"
      case "IndividualsIncomeReceivedEmploymentsIdUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019/$randomEmploymentId"
      case "IndividualsIncomeReceivedFinancialDetailsUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details"
      case "IndividualsIncomeReceivedFinancialDetailsWithNoEmploymentIdUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019"
      case "IndividualsIncomeReceivedFinancialDetailsWithNoEmploymentIdTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedFinancialDetailsTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details"
      case "IndividualsIncomeReceivedFinancialDetailsLatestUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details?source=latest"
      case "IndividualsIncomeReceivedFinancialDetailsLatestTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details?source=latest"
      case "IndividualsIncomeReceivedFinancialDetailsUserUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details?source=user"
      case "IndividualsIncomeReceivedFinancialDetailsUserTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details?source=user"
      case "IndividualsIncomeReceivedFinancialDetailsHMRCHeldUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details?source=hmrcHeld"
      case "IndividualsIncomeReceivedFinancialDetailsHMRCHeldTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/employments/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details?source=hmrcHeld"

      // Capital Gains Tax
      case "IndividualsIncomeReceivedOtherCapitalGainsUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/other-gains/${taxPayer.nino}/$taxYear2021"
      case "IndividualsIncomeReceivedOtherCapitalGainsTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/other-gains/${taxPayer.nino}/$taxYear2023"
      case "IndividualsIncomeReceivedPPDUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2020/ppd"
      case "IndividualsIncomeReceivedPPDTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2023/ppd"
      case "CgtRetrieveResidentialPropertyUrl" => s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2020"
      case "CgtRetrieveResidentialPropertyTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2023"
      case "CgtRetrieveResidentialPropertyUserUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2020?source=user"
      case "CgtRetrieveResidentialPropertyUserTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2023?source=user"
      case "CgtRetrieveResidentialPropertyHmrcHeldUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2020?source=hmrcHeld"
      case "CgtRetrieveResidentialPropertyHmrcHeldTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2023?source=hmrcHeld"
      case "CgtRetrieveResidentialPropertyLatestUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2020?source=latest"
      case "CgtRetrieveResidentialPropertyLatestTysUrl" =>
        s"$individualIncomeReceivedApiBaseUrl/disposals/residential-property/${taxPayer.nino}/$taxYear2023?source=latest"

      // Non-PAYE
      case "IndividualsIncomeReceivedNonPayeEmploymentIncomeUrl"    => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2020"
      case "IndividualsIncomeReceivedNonPayeEmploymentIncomeTysUrl" => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2023"
      case "IndividualsIncomeReceivedNonPayeUserUrl"                => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2020?source=user"
      case "IndividualsIncomeReceivedNonPayeUserTysUrl"             => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2023?source=user"
      case "IndividualsIncomeReceivedNonPayeHMRCHeldUrl"            => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2020?source=hmrcHeld"
      case "IndividualsIncomeReceivedNonPayeHMRCHeldTysUrl"         => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2023?source=hmrcHeld"
      case "IndividualsIncomeReceivedNonPayeLatestUrl"              => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2020?source=latest"
      case "IndividualsIncomeReceivedNonPayeLatestTysUrl"           => s"$individualIncomeNonPayeEmploymentBaseUrl/$taxYear2023?source=latest"

      // ░▒▓▓▓ Individuals Dividends Income API ▓▓▓▒░
      case "IndividualsDividendsIncomeUrl"             => s"$individualsDividendsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "IndividualsDividendsIncomeTysUrl"          => s"$individualsDividendsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023"
      case "IndividualsUkDividendsAnnualSummaryUrl"    => s"$individualsDividendsIncomeApiBaseUrl/uk/${taxPayer.nino}/$taxYear2019"
      case "IndividualsUkDividendsAnnualSummaryTysUrl" => s"$individualsDividendsIncomeApiBaseUrl/uk/${taxPayer.nino}/$taxYear2023"

      // ░▒▓▓▓ Individuals Capital Gains Income API ▓▓▓▒░
      case "IndividualsOtherCapitalGainsIncomeUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/other-gains/${taxPayer.nino}/$taxYear2021"
      case "IndividualsOtherCapitalGainsIncomeTysUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/other-gains/${taxPayer.nino}/$taxYear2023"
      case "IndividualsCapitalGainsIncomePPDUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2020/ppd"
      case "IndividualsCapitalGainsIncomePPDTysUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2023/ppd"
      case "IndividualsCgtRetrieveResidentialPropertyUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2020"
      case "IndividualsCgtRetrieveResidentialPropertyTysUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2023"
      case "IndividualsCgtRetrieveResidentialPropertyUserUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2020?source=user"
      case "IndividualsCgtRetrieveResidentialPropertyUserTysUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2023?source=user"
      case "IndividualsCgtRetrieveResidentialPropertyHmrcHeldUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2020?source=hmrc-held"
      case "IndividualsCgtRetrieveResidentialPropertyHmrcHeldTysUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2023?source=hmrc-held"
      case "IndividualsCgtRetrieveResidentialPropertyLatestUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2020?source=latest"
      case "IndividualsCgtRetrieveResidentialPropertyLatestTysUrl" =>
        s"$individualsCapitalGainsIncomeBaseUrl/residential-property/${taxPayer.nino}/$taxYear2023?source=latest"

      // ░▒▓▓▓ Individuals Foreign Income API ▓▓▓▒░
      case "ForeignIncomeUrl"    => s"$individualsForeignIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "ForeignIncomeTysUrl" => s"$individualsForeignIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023"

      // ░▒▓▓▓ Individuals Employments Income API ▓▓▓▒░
      case "IndividualsEmploymentsIncomeUrl" => s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "IndividualsEmploymentsIncomeFinancialDetailsHMRCHeldUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details?source=hmrc-held"
      case "IndividualsEmploymentsIncomeFinancialDetailsUserUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details?source=user"
      case "IndividualsEmploymentsIncomeFinancialDetailsLatestUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details?source=latest"
      case "IndividualsEmploymentsIncomeFinancialDetailsUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/financial-details"
      case "IndividualsEmploymentsIncomeFinancialDetailsHMRCHeldTysUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details?source=hmrc-held"
      case "IndividualsEmploymentsIncomeFinancialDetailsUserTysUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details?source=user"
      case "IndividualsEmploymentsIncomeFinancialDetailsLatestTysUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details?source=latest"
      case "IndividualsEmploymentsIncomeFinancialDetailsTysUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023/$randomEmploymentId/financial-details"
      case "IndividualsEmploymentsIncomeEmploymentsIdUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomEmploymentId"
      case "IndividualsEmploymentsIncomeEmploymentsUrl"    => s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "IndividualsEmploymentsIncomeEmploymentsTysUrl" => s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023"
      case "IndividualsEmploymentsIncomeEmploymentsIgnoreUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/ignore"
      case "IndividualsEmploymentsIncomeEmploymentsUnignoreUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019/$randomEmploymentId/unignore"
      case "IndividualsEmploymentsIncomeFinancialDetailsWithNoEmploymentIdUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "IndividualsEmploymentsIncomeFinancialDetailsWithNoEmploymentIdTysUrl" =>
        s"$individualsEmploymentsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023"
      case "IndividualsEmploymentsIncomeOtherEmploymentUrl"    => s"$individualsEmploymentsIncomeApiBaseUrl/other/${taxPayer.nino}/$taxYear2019"
      case "IndividualsEmploymentsIncomeOtherEmploymentTysUrl" => s"$individualsEmploymentsIncomeApiBaseUrl/other/${taxPayer.nino}/$taxYear2023"

      // Non-PAYE
      case "IndividualsEmploymentsIncomeNonPayeEmploymentIncomeUrl"    => s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2020"
      case "IndividualsEmploymentsIncomeNonPayeEmploymentIncomeTysUrl" => s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2023"
      case "IndividualsEmploymentsIncomeNonPayeUserUrl"     => s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2020?source=user"
      case "IndividualsEmploymentsIncomeNonPayeUserTysUrl"  => s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2023?source=user"
      case "IndividualsEmploymentsIncomeNonPayeHMRCHeldUrl" => s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2020?source=hmrc-held"
      case "IndividualsEmploymentsIncomeNonPayeHMRCHeldTysUrl" =>
        s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2023?source=hmrc-held"
      case "IndividualsEmploymentsIncomeNonPayeLatestUrl"    => s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2020?source=latest"
      case "IndividualsEmploymentsIncomeNonPayeLatestTysUrl" => s"$individualsEmploymentsIncomeNonPayeEmploymentBaseUrl/$taxYear2023?source=latest"

      // ░▒▓▓▓ Individuals Pensions Income API ▓▓▓▒░
      case "PensionsIncomeUrl"    => s"$individualsPensionsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "PensionsIncomeTysUrl" => s"$individualsPensionsIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023"

      // ░▒▓▓▓ Individuals Savings Income API ▓▓▓▒░

      case "IndividualsSavingsIncomeUrl"                => s"$individualsSavingsIncomeApiBaseUrl/other/${taxPayer.nino}/$taxYear2019"
      case "IndividualsSavingsIncomeTysUrl"             => s"$individualsSavingsIncomeApiBaseUrl/other/${taxPayer.nino}/$taxYear2023"
      case "IndividualsSavingsIncomeSavingsAccountsUrl" => s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}"
      case "IndividualsSavingsIncomeSavingsAccountSummaryUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}/$taxYear2019/$randomSavingsAccountId"
      case "IndividualsSavingsIncomeSavingsAccountSummaryStatefulUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}/$taxYear2019"
      case "IndividualsSavingsIncomeSavingsAccountSummaryStatefulTysUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}/$taxYear2023"
      case "IndividualsSavingsIncomeSavingsAccountSummaryTysUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}/$taxYear2023/$randomSavingsAccountId"
      case "IndividualsSavingsIncomeUkSavingsAccountsSingleRetrieveUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}?savingsAccountId=$randomSavingsAccountId"
      case "IndividualsSavingsIncomeUkSavingsAccountsWithIncomeSourceIdUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}?incomeSourceId=123456789012345"
      case "IndividualsSavingsIncomeUkSavingsAccountSummaryDummySAIdUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}/$taxYear2019/SAVKB2UVwUTBQGJ"
      case "IndividualsSavingsIncomeUkSavingsAccountSummaryTysDummySAIdUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}/$taxYear2023/SAVKB2UVwUTBQGJ"
      case "IndividualsSavingsIncomeUkSavingsAccountsSingleRetrieveStatefulUrl" =>
        s"$individualsSavingsIncomeApiBaseUrl/uk-accounts/${taxPayer.nino}?savingsAccountId="

      // ░▒▓▓▓ Individuals Other Income API ▓▓▓▒░
      case "OtherIncomeUrl"    => s"$individualsOtherIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "OtherIncomeTysUrl" => s"$individualsOtherIncomeApiBaseUrl/${taxPayer.nino}/$taxYear2023"

      // ░▒▓▓▓ Individuals Reliefs API ▓▓▓▒░
      case "ReliefsInvestmentsUrl"         => s"$individualsReliefsInvestmentsApiBaseUrl/$taxYear2020"
      case "ReliefsInvestmentsTysUrl"      => s"$individualsReliefsInvestmentsApiBaseUrl/$taxYear2023"
      case "OtherReliefsUrl"               => s"$individualsOtherReliefsApiBaseUrl/$taxYear2020"
      case "OtherReliefsTysUrl"            => s"$individualsOtherReliefsApiBaseUrl/$taxYear2023"
      case "ForeignReliefsUrl"             => s"$individualsForeignReliefsApiBaseUrl/$taxYear2020"
      case "ForeignReliefsTysUrl"          => s"$individualsForeignReliefsApiBaseUrl/$taxYear2023"
      case "PensionReliefsTysUrl"          => s"$individualsPensionsReliefsApiBaseUrl/$taxYear2023"
      case "PensionReliefsUrl"             => s"$individualsPensionsReliefsApiBaseUrl/$taxYear2020"
      case "CharitableGivingReliefsTysUrl" => s"$individualsCharitableGivingReliefsApiBaseUrl/$taxYear2023"
      case "CharitableGivingReliefsUrl"    => s"$individualsCharitableGivingReliefsApiBaseUrl/$taxYear2020"

      // ░▒▓▓▓ Individuals Expenses API ▓▓▓▒░
      case "individualsOtherExpensesUrl"        => s"$individualsOtherExpensesApiBaseUrl/$taxYear2021"
      case "individualsOtherExpensesTysUrl"     => s"$individualsOtherExpensesApiBaseUrl/$taxYear2023"
      case "employmentExpensesUrl"              => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2019"
      case "employmentExpensesTysUrl"           => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2023"
      case "hmrcEmploymentExpensesUrl"          => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2019?source=hmrcHeld"
      case "hmrcEmploymentExpensesTysUrl"       => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2023?source=hmrcHeld"
      case "userEmploymentExpensesUrl"          => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2019?source=user"
      case "userEmploymentExpensesTysUrl"       => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2023?source=user"
      case "latestEmploymentExpensesUrl"        => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2019?source=latest"
      case "latestEmploymentExpensesTysUrl"     => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2023?source=latest"
      case "ignoreEmploymentExpensesUrl"        => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2019/ignore"
      case "ignoreEmploymentExpensesTysUrl"     => s"$individualsEmploymentExpensesApiBaseUrl/$taxYear2023/ignore"
      case "hmrcCurrentEmploymentExpensesUrl"   => s"$individualsEmploymentExpensesApiBaseUrl/$getTaxYear?source=hmrcHeld"
      case "userCurrentEmploymentExpensesUrl"   => s"$individualsEmploymentExpensesApiBaseUrl/$getTaxYear?source=user"
      case "latestCurrentEmploymentExpensesUrl" => s"$individualsEmploymentExpensesApiBaseUrl/$getTaxYear?source=latest"

      // ░▒▓▓▓ Business Details API ▓▓▓▒░
      case "ListAllBusinessesUrl"                      => s"$businessDetailsApiBaseUrl/list"
      case "RetrieveBusinessDetailsDefaultUrl"         => s"$businessDetailsApiBaseUrl/XBIS12345678901"
      case "RetrieveBusinessDetailsCashDefaultUrl"     => s"$businessDetailsApiBaseUrl/XBIS12345678902"
      case "RetrieveBusinessDetailsPropertyUrl"        => s"$businessDetailsApiBaseUrl/XPIS12345678901"
      case "RetrieveBusinessDetailsCashPropertyUrl"    => s"$businessDetailsApiBaseUrl/XPIS12345678902"
      case "RetrieveBusinessDetailsForeignUrl"         => s"$businessDetailsApiBaseUrl/XFIS12345678901"
      case "RetrieveBusinessDetailsCashForeignUrl"     => s"$businessDetailsApiBaseUrl/XFIS12345678902"
      case "RetrieveBusinessDetailsUnspecifiedUrl"     => s"$businessDetailsApiBaseUrl/XAIS12345678901"
      case "RetrieveBusinessDetailsCashUnspecifiedUrl" => s"$businessDetailsApiBaseUrl/XAIS12345678902"
      case "BusinessDetailsUrl"                        => s"$businessDetailsApiBaseUrl"
      case "CreateAmendQuarterlyPeriodTypeUrl"         => s"$businessDetailsApiBaseUrl/XAIS12345678902/$taxYear2023"

      // ░▒▓▓▓ Self Assessment Individual Details API ▓▓▓▒░
      case "RetrieveItsaStatus"                => s"$saIndividualDetailsBaseUrl/itsa-status/${taxPayer.nino}/$taxYear2019"
      case "RetrieveItsaStatusWithHistory"     => s"$saIndividualDetailsBaseUrl/itsa-status/${taxPayer.nino}/$taxYear2019?history=true"
      case "RetrieveItsaStatusWithFutureYears" => s"$saIndividualDetailsBaseUrl/itsa-status/${taxPayer.nino}/$taxYear2019?futureYears=true"
      case "RetrieveItsaStatusWithFutureYearsAndHistory" =>
        s"$saIndividualDetailsBaseUrl/itsa-status/${taxPayer.nino}/$taxYear2019?futureYears=true&history=true"

      // ░▒▓▓▓ Self Assessment Accounts API ▓▓▓▒░
      // Payments and Liabilities
      case "RetrieveChargeHistoryUrl"                  => s"$accountsApiBaseUrl/charges/$randomTransactionId"
      case "RetrieveChargeHistoryWithTransactionIdUrl" => s"$accountsApiBaseUrl/charges/transactionId/$randomTransactionId"
      case "RetrieveChargeHistoryWithChargeRefUrl"     => s"$accountsApiBaseUrl/charges/chargeReference/$randomChargeRef"
      case "RetrieveBalanceTransactionsUrl"      => s"$accountsApiBaseUrl/balance-and-transactions"
      case "ListPaymentsAndAllocationDetailsUrl" => s"$accountsApiBaseUrl/payments-and-allocations"

      // Coding Out Underpayments and Debts
      case "RetrieveCodingOutUnderpaymentsDefaultUrl"     => s"$accountsApiBaseUrl/$taxYear2019/collection/tax-code"
      case "RetrieveCodingOutUnderpaymentsDefaultTysUrl"  => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code"
      case "RetrieveCodingOutUnderpaymentsLatestUrl"      => s"$accountsApiBaseUrl/$taxYear2019/collection/tax-code?source=latest"
      case "RetrieveCodingOutUnderpaymentsLatestTysUrl"   => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code?source=latest"
      case "RetrieveCodingOutUnderpaymentsUserUrl"        => s"$accountsApiBaseUrl/$taxYear2019/collection/tax-code?source=user"
      case "RetrieveCodingOutUnderpaymentsUserTysUrl"     => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code?source=user"
      case "RetrieveCodingOutUnderpaymentsHmrcHeldUrl"    => s"$accountsApiBaseUrl/$taxYear2019/collection/tax-code?source=hmrcHeld"
      case "RetrieveCodingOutUnderpaymentsHmrcHeldTysUrl" => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code?source=hmrcHeld"
      case "CodingOutUrl"                                 => s"$accountsApiBaseUrl/$taxYear2019/collection/tax-code"
      case "CodingOutTysUrl"                              => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code"

      // Coding Out Status
      case "RetrieveCodingOutStatusUrl" => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code/coding-out/status"
      case "OptInToCodingOutUrl"        => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code/coding-out/opt-in"
      case "OptOutOfCodingOutUrl"       => s"$accountsApiBaseUrl/$taxYear2023/collection/tax-code/coding-out/opt-out"

      // ░▒▓▓▓ Self Assessment BISS API ▓▓▓▒░
      // V1
      case "RetrieveSEBissUrl"               => s"$bissApiBaseUrl/self-employment?selfEmploymentId=$randomSelfEmploymentId&taxYear=2017-18"
      case "RetrieveIncorrectSEBissUrl"      => s"$bissApiBaseUrl/self-employment/INCORRECT?selfEmploymentId=$randomSelfEmploymentId&taxYear=2017-18"
      case "RetrieveSEBissWithoutTaxYearUrl" => s"$bissApiBaseUrl/self-employment?selfEmploymentId=$randomSelfEmploymentId"
      case "RetrieveUkPropBissUrl"           => s"$bissApiBaseUrl/uk-property?typeOfBusiness=uk-property-fhl&taxYear=2017-18"
      case "RetrieveUkPropBissWithoutTaxYearUrl" => s"$bissApiBaseUrl/uk-property?typeOfBusiness=uk-property-fhl"
      case "RetrieveForeignPropFhlBissUrl" =>
        s"$bissApiBaseUrl/foreign-property?typeOfBusiness=foreign-property-fhl-eea&businessId=XAIS12345678910&taxYear=$taxYear2019"
      case "RetrieveForeignPropFhlBissWithoutTaxYearUrl" =>
        s"$bissApiBaseUrl/foreign-property?typeOfBusiness=foreign-property-fhl-eea&businessId=XAIS12345678910"
      case "RetrieveForeignPropBissUrl" =>
        s"$bissApiBaseUrl/foreign-property?typeOfBusiness=foreign-property&businessId=XAIS12345678910&taxYear=$taxYear2019"
      // V2
      case "RetrieveSEBissUrlV2"          => s"$bissApiBaseUrl/self-employment/$taxYear2020/XAIS12345678910"
      case "RetrieveForeignPropBissUrlV2" => s"$bissApiBaseUrl/foreign-property/$taxYear2020/XAIS12345678910"
      case "RetrieveUkPropBissUrlV2"      => s"$bissApiBaseUrl/uk-property-fhl/$taxYear2020/XAIS12345678910"
      // TYS
      case "RetrieveSEBissUrlTYSV2"          => s"$bissApiBaseUrl/self-employment/$taxYear2023/XAIS12345678910"
      case "RetrieveForeignPropBissUrlTYSV2" => s"$bissApiBaseUrl/foreign-property/$taxYear2023/XAIS12345678910"
      case "RetrieveUkPropBissUrlTYSV2"      => s"$bissApiBaseUrl/uk-property-fhl/$taxYear2023/XAIS12345678910"

      // ░▒▓▓▓ Self Assessment BSAS API ▓▓▓▒░
      // V2
      case "TriggerBsasUrl"                  => s"$bsasApiBaseUrl/trigger"
      case "SaBsasListUrl"                   => s"$bsasApiBaseUrl?taxYear=$getTaxYear"
      case "SaBsasListTysUrl"                => s"$bsasApiBaseUrl?taxYear=$taxYear2023"
      case "SaBsasListUrl2025"               => s"$bsasApiBaseUrl?taxYear=$taxYear2025"
      case "SaBsasListNonTysSEUrl"           => s"$bsasApiBaseUrl?taxYear=$taxYear2019&typeOfBusiness=self-employment&businessId=XAIS12345678901"
      case "SaBsasListNonTysUKPropFHLUrl"    => s"$bsasApiBaseUrl?taxYear=$taxYear2019&typeOfBusiness=uk-property-fhl&businessId=XAIS12345678904"
      case "SaBsasListNonTysUKPropNonFHLUrl" => s"$bsasApiBaseUrl?taxYear=$taxYear2019&typeOfBusiness=uk-property-non-fhl&businessId=XAIS12345678902"
      case "SaBsasListNonTysUKPropUrl"       => s"$bsasApiBaseUrl?taxYear=$taxYear2019&typeOfBusiness=uk-property&businessId=XAIS12345678902"
      case "SaBsasListNonTysForeignPropFHLEEAUrl" =>
        s"$bsasApiBaseUrl?taxYear=$taxYear2019&typeOfBusiness=foreign-property-fhl-eea&businessId=XAIS12345678903"
      case "SaBsasListNonTysForeignPropUrl" => s"$bsasApiBaseUrl?taxYear=$taxYear2019&typeOfBusiness=foreign-property&businessId=XAIS12345678915"
      case "SaBsasListTysSEUrl"             => s"$bsasApiBaseUrl?taxYear=2040-41&typeOfBusiness=self-employment&businessId=XAIS12345678901"
      case "SaBsasListTysUKPropFHLUrl"      => s"$bsasApiBaseUrl?taxYear=2040-41&typeOfBusiness=uk-property-fhl&businessId=XAIS12345678904"
      case "SaBsasListTysUKPropNonFHLUrl"   => s"$bsasApiBaseUrl?taxYear=2040-41&typeOfBusiness=uk-property-non-fhl&businessId=XAIS12345678902"
      case "SaBsasListTysForeignPropFHLEEAUrl" =>
        s"$bsasApiBaseUrl?taxYear=2040-41&typeOfBusiness=foreign-property-fhl-eea&businessId=XAIS12345678903"
      case "SaBsasListTysForeignPropUrl" => s"$bsasApiBaseUrl?taxYear=2040-41&typeOfBusiness=foreign-property&businessId=XAIS12345678915"
      case "SaBsasListCurrentYearUrl"    => s"$bsasApiBaseUrl"
      case "SaBsasListDates1Url"         => s"$bsasApiBaseUrl?typeOfBusiness=self-employment&businessId=XAIS12345678901"
      case "SaBsasListDates2Url"         => s"$bsasApiBaseUrl?typeOfBusiness=uk-property-non-fhl&businessId=XAIS12345678902"

      case "RetrieveUkPropBsasUrlNoParameters"         => s"$bsasApiBaseUrl/property/$randomBsasId"
      case "RetrieveUkPropBsasUrlReturnTrue"           => s"$bsasApiBaseUrl/property/$randomBsasId?adjustedStatus=true"
      case "RetrieveUkPropBsasUrlReturnFalse"          => s"$bsasApiBaseUrl/property/$randomBsasId?adjustedStatus=false"
      case "RetrieveSelfEmploymentBsasUrlNoParameters" => s"$bsasApiBaseUrl/self-employment/$randomBsasId"
      case "RetrieveSelfEmploymentBsasUrlReturnTrue"   => s"$bsasApiBaseUrl/self-employment/$randomBsasId?adjustedStatus=true"
      case "RetrieveSelfEmploymentBsasUrlReturnFalse"  => s"$bsasApiBaseUrl/self-employment/$randomBsasId?adjustedStatus=false"
      case "RetrieveForeignPropBsasUrlNoParameters"    => s"$bsasApiBaseUrl/foreign-property/$randomBsasId"
      case "RetrieveForeignPropBsasUrlReturnTrue"      => s"$bsasApiBaseUrl/foreign-property/$randomBsasId?adjustedStatus=true"
      case "RetrieveForeignPropBsasUrlReturnFalse"     => s"$bsasApiBaseUrl/foreign-property/$randomBsasId?adjustedStatus=false"
      case "RetrieveSelfEmploymentBsasAdjustmentsUrl"  => s"$bsasApiBaseUrl/self-employment/$randomBsasId/adjust"
      case "RetrieveUkPropBsasAdjustmentsUrl"          => s"$bsasApiBaseUrl/property/$randomBsasId/adjust"
      case "RetrieveForeignPropBsasAdjustmentsUrl"     => s"$bsasApiBaseUrl/foreign-property/$randomBsasId/adjust"

      // V3
      case "TriggerBsasUrlV3" | "TriggerBsasTysUrlV3" => s"$bsasApiBaseUrl/trigger"

      case "BaseRetrieveUkPropertyBsasUrl"         => s"$bsasApiBaseUrl/uk-property"
      case "RetrieveUkPropBsasUrl"                 => s"$bsasApiBaseUrl/uk-property/$randomCalcId"
      case "RetrieveUkPropBsasTysUrl"              => s"$bsasApiBaseUrl/uk-property/$randomCalcId?taxYear=${scenarioContext("taxYear")}"
      case "BaseRetrieveSelfEmploymentBsasUrl"     => s"$bsasApiBaseUrl/self-employment"
      case "BaseRetrieveForeignPropertyBsasUrl"    => s"$bsasApiBaseUrl/foreign-property"
      case "RetrieveSelfEmploymentBsasUrl"         => s"$bsasApiBaseUrl/self-employment/$randomCalcId"
      case "RetrieveSelfEmploymentBsasUrlTys"      => s"$bsasApiBaseUrl/self-employment/$randomCalcId?taxYear=${scenarioContext("taxYear")}"
      case "SubmitForeignPropBsasAdjustmentUrl"    => s"$bsasApiBaseUrl/foreign-property/$randomCalcId/adjust"
      case "SubmitForeignPropBsasAdjustmentTysUrl" => s"$bsasApiBaseUrl/foreign-property/$randomCalcId/adjust?taxYear=${scenarioContext("taxYear")}"
      case "SubmitUkPropBsasAdjustmentUrl"         => s"$bsasApiBaseUrl/uk-property/$randomCalcId/adjust"
      case "SubmitUkPropBsasAdjustmentUrlTysUrl"   => s"$bsasApiBaseUrl/uk-property/$randomCalcId/adjust?taxYear=${scenarioContext("taxYear")}"
      case "SubmitUkPropBsasAdjustmentUrlV3"       => s"$bsasApiBaseUrl/uk-property/$randomCalcId/adjust"
      case "SubmitUkPropBsasAdjustmentUrlV3Tys"    => s"$bsasApiBaseUrl/uk-property/$randomCalcId/adjust?taxYear=$taxYear2023"
      case "RetrieveForeignPropBsasUrl"            => s"$bsasApiBaseUrl/foreign-property/$randomCalcId"
      case "RetrieveForeignPropBsasTysUrl"         => s"$bsasApiBaseUrl/foreign-property/$randomCalcId?taxYear=${scenarioContext("taxYear")}"
      case "SubmitSEBsasAdjustmentUrl"             => s"$bsasApiBaseUrl/self-employment/$randomCalcId/adjust"
      case "SubmitSEBsasAdjustmentTysUrl"          => s"$bsasApiBaseUrl/self-employment/$randomCalcId/adjust?taxYear=${scenarioContext("taxYear")}"
      case "SubmitUkPropBsasAdjustmentTysUrl"     => s"$bsasApiBaseUrl/uk-property/$randomCalcId/adjust?taxYear=${scenarioContext("taxYear")}"

      // V4
      case "TriggerBsasUrlV4" | "TriggerBsasTysUrlV4" => s"$bsasApiBaseUrl/trigger"

      // V5
      case "TriggerBsasUrlV5" | "TriggerBsasTysUrlV5" => s"$bsasApiBaseUrl/trigger"
      case "SubmitUkPropBsasAdjustmentV5Url"          => s"$bsasApiBaseUrl/uk-property/$randomCalcId/adjust?taxYear=$taxYear2024"
      case "SubmitForeignPropBsasAdjustmentV5Url" => s"$bsasApiBaseUrl/foreign-property/$randomCalcId/adjust?taxYear=$taxYear2024"

      // V6
      case "TriggerBsasUrlV6"             => s"$bsasApiBaseUrl/trigger"
      case "SaBsasListUrlV6"              => s"$bsasApiBaseUrl/${scenarioContext("taxYear")}"
      case "SaBsasListTaxYearTypeOfBusinessFilteredUrlV6" =>
        s"$bsasApiBaseUrl/${scenarioContext("taxYear")}?typeOfBusiness=${scenarioContext("typeOfBusiness")}"
      case "SubmitUkPropBsasAdjustmentUrlV6"         => s"$bsasApiBaseUrl/uk-property/${scenarioContext.getOrElse("calculationId", randomCalcId)}/adjust/${scenarioContext("taxYear")}"
      case "SubmitForeignPropBsasAdjustmentUrlV6"    => s"$bsasApiBaseUrl/foreign-property/${scenarioContext.getOrElse("calculationId", randomCalcId)}/adjust/${scenarioContext("taxYear")}"
      case "SubmitSEBsasAdjustmentUrlV6" => s"$bsasApiBaseUrl/self-employment/${scenarioContext.getOrElse("calculationId", randomCalcId)}/adjust/${scenarioContext("taxYear")}"
      case "RetrieveUkPropBsasUrlV6" => s"$bsasApiBaseUrl/uk-property/${scenarioContext.getOrElse("calculationId", randomCalcId)}/${scenarioContext("taxYear")}"
      case "RetrieveSelfEmploymentBsasUrlV6" => s"$bsasApiBaseUrl/self-employment/${scenarioContext.getOrElse("calculationId", randomCalcId)}/${scenarioContext("taxYear")}"
      case "RetrieveForeignPropBsasUrlV6" => s"$bsasApiBaseUrl/foreign-property/${scenarioContext.getOrElse("calculationId", randomCalcId)}/${scenarioContext("taxYear")}"


      // ░▒▓▓▓ Individual Losses API ▓▓▓▒░
      // Brought Forward Losses
      case "AmendBFLossesUrl"                => s"$lossesApiBaseUrl/brought-forward-losses/$randomLossId/change-loss-amount"
      case "CreateBFLossesUrl"               => s"$lossesApiBaseUrl/brought-forward-losses"
      case "DeleteBFLossesUrl"               => s"$lossesApiBaseUrl/brought-forward-losses/$randomLossId"
      case "ListBFLossesV3UrlWithoutTaxYear" => s"$lossesApiBaseUrl/brought-forward-losses"
      case "ListBFLossesV3UrlWithTaxYear" =>
        s"$lossesApiBaseUrl/brought-forward-losses?taxYearBroughtForwardFrom=$taxYear2023&businessId=$randomBusinessId"
      case "ListBFLossesV4UrlDynamic1Url" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2023?businessId=XBIS12345678901&typeOfLoss=self-employment"
      case "ListBFLossesV4UrlDynamic2Url" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2021?businessId=XPIS12345678904&typeOfLoss=uk-property-fhl"
      case "ListBFLossesV4UrlDynamic3Url" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2023?businessId=XPIS12345678903&typeOfLoss=uk-property-non-fhl"
      case "ListBFLossesV4UrlDynamic4Url" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2022?businessId=XFIS12345678905&typeOfLoss=foreign-property-fhl-eea"
      case "ListBFLossesV4UrlDynamic5Url" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2023?businessId=XFIS12345678906&typeOfLoss=foreign-property"
      case "ListBFLossesV5UrlDynamicUrl" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2023?businessId=XPIS12345678903&typeOfLoss=uk-property"
      case "ListBFLossesV4BaseUrl" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2019"
      case "ListBFLossesTysUrl" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2023"
      case "ListBFLossesV4TysUrl" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2023?businessId=$randomBusinessId&typeOfClaim=carry-sideways"
      case "ListBFLossesV4Url" =>
        s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2021?businessId=$randomBusinessId&typeOfClaim=carry-sideways"
      case "RetrieveBFLossesUrl" => s"$lossesApiBaseUrl/brought-forward-losses/$randomLossId"
      case "BFLossesBaseUrl"     => s"$lossesApiBaseUrl/brought-forward-losses"

      // Loss Claims
      case "ListLossClaimsUrlDynamic1Url"                 => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2019?typeOfLoss=self-employment"
      case "ListLossClaimsV4UrlDynamic2Url"                 => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2019?typeOfLoss=uk-property-non-fhl"
      case "ListLossClaimsV5UrlDynamic2Url"                 => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2019?typeOfLoss=uk-property"
      case "ListLossClaimsUrlDynamic3Url"                 => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2019?typeOfLoss=foreign-property"
      case "ListLossClaimsUrlDynamic4Url"                 => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2022?typeOfClaim=carry-sideways"
      case "ListLossClaimsUrlDynamic5Url"                 => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2023"
      case "ListBFLossesV4UrlWithoutTypeOfLoss"           => s"$lossesApiBaseUrl/brought-forward-losses/tax-year/$taxYear2023"
      case "ListLossClaimV4WithBusinessIdUrl"             => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2023?businessId=XPIS12345678901"
      case "ListLossClaimV4WithBusinessIdNotInTheListUrl" => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2023?businessId=XPIS12345678906"
      case "ListLossClaimV4Url"                           => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2023"
      case "ListLossClaimUrl"                             => s"$lossesApiBaseUrl/loss-claims/tax-year/$taxYear2019"

      case "AmendLossClaimUrl"               => s"$lossesApiBaseUrl/loss-claims/$randomClaimId/change-type-of-claim"
      case "CreateLossClaimUrl"              => s"$lossesApiBaseUrl/loss-claims"
      case "DeleteLossClaimUrl"              => s"$lossesApiBaseUrl/loss-claims/$randomClaimId"
      case "ListLossClaimUrlWithoutTaxYear"  => s"$lossesApiBaseUrl/loss-claims"
      case "RetrieveLossClaimUrl"            => s"$lossesApiBaseUrl/loss-claims/$randomClaimId"
      case "AmendLossClaimsOrderCurrentUrl"  => s"$lossesApiBaseUrl/loss-claims/order/$getTaxYear"
      case "AmendLossClaimsOrder2023Url"     => s"$lossesApiBaseUrl/loss-claims/order/$taxYear2023"
      case "AmendLossClaimsOrder2019Url"     => s"$lossesApiBaseUrl/loss-claims/order/$taxYear2019"
      case "AmendLossClaimsOrder2019NinoUrl" => s"$lossesApiBaseUrl/AA999999A/loss-claims/order/$taxYear2019"

      // ░▒▓▓▓ Individual Charges API ▓▓▓▒░
      case "IndividualPensionChargesUrl"                 => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/${scenarioContext("taxYear")}"
      case "PensionChargesUrl"                           => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/$taxYear2021"
      case "PensionChargesTYSUrl"                        => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/$taxYear2023"
      case "PensionChargesInvalidNinoUrl"                => s"$individualsChargesPensionsApiBaseUrl/JX06739!D/$taxYear2021"
      case "PensionChargesInvalidTaxYearUrl"             => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2021-2022"
      case "PensionChargesInvalidTaxYearRangeUrl"        => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2020-22"
      case "PensionChargesInvalidTaxYearNotSupportedUrl" => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "PensionChargesInvalidMultipleErrorsUrl"      => s"$individualsChargesPensionsApiBaseUrl/${taxPayer.nino}/2018-20"

      // ░▒▓▓▓ Individual Calculations API ▓▓▓▒░

      // V4 & V5
      case "ListSaTaxCalculationsUrl"                => s"$calcApiBaseUrl/self-assessment"
      case "ListSaTaxCalculationsWithTyPathParamUrl" => s"$calcApiBaseUrl/self-assessment/$taxYear2019"
      case "ListSaTaxCalculationsDynamicUrl"         => s"$calcApiBaseUrl/self-assessment?taxYear=2017-18"
      case "ListSaTaxCalculationsDynamicFutureUrl"   => s"$calcApiBaseUrl/self-assessment?taxYear=2040-41"
      case "TriggerCalcUrl"                          => s"$calcApiBaseUrl/self-assessment/$taxYear2019"
      case "TriggerCalcTysUrl"                       => s"$calcApiBaseUrl/self-assessment/$taxYear2023"
      case "TriggerCalcFinalDeclarationUrl"          => s"$calcApiBaseUrl/self-assessment/$taxYear2019?finalDeclaration=true"
      case "TriggerCalcFinalDeclarationTysUrl"       => s"$calcApiBaseUrl/self-assessment/$taxYear2023?finalDeclaration=true"
      case "SubmitSAFinalDeclarationUrl"             => s"$calcApiBaseUrl/self-assessment/$taxYear2020/$randomCalcId/final-declaration"
      case "SubmitSAFinalDeclarationTy2526Url"             => s"$calcApiBaseUrl/self-assessment/$taxYear2025/$randomCalcId/confirm-amendment"
      case "RetrieveSelfAssessmentTaxCalculationUrl" => s"$calcApiBaseUrl/self-assessment/${scenarioContext("taxYear")}/$randomCalcId"
      case "ListSaTaxCalculationsTysUrl"             => s"$calcApiBaseUrl/self-assessment?taxYear=$taxYear2023"
      case "RetrieveSelfAssessmentTaxCalculationDynamicUrl" =>
        s"$calcApiBaseUrl/self-assessment/${scenarioContext("taxYear")}/${scenarioContext("calculationId")}"

      // V7
      case "ListSaTaxCalculationsQueryParamUrl" => s"$calcApiBaseUrl/self-assessment?taxYear=${scenarioContext("taxYear")}"
      case "ListSaTaxCalculationsPathParamUrl"  => s"$calcApiBaseUrl/self-assessment/${scenarioContext("taxYear")}"

      // ░▒▓▓▓ Self Assessment API ▓▓▓▒░
      // Self Assessment Legacy
      // Self-Employments
      case "SeAddBusiness"                 => s"$saApiBaseUrl/self-employments"
      case "SeListBusinesses"              => s"$saApiBaseUrl/self-employments"
      case "SeGetBusiness"                 => s"$saApiBaseUrl/self-employments/$selfEmploymentId"
      case "SeObligations"                 => s"$saApiBaseUrl/self-employments/$selfEmploymentId/obligations"
      case "SePeriods"                     => s"$saApiBaseUrl/self-employments/$selfEmploymentId/periods"
      case "SePeriodOne"                   => s"$saApiBaseUrl/self-employments/$selfEmploymentId/periods/2017-04-06_2017-07-05"
      case "SeAnnualSummary"               => s"$saApiBaseUrl/self-employments/$selfEmploymentId/2017-18"
      case "SeRetrieveEopsObligations"     => s"$saApiBaseUrl/self-employments/$selfEmploymentId/end-of-period-statements/obligations"
      case "SeBusinessIncomeSourceSummary" => s"$saApiBaseUrl/self-employments/$randomSelfEmploymentId/2017-18/income-summary"

      // Self-Employments 2nd business
      case "SeGetBusiness2nd"             => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd"
      case "SeObligations2nd"             => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/obligations"
      case "SePeriods2nd"                 => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/periods"
      case "SePeriodOne2nd"               => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/periods/2017-04-06_2017-07-05"
      case "SeAnnualSummary2nd"           => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/2017-18"
      case "SeRetrieveEopsObligations2nd" => s"$saApiBaseUrl/self-employments/$selfEmploymentId2nd/end-of-period-statements/obligations"

      // UK Property
      case "UkpAddBusiness"                 => s"$saApiBaseUrl/uk-properties"
      case "UkpGetBusiness"                 => s"$saApiBaseUrl/uk-properties"
      case "UkpObligations"                 => s"$saApiBaseUrl/uk-properties/obligations"
      case "UkpNonFhlPeriods"               => s"$saApiBaseUrl/uk-properties/other/periods"
      case "UkpNonFhlPeriodOne"             => s"$saApiBaseUrl/uk-properties/other/periods/2017-04-06_2017-07-05"
      case "UkpFhlPeriods"                  => s"$saApiBaseUrl/uk-properties/furnished-holiday-lettings/periods"
      case "UkpFhlPeriodOne"                => s"$saApiBaseUrl/uk-properties/furnished-holiday-lettings/periods/2017-04-06_2017-07-05"
      case "UkpNonFhlAnnualSummary"         => s"$saApiBaseUrl/uk-properties/other/2017-18"
      case "UkpFhlAnnualSummary"            => s"$saApiBaseUrl/uk-properties/furnished-holiday-lettings/2017-18"
      case "UkpBusinessIncomeSourceSummary" => s"$saApiBaseUrl/uk-properties/2017-18/income-summary"

      // Tax Calculations
      case "TriggerTaxCalc" => s"$saApiBaseUrl/calculations"

      // MTD Charitable Giving
      case "AmendCharitableGiving"    => s"$saApiBaseUrl/charitable-giving/2018-19"
      case "RetrieveCharitableGiving" => s"$saApiBaseUrl/charitable-giving/2018-19"

      // MTD Crystallisation
      case "Crystallisation"         => s"$saApiBaseUrl/2018-19/crystallisation"
      case "IntentToCrystallise"     => s"$saApiBaseUrl/2018-19/intent-to-crystallise"
      case "RetrieveCrystallisation" => s"$saApiBaseUrl/crystallisation/obligations?from=2018-04-06&to=2019-04-05"

      // MTD Dividends Income
      case "AmendDividends"    => s"$saApiBaseUrl/dividends/2017-18"
      case "RetrieveDividends" => s"$saApiBaseUrl/dividends/2017-18"

      // MTD Property API
      case "PropRetrieveEopsObligations" => s"$saApiBaseUrl/uk-properties/end-of-period-statements/obligations?from=2017-04-19&to=2018-04-19"
      case "PropSubmitEopsDeclaration"   => s"$saApiBaseUrl/uk-properties/end-of-period-statements/from/2017-04-06/to/2018-04-05"

      // MTD Savings Accounts
      case "AddSavingsAccount"                   => s"$saApiBaseUrl/savings-accounts"
      case "AmendSavingsAccountAnnualSummary"    => s"$saApiBaseUrl/savings-accounts/SAVbDlYvnLS0GtZ/2017-18"
      case "ListAllSavingsAccounts"              => s"$saApiBaseUrl/savings-accounts"
      case "RetrieveSavingsAccount"              => s"$saApiBaseUrl/savings-accounts/SAVbDlYvnLS0GtZ"
      case "RetrieveSavingsAccountAnnualSummary" => s"$saApiBaseUrl/savings-accounts/SAVbDlYvnLS0GtZ/2017-18"

      // MTD Self Employment
      case "SeSubmitEopsDeclaration" =>
        s"$saApiBaseUrl/self-employments/$randomSelfEmploymentId/end-of-period-statements/from/2017-04-06/to/2018-04-05"

      // MTD Tax Calculation
      case "RetrieveTaxCalculation"            => s"$saApiBaseUrl/calculations/$randomCalcId"
      case "RetrieveTaxCalculationBvrMessages" => s"$saApiBaseUrl/calculations/$randomCalcId/validation-messages"

      // Individuals Business EOPS
      case "BusinessEOPSUrl"            => s"$individualsBusinessEOPSSApiBaseUrl/${taxPayer.nino}"
      case "BusinessEOPInvalidNINOSUrl" => s"$individualsBusinessEOPSSApiBaseUrl/${taxPayer.nino}!"

      // ░▒▓▓▓ Self-Assessment Test Support API ▓▓▓▒░
      case "DeleteSaTestSupportUrl"                => s"$saTestSupportUrl/vendor-state"
      case "DeleteSaTestSupportUrlWithNINO"        => s"$saTestSupportUrl/vendor-state?nino=${taxPayer.nino}"
      case "DeleteSaTestSupportUrlWithInvalidNINO" => s"$saTestSupportUrl/vendor-state?nino=${taxPayer.nino}!"
      case "CreateCheckpoint"                      => s"$saTestSupportUrl/vendor-state/checkpoints?nino=${taxPayer.nino}"
      case "ListOrDeleteCheckpointNoNinoUrl"       => s"$saTestSupportUrl/vendor-state/checkpoints"
      case "ListCheckpoint"                        => s"$saTestSupportUrl/vendor-state/checkpoints?nino=${taxPayer.nino}"
      case "ListCheckpointNewNinoNoData"           => s"$saTestSupportUrl/vendor-state/checkpoints?nino=TC663795B"
      case "TestBusinessUrl"                       => s"$saTestSupportUrl/business/${taxPayer.nino}"
      case "RestoreCheckpointInvalidCheckpointID"  => s"$saTestSupportUrl/vendor-state/checkpoints/$randomCheckpointId/restore"
      case "RestoreCheckpoint"                     => s"$saTestSupportUrl/vendor-state/checkpoints"
      case "CreateAmendItsaStatus"                 => s"$saTestSupportUrl/itsa-status/${taxPayer.nino}/$taxYear2019"
      case "CreateAmendItsaStatus23-24"            => s"$saTestSupportUrl/itsa-status/${taxPayer.nino}/$taxYear2023"

      // ░▒▓▓▓ Individuals Insurance Policies Income API ▓▓▓▒░
      case "IndividualsInsurancePoliciesIncomeReceivedUrl"    => s"$individualInsurancePoliciesIncomeBaseUrl/${taxPayer.nino}/$taxYear2019"
      case "IndividualsInsurancePoliciesIncomeReceivedTysUrl" => s"$individualInsurancePoliciesIncomeBaseUrl/${taxPayer.nino}/$taxYear2023"

      case _ => s"$saApiBaseUrl/didnt-find-url"
        */
      case "SubscriptionUrl"                           => s"$SubscriptionUrl"

    }
  }

}
