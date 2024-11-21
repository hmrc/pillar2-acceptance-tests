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

object RequestBodies {

  def retrieveRequestBody(body: String): String = {

    body match {

      /*
            // ----- MTD API template endpoint -----
            case "API_TEMPLATE_REQUEST" => SampleEndpointJson.API_TEMPLATE_REQUEST

            // ----- Business Details API -----
            case "CREATE_AMEND_QUARTERLY_PERIOD_TYPE_BODY"          => BusinessDetailsJson.CREATE_AMEND_QUARTERLY_PERIOD_TYPE_BODY
            case "CREATE_AMEND_QUARTERLY_PERIOD_TYPE_CALENDAR_BODY" => BusinessDetailsJson.CREATE_AMEND_QUARTERLY_PERIOD_TYPE_CALENDAR_BODY

            // ----- CIS Deductions API endpoint -----
            case "CIS_CREATE_REQUEST"                      => CisDeductionsJson.CIS_CREATE_REQUEST
            case "CIS_CREATE_REQUEST_TYS"                  => CisDeductionsJson.CIS_CREATE_REQUEST_TYS
            case "CIS_AMEND_REQUEST"                       => CisDeductionsJson.CIS_AMEND_REQUEST
            case "CIS_AMEND_REQUEST_TYS"                   => CisDeductionsJson.CIS_AMEND_REQUEST_TYS
            case "RETRIEVE_CIS_DEDUCTIONS"                 => RetrieveCisDeductionsJson.RETRIEVE_CIS_DEDUCTIONS_JSON_BODY
            case "RETRIEVE_CIS_DEDUCTIONS_AFTER_AMEND"     => RetrieveCisDeductionsJson.RETRIEVE_CIS_DEDUCTIONS_JSON_BODY_AFTER_AMEND
            case "RETRIEVE_CIS_DEDUCTIONS_TYS"             => RetrieveCisDeductionsJson.RETRIEVE_CIS_DEDUCTIONS_JSON_BODY_TYS
            case "RETRIEVE_CIS_DEDUCTIONS_AFTER_AMEND_TYS" => RetrieveCisDeductionsJson.RETRIEVE_CIS_DEDUCTIONS_JSON_BODY_AFTER_AMEND_TYS

            // ----- Self Employment Business API -----
            case "CREATE_OR_AMEND_ANNUAL_SUBMISSION_V3"                    => AmendSEAnnualSubmissionJsonV3.CreateOrAmendAnnualSubmission
            case "CREATE_OR_AMEND_ANNUAL_SUBMISSION_TRADING_ALLOWANCES_V3" => AmendSEAnnualSubmissionJsonV3.CreateOrAmendAnnualSubmissionTradingAllowances
            case "AMEND_SE_ANNUAL_SUBMISSION_V3"                           => AmendSEAnnualSubmissionJsonV3.AmendAnnualSubmission
            case "AMEND_SE_ANNUAL_SUBMISSION_TRADING_ALLOWANCES_V3"        => AmendSEAnnualSubmissionJsonV3.AmendAnnualSubmissionTradingAllowances
            case "AMEND_SE_PERIOD_SUMMARY_V3"                              => AmendSEPeriodSummaryJsonV3.amendSEPeriodSummaryDefaultNonTys
            case "AMEND_SE_PERIOD_SUMMARY_TYS_V3"                          => AmendSEPeriodSummaryJsonV3.amendSEPeriodSummaryDefaultTys
            case "AMEND_SE_PERIOD_SUMMARY_NEGATIVE_VALUES_V3"              => AmendSEPeriodSummaryJsonV3.amendSEPeriodSummaryNegativeValuesNonTys
            case "AMEND_SE_PERIOD_SUMMARY_NEGATIVE_VALUES_TYS_V3"          => AmendSEPeriodSummaryJsonV3.amendSEPeriodSummaryNegativeValuesTys
            case "AMEND_SE_PERIOD_SUMMARY_CONSOLIDATED_V3"                 => AmendSEPeriodSummaryJsonV3.amendSEPeriodSummaryConsolidatedNonTys
            case "AMEND_SE_PERIOD_SUMMARY_CONSOLIDATED_TYS_V3"             => AmendSEPeriodSummaryJsonV3.amendSEPeriodSummaryConsolidatedTys
            case "AMEND_SE_CONSOLIDATED_EXPENSES_EXCEEDED_V3"              => AmendSEPeriodSummaryJsonV3.amendSEPeriodSummaryConsolidatedExceeded
            case "CREATE_SE_PERIOD_SUMMARY_V3_Q1"                          => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_Q1
            case "CREATE_SE_PERIOD_SUMMARY_V3"                             => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY
            case "CREATE_SE_PERIOD_SUMMARY_V3_Q3"                          => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_Q3
            case "CREATE_SE_PERIOD_SUMMARY_V3_Q4"                          => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_Q4
            case "CREATE_SE_PERIOD_SUMMARY_NEGATIVE_VALUES_V3"             => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_NEGATIVE_VALUES
            case "CREATE_SE_PERIOD_SUMMARY_TYS_V3_Q1"                      => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_TYS_Q1
            case "CREATE_SE_PERIOD_SUMMARY_TYS_V3"                         => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_TYS
            case "CREATE_SE_PERIOD_SUMMARY_TYS_V3_25"                      => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_TYS_25
            case "CREATE_SE_PERIOD_SUMMARY_TYS_V3_Q3"                      => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_TYS_Q3
            case "CREATE_SE_PERIOD_SUMMARY_TYS_V3_Q4"                      => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_TYS_Q4
            case "CREATE_SE_PERIOD_SUMMARY_NEGATIVE_VALUES_TYS_V3"         => CreateSEPeriodSummaryJsonV3.CREATE_SE_PERIOD_SUMMARY_NEGATIVE_VALUES_TYS

            case "CREATE_AMEND_SE_CUMULATIVE_PERIOD_SUMMARY_TYS_V4" => CreateAmendSECumulativePeriodSummaryJsonV4.CREATE_AMEND_SE_PERIOD_SUMMARY_TYS
            case "CREATE_AMEND_SE_CUMULATIVE_PERIOD_SUMMARY_V4_24"  => CreateAmendSECumulativePeriodSummaryJsonV4.CREATE_AMEND_SE_PERIOD_SUMMARY_24
            case "CREATE_AMEND_SE_CUMULATIVE_PERIOD_SUMMARY_V4_22"  => CreateAmendSECumulativePeriodSummaryJsonV4.CREATE_AMEND_SE_PERIOD_SUMMARY_22
            case "CREATE_AMEND_SE_CUMULATIVE_PERIOD_SUMMARY_NEGATIVE_VALUES_TYS_V4" =>
              CreateAmendSECumulativePeriodSummaryJsonV4.CREATE_AMEND_SE_PERIOD_SUMMARY_NEGATIVE_VALUES_TYS
            case "CREATE_AMEND_SE_CUMULATIVE_PERIOD_SUMMARY_CONSOLIDATED_TYS_V4" =>
              CreateAmendSECumulativePeriodSummaryJsonV4.CREATE_AMEND_SE_PERIOD_SUMMARY_CONSOLIDATED_TYS

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Property Business API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
            // Annual Submission
            case "amendAnnualSubmissionDefault"                => AmendAnnualSubmissionJson.amendAnnualSubmissionDefault
            case "amendAnnualSubmissionWithMultipleProperties" => AmendAnnualSubmissionJson.amendAnnualSubmissionWithMultipleProperties
            case "amendAnnualSubmissionMinimumFields"          => AmendAnnualSubmissionJson.amendAnnualSubmissionMinimumFields
            case "amendAnnualSubmissionValueErrorsRequest"     => AmendAnnualSubmissionJson.amendAnnualSubmissionValueErrorsRequest
            case "amendAnnualSubmissionMissingErrorsRequest"   => AmendAnnualSubmissionJson.amendAnnualSubmissionMissingErrorsRequest

            // Period Summary
            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY"                  => AmendUkPropertyPeriodSummaryJson.defaultRequest
            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED"     => AmendUkPropertyPeriodSummaryJson.consolidatedRequest
            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_MINIMUM"          => AmendUkPropertyPeriodSummaryJson.minimumRequest
            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_VALUE_FORMAT"     => AmendUkPropertyPeriodSummaryJson.valueFormatRequest
            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_BOTH_EXPENSES"    => AmendUkPropertyPeriodSummaryJson.bothExpensesSuppliedRequest
            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_EMPTY_ITEMS"      => AmendUkPropertyPeriodSummaryJson.emptyItemsRequest
            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_NEGATIVES_TY2425" => AmendUkPropertyPeriodSummaryJson.defaultRequestNegativesTY2425

            case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED_TY2425" => AmendUkPropertyPeriodSummaryJson.consolidatedTY2425Request

            case "AMEND_FOREIGN_PROPERTY_DEF1" => AmendPeriodSummaryJsonDef1.amendPeriodSummaryDefault

            case "CREATE_FOREIGN_PROPERTY_MIN_FIELDS"            => Def1CreatePeriodSummaryJson.createPeriodSummaryMinFields
            case "CREATE_FOREIGN_PROPERTY_EXPENSES"              => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditure
            case "CREATE_FOREIGN_PROPERTY_CONSOLIDATED_EXPENSES" => Def1CreatePeriodSummaryJson.createPeriodSummaryWithConsolidatedExpenditure

            case "CREATE_FOREIGN_PROPERTY_EXPENSES_Q1"     => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditure_Q1
            case "CREATE_FOREIGN_PROPERTY_EXPENSES_Q2"     => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditure_Q2
            case "CREATE_FOREIGN_PROPERTY_EXPENSES_Q3"     => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditure_Q3
            case "CREATE_FOREIGN_PROPERTY_EXPENSES_Q4"     => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditure_Q4
            case "CREATE_FOREIGN_PROPERTY_EXPENSES_TYS_Q1" => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditureTYS_Q1
            case "CREATE_FOREIGN_PROPERTY_EXPENSES_TYS_Q2" => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditureTYS_Q2
            case "CREATE_FOREIGN_PROPERTY_EXPENSES_TYS_Q3" => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditureTYS_Q3
            case "CREATE_FOREIGN_PROPERTY_EXPENSES_TYS_Q4" => Def1CreatePeriodSummaryJson.createPeriodSummaryWithExpenditureTYS_Q4

            case "CREATE_UK_PROPERTY_MIN_FIELDS" => CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryMinFields(DateRange("2020-01-01", "2020-01-31"))
            case "CREATE_UK_PROPERTY_MIN_FIELDS_TYS" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryMinFields(DateRange("2023-05-01", "2023-05-31"))
            case "CREATE_UK_PROPERTY_MIN_FIELDS_TY2024" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryMinFields(DateRange("2024-05-01", "2024-05-31"))
            case "CREATE_UK_PROPERTY_MIN_FIELDS_TY2025" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryMinFields(DateRange("2025-04-06", "2025-05-31"))

            case "CREATE_UK_PROPERTY_EXPENSES" | "CREATE_UK_PROPERTY_EXPENSES_Q1" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2022-04-06", "2022-07-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_Q2" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2022-07-06", "2022-10-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_Q3" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2022-10-06", "2023-01-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_Q4" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2023-01-06", "2023-04-05"))

            case "CREATE_UK_PROPERTY_EXPENSES_TYS" | "CREATE_UK_PROPERTY_EXPENSES_TYS_Q1" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2023-04-06", "2023-07-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_TYS_Q2" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2023-07-06", "2023-10-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_TYS_Q3" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2023-10-06", "2024-01-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_TYS_Q4" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2024-01-06", "2024-04-05"))

            case "CREATE_UK_PROPERTY_EXPENSES_TY2024" | "CREATE_UK_PROPERTY_EXPENSES_TY2024_Q1" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2024-04-06", "2024-07-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_TY2425_Q2" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2024-07-06", "2024-10-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_TY2425_Q3" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2024-10-06", "2025-01-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_TY2425_Q4" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2025-01-06", "2025-04-05"))
            case "CREATE_UK_PROPERTY_EXPENSES_NEGATIVE_TY2024" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithNegativeExpenditure(DateRange("2025-01-06", "2025-04-05"))

            case "CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithConsolidatedExpenditure(DateRange("2022-04-06", "2022-07-05"))
            case "CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES_TYS" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithConsolidatedExpenditure(DateRange("2023-04-06", "2023-07-05"))
            case "CREATE_UK_PROPERTY_CONSOLIDATED_EXPENSES_TY2024" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithConsolidatedExpenditureWithExtraFields(DateRange("2024-04-06", "2024-07-05"))
            case "CREATE_UK_PROPERTY_NEGATIVE_CONSOLIDATED_EXPENSES_TY2024" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithNegativeConsolidatedExpenditureWithExtraFields(
                DateRange("2024-04-06", "2024-07-05"))

            case "CREATE_UK_PROPERTY_EXPENSES_MISALIGNED" =>
              CreateUKPropPeriodSummaryJson.createUKPropPeriodSummaryWithExpenditure(DateRange("2022-01-01", "2022-06-30"))

            case "CreateAmendUkPropertyCumulativeSummaryV5_def1" => CreateAmendUkPropertyCumulativeSummaryV5_def1.createAmendJson

            // ░▒▓▓▓ Historic Property Business API ▓▓▓▒░

            // Annual Submission
            case "CREATE_AMEND_HISTORIC_FHL_UK_PROPERTY_ANNUAL_SUBMISSION" =>
              CreateAmendHistoricFhlUKPropAnnualSubmissionJson.amendHistoricFhlUKPropertyBusinessRequestBody
            case "CREATE_AMEND_HISTORIC_NON_FHL_UK_PROPERTY_ANNUAL_SUBMISSION" =>
              CreateAmendHistoricNonFhlUKPropAnnualSubmissionJson.amendHistoricNonFhlUKPropertyBusinessRequestBody
            case "createHistoricUKNonFHLPropAnnualSubmission" =>
              CreateAmendHistoricNonFhlUKPropAnnualSubmissionJson.createHistoricNonFhlUKPropertyBusinessRequestBody
            case "amendHistoricUKNonFHLPropAnnualSubmission" =>
              CreateAmendHistoricNonFhlUKPropAnnualSubmissionJson.amendHistoricNonFhlUKPropertyBusinessRequestBody
            case "createHistoricUKFHLPropAnnualSubmission" =>
              CreateAmendHistoricFhlUKPropAnnualSubmissionJson.createHistoricFhlUKPropertyBusinessRequestBody
            case "amendHistoricUKFHLPropAnnualSubmission" => CreateAmendHistoricFhlUKPropAnnualSubmissionJson.amendHistoricFhlUKPropertyBusinessRequestBody

            // Period Summary
            case "createHistoricNonFhlUKPropertyPeriodWithConsolidatedExpenses" =>
              Def2CreatePeriodSummaryJson.createHistoricNonFhlUKPropertyPeriodWithConsolidatedExpenses
            case "createHistoricNonFhlUKPropertyPeriodWithExpenses" => Def2CreatePeriodSummaryJson.createHistoricNonFhlUKPropertyPeriodWithExpenses
            case "AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY" =>
              AmendHistoricFhlUKPropertyPeriodSummaryJson.amendHistoricFhlUKPropertyPeriodSummaryDefaultRequest
            case "AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_Stateful" =>
              AmendHistoricFhlUKPropertyPeriodSummaryJson.amendHistoricFhlUKPropertyPeriodSummaryDefaultRequest_Stateful
            case "AMEND_HISTORIC_FHL_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED" =>
              AmendHistoricFhlUKPropertyPeriodSummaryJson.amendHistoricFhlUKPropertyPeriodSummaryConsolidatedRequest
            case "AMEND_HISTORIC_NON_FHL_UK_PROPERTY_PERIOD_SUMMARY" =>
              AmendHistoricNonFhlUKPropertyPeriodSummaryJson.amendHistoricNonFhlUKPropertyPeriodSummaryDefaultRequest
            case "AMEND_HISTORIC_NON_FHL_UK_PROPERTY_PERIOD_SUMMARY_CONSOLIDATED" =>
              AmendHistoricNonFhlUKPropertyPeriodSummaryJson.amendHistoricNonFhlUKPropertyPeriodSummaryConsolidatedRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Property Business API V2 ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "AMEND_FOREIGN_PROPERTY_DEF2"                   => AmendPeriodSummaryJsonDef2.amendPeriodSummaryDefault
            case "AMEND_FOREIGN_PROPERTY_CONSOLIDATED"           => AmendPeriodSummaryJsonDef2.amendPeriodSummaryConsolidated
            case "AMEND_FOREIGN_PROPERTY_MINIMUM_FIELDS"         => AmendPeriodSummaryJsonDef2.amendPeriodSummaryMinimumFields
            case "AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_REQUEST"   => AmendPeriodSummaryJsonDef2.amendPeriodSummaryValueErrorsRequest
            case "AMEND_FOREIGN_PROPERTY_MISSING_ERRORS_REQUEST" => AmendPeriodSummaryJsonDef2.amendPeriodSummaryMissingErrorsRequest
            case "AMEND_FOREIGN_PROPERTY_NEGATIVES_TY2425"       => AmendPeriodSummaryJsonDef2.amendPeriodSummaryDefaultNegativesTY2425

            case "createAmendUKPropAnnualSubmissionDefault"        => CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionDefault
            case "createAmendUKPropAnnualSubmissionDefaultV5_Def1" => CreateAmendUKPropAnnualSubmissionJsonV5_Def1.createAmendUKPropAnnualSubmissionDefault
            case "createAmendUKPropAnnualSubmissionDefaultV5_Def2" => CreateAmendUKPropAnnualSubmissionJsonV5_Def2.createAmendUKPropAnnualSubmissionDefault

            case "createAmendUKPropAnnualSubmissionMinimalV5_Def1" => CreateAmendUKPropAnnualSubmissionJsonV5_Def1.createAmendUKPropAnnualSubmissionMinimal
            case "createAmendUKPropAnnualSubmissionMinimalV5_Def2" => CreateAmendUKPropAnnualSubmissionJsonV5_Def2.createAmendUKPropAnnualSubmissionMinimal

            case "createUKPropAnnualSubmissionDefaultStateful" => CreateAmendUKPropAnnualSubmissionJson.createUKPropAnnualSubmissionDefaultStateful
            case "amendUKPropAnnualSubmissionDefaultStateful"  => CreateAmendUKPropAnnualSubmissionJson.amendUKPropAnnualSubmissionDefaultStateful

            case "createAmendUKPropAnnualSubmissionMinimumFields" => CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionMinimumFields
            case "createAmendUKPropAnnualSubmissionValueErrorsRequest" =>
              CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionValueErrorsRequest
            case "createAmendUKPropAnnualSubmissionInvalidBodyRequest" =>
              CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionInvalidBodyRequest
            case "createAmendUKPropAnnualSubmissionEmptyBodyRequest" =>
              CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionEmptyBodyRequest
            case "createAmendUKPropAnnualSubmissionRulePropIncomeAllowanceRequest" =>
              CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionRulePropIncomeAllowanceRequest

            case "createAmendForeignPropAnnualSubmissionDefault" => CreateAmendForeignPropertyAnnualSubmissionJson.createAmendAnnualSubmissionDefault
            case "createAmendForeignPropAnnualSubmissionWithMultipleProperties" =>
              CreateAmendForeignPropertyAnnualSubmissionJson.createAmendAnnualSubmissionWithMultipleProperties
            case "createAmendForeignPropAnnualSubmissionValueErrorsRequest" =>
              CreateAmendForeignPropertyAnnualSubmissionJson.createAmendAnnualSubmissionValueErrorsRequest
            case "createAmendForeignPropAnnualSubmissionInvalidBodyRequest" =>
              CreateAmendForeignPropertyAnnualSubmissionJson.createAmendAnnualSubmissionInvalidBodyRequest
            case "createAmendForeignPropAnnualSubmissionEmptyBodyRequest" =>
              CreateAmendForeignPropertyAnnualSubmissionJson.createAmendAnnualSubmissionEmptyBodyRequest
            case "amendForeignAnnualSubmissionStatefulDefault" =>
              CreateAmendForeignPropertyAnnualSubmissionJson.amendForeignAnnualSubmissionStatefulDefault

            case "createForeignPropertyMinimumFields"            => CreateForeignPropPeriodSummaryJson.createPeriodSummaryMinFields
            case "createForeignPropertyMinimumFieldsCumulative"  => CreateAmendForeignPropertyCumulativeSummaryV5_def1.createPeriodSummaryMinFields
            case "createForeignPropertyWithExpenses"             => CreateForeignPropPeriodSummaryJson.createPeriodSummaryWithExpenses
            case "createForeignPropertyWithConsolidatedExpenses" => CreateForeignPropPeriodSummaryJson.createPeriodSummaryWithConsolidatedExpenses
            case "createForeignPropertyWithNegativeExpenses"     => CreateForeignPropPeriodSummaryJson.createPeriodSummaryWithNegativeExpenses
            case "createForeignPropertyWithNegativeConsolidatedExpenses" =>
              CreateForeignPropPeriodSummaryJson.createPeriodSummaryWithNegativeConsolidatedExpenses
            case "createForeignPropertyPeriodSummaryDefaultStateful" =>
              CreateForeignPropPeriodSummaryJson.createPeriodSummaryStateful(DateRange("2022-04-06", "2022-07-05"))
            case "createForeignPropertyPeriodSummaryDefaultStatefulMisaligned" =>
              CreateForeignPropPeriodSummaryJson.createPeriodSummaryStateful(DateRange("2022-01-01", "2022-06-30"))
            case "createForeignPropertyPeriodSummaryDefaultStatefulTys" =>
              CreateForeignPropPeriodSummaryJson.createPeriodSummaryStateful(DateRange("2023-04-06", "2023-07-05"))

            case "createHistoricFhlUKPropertyPeriodSummaryWithExpenses" => Def2CreatePeriodSummaryJson.createHistoricFhlUKPropertyPeriodSummaryWithExpenses
            case "createHistoricFhlUKPropertyPeriodSummaryWithConsolidatedExpenses" =>
              Def2CreatePeriodSummaryJson.createHistoricFhlUKPropertyPeriodSummaryWithConsolidatedExpenses
            case "createHistoricFhlUKPropertyPeriodSummaryV2_Stateful" => Def2CreatePeriodSummaryJson.createHistoricFhlUKPropertyPeriodSummary_Stateful

            // Version 5
            // Def1
            case "createAmendForeignPropAnnualSubmissionDefaultV5" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.createAmendAnnualSubmissionDefault
            case "createAmendForeignPropAnnualSubmissionWithMultiplePropertiesV5" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.createAmendAnnualSubmissionWithMultipleProperties
            case "createAmendForeignPropAnnualSubmissionValueErrorsRequestV5" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.createAmendAnnualSubmissionValueErrorsRequest
            case "createAmendForeignPropAnnualSubmissionInvalidBodyRequestV5" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.createAmendAnnualSubmissionInvalidBodyRequest
            case "createAmendForeignPropAnnualSubmissionEmptyBodyRequestV5" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.createAmendAnnualSubmissionEmptyBodyRequest
            case "amendForeignAnnualSubmissionStatefulDefaultV5" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.amendForeignAnnualSubmissionStatefulDefault
            // Def2
            case "createAmendForeignPropAnnualSubmissionDefaultV5_def2" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.createAmendAnnualSubmissionDefault
            case "createAmendForeignPropAnnualSubmissionWithMultiplePropertiesV5_def2" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.createAmendAnnualSubmissionWithMultipleProperties
            case "createAmendForeignPropAnnualSubmissionValueErrorsRequestV5_def2" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.createAmendAnnualSubmissionValueErrorsRequest
            case "createAmendForeignPropAnnualSubmissionInvalidBodyRequestV5_def2" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.createAmendAnnualSubmissionInvalidBodyRequest
            case "createAmendForeignPropAnnualSubmissionEmptyBodyRequestV5_def2" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.createAmendAnnualSubmissionEmptyBodyRequest
            case "amendForeignAnnualSubmissionStatefulDefaultV5_def2" =>
              CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.amendForeignAnnualSubmissionStatefulDefault
            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Self Assessment Accounts API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "CREATE_CODING_OUT_REQUEST"                    => CreateAmendCodingOutJson.createCodingOutRequest
            case "AMEND_CODING_OUT_REQUEST"                     => CreateAmendCodingOutJson.amendCodingOutRequest
            case "CREATE_AMEND_CODING_OUT_VALUE_ERRORS_REQUEST" => CreateAmendCodingOutJson.createAmendCodingOutValueErrorsRequest
            case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_REQUEST" =>
              CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsRequest
            case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_INNER_REQUEST" =>
              CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsInnerRequest
            case "CREATE_AMEND_CODING_OUT_EMPTY_BODY_REQUEST" => CreateAmendCodingOutJson.createAmendCodingOutEmptyBodyRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Expenses API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "CREATE_OTHER_EXPENSES"                               => OtherExpensesJson.createOtherExpenses
            case "AMEND_OTHER_EXPENSES"                                => OtherExpensesJson.amendOtherExpenses
            case "AMEND_OTHER_EXPENSES_MINIMUM_FIELDS"                 => OtherExpensesJson.amendOtherExpensesMinimumFields
            case "AMEND_OTHER_EXPENSES_MISSING_ERRORS"                 => OtherExpensesJson.amendOtherExpensesMissingErrorsRequest
            case "AMEND_OTHER_EXPENSES_VALUE_ERRORS_REQUEST"           => OtherExpensesJson.amendOtherExpensesValueErrorsRequest
            case "CREATE_AND_AMEND_EMPLOYMENT_EXPENSES"                => EmploymentsExpensesJson.CREATE_AND_AMEND_EMPLOYMENT_EXPENSES
            case "CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_MINIMUM_FIELDS" => EmploymentsExpensesJson.CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_MINIMUM_FIELDS
            case "CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_MISSING_ERRORS" => EmploymentsExpensesJson.CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_MISSING_ERRORS
            case "CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_REQUEST" =>
              EmploymentsExpensesJson.CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_REQUEST

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Other Deductions API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "AMEND_OTHER_DEDUCTIONS"                           => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS
            case "AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS"            => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS
            case "AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS"            => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS
            case "AMEND_OTHER_DEDUCTIONS_FIELDS_MISSING"            => OtherDeductionsJson.AMEND_OTHER_DEDUCTIONS_FIELDS_MISSING
            case "CREATE_AND_AMEND_OTHER_DEDUCTIONS"                => OtherDeductionsJson.CREATE_AND_AMEND_OTHER_DEDUCTIONS
            case "CREATE_AND_AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS" => OtherDeductionsJson.CREATE_AND_AMEND_OTHER_DEDUCTIONS_MULTIPLE_ITEMS
            case "CREATE_AND_AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS" => OtherDeductionsJson.CREATE_AND_AMEND_OTHER_DEDUCTIONS_MINIMUM_FIELDS

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Charges API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "Def1_AmendIndividualsChargesPensionsMaximumV2"  => IndividualsChargesPensionsRequestJsonV2.DEF1_AMEND_PENSIONS_CHARGES_MAXIMUM_DEFAULT
            case "Def1_AmendIndividualsChargesPensionsMinimumV2"  => IndividualsChargesPensionsRequestJsonV2.DEF1_AMEND_PENSIONS_CHARGES_MINIMUM_DEFAULT
            case "Def1_CreateIndividualsChargesPensionsMaximumV2" => IndividualsChargesPensionsRequestJsonV2.DEF1_CREATE_PENSIONS_CHARGES_MAXIMUM_DEFAULT
            case "Def1_CreateIndividualsChargesPensionsMinimumV2" => IndividualsChargesPensionsRequestJsonV2.DEF1_CREATE_PENSIONS_CHARGES_MINIMUM_DEFAULT
            case "Def2_AmendIndividualsChargesPensionsMaximumV2"  => IndividualsChargesPensionsRequestJsonV2.DEF2_AMEND_PENSIONS_CHARGES_MAXIMUM_DEFAULT

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Reliefs API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "CreateReliefInvestments"                 => ReliefInvestmentsJson.createReliefInvestment
            case "AmendReliefInvestments"                  => ReliefInvestmentsJson.amendReliefInvestments
            case "ReliefInvestmentsAmendMinimumFields"     => ReliefInvestmentsJson.reliefInvestmentsAmendMinimumFields
            case "AmendReliefInvestmentsWithMinimumFields" => ReliefInvestmentsJson.amendReliefInvestmentsAmendMinimumFields
            case "ReliefInvestmentsAmendValueErrors"       => ReliefInvestmentsJson.reliefInvestmentsAmendValueErrorsRequest
            case "reliefInvestmentsAmendMissingErrors"     => ReliefInvestmentsJson.reliefInvestmentsAmendMissingErrorsRequest

            case "amendForeignReliefs"              => ForeignReliefsJson.amendForeignReliefs
            case "createForeignReliefs"             => ForeignReliefsJson.createForeignReliefs
            case "foreignReliefsAmendValueErrors"   => ForeignReliefsJson.foreignReliefsAmendValueErrorsRequest
            case "foreignReliefsAmendMissingErrors" => ForeignReliefsJson.foreignReliefsAmendMissingErrorsRequest

            case "CreateOtherReliefs"                   => OtherReliefsJson.CreateOtherReliefs
            case "AmendOtherReliefs"                    => OtherReliefsJson.AmendOtherReliefs
            case "otherReliefsAmendMinimumFields"       => OtherReliefsJson.otherReliefsAmendMinimumFields
            case "CreateOtherReliefsAmendMinimumFields" => OtherReliefsJson.CreateOtherReliefsAmendMinimumFields
            case "AmendOtherReliefsAmendMinimumFields"  => OtherReliefsJson.AmendOtherReliefsAmendMinimumFields
            case "otherReliefsAmendValueErrors"         => OtherReliefsJson.otherReliefsAmendValueErrorsRequest
            case "otherReliefsAmendMissingErrors"       => OtherReliefsJson.otherReliefsAmendMissingErrorsRequest

            case "AmendPensionsReliefs"                    => PensionReliefsJson.amendPensionsReliefs
            case "CreatePensionsReliefs"                   => PensionReliefsJson.createPensionsReliefs
            case "CreatePensionsReliefsMinimumFields"      => PensionReliefsJson.createPensionsReliefsMinimumFields
            case "AmendPensionsReliefsMinimumFields"       => PensionReliefsJson.amendPensionsReliefsMinimumFields
            case "pensionReliefsAmendMissingErrorsRequest" => PensionReliefsJson.pensionReliefsAmendMissingErrorsRequest
            case "pensionReliefsAmendValueErrorsRequest"   => PensionReliefsJson.pensionReliefsAmendValueErrorsRequest

            case "CHARITABLE_GIVING_RELIEFS_REQUEST_BODY"               => CharitableGivingReliefsJson.CREATE_OR_AMEND_CHARITABLE_GIVING_RELIEFS
            case "AMEND_CHARITABLE_GIVING_RELIEFS"                      => CharitableGivingReliefsJson.AMEND_CHARITABLE_GIVING_RELIEFS
            case "AMEND_CHARITABLE_GIVING_RELIEFS_MINIMUM_FIELDS"       => CharitableGivingReliefsJson.AMEND_CHARITABLE_GIVING_RELIEFS_MINIMUM_FIELDS
            case "AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_REQUEST" => CharitableGivingReliefsJson.AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_REQUEST

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Disclosures API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "iDisclosuresAmendRequest"              => DisclosuresJson.iDisclosuresAmend
            case "iDisclosuresAmendRequestAgain"         => DisclosuresJson.iDisclosuresAmendAgain
            case "iDisclosuresAmendMinimumFieldsRequest" => DisclosuresJson.iDisclosuresAmendMinimumFields
            case "iDisclosuresAmendMissingErrorsRequest" => DisclosuresJson.iDisclosuresAmendMissingErrors
            case "iDisclosuresAmendValueErrorsRequest"   => DisclosuresJson.iDisclosuresAmendValueErrorsRequest
            case "iDisclosuresAmendEmptyBodyRequest"     => DisclosuresJson.iDisclosuresAmendEmptyBodyRequest
            case "CreateIndividualDisclosures"           => DisclosuresJson.CreateRequestBodyForIndividualDisclosures
            case "AmendIndividualDisclosures"            => DisclosuresJson.AmendRequestBodyForIndividualDisclosures

            case "marriageAllowanceRequest"              => MarriageAllowanceJson.marriageAllowanceRequest
            case "marriageAllowanceMinimumFieldsRequest" => MarriageAllowanceJson.marriageAllowanceMinimumFields
            case "marriageAllowanceEmptyBodyRequest"     => MarriageAllowanceJson.marriageAllowanceEmptyBodyRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals State Benefits API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "iStateBenefitsAmendRequest"              => AmendStateBenefitJson.iStateBenefitsAmendRequest
            case "iStateBenefitsAmendMinimumFieldsRequest" => AmendStateBenefitJson.iStateBenefitsAmendMinimumFieldsRequest
            case "iStateBenefitsAmendInvalidBodyRequest"   => AmendStateBenefitJson.iStateBenefitsAmendInvalidBodyRequest
            case "iStateBenefitsAmendEmptyBodyRequest"     => AmendStateBenefitJson.iStateBenefitsAmendEmptyBodyRequest
            case "iStateBenefitsAmendValueErrorsRequest"   => AmendStateBenefitJson.iStateBenefitsAmendValueErrorsRequest

            case "iStateBenefitsAddRequest"              => CreateStateBenefitJson.iStateBenefitsAddRequest
            case "iStateBenefitsAddRequestStateful"      => CreateStateBenefitJson.iStateBenefitsAddRequestStateful
            case "iStateBenefitsAddRequestTYS"           => CreateStateBenefitJson.iStateBenefitsAddRequestTYS
            case "iStateBenefitsAddMinimumFieldsRequest" => CreateStateBenefitJson.iStateBenefitsAddMinimumFieldsRequest
            case "iStateBenefitsAddInvalidBodyRequest"   => CreateStateBenefitJson.iStateBenefitsAddInvalidBodyRequest
            case "iStateBenefitsAddValueErrorsRequest"   => CreateStateBenefitJson.iStateBenefitsAddValueErrorsRequest

            case "iStateBenefitsAmendAmountsRequest"              => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsRequest
            case "iStateBenefitsAmendAmountsMinimumFieldsRequest" => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsMinimumFieldsRequest
            case "iStateBenefitsAmendAmountsInvalidBodyRequest"   => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsInvalidBodyRequest
            case "iStateBenefitsAmendAmountsEmptyBodyRequest"     => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsEmptyBodyRequest
            case "iStateBenefitsAmendAmountsValueErrorsRequest"   => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsValueErrorsRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Savings Income API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
            case "savingsCreateRequest"              => IndividualsSavingsIncomeApi.CreateSavingsIncomeJson.savingsCreateRequest
            case "savingsCreateMinimumFieldsRequest" => IndividualsSavingsIncomeApi.CreateSavingsIncomeJson.savingsCreateMinimumFieldsRequest
            case "savingsAmendRequest"               => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendRequest
            case "savingsAmendMinimumFieldsRequest"  => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendMinimumFieldsRequest
            case "savingsAmendValueErrorsRequest"    => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendValueErrorsRequest
            case "savingsAmendInvalidBodyRequest"    => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendInvalidBodyRequest
            case "savingsAmendEmptyBodyRequest"      => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendEmptyBodyRequest
            case "savingsAmendRequestAgain"          => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendRequestAgain

            case "ukSavingsAccountAddRequest"    => IndividualsSavingsIncomeApi.AddUkSavingsAccountJson.ukSavingsAccountAddRequest
            case "ukSavingsAccountAddRequestTYS" => IndividualsSavingsIncomeApi.AddUkSavingsAccountJson.ukSavingsAccountAddRequestTYS
            case "ukSavingsAccountAmendRequest"  => IndividualsSavingsIncomeApi.AmendUkSavingsAccountIncomeJson.ukSavingsAccountAmendRequest
            case "ukSavingsAccountCreateRequest" => IndividualsSavingsIncomeApi.AmendUkSavingsAccountIncomeJson.ukSavingsAccountCreateRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Employments Income API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
            case "ieiCustomEmploymentAddRequest" => IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddRequest(false)
            case "ieiCustomEmploymentAddMinimumFieldsRequest" =>
              IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddMinimumFieldsRequest
            case "ieiCustomEmploymentAddInvalidBodyRequest" =>
              IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddInvalidBodyRequest
            case "ieiCustomEmploymentAddValueErrorsRequest" =>
              IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddValueErrorsRequest
            case "ieiCustomEmploymentAmendRequest" => IndividualsEmploymentsIncomeApi.AmendCustomEmploymentJson.ieiCustomEmploymentAmendRequest
            case "ieiCustomEmploymentAmendMinimumFieldsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendCustomEmploymentJson.ieiCustomEmploymentAmendMinimumFieldsRequest
            case "ieiCustomEmploymentAmendInvalidBodyRequest" =>
              IndividualsEmploymentsIncomeApi.AmendCustomEmploymentJson.ieiCustomEmploymentAmendInvalidBodyRequest
            case "ieiCustomEmploymentAmendValueErrorsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendCustomEmploymentJson.ieiCustomEmploymentAmendValueErrorsRequest
            case "ieiFinancialDetailsAmendRequest" => IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendRequest
            case "ieiFinancialDetailsAmendRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendRequestTYS
            case "ieiFinancialDetailsCreateRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsCreateRequestTYS
            case "ieiFinancialDetailsAmendInvalidRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendInvalidRequest
            case "ieiFinancialDetailsAmendInvalidRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendInvalidRequestTYS
            case "ieiFinancialDetailsCreateMinimumFieldsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsCreateMinimumFieldsRequest
            case "ieiFinancialDetailsAmendMinimumFieldsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendMinimumFieldsRequest
            case "ieiFinancialDetailsAmendMinimumFieldsRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendMinimumFieldsRequestTYS
            case "ieiFinancialDetailsCreateMinimumFieldsRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsCreateMinimumFieldsRequestTYS
            case "ieiFinancialDetailsAmendValueErrorsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendValueErrorsRequest
            case "ieiFinancialDetailsAmendValueErrorsRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendValueErrorsRequestTYS
            case "ieiFinancialDetailsAmendMissingErrorsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendMissingErrorsRequest
            case "ieiFinancialDetailsAmendMissingErrorsRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendMissingErrorsRequestTYS
            case "ieiFinancialDetailsAmendEmptyBenefitsInKindRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyBenefitsInKindRequest
            case "ieiFinancialDetailsAmendEmptyBenefitsInKindRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyBenefitsInKindRequestTYS
            case "ieiFinancialDetailsAmendEmptyDeductionsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyDeductionsRequest
            case "ieiFinancialDetailsAmendEmptyDeductionsRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyDeductionsRequestTYS
            case "ieiFinancialDetailsAmendEmptyStudentLoansRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyStudentLoansRequest
            case "ieiFinancialDetailsAmendEmptyStudentLoansRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyStudentLoansRequestTYS
            case "ieiFinancialDetailsAmendEmptyObjectsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyObjectsRequest
            case "ieiFinancialDetailsAmendEmptyObjectsRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyObjectsRequestTYS
            case "ieiFinancialDetailsCreateRequest" => IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsCreateRequest
            case "ieiCustomEmploymentFlagTrueAddRequest" => IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddRequest(true)
            case "ieiCustomEmploymentFlagTrueAddRequestTys" =>
              IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddRequestTys(true)
            case "ieiCustomEmploymentAddRequestTys" => IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddRequestTys(false)
            case "ieiFinancialDetailsCreateMedicalInsuranceOnlyRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsCreateOnlyMedicalInsuranceRequest
            case "ieiFinancialDetailsAmendMedicalInsuranceOnlyRequest" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendOnlyMedicalInsuranceRequest
            case "ieiFinancialDetailsCreateMedicalInsuranceOnlyRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsCreateOnlyMedicalInsuranceRequestTYS
            case "ieiFinancialDetailsAmendMedicalInsuranceOnlyRequestTYS" =>
              IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendOnlyMedicalInsuranceRequestTYS
            case "ieiNonPayeEmploymentIncomeRequest" =>
              IndividualsEmploymentsIncomeApi.CreateAmendNonPayeEmploymentIncomeJson.CREATE_AND_AMEND_NON_PAYE_EMPLOYMENT_INCOME_REQUEST
            case "ieiNonPayeEmploymentIncomeAmendRequest" =>
              IndividualsEmploymentsIncomeApi.CreateAmendNonPayeEmploymentIncomeJson.AMEND_NON_PAYE_EMPLOYMENT_INCOME_REQUEST
            case "ieiOtherEmploymentAmendRequest" => IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendRequest
            case "ieiOtherEmploymentAmendMinimumFieldsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendMinimumFieldsRequest
            case "ieiOtherEmploymentAmendValueErrorsRequest" =>
              IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendValueErrorsRequest
            case "ieiOtherEmploymentAmendInvalidDateRequest" =>
              IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendInvalidDateRequest
            case "ieiOtherEmploymentAmendInvalidBodyRequest" =>
              IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendInvalidBodyRequest
            case "ieiOtherEmploymentAmendEmptyBodyRequest" =>
              IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendEmptyBodyRequest
            case "ieiOtherEmploymentCreateRequest" => IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentCreateRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Income Received API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "iirSavingsCreateRequest"              => CreateSavingsIncomeJson.iirSavingsCreateRequest
            case "iirSavingsCreateMinimumFieldsRequest" => CreateSavingsIncomeJson.iirSavingsCreateMinimumFieldsRequest
            case "iirSavingsAmendRequest"               => AmendSavingsIncomeJson.iirSavingsAmendRequest
            case "iirSavingsAmendMinimumFieldsRequest"  => AmendSavingsIncomeJson.iirSavingsAmendMinimumFieldsRequest
            case "iirSavingsAmendValueErrorsRequest"    => AmendSavingsIncomeJson.iirSavingsAmendValueErrorsRequest
            case "iirSavingsAmendInvalidBodyRequest"    => AmendSavingsIncomeJson.iirSavingsAmendInvalidBodyRequest
            case "iirSavingsAmendEmptyBodyRequest"      => AmendSavingsIncomeJson.iirSavingsAmendEmptyBodyRequest
            case "iirSavingsAmendRequestAgain"          => AmendSavingsIncomeJson.iirSavingsAmendRequestAgain

            case "iirUkSavingsAccountAddRequest"    => AddUkSavingsAccountJson.iirUkSavingsAccountAddRequest
            case "iirUkSavingsAccountAddRequestTYS" => AddUkSavingsAccountJson.iirUkSavingsAccountAddRequestTYS
            case "iirUkSavingsAccountAmendRequest"  => AmendUkSavingsAccountIncomeJson.iirUkSavingsAccountAmendRequest
            case "iirUkSavingsAccountCreateRequest" => AmendUkSavingsAccountIncomeJson.iirUkSavingsAccountCreateRequest

            case "iirInsurancePoliciesCreateRequest"                 => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesCreateRequest
            case "iirInsurancePoliciesAmendRequest"                  => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRequest
            case "iirInsurancePoliciesAmendMinimumFieldsRequest"     => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendMinimumFieldsRequest
            case "iirInsurancePoliciesAmendInvalidBodyRequest"       => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendInvalidBodyRequest
            case "iirInsurancePoliciesAmendEmptyBodyRequest"         => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendEmptyBodyRequest
            case "iirInsurancePoliciesAmendRefAndEventErrorsRequest" => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRefAndEventErrorsRequest
            case "iirInsurancePoliciesAmendValueErrorsRequest"       => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendValueErrorsRequest
            case "iirInsurancePoliciesAmendRequestAgain"             => AmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRequestAgain

            case "iirForeignAmendRequest"              => AmendForeignIncomeJson.iirForeignAmendRequest
            case "iirForeignCreateRequest"             => AmendForeignIncomeJson.iirForeignCreateRequest
            case "iirForeignAmendMinimumFieldsRequest" => AmendForeignIncomeJson.iirForeignIncomeAmendMinimumFieldsRequest
            case "iirForeignAmendInvalidBodyRequest"   => AmendForeignIncomeJson.iirForeignIncomeAmendInvalidBodyRequest
            case "iirForeignAmendValueErrorsRequest"   => AmendForeignIncomeJson.iirForeignIncomeAmendValueErrorsRequest
            case "iirForeignAmendEmptyBodyRequest"     => AmendForeignIncomeJson.iirForeignIncomeAmendEmptyBodyRequest
            case "iirForeignAmendRequestAgain"         => AmendForeignIncomeJson.iirForeignAmendRequestAgain

            case "iirPensionsAmendRequest"               => AmendPensionsIncomeJson.iirPensionsAmendRequest
            case "iirPensionsCreateRequestV2"            => AmendPensionsIncomeJson.iirPensionsCreateRequestV2
            case "iirPensionsAmendRequestV2"             => AmendPensionsIncomeJson.iirPensionsAmendRequestV2
            case "iirPensionsCreateMinimumFieldsRequest" => AmendPensionsIncomeJson.iirPensionsCreateMinimumFieldsRequest
            case "iirPensionsAmendMinimumFieldsRequest"  => AmendPensionsIncomeJson.iirPensionsAmendMinimumFieldsRequest
            case "iirPensionsAmendInvalidBodyRequest"    => AmendPensionsIncomeJson.iirPensionsAmendInvalidBodyRequest
            case "iirPensionsAmendValueErrorsRequest"    => AmendPensionsIncomeJson.iirPensionsAmendValueErrorsRequest
            case "iirPensionsAmendEmptyBodyRequest"      => AmendPensionsIncomeJson.iirPensionsAmendEmptyBodyRequest
            case "iirPensionsAmendRequestAgain"          => AmendPensionsIncomeJson.iirPensionsAmendRequestAgain

            case "iirOtherAmendRequest"                  => AmendOtherIncomeJson.iirOtherAmendRequest
            case "iirOtherAmendMinimumFieldsRequest"     => AmendOtherIncomeJson.iirOtherAmendMinimumFieldsRequest
            case "iirOtherAmendInvalidBodyRequest"       => AmendOtherIncomeJson.iirOtherAmendInvalidBodyRequest
            case "iirOtherAmendValueErrorsRequest"       => AmendOtherIncomeJson.iirOtherAmendValueErrorsRequest
            case "iirOtherAmendEmptyBodyRequest"         => AmendOtherIncomeJson.iirOtherIncomeAmendEmptyBodyRequest
            case "iirOtherIncomeAmendInvalidDateRequest" => AmendOtherIncomeJson.iirOtherIncomeAmendInvalidDateRequest
            case "iirOtherAmendRequestAgain"             => AmendOtherIncomeJson.iirOtherAmendRequestAgain
            case "iirOtherCreateRequest"                 => AmendOtherIncomeJson.iirOtherCreateRequest
            case "iirOtherCreateMinimumFieldsRequest"    => AmendOtherIncomeJson.iirOtherCreateMinimumFieldsRequest

            case "iirUkDividendsCreateRequest" => CreateUkDividendsIncomeJson.iirUkDividendsCreateRequest
            case "iirUkDividendsAmendRequest"  => AmendUkDividendsIncomeJson.iirUkDividendsAmendRequest

            case "iirDividendsAmendRequest"                    => AmendDividendsIncomeJson.iirDividendsAmendRequest
            case "iirDividendsAmendMinimumFieldsRequest"       => AmendDividendsIncomeJson.iirDividendsAmendMinimumFieldsRequest
            case "iirDividendsAmendMinimumFieldsRequestV2"     => AmendDividendsIncomeJson.iirDividendsAmendMinimumFieldsRequestV2
            case "iirDividendsAmendInvalidBodyRequest"         => AmendDividendsIncomeJson.iirDividendsAmendInvalidBodyRequest
            case "iirDividendsAmendValueErrorsRequest"         => AmendDividendsIncomeJson.iirDividendsAmendValueErrorsRequest
            case "iirDividendsAmendEmptyBodyRequest"           => AmendDividendsIncomeJson.iirDividendsAmendEmptyBodyRequest
            case "iirDividendsCreateRequest"                   => AmendDividendsIncomeJson.iirDividendsCreateRequest
            case "iirOtherEmploymentCreateRequest"             => AmendOtherEmploymentIncomeJson.iirOtherEmploymentCreateRequest
            case "iirOtherEmploymentAmendRequest"              => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendRequest
            case "iirOtherEmploymentAmendMinimumFieldsRequest" => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendMinimumFieldsRequest
            case "iirOtherEmploymentAmendValueErrorsRequest"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendValueErrorsRequest
            case "iirOtherEmploymentAmendInvalidDateRequest"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendInvalidDateRequest
            case "iirOtherEmploymentAmendInvalidBodyRequest"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendInvalidBodyRequest
            case "iirOtherEmploymentAmendEmptyBodyRequest"     => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendEmptyBodyRequest
            case "iirOtherEmploymentAmendRequestAgain"         => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendRequestAgain

            case "iirCustomEmploymentAddRequest"              => AddCustomEmploymentJson.iirCustomEmploymentAddRequest(false)
            case "iirCustomEmploymentAddRequestTys"           => AddCustomEmploymentJson.iirCustomEmploymentAddRequestTys(false)
            case "iirCustomEmploymentFlagTrueAddRequest"      => AddCustomEmploymentJson.iirCustomEmploymentAddRequest(true)
            case "iirCustomEmploymentFlagTrueAddRequestTys"   => AddCustomEmploymentJson.iirCustomEmploymentAddRequestTys(true)
            case "iirCustomEmploymentAddMinimumFieldsRequest" => AddCustomEmploymentJson.iirCustomEmploymentAddMinimumFieldsRequest
            case "iirCustomEmploymentAddInvalidBodyRequest"   => AddCustomEmploymentJson.iirCustomEmploymentAddInvalidBodyRequest
            case "iirCustomEmploymentAddValueErrorsRequest"   => AddCustomEmploymentJson.iirCustomEmploymentAddValueErrorsRequest

            case "iirCustomEmploymentAmendRequest"              => AmendCustomEmploymentJson.iirCustomEmploymentAmendRequest
            case "iirCustomEmploymentAmendMinimumFieldsRequest" => AmendCustomEmploymentJson.iirCustomEmploymentAmendMinimumFieldsRequest
            case "iirCustomEmploymentAmendInvalidBodyRequest"   => AmendCustomEmploymentJson.iirCustomEmploymentAmendInvalidBodyRequest
            case "iirCustomEmploymentAmendValueErrorsRequest"   => AmendCustomEmploymentJson.iirCustomEmploymentAmendValueErrorsRequest
            case "iirFinancialDetailsCreateRequest"             => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsCreateRequest
            case "iirFinancialDetailsCreateMedicalInsuranceOnlyRequestTYS" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsCreateOnlyMedicalInsuranceRequestTYS
            case "iirFinancialDetailsCreateMedicalInsuranceOnlyRequest" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsCreateOnlyMedicalInsuranceRequest
            case "iirFinancialDetailsAmendMedicalInsuranceOnlyRequestTYS" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendOnlyMedicalInsuranceRequestTYS
            case "iirFinancialDetailsAmendMedicalInsuranceOnlyRequest" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendOnlyMedicalInsuranceRequest
            case "iirFinancialDetailsAmendRequest"                  => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendRequest
            case "iirFinancialDetailsAmendRequestTYS"               => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendRequestTYS
            case "iirFinancialDetailsCreateRequestTYS"              => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsCreateRequestTYS
            case "iirFinancialDetailsAmendInvalidRequest"           => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendInvalidRequest
            case "iirFinancialDetailsAmendInvalidRequestTYS"        => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendInvalidRequestTYS
            case "iirFinancialDetailsCreateMinimumFieldsRequest"    => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsCreateMinimumFieldsRequest
            case "iirFinancialDetailsAmendMinimumFieldsRequest"     => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMinimumFieldsRequest
            case "iirFinancialDetailsAmendMinimumFieldsRequestTYS"  => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMinimumFieldsRequestTYS
            case "iirFinancialDetailsCreateMinimumFieldsRequestTYS" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsCreateMinimumFieldsRequestTYS
            case "iirFinancialDetailsAmendValueErrorsRequest"       => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendValueErrorsRequest
            case "iirFinancialDetailsAmendValueErrorsRequestTYS"    => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendValueErrorsRequestTYS
            case "iirFinancialDetailsAmendMissingErrorsRequest"     => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMissingErrorsRequest
            case "iirFinancialDetailsAmendMissingErrorsRequestTYS"  => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMissingErrorsRequestTYS
            case "iirFinancialDetailsAmendEmptyBenefitsInKindRequest" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyBenefitsInKindRequest
            case "iirFinancialDetailsAmendEmptyBenefitsInKindRequestTYS" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyBenefitsInKindRequestTYS
            case "iirFinancialDetailsAmendEmptyDeductionsRequest" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyDeductionsRequest
            case "iirFinancialDetailsAmendEmptyDeductionsRequestTYS" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyDeductionsRequestTYS
            case "iirFinancialDetailsAmendEmptyStudentLoansRequest" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyStudentLoansRequest
            case "iirFinancialDetailsAmendEmptyStudentLoansRequestTYS" =>
              AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyStudentLoansRequestTYS
            case "iirFinancialDetailsAmendEmptyObjectsRequest"    => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyObjectsRequest
            case "iirFinancialDetailsAmendEmptyObjectsRequestTYS" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyObjectsRequestTYS

            case "iirOtherCapitalGainsRequest"              => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_REQUEST
            case "AmendiirOtherCapitalGainsRequest"         => CreateAndAmendOtherCapitalGains.AMEND_OTHER_CAPITAL_GAINS_REQUEST
            case "iirOtherCapitalGainsMinimumFieldsRequest" => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MINIMUM_FIELDS
            case "iirOtherCapitalGainsMissingFieldsRequest" => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS
            case "iirOtherCapitalGainsInvalidRequest"       => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST
            case "iirPPDRequest"                            => CreateAmendPPDJson.CREATE_AND_AMEND_PPD
            case "iirPPDAmendRequest"                       => CreateAmendPPDJson.AMEND_PPD
            case "iirPPDMinimumFieldsRequest"               => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MINIMUM_FIELDS
            case "iirPPDMinimumFieldsAmendRequest"          => CreateAmendPPDJson.AMEND_PPD_MINIMUM_FIELDS
            case "iirPPDMissingFieldsRequest"               => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MISSING_FIELDS
            case "iirPPDInvalidRequest"                     => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_REQUEST
            case "iirPPDInvalidDateRequest"                 => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_DATE

            case "iirCgtResidentialPropertyRequest" => CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_REQUEST
            case "CREATE_CGT_RESIDENTIAL_PROPERTY_REQUEST_TYS" =>
              CreateAndAmendCgtResidentialPropertyDisposals.CREATE_CGT_RESIDENTIAL_PROPERTY_REQUEST_TYS
            case "iirCgtResidentialPropertyMinimumFieldsRequest" =>
              CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MINIMUM_FIELDS
            case "iirCgtResidentialPropertyMissingFieldsRequest" =>
              CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS
            case "iirCgtResidentialPropertyInvalidRequest" =>
              CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST
            case "AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL" =>
              CreateAndAmendCgtResidentialPropertyDisposals.AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL
            case "AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL_TYS" =>
              CreateAndAmendCgtResidentialPropertyDisposals.AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL_TYS

            case "iirNonPayeEmploymentIncomeRequest"      => CreateAmendNonPayeEmploymentIncomeJson.CREATE_AND_AMEND_NON_PAYE_EMPLOYMENT_INCOME_REQUEST
            case "iirNonPayeEmploymentIncomeAmendRequest" => CreateAmendNonPayeEmploymentIncomeJson.AMEND_NON_PAYE_EMPLOYMENT_INCOME_REQUEST

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Capital Gains Income API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "OtherCapitalGainsRequest" => IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_REQUEST
            case "AmendOtherCapitalGainsRequest" => IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.AMEND_OTHER_CAPITAL_GAINS_REQUEST
            case "OtherCapitalGainsMinimumFieldsRequest" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MINIMUM_FIELDS
            case "OtherCapitalGainsMissingFieldsRequest" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS
            case "OtherCapitalGainsInvalidRequest" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST
            case "PPDRequest"                   => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD
            case "PPDAmendRequest"              => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.AMEND_PPD
            case "PPDMinimumFieldsRequest"      => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MINIMUM_FIELDS
            case "PPDMinimumFieldsAmendRequest" => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.AMEND_PPD_MINIMUM_FIELDS
            case "PPDMissingFieldsRequest"      => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MISSING_FIELDS
            case "PPDInvalidRequest"            => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_REQUEST
            case "PPDInvalidDateRequest"        => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_DATE

            case "CgtResidentialPropertyRequest" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_REQUEST
            case "CREATE_CGT_RESIDENTIAL_PROPERTY_TYS_REQUEST" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.CREATE_CGT_RESIDENTIAL_PROPERTY_TYS_REQUEST
            case "CgtResidentialPropertyMinimumFieldsRequest" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MINIMUM_FIELDS
            case "CgtResidentialPropertyMissingFieldsRequest" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS
            case "CgtResidentialPropertyInvalidRequest" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST
            case "AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL_REQUEST" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL_REQUEST
            case "AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL_TYS_REQUEST" =>
              IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.AMEND_CGT_RESIDENTIAL_PROPERTY_STATEFUL_TYS_REQUEST

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Other Income API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "IndividualsOtherIncomeAmendRequest"            => CreateAmendOtherIncomeJson.amendRequest
            case "IndividualsOtherIncomeAmendMinimalRequest"     => CreateAmendOtherIncomeJson.amendRequestWithMinimalFields
            case "IndividualsOtherIncomeCreateRequest"           => CreateAmendOtherIncomeJson.createRequest
            case "IndividualsOtherIncomeCreateMinimalRequest"    => CreateAmendOtherIncomeJson.createRequestWithMinimalFields
            case "IndividualsOtherIncomeAmendValueErrorsRequest" => CreateAmendOtherIncomeJson.amendValueErrorsRequest
            case "IndividualsOtherIncomeAmendInvalidBodyRequest" => CreateAmendOtherIncomeJson.amendInvalidBodyRequest
            case "IndividualsOtherIncomeAmendInvalidDateRequest" => CreateAmendOtherIncomeJson.amendInvalidDateRequest
            case "IndividualsOtherIncomeAmendEmptyBodyRequest"   => CreateAmendOtherIncomeJson.amendEmptyBodyRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Dividends Income API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "IndividualsDividendsIncomeAmendRequest"            => CreateAmendDividendsJson.amendRequest
            case "IndividualsDividendsIncomeCreateRequest"           => CreateAmendDividendsJson.createRequest
            case "IndividualsDividendsIncomeAmendMinimalRequest"     => CreateAmendDividendsJson.amendRequestWithMinimalFields
            case "IndividualsDividendsIncomeCreateMinimalRequest"    => CreateAmendDividendsJson.createRequestWithMinimalFields
            case "IndividualsDividendsIncomeAmendValueErrorsRequest" => CreateAmendDividendsJson.amendValueErrorsRequest
            case "IndividualsDividendsIncomeAmendInvalidBodyRequest" => CreateAmendDividendsJson.amendInvalidBodyRequest
            case "IndividualsDividendsIncomeAmendEmptyBodyRequest"   => CreateAmendDividendsJson.amendEmptyBodyRequest

            case "UkDividendsIncomeAnnualSummaryAmendRequest"            => CreateAmendUkDividendsAnnualSummaryJson.amendRequest
            case "UkDividendsIncomeAnnualSummaryCreateRequest"           => CreateAmendUkDividendsAnnualSummaryJson.createRequest
            case "UkDividendsIncomeAnnualSummaryAmendMinimalRequest"     => CreateAmendUkDividendsAnnualSummaryJson.amendRequestWithMinimalFields
            case "UkDividendsIncomeAnnualSummaryCreateMinimalRequest"    => CreateAmendUkDividendsAnnualSummaryJson.createRequestWithMinimalFields
            case "UkDividendsIncomeAnnualSummaryAmendValueErrorsRequest" => CreateAmendUkDividendsAnnualSummaryJson.amendValueErrorsRequest
            case "UkDividendsIncomeAnnualSummaryAmendEmptyBodyRequest"   => CreateAmendUkDividendsAnnualSummaryJson.amendEmptyBodyRequest

            // Individuals Foreign Income API
            case "ifiCreateRequest"             => IfiCreateAmendForeignIncomeJson.createRequest
            case "ifiAmendRequest"              => IfiCreateAmendForeignIncomeJson.amendRequest
            case "ifiAmendMinimumFieldsRequest" => IfiCreateAmendForeignIncomeJson.amendMinimumFieldsRequest
            case "ifiAmendInvalidBodyRequest"   => IfiCreateAmendForeignIncomeJson.amendInvalidBodyRequest
            case "ifiAmendValueErrorsRequest"   => IfiCreateAmendForeignIncomeJson.amendValueErrorsRequest
            case "ifiAmendEmptyBodyRequest"     => IfiCreateAmendForeignIncomeJson.amendEmptyBodyRequest

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individuals Pensions Income API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
            case "ipiCreateRequest"              => PensionsIncomeAmendJson.createRequest
            case "ipiCreateMinimumFieldsRequest" => PensionsIncomeAmendJson.createMinimumFieldsRequest
            case "ipiAmendRequest"               => PensionsIncomeAmendJson.amendRequest
            case "ipiAmendMinimumFieldsRequest"  => PensionsIncomeAmendJson.amendMinimumFieldsRequest
            case "ipiAmendInvalidBodyRequest"    => PensionsIncomeAmendJson.invalidBodyRequest
            case "ipiAmendValueErrorsRequest"    => PensionsIncomeAmendJson.valueErrorsRequest
            case "ipiAmendEmptyBodyRequest"      => PensionsIncomeAmendJson.emptyBodyRequest
            case "ipiAmendRequestAgain"          => PensionsIncomeAmendJson.amendRequestAgain

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individual Losses API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
            case "SELF_EMPLOYMENT"                                  => IndividualLossesJson.SELF_EMPLOYMENT
            case "SELF_EMPLOYMENT_CLASS4"                           => IndividualLossesJson.SELF_EMPLOYMENT_CLASS4
            case "UK_PROPERTY_FHL"                                  => IndividualLossesJson.UK_FHL_PROPERTY
            case "UK_PROPERTY_NON_FHL"                              => IndividualLossesJson.UK_NON_FHL_PROPERTY
            case "UK_PROPERTY"                                      => IndividualLossesJson.UK_PROPERTY
            case "FOREIGN_PROPERTY_FHL_EEA"                         => IndividualLossesJson.FOREIGN_PROPERTY_FHL_EEA
            case "AMEND_LOSS_CLAIM_SELF_EMPLOYMENT"                 => IndividualLossesJson.AMEND_LOSS_CLAIM_SELF_EMPLOYMENT
            case "AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL"             => IndividualLossesJson.AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL
            case "LOSS_CLAIM_SELF_EMPLOYMENT"                       => IndividualLossesJson.LOSS_CLAIM_SELF_EMPLOYMENT
            case "LOSS_CLAIM_FOREIGN_PROPERTY"                      => IndividualLossesJson.LOSS_CLAIM_FOREIGN_PROPERTY
            case "LOSS_CLAIM_UK_PROPERTY"                           => IndividualLossesJson.LOSS_CLAIM_UK_PROPERTY
            case "LOSS_CLAIM_UK_NON_FHL_PROPERTY"                   => IndividualLossesJson.LOSS_CLAIM_UK_NON_FHL_PROPERTY
            case "AMEND_LOSS_CLAIM_ORDER_CARRY_FORWARD"             => IndividualLossesJson.AMEND_LOSS_CLAIM_ORDER_CARRY_FORWARD
            case "AMEND_LOSS_CLAIM_ORDER_CARRY_SIDEWAYS"            => IndividualLossesJson.AMEND_LOSS_CLAIM_ORDER_CARRY_SIDEWAYS
            case "AMEND_LOSS_AMOUNT"                                => IndividualLossesJson.AMEND_LOSS_AMOUNT
            case "AMEND_BFLOSS_AMOUNT_DYNAMIC"                      => IndividualLossesJson.AMEND_BFLOSS_AMOUNT_DYNAMIC
            case "AMEND_BFLOSS_AMOUNT_DYNAMIC_1"                    => IndividualLossesJson.AMEND_BFLOSS_AMOUNT_DYNAMIC_1
            case "FOREIGN_PROPERTY"                                 => IndividualLossesJson.FOREIGN_PROPERTY
            case "AMEND_LOSS_CLAIM_SELF_EMPLOYMENT_DYNAMIC_CF"      => IndividualLossesJson.AMEND_LOSS_CLAIM_SELF_EMPLOYMENT_DYNAMIC_CF
            case "AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL_DYNAMIC_CS"  => IndividualLossesJson.AMEND_LOSS_CLAIM_UK_PROPERTY_NON_FHL_DYNAMIC_CS
            case "AMEND_LOSS_CLAIM_FOREIGN_PROPERTY_DYNAMIC_CS_FHL" => IndividualLossesJson.AMEND_LOSS_CLAIM_FOREIGN_PROPERTY_DYNAMIC_CS_FHL
            case "AMEND_LOSS_CLAIM_FOREIGN_PROPERTY_DYNAMIC_CF_CS"  => IndividualLossesJson.AMEND_LOSS_CLAIM_FOREIGN_PROPERTY_DYNAMIC_CF_CS
            case "LOSS_CLAIM_ORDER_1"                               => IndividualLossesJson.LOSS_CLAIM_ORDER_1
            case "LOSS_CLAIM_ORDER_2"                               => IndividualLossesJson.LOSS_CLAIM_ORDER_2

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Individual Calculations API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "TRIGGER_TAX_CALC" => IndividualCalculationsJson.triggerTaxCalc

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Business Source Accounting Summary API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            // V2
            case "SUBMIT_BSAS_ADJUSTMENT_NON_FHL"                       => SubmitBsasJson.NON_FHL_BREAKDOWN
            case "SUBMIT_BSAS_ADJUSTMENT_NON_FHL_CONSOLIDATED"          => SubmitBsasJson.NON_FHL_CONSOLIDATED
            case "SUBMIT_BSAS_ADJUSTMENT_NON_FHL_BOTH_EXPENSES"         => SubmitBsasJson.NON_FHL_BOTH_EXPENSES
            case "SUBMIT_BSAS_ADJUSTMENT_FHL"                           => SubmitBsasJson.FHL_BREAKDOWN
            case "SUBMIT_BSAS_ADJUSTMENT_FHL_CONSOLIDATED"              => SubmitBsasJson.FHL_CONSOLIDATED
            case "SUBMIT_BSAS_ADJUSTMENT_FHL_BOTH_EXPENSES"             => SubmitBsasJson.FHL_BOTH_EXPENSES
            case "SUBMIT_BSAS_ADJUSTMENT_INVALID_FHL_AND_NON_FHL"       => SubmitBsasJson.INVALID_FHL_AND_NON_FHL
            case "SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT"               => SubmitBsasJson.SELF_EMPLOYMENT_BREAKDOWN
            case "SUBMIT_BSAS_ADJUSTMENT_SE_CONSOLIDATED"               => SubmitBsasJson.SELF_EMPLOYMENT_CONSOLIDATED
            case "SUBMIT_BSAS_ADJUSTMENT_INVALID_SELF_EMPLOYMENT"       => SubmitBsasJson.INVALID_SELF_EMPLOYMENT
            case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN"                       => SubmitBsasJson.FOREIGN_PROP_BREAKDOWN
            case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_CONSOLIDATED"          => SubmitBsasJson.FOREIGN_PROP_CONSOLIDATED
            case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_BOTH_EXPENSES"         => SubmitBsasJson.FOREIGN_PROP_BOTH_EXPENSES
            case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA"               => SubmitBsasJson.FOREIGN_FHL_EEA_BREAKDOWN
            case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_CONSOLIDATED"  => SubmitBsasJson.FOREIGN_FHL_EEA_CONSOLIDATED
            case "SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_BOTH_EXPENSES" => SubmitBsasJson.FOREIGN_FHL_EEA_BOTH_EXPENSES
            case "SUBMIT_BSAS_ADJUSTMENT_INVALID_FOREIGN_AND_FHL_EEA"   => SubmitBsasJson.INVALID_FOREIGN_AND_FHL_EEA
            case "SELF_EMPLOYMENT_BOTH_EXPENSES_SUPPLIED"               => SubmitBsasJson.SELF_EMPLOYMENT_BOTH_EXPENSES_SUPPLIED
            case "V2_TRIGGER_BSAS_FOREIGN_PROPERTY"                     => V2TriggerBsasJson.FOREIGN_PROPERTY
            case "V2_TRIGGER_BSAS_FOREIGN_PROPERTY_FHL_EEA"             => V2TriggerBsasJson.FOREIGN_PROPERTY_FHL_EEA
            case "V2_TRIGGER_BSAS_SELF_EMPLOYMENT"                      => V2TriggerBsasJson.SELF_EMPLOYMENT
            case "V2_TRIGGER_BSAS_UK_FHL_PROPERTY"                      => V2TriggerBsasJson.UK_FHL_PROPERTY
            case "V2_TRIGGER_BSAS_UK_NON_FHL_PROPERTY"                  => V2TriggerBsasJson.UK_NON_FHL_PROPERTY

            // V3
            case "V3_TRIGGER_BSAS_FOREIGN_PROPERTY"                         => V3TriggerBsasJson.FOREIGN_PROPERTY
            case "V3_TRIGGER_BSAS_FOREIGN_PROPERTY_FHL_EEA"                 => V3TriggerBsasJson.FOREIGN_PROPERTY_FHL_EEA
            case "V3_TRIGGER_BSAS_SELF_EMPLOYMENT"                          => V3TriggerBsasJson.SELF_EMPLOYMENT
            case "V3_TRIGGER_BSAS_SELF_EMPLOYMENT_TYS"                      => V3TriggerBsasJson.SELF_EMPLOYMENT_TYS
            case "V3_TRIGGER_BSAS_SELF_EMPLOYMENT_2025"                     => V3TriggerBsasJson.SELF_EMPLOYMENT_2025
            case "V3_TRIGGER_BSAS_UK_FHL_PROPERTY"                          => V3TriggerBsasJson.UK_FHL_PROPERTY
            case "V3_TRIGGER_BSAS_UK_NON_FHL_PROPERTY"                      => V3TriggerBsasJson.UK_NON_FHL_PROPERTY
            case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"                        => V3SubmitBsasJson.V3_FOREIGN_PROPERTY_BREAKDOWN
            case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_CONSOLIDATED"           => V3SubmitBsasJson.V3_FOREIGN_PROPERTY_CONSOLIDATED
            case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA"                => V3SubmitBsasJson.V3_FOREIGN_FHL_EEA_BREAKDOWN
            case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_CONSOLIDATED"   => V3SubmitBsasJson.V3_FOREIGN_FHL_EEA_CONSOLIDATED
            case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_BOTH_EXPENSES"          => V3SubmitBsasJson.V3_FOREIGN_PROPERTY_BOTH_EXPENSES
            case "V3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_BOTH_EXPENSES"  => V3SubmitBsasJson.V3_FOREIGN_FHL_EEA_BOTH_EXPENSES
            case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL"                     => V3SubmitBsasJson.UK_NON_FHL_BREAKDOWN
            case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_CONSOLIDATED"        => V3SubmitBsasJson.UK_NON_FHL_CONSOLIDATED
            case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL"                         => V3SubmitBsasJson.UK_FHL_BREAKDOWN
            case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_CONSOLIDATED"            => V3SubmitBsasJson.UK_FHL_CONSOLIDATED
            case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_BOTH_EXPENSES"       => V3SubmitBsasJson.UK_NON_FHL_BOTH_EXPENSES
            case "V3_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_BOTH_EXPENSES"           => V3SubmitBsasJson.UK_FHL_BOTH_EXPENSES
            case "V3_SUBMIT_BSAS_ADJUSTMENT_INVALID_UK_FHL_AND_NON_FHL"     => V3SubmitBsasJson.INVALID_UK_FHL_AND_NON_FHL
            case "V3_SUBMIT_BSAS_ADJUSTMENT_EMPTY_UK_NON_FHL_INCOME_OBJECT" => V3SubmitBsasJson.EMPTY_UK_NON_FHL_INCOME_OBJECT
            case "V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT"                => V3SubmitBsasJson.V3_SELF_EMPLOYMENT_BREAKDOWN
            case "V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT_CONSOLIDATED"   => V3SubmitBsasJson.V3_SELF_EMPLOYMENT_CONSOLIDATED
            case "V3_SUBMIT_BSAS_ADJUSTMENT_SELF_EMPLOYMENT_BOTH_EXPENSES"  => V3SubmitBsasJson.V3_SELF_EMPLOYMENT_BOTH_EXPENSES

            // V4
            case "V4_TRIGGER_BSAS_SELF_EMPLOYMENT_TYS"     => V4TriggerBsasJson.requestBody("self-employment", TaxYear.fromMtdFormat("2023-24"))
            case "V4_TRIGGER_BSAS_SELF_EMPLOYMENT"         => V4TriggerBsasJson.requestBody("self-employment", TaxYear.fromMtdFormat("2019-20"))
            case "V4_TRIGGER_BSAS_UK_PROPERTY_FHL_TYS"     => V4TriggerBsasJson.requestBody("uk-property-fhl", TaxYear.fromMtdFormat("2023-24"))
            case "V4_TRIGGER_BSAS_UK_PROPERTY_FHL"         => V4TriggerBsasJson.requestBody("uk-property-fhl", TaxYear.fromMtdFormat("2022-23"))
            case "V4_TRIGGER_BSAS_UK_PROPERTY_NON_FHL_TYS" => V4TriggerBsasJson.requestBody("uk-property-non-fhl", TaxYear.fromMtdFormat("2023-24"))
            case "V4_TRIGGER_BSAS_UK_PROPERTY_NON_FHL"     => V4TriggerBsasJson.requestBody("uk-property-non-fhl", TaxYear.fromMtdFormat("2022-23"))
            case "V4_TRIGGER_BSAS_FOREIGN_PROPERTY_FHL_EEA_TYS" =>
              V4TriggerBsasJson.requestBody("foreign-property-fhl-eea", TaxYear.fromMtdFormat("2023-24"))
            case "V4_TRIGGER_BSAS_FOREIGN_PROPERTY_FHL_EEA" =>
              V4TriggerBsasJson.requestBody("foreign-property-fhl-eea", TaxYear.fromMtdFormat("2022-23"))
            case "V4_TRIGGER_BSAS_FOREIGN_PROPERTY_TYS" =>
              V4TriggerBsasJson.requestBody("foreign-property", TaxYear.fromMtdFormat("2023-24"))
            case "V4_TRIGGER_BSAS_FOREIGN_PROPERTY" =>
              V4TriggerBsasJson.requestBody("foreign-property", TaxYear.fromMtdFormat("2022-23"))

            // V5
            case "V5_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"         => V5SubmitBsasJson.FOREIGN_PROPERTY_BREAKDOWN
            case "V5_INVALID_SUBMIT_BSAS_ADJUSTMENT_FOREIGN" => V5SubmitBsasJson.INVALID_FOREIGN_PROPERTY_BREAKDOWN

            case "V5_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL"         => V5SubmitBsasJson.UK_NON_FHL_BREAKDOWN
            case "V5_INVALID_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL" => V5SubmitBsasJson.INVALID_UK_NON_FHL_BREAKDOWN

            // V6
            case "V6_TRIGGER_BSAS" =>
              V6TriggerBsasJson.requestBody(typeOfBusiness = scenarioContext("typeOfBusiness"), taxYear = scenarioContext("taxYear"))

            case "V6_Def1_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"                       => V6_Def1_SubmitBsasJson.FOREIGN_PROPERTY_BREAKDOWN
            case "V6_Def1_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_CONSOLIDATED"          => V6_Def1_SubmitBsasJson.FOREIGN_PROPERTY_CONSOLIDATED
            case "V6_Def1_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA"               => V6_Def1_SubmitBsasJson.FOREIGN_FHL_EEA_BREAKDOWN
            case "V6_Def1_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_CONSOLIDATED"  => V6_Def1_SubmitBsasJson.FOREIGN_FHL_EEA_CONSOLIDATED
            case "V6_Def1_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_BOTH_EXPENSES"         => V6_Def1_SubmitBsasJson.FOREIGN_PROPERTY_BOTH_EXPENSES
            case "V6_Def1_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_FHL_EEA_BOTH_EXPENSES" => V6_Def1_SubmitBsasJson.FOREIGN_FHL_EEA_BOTH_EXPENSES
            case "V6_Def2_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"                       => V6_Def2_SubmitBsasJson.FOREIGN_PROPERTY_BREAKDOWN
            case "V6_Def2_INVALID_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"               => V6_Def2_SubmitBsasJson.INVALID_FOREIGN_PROPERTY_BREAKDOWN
            case "V6_Def3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"                       => V6_Def3_SubmitBsasJson.FOREIGN_PROPERTY_BREAKDOWN
            case "V6_Def3_INVALID_SUBMIT_BSAS_ADJUSTMENT_FOREIGN"               => V6_Def3_SubmitBsasJson.INVALID_FOREIGN_PROPERTY_BREAKDOWN
            case "V6_Def3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_CONSOLIDATED"          => V6_Def3_SubmitBsasJson.V6_FOREIGN_PROPERTY_CONSOLIDATED
            case "V6_Def3_SUBMIT_BSAS_ADJUSTMENT_FOREIGN_BOTH_EXPENSES"         => V6_Def3_SubmitBsasJson.FOREIGN_PROPERTY_BOTH_EXPENSES

            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_UK_PROPERTY"                     => V6_Def1_SubmitUkPropertyBsasJson.UK_PROPERTY_BREAKDOWN
            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_UK_PROPERTY_CONSOLIDATED"        => V6_Def1_SubmitUkPropertyBsasJson.UK_PROPERTY_CONSOLIDATED
            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_UK_FHL"                          => V6_Def1_SubmitUkPropertyBsasJson.UK_FHL_BREAKDOWN
            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_CONSOLIDATED"             => V6_Def1_SubmitUkPropertyBsasJson.UK_FHL_CONSOLIDATED
            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_UK_PROPERTY_BOTH_EXPENSES"       => V6_Def1_SubmitUkPropertyBsasJson.UK_PROPERTY_BOTH_EXPENSES
            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_UK_FHL_BOTH_EXPENSES"            => V6_Def1_SubmitUkPropertyBsasJson.UK_FHL_BOTH_EXPENSES
            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_INVALID_UK_FHL_AND_UK_PROPERTY"  => V6_Def1_SubmitUkPropertyBsasJson.INVALID_UK_FHL_AND_UK_PROPERTY
            case "V6_DEF1_SUBMIT_BSAS_ADJUSTMENT_EMPTY_UK_PROPERTY_INCOME_OBJECT" => V6_Def1_SubmitUkPropertyBsasJson.EMPTY_UK_PROPERTY_INCOME_OBJECT

            case "V6_DEF2_SUBMIT_BSAS_ADJUSTMENT_UK_PROPERTY"         => V6_Def2_SubmitUkPropertyBsasJson.UK_PROPERTY_BREAKDOWN
            case "V6_DEF2_INVALID_SUBMIT_BSAS_ADJUSTMENT_UK_PROPERTY" => V6_Def2_SubmitUkPropertyBsasJson.INVALID_UK_PROPERY_BREAKDOWN

            case "V6_DEF3_SUBMIT_BSAS_ADJUSTMENT_UK_PROPERTY"              => V6_Def3_SubmitUkPropertyBsasJson.UK_PROPERTY_BREAKDOWN
            case "V6_DEF3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_CONSOLIDATED"  => V6_Def3_SubmitUkPropertyBsasJson.UK_NON_FHL_CONSOLIDATED
            case "V6_DEF3_SUBMIT_BSAS_ADJUSTMENT_UK_NON_FHL_BOTH_EXPENSES" => V6_Def3_SubmitUkPropertyBsasJson.UK_NON_FHL_BOTH_EXPENSES

            // ----- Individuals Business EOPS -----

            // V1
            case "SubmitBusinessEOPSSelfEmployment"  => SubmitBusinessEOPSRequestJsonV1.submitEOPSStatementSelfEmployment
            case "SubmitBusinessEOPSUkProperty"      => SubmitBusinessEOPSRequestJsonV1.submitEOPSStatementUkProperty
            case "SubmitBusinessEOPSForeignProperty" => SubmitBusinessEOPSRequestJsonV1.submitEOPSStatementForeignProperty

            // V2
            case "SubmitBusinessEOPSSelfEmploymentV2"  => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementSelfEmploymentV2
            case "SubmitBusinessEOPSUkPropertyV2"      => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementUkPropertyV2
            case "SubmitBusinessEOPSForeignPropertyV2" => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementForeignPropertyV2

            // V2 TYS
            case "SubmitBusinessEOPSSelfEmploymentV2Tys"  => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementSelfEmploymentV2Tys
            case "SubmitBusinessEOPSUkPropertyV2Tys"      => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementUkPropertyV2Tys
            case "SubmitBusinessEOPSForeignPropertyV2Tys" => SubmitBusinessEOPSRequestJsonV2.submitEOPSStatementForeignPropertyV2Tys

            // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ Self Assessment Test Support API ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

            case "CreateTestBusinessUkProperty"              => CreateTestBusinessJson.CREATE_TEST_BUSINESS_UK_PROPERTY
            case "CreateTestBusinessForeignProperty"         => CreateTestBusinessJson.CREATE_TEST_BUSINESS_FOREIGN_PROPERTY
            case "CreateTestBusinessPropertyUnspecified"     => CreateTestBusinessJson.CREATE_TEST_BUSINESS_PROPERTY_UNSPECIFIED
            case "CreateTestBusinessWithQuarterlyTypeChoice" => CreateTestBusinessJson.CREATE_TEST_BUSINESS_WITH_QUARTERLY_TYPE_CHOICE
            case "CreateTestBusinessSelfEmployment"          => CreateTestBusinessJson.CREATE_TEST_BUSINESS_SELF_EMPLOYMENT
            case "CreateTestBusinessUkPropertyMinFields"     => CreateTestBusinessJson.CREATE_TEST_BUSINESS_UK_PROPERTY_MINIMUM_FIELDS
            case "CreateItsaStatus"                          => CreateAmendItsaStatusJson.CREATE_ITSA_STATUS
            case "AmendItsaStatus"                           => CreateAmendItsaStatusJson.AMEND_ITSA_STATUS

            // Individuals Insurance Policies Income
            case "insurancePoliciesCreateRequest" => IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesCreateRequest
            case "insurancePoliciesAmendRequest"  => IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendRequest
            case "insurancePoliciesAmendMinimumFieldsRequest" =>
              IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendMinimumFieldsRequest
            case "insurancePoliciesAmendInvalidBodyRequest" =>
              IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendInvalidBodyRequest
            case "insurancePoliciesAmendEmptyBodyRequest" =>
              IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendEmptyBodyRequest
            case "insurancePoliciesAmendRefAndEventErrorsRequest" =>
              IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendRefAndEventErrorsRequest
            case "insurancePoliciesAmendValueErrorsRequest" =>
              IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendValueErrorsRequest
            case "insurancePoliciesAmendRequestAgain" =>
              IndividualsInsurancePolicies.AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendRequestAgain
  */
            case _ => "{}"

    }
  }

}
