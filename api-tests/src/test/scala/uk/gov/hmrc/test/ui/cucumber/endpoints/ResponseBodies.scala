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

import play.api.libs.json.{Json, Reads}

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import BasePage._
object ResponseBodies {

  def checkResponseBodyStructure[A](body: String)(implicit rds: Reads[A]): Unit =
    Json
      .parse(body)
      .validate[A]
      .fold(
        invalid =>
          Predef
            .assert(assertion = false, s"JSON Response did not match the expected format and could not be parsed.\nErrors: $invalid\n${errorLog()}"),
        _ => Predef.assert(assertion = true)
      )

  def getTaxYearFromDate(date: LocalDate): Int = {
    val taxYearStartDate = LocalDate.parse(
      date.getYear.toString + "-04-06",
      DateTimeFormatter.ofPattern("yyyy-MM-dd")
    )
    if (date.isBefore(taxYearStartDate)) date.getYear else date.getYear + 1
  }

  def findKeyAndMatchValue[T](key: String, value: String)(implicit reads: Reads[T]): Boolean = {
    val responseBody = Option(response.body)
    responseBody.exists(b =>
      (Json.parse(b) \\ key).headOption
        .exists(_.as[T].toString == value))
  }

  def findKeysAndMatchValues[T](key: String, value: String)(implicit reads: Reads[T]): Boolean = {
    val responseBody = Option(response.body)
    responseBody.exists(b =>
      (Json.parse(b) \\ key)
        .exists(_.as[T].toString == value))
  }

  def retrieveExpectedResponse(responseName: String): String = {
    responseName match {

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ SUCCESSFUL RESPONSES ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░
/*
      // ----- MTD API template endpoint -----
      case "INCOME_API_TEMPLATE_RESPONSE"         => SampleEndpointJson.INCOME_API_TEMPLATE_RESPONSE
      case "DEDUCTIONS_API_TEMPLATE_RESPONSE"     => SampleEndpointJson.DEDUCTIONS_API_TEMPLATE_RESPONSE
      case "DISCLOSURES_API_TEMPLATE_RESPONSE"    => SampleEndpointJson.DISCLOSURES_API_TEMPLATE_RESPONSE
      case "STATE_BENEFITS_API_TEMPLATE_RESPONSE" => SampleEndpointJson.STATE_BENEFITS_API_TEMPLATE_RESPONSE

      // ---- business-details-api ----
      case "PROPERTY_RESPONSE"                 => BusinessDetailsJson.PROPERTY_RESPONSE
      case "FOREIGN_PROPERTY_RESPONSE"         => BusinessDetailsJson.FOREIGN_PROPERTY_RESPONSE
      case "PROPERTY_UNSPECIFIED_RESPONSE"     => BusinessDetailsJson.PROPERTY_UNSPECIFIED_RESPONSE
      case "ACCOUNTING_TYPE_CASH_RESPONSE"     => BusinessDetailsJson.ACCOUNTING_TYPE_CASH_RESPONSE
      case "ACCOUNTING_TYPE_ACCRUALS_RESPONSE" => BusinessDetailsJson.ACCOUNTING_TYPE_ACCRUALS_RESPONSE
      case "RULE_BUSINESS_ID_NOT_FOUND"        => BusinessDetailsJson.RULE_BUSINESS_ID_NOT_FOUND
      case "RULE_BUSINESS_ID_STATE_CONFLICT"   => BusinessDetailsJson.RULE_BUSINESS_ID_STATE_CONFLICT
      case "RULE_QUARTERLY_PERIOD_UPDATING"    => BusinessDetailsJson.RULE_QUARTERLY_PERIOD_UPDATING

      // ----- individuals-disclosures-api ----
      case "iDisclosuresRetrieval" => DisclosuresJson.iDisclosuresAmendRetrieval

      // ----- property-business-api -----
      // Annual Submission

      // Period Summary
      case "PROPERTY_BUSINESS_DEFAULT_RESPONSE"                  => RetrievePeriodSummaryJson.PeriodSummaryDefaultResponse
      case "PROPERTY_BUSINESS_CONSOLIDATED_EXPENDITURE_RESPONSE" => RetrievePeriodSummaryJson.PeriodSummaryConsolidatedExpenditureResponse
      case "PROPERTY_BUSINESS_NO_EXPENDITURE_RESPONSE"           => RetrievePeriodSummaryJson.PeriodSummaryNoExpenditureResponse

      // ----- property-business-api V2 -----
      case "PROPERTY_BUSINESS_RULE_TYPE_OF_BUSINESS_INCORRECT" =>
        CreateAmendUKPropAnnualSubmissionJson.PROPERTY_BUSINESS_RULE_TYPE_OF_BUSINESS_INCORRECT

      // ----- self-assessment-bsas-api -----

      // V2
      case "V2_LIST_BSAS_DEFAULT"                   => V2ListBsasJson.LIST_BSAS_DEFAULT
      case "V2_LIST_BSAS_FOREIGN_PROPERTY"          => V2ListBsasJson.LIST_BSAS_FOREIGN_PROPERTY
      case "V2_LIST_BSAS_FOREIGN_PROPERTY_FHL_EEA"  => V2ListBsasJson.LIST_BSAS_FOREIGN_PROPERTY_FHL_EEA
      case "V2_LIST_BSAS_MULTIPLE_FOREIGN_PROPERTY" => V2ListBsasJson.LIST_BSAS_MULTIPLE_FOREIGN_PROPERTY
      case "V2_LIST_BSAS_SE"                        => V2ListBsasJson.LIST_BSAS_SE
      case "V2_LIST_BSAS_MULTIPLE_SE"               => V2ListBsasJson.LIST_BSAS_MULTIPLE_SE
      case "V2_LIST_BSAS_UK_PROPERTY_FHL"           => V2ListBsasJson.LIST_BSAS_UK_PROPERTY_FHL
      case "V2_LIST_BSAS_UK_PROPERTY_NON_FHL"       => V2ListBsasJson.LIST_BSAS_UK_PROPERTY_NON_FHL
      case "V2_LIST_BSAS_MULTIPLE_PROPERTY"         => V2ListBsasJson.LIST_BSAS_MULTIPLE_PROPERTY
      case "FOREIGN_PROP_FHL_EEA_ADJUSTED"          => V2RetrieveForeignBsasJson.FOREIGN_PROP_FHL_EEA_ADJUSTED
      case "FOREIGN_PROP_FHL_EEA_CONSOLIDATED"      => V2RetrieveForeignBsasJson.FOREIGN_PROP_FHL_EEA_CONSOLIDATED
      case "FOREIGN_PROP_ADJUSTED"                  => V2RetrieveForeignBsasJson.FOREIGN_PROP_ADJUSTED
      case "FOREIGN_PROP_CONSOLIDATED"              => V2RetrieveForeignBsasJson.FOREIGN_PROP_CONSOLIDATED

      // ░▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓ ERROR RESPONSES ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒░

      // Common Errors
      case "CLIENT_OR_AGENT_NOT_AUTHORISED"   => CommonErrorsJson.CLIENT_OR_AGENT_NOT_AUTHORISED
      case "CLIENT_NOT_SUBSCRIBED"            => CommonErrorsJson.CLIENT_NOT_SUBSCRIBED
      case "UNAUTHORIZED"                     => CommonErrorsJson.UNAUTHORIZED
      case "AGENT_NOT_AUTHORIZED"             => CommonErrorsJson.AGENT_NOT_AUTHORIZED
      case "INVALID_BODY_TYPE"                => CommonErrorsJson.INVALID_BODY_TYPE
      case "INTERNAL_SERVER_ERROR"            => CommonErrorsJson.INTERNAL_SERVER_ERROR
      case "NOT_FOUND"                        => CommonErrorsJson.NOT_FOUND
      case "NOT_FOUND_ALTERNATE"              => CommonErrorsJson.NOT_FOUND_ALTERNATE
      case "NOT_FOUND_API_GATEWAY"            => CommonErrorsJson.NOT_FOUND_API_GATEWAY
      case "RULE_INSOLVENT_TRADER"            => CommonErrorsJson.RULE_INSOLVENT_TRADER
      case "MATCHING_RESOURCE_NOT_FOUND"      => CommonErrorsJson.MATCHING_RESOURCE_NOT_FOUND
      case "RULE_INCORRECT_GOV_TEST_SCENARIO" => CommonErrorsJson.RULE_INCORRECT_GOV_TEST_SCENARIO
      case "ACCEPT_HEADER_INVALID"            => CommonErrorsJson.ACCEPT_HEADER_INVALID
      case "FORMAT_NINO"                      => CommonErrorsJson.FORMAT_NINO
      case "FORMAT_TAX_YEAR"                  => CommonErrorsJson.FORMAT_TAX_YEAR
      case "INVALID_CORRELATIONID"            => CommonErrorsJson.INVALID_CORRELATIONID
      case "RULE_SUBMISSION_FAILED"           => CommonErrorsJson.RULE_SUBMISSION_FAILED
      case "RULE_TAX_YEAR_NOT_SUPPORTED"      => CommonErrorsJson.RULE_TAX_YEAR_NOT_SUPPORTED
      case "RULE_TAX_YEAR_NOT_ENDED"          => CommonErrorsJson.RULE_TAX_YEAR_NOT_ENDED
      case "RULE_REQUEST_CANNOT_BE_FULFILLED" => CommonErrorsJson.RULE_REQUEST_CANNOT_BE_FULFILLED
      case "RULE_TYPE_OF_BUSINESS_INCORRECT"  => CommonErrorsJson.RULE_TYPE_OF_BUSINESS_INCORRECT

      // Common Errors API Platform
      case "MATCHING_RESOURCE_NOT_FOUND_AP" => CommonErrorsJson.MATCHING_RESOURCE_NOT_FOUND_AP
      case "MISSING_CREDENTIALS"            => CommonErrorsJson.MISSING_CREDENTIALS

      // CIS Deductions API
      case "CIS_AMEND_DEDUCTIONS_DATE_RANGE_INVALID"  => CisDeductionsJson.CIS_AMEND_DEDUCTIONS_DATE_RANGE_INVALID
      case "CIS_AMEND_DUPLICATE_PERIOD"               => CisDeductionsJson.CIS_AMEND_DUPLICATE_PERIOD
      case "CIS_AMEND_UNALIGNED_DEDUCTIONS_PERIOD"    => CisDeductionsJson.CIS_AMEND_UNALIGNED_DEDUCTIONS_PERIOD
      case "CIS_CREATE_DEDUCTIONS_DATE_RANGE_INVALID" => CisDeductionsJson.CIS_CREATE_DEDUCTIONS_DATE_RANGE_INVALID
      case "CIS_CREATE_DUPLICATE_PERIOD"              => CisDeductionsJson.CIS_CREATE_DUPLICATE_PERIOD
      case "CIS_CREATE_DUPLICATE_SUBMISSION"          => CisDeductionsJson.CIS_CREATE_DUPLICATE_SUBMISSION
      case "CIS_CREATE_UNALIGNED_DEDUCTIONS_PERIOD"   => CisDeductionsJson.CIS_CREATE_UNALIGNED_DEDUCTIONS_PERIOD
      case "CIS_RULE_DATE_RANGE_OUT_OF_DATE"          => CisDeductionsJson.CIS_RULE_DATE_RANGE_OUT_OF_DATE
      case "CIS_INVALID_TAX_YEAR_PARAMETER"           => CisDeductionsJson.CIS_INVALID_TAX_YEAR_PARAMETER

      // Income Received Errors
      case "RULE_CUSTOM_EMPLOYMENT_IGNORE"       => IncomeReceivedErrorsJson.RULE_CUSTOM_EMPLOYMENT_IGNORE
      case "RULE_CUSTOM_EMPLOYMENT_UNIGNORE"     => IncomeReceivedErrorsJson.RULE_CUSTOM_EMPLOYMENT_UNIGNORE
      case "RULE_UPDATE_FORBIDDEN"               => IncomeReceivedErrorsJson.RULE_UPDATE_FORBIDDEN
      case "RULE_MISSING_OFF_PAYROLL_WORKER"     => IncomeReceivedErrorsJson.RULE_MISSING_OFF_PAYROLL_WORKER
      case "RULE_NOT_ALLOWED_OFF_PAYROLL_WORKER" => IncomeReceivedErrorsJson.RULE_NOT_ALLOWED_OFF_PAYROLL_WORKER

      // ----- individual-losses-api -----
      case "RULE_DUPLICATE_SUBMISSION"                             => IndividualLossesJson.RULE_DUPLICATE_SUBMISSION
      case "RULE_DELETE_AFTER_FINAL_DECLARATION"                   => IndividualLossesJson.RULE_DELETE_AFTER_FINAL_DECLARATION
      case "DUPLICATE_LOSS_CLAIM"                                  => IndividualLossesJson.RULE_DUPLICATE_SUBMISSION_LOSS_CLAIMS
      case "AMEND_LOSS_RULE_NO_CHANGE"                             => IndividualLossesJson.AMEND_BF_LOSS_RULE_NO_CHANGE
      case "RULE_ACCOUNTING_PERIOD_NOT_ENDED"                      => IndividualLossesJson.RULE_ACCOUNTING_PERIOD_NOT_ENDED
      case "RULE_NO_ACCOUNTING_PERIOD"                             => IndividualLossesJson.NO_ACCOUNTING_PERIOD
      case "RULE_TYPE_OF_CLAIM_INVALID"                            => IndividualLossesJson.AMEND_LOSS_CLAIM_RULE_TYPE_OF_CLAIM_INVALID
      case "RULE_NO_CHANGE"                                        => IndividualLossesJson.RULE_NO_CHANGE
      case "RULE_LOSS_CLAIMS_MISSING"                              => IndividualLossesJson.RULE_LOSS_CLAIMS_MISSING
      case "AMEND_LOSS_DYNAMIC"                                    => IndividualLossesJson.AMEND_LOSS_DYNAMIC
      case "AMEND_LOSS_DYNAMIC_1"                                  => IndividualLossesJson.AMEND_LOSS_DYNAMIC_1
      case "AMEND_LOSS_CLAIM_SELF_EMPLOYMENT_DYNAMIC_CF_RESPONSE"  => IndividualLossesJson.AMEND_LOSS_CLAIM_SELF_EMPLOYMENT_DYNAMIC_CF_RESPONSE
      case "AMEND_LOSS_CLAIM_UK_PROP_NON_FHL_DYNAMIC_CS_RESPONSE"  => IndividualLossesJson.AMEND_LOSS_CLAIM_UK_PROP_NON_FHL_DYNAMIC_CS_RESPONSE
      case "AMEND_LOSS_CLAIM_FOREIGN_PROP_DYNAMIC_CS_FHL_RESPONSE" => IndividualLossesJson.AMEND_LOSS_CLAIM_FOREIGN_PROP_DYNAMIC_CS_FHL_RESPONSE
      case "AMEND_LOSS_CLAIM_FOREIGN_PROP_DYNAMIC_CF_CS_RESPONSE"  => IndividualLossesJson.AMEND_LOSS_CLAIM_FOREIGN_PROP_DYNAMIC_CF_CS_RESPONSE

      // ----- individual-calculation-api -----
      case "RULE_FINAL_DECLARATION_IN_PROGRESS"    => IndividualCalculationsJson.FINAL_DECLARATION_IN_PROGRESS
      case "RULE_FINAL_DECLARATION_RECEIVED"       => IndividualCalculationsJson.RULE_FINAL_DECLARATION_RECEIVED
      case "RULE_FINAL_DECLARATION_TAX_YEAR"       => IndividualCalculationsJson.RULE_FINAL_DECLARATION_TAX_YEAR
      case "RULE_INCOME_SOURCES_CHANGED"           => IndividualCalculationsJson.RULE_INCOME_SOURCES_CHANGED
      case "RULE_INCOME_SOURCES_INVALID"           => IndividualCalculationsJson.RULE_INCOME_SOURCES_INVALID
      case "RULE_NO_INCOME_SUBMISSIONS_EXIST"      => IndividualCalculationsJson.RULE_NO_INCOME_SUBMISSIONS_EXIST
      case "RULE_RECENT_SUBMISSIONS_EXIST"         => IndividualCalculationsJson.RULE_RECENT_SUBMISSIONS_EXIST
      case "RULE_RESIDENCY_CHANGED"                => IndividualCalculationsJson.RULE_RESIDENCY_CHANGED
      case "CALC_RULE_SUBMISSION_FAILED"           => IndividualCalculationsJson.RULE_SUBMISSION_FAILED
      case "CALC_RULE_TAX_YEAR_NOT_SUPPORTED"      => IndividualCalculationsJson.RULE_TAX_YEAR_NOT_SUPPORTED
      case "RULE_CALCULATION_IN_PROGRESS"          => IndividualCalculationsJson.RULE_CALCULATION_IN_PROGRESS
      case "CALC_RULE_BUSINESS_VALIDATION_FAILURE" => IndividualCalculationsJson.RULE_BUSINESS_VALIDATION_FAILURE
      case "RULE_OUTSIDE_AMENDMENT_WINDOW"         => IndividualCalculationsJson.RULE_OUTSIDE_AMENDMENT_WINDOW

      case "V4_RETRIEVE_SELF_ASSESSMENT_TAX_CALCULATION_JSON_BODY_DYNAMIC" =>
        IndividualCalculationsJson.RETRIEVE_SELF_ASSESSMENT_TAX_CALCULATION_JSON_BODY_DYNAMIC(preRelease10 = true)

      // ----- self-assessment-biss-api -----

      case "BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST" => RetrieveBissJson.BISS_RULE_NO_INCOME_SUBMISSIONS_EXIST

      // ----- self-assessment-bsas-api -----

      // V2
      case "RULE_PERIODIC_DATA_INCOMPLETE"                  => V2TriggerBsasJson.RULE_PERIODIC_DATA_INCOMPLETE
      case "BSAS_RULE_NO_ACCOUNTING_PERIOD"                 => V2TriggerBsasJson.BSAS_TRIGGER_RULE_NO_ACCOUNTING_PERIOD
      case "RULE_NOT_UK_PROPERTY"                           => V2RetrieveBsasJson.RULE_NOT_UK_PROPERTY
      case "RULE_NO_ADJUSTMENTS_MADE"                       => V2RetrieveBsasJson.RULE_NO_ADJUSTMENTS_MADE
      case "RULE_NOT_SELF_EMPLOYMENT"                       => V2RetrieveBsasJson.RULE_NOT_SELF_EMPLOYMENT
      case "RULE_NOT_FOREIGN_PROPERTY"                      => V2RetrieveForeignBsasJson.RULE_NOT_FOREIGN_PROPERTY
      case "BSAS_RULE_BOTH_EXPENSES_SUPPLIED"               => SubmitBsasJson.BSAS_RULE_BOTH_EXPENSES_SUPPLIED
      case "BSAS_RULE_SELF_EMPLOYMENT_ADJUSTED"             => SubmitBsasJson.BSAS_RULE_SELF_EMPLOYMENT_ADJUSTED
      case "BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT"           => SubmitBsasJson.BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT
      case "BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED"    => SubmitBsasJson.BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED
      case "BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD" => SubmitBsasJson.BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD
      case "BSAS_RULE_SUMMARY_STATUS_SUPERSEDED"            => SubmitBsasJson.BSAS_RULE_SUMMARY_STATUS_SUPERSEDED
      case "BSAS_RULE_SUMMARY_STATUS_INVALID"               => SubmitBsasJson.BSAS_RULE_SUMMARY_STATUS_INVALID
      case "BSAS_RULE_BSAS_ALREADY_ADJUSTED"                => SubmitBsasJson.BSAS_RULE_BSAS_ALREADY_ADJUSTED
      case "RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED"         => CommonErrorsJson.RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED
      case "BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED"     => SubmitBsasJson.BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED
      case "BSAS_RULE_NOT_SELF_EMPLOYMENT"                  => SubmitBsasJson.BSAS_RULE_NOT_SELF_EMPLOYMENT
      case "BSAS_RULE_UK_PROPERTY_ADJUSTED"                 => SubmitBsasJson.BSAS_RULE_UK_PROPERTY_ADJUSTED
      case "BSAS_RULE_INCORRECT_PROPERTY_ADJUSTED"          => SubmitBsasJson.BSAS_RULE_INCORRECT_PROPERTY_ADJUSTED
      case "BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED"        => SubmitBsasJson.BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED
      case "BSAS_RULE_PERIODIC_DATA_INCOMPLETE"             => SubmitBsasJson.BSAS_RULE_PERIODIC_DATA_INCOMPLETE

      // V3
      case "V3_RULE_PERIODIC_DATA_INCOMPLETE"                          => V3TriggerBsasJson.RULE_PERIODIC_DATA_INCOMPLETE
      case "V3_BSAS_RULE_NO_ACCOUNTING_PERIOD"                         => V3TriggerBsasJson.BSAS_TRIGGER_RULE_NO_ACCOUNTING_PERIOD
      case "V3_RULE_ACCOUNTING_PERIOD_NOT_ENDED"                       => V3TriggerBsasJson.RULE_ACCOUNTING_PERIOD_NOT_ENDED
      case "V3_BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT"                   => V3CommonBsasJson.BSAS_RULE_TYPE_OF_BUSINESS_INCORRECT
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_PROPERTY"      => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_PROPERTY
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_FHL_EEA"       => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_FHL_EEA
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_FHL"                => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_FHL
      case "V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_NON_FHL"            => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_NON_FHL
      case "V3_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS" => V3SubmitBsasJson.V3_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS
      case "V3_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED"            => V3SubmitBsasJson.V3_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED
      case "V3_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD"         => V3SubmitBsasJson.V3_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD
      case "V3_BSAS_RULE_SUMMARY_STATUS_INVALID"                       => V3SubmitBsasJson.V3_BSAS_RULE_SUMMARY_STATUS_INVALID
      case "V3_BSAS_RULE_ALREADY_ADJUSTED"                             => V3SubmitBsasJson.V3_BSAS_RULE_ALREADY_ADJUSTED
      case "V3_BSAS_RULE_BOTH_PROPERTIES_SUPPLIED"                     => V3SubmitBsasJson.V3_BSAS_RULE_BOTH_PROPERTIES_SUPPLIED
      case "V3_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED"                => V3SubmitBsasJson.V3_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED
      case "V3_BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED"             => V3SubmitBsasJson.V3_BSAS_RULE_TRADING_INCOME_ALLOWANCE_CLAIMED
      case "V3_BSAS_RULE_BSAS_ALREADY_ADJUSTED"                        => V3SubmitBsasJson.V3_BSAS_RULE_ALREADY_ADJUSTED
      case "V3_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED"                    => V3SubmitBsasJson.V3_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED
      case "V3_BSAS_RULE_SELF_EMPLOYMENT_BOTH_EXPENSES"                => V3SubmitBsasJson.V3_BSAS_RULE_SELF_EMPLOYMENT_BOTH_EXPENSES

      // V4
      case "V4_TRIGGER_MATCHING_RESOURCE_NOT_FOUND" => V4TriggerBsasJson.TRIGGER_MATCHING_RESOURCE_NOT_FOUND

      // V5
      case "FORMAT_VALUE_UK"      => V5SubmitBsasJson.FORMAT_VALUE_UK
      case "FORMAT_VALUE_FOREIGN" => V5SubmitBsasJson.FORMAT_VALUE_FOREIGN

      // V6
      case "RULE_OBLIGATIONS_NOT_MET"                             => V6TriggerBsasJson.RULE_OBLIGATIONS_NOT_MET
      case "V6_DEF1_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_PROPERTY" => V6_Def1_SubmitUkPropertyBsasJson.v6_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_UK_PROPERTY
      case "V6_DEF1_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS" =>
        V6_Def1_SubmitUkPropertyBsasJson.V6_BSAS_RULE_INCORRECT_OR_EMPTY_BODY_SUBMITTED_WITH_PATHS
      case "V6_FORMAT_VALUE_UK_PROPERTY" => V6_Def2_SubmitUkPropertyBsasJson.FORMAT_VALUE_UK_PROPERTY

      case "V6_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_PROPERTY" => V6_Def1_SubmitBsasJson.BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_PROPERTY
      case "V6_BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_FHL_EEA"  => V6_Def1_SubmitBsasJson.BSAS_RULE_BOTH_EXPENSES_SUPPLIED_FOREIGN_FHL_EEA
      case "V6_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED"       => V6_Def1_SubmitBsasJson.V6_BSAS_RULE_PROPERTY_INCOME_ALLOWANCE_CLAIMED
      case "V6_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD"    => V6_Def1_SubmitBsasJson.V6_BSAS_RULE_OVER_CONSOLIDATED_EXPENSES_THRESHOLD
      case "V6_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED"               => V6_Def1_SubmitBsasJson.V6_BSAS_RULE_SUMMARY_STATUS_SUPERSEDED
      case "V6_BSAS_RULE_SUMMARY_STATUS_INVALID"                  => V6_Def1_SubmitBsasJson.V6_BSAS_RULE_SUMMARY_STATUS_INVALID
      case "V6_BSAS_RULE_ALREADY_ADJUSTED"                        => V6_Def1_SubmitBsasJson.V6_BSAS_RULE_ALREADY_ADJUSTED
      case "V6_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED"           => V6_Def1_SubmitBsasJson.V6_BSAS_RULE_RESULTING_VALUE_NOT_PERMITTED
      case "V6_FORMAT_VALUE_FOREIGN"                              => V6_Def2_SubmitBsasJson.FORMAT_VALUE_FOREIGN

      // ----- self-assessment-accounts-api -----
      // Payments and Liabilities
      case "RULE_INCONSISTENT_QUERY_PARAMS"    => RuleInconsistentQueryParamsJson.RULE_INCONSISTENT_QUERY_PARAMS
      case "RULE_INVALID_DATE_RANGE"           => RuleInvalidDateRangeJson.RULE_INVALID_DATE_RANGE
      case "RETRIEVE_BALANCE_AND_TRANSACTIONS" => BalanceAndTransactionsJson.retrieveBalanceAndTransactionsResponseJson

      // Coding Out Underpayments and Debts
      case "CREATE_AMEND_CODING_OUT_VALUE_ERRORS_RESPONSE" => CreateAmendCodingOutJson.createAmendCodingOutValueErrorsResponse
      case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_RESPONSE" =>
        CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsResponse
      case "CREATE_AMEND_CODING_OUT_INVALID_BODY_TAXCODECOMPONENTS_INNER_RESPONSE" =>
        CreateAmendCodingOutJson.createAmendCodingOutInvalidBodyTaxCodeComponentsInnerResponse
      case "CODING_OUT_NOT_FOUND" => CodingOutJson.CODING_OUT_NOT_FOUND

      // Coding Out Status
      case "RULE_BUSINESS_PARTNER_NOT_EXIST"     => CodingOutStatusJson.RULE_BUSINESS_PARTNER_NOT_EXIST
      case "RULE_ITSA_CONTRACT_OBJECT_NOT_EXIST" => CodingOutStatusJson.RULE_ITSA_CONTRACT_OBJECT_NOT_EXIST
      case "RULE_ALREADY_OPTED_IN"               => OptInCodingOutJson.RULE_ALREADY_OPTED_IN

      case "RULE_ALREADY_OPTED_OUT" => OptOutCodingOutJson.RULE_ALREADY_OPTED_OUT

      // ----- individuals-employments-income-api -----
      case "ieiCustomEmploymentAddInvalidBodyResponse" =>
        IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddInvalidBodyResponse
      case "ieiCustomEmploymentAddValueErrorsResponse" =>
        IndividualsEmploymentsIncomeApi.AddCustomEmploymentJson.ieiCustomEmploymentAddValueErrorsResponse
      case "ieiCustomEmploymentAmendValueErrorsResponse" =>
        IndividualsEmploymentsIncomeApi.AmendCustomEmploymentJson.ieiCustomEmploymentAmendErrorsResponse
      case "ieiCustomEmploymentAmendInvalidBodyResponse" =>
        IndividualsEmploymentsIncomeApi.AmendCustomEmploymentJson.ieiCustomEmploymentAmendInvalidBodyResponse
      case "ieiFinancialDetailsAmendInvalidResponse" =>
        IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendInvalidResponse
      case "ieiFinancialDetailsAmendMissingErrorsResponse" =>
        IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendMissingErrorsResponse
      case "ieiFinancialDetailsAmendValueErrorsResponse" =>
        IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendValueErrorsResponse
      case "ieiFinancialDetailsAmendEmptyBenefitsInKindResponse" =>
        IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyBenefitsInKindResponse
      case "ieiFinancialDetailsAmendEmptyDeductionsResponse" =>
        IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyDeductionsResponse
      case "ieiFinancialDetailsAmendEmptyStudentLoansResponse" =>
        IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyStudentLoansResponse
      case "ieiFinancialDetailsAmendEmptyObjectsResponse" =>
        IndividualsEmploymentsIncomeApi.AmendEmploymentFinancialDetailsJson.ieiFinancialDetailsAmendEmptyObjectsResponse
      case "IEI_RULE_CUSTOM_EMPLOYMENT_IGNORE"   => IndividualsEmploymentsIncomeErrorsJson.RULE_CUSTOM_EMPLOYMENT_IGNORE
      case "IEI_RULE_CUSTOM_EMPLOYMENT_UNIGNORE" => IndividualsEmploymentsIncomeErrorsJson.RULE_CUSTOM_EMPLOYMENT_UNIGNORE
      case "ieiOtherEmploymentAmendValueErrorsResponse" =>
        IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendValueErrorsResponse
      case "ieiOtherEmploymentAmendInvalidBodyResponse" =>
        IndividualsEmploymentsIncomeApi.AmendOtherEmploymentIncomeJson.ieiOtherEmploymentAmendInvalidBodyResponse

      // ----- individuals-savings-income-api -----
      case "savingsAmendValueErrorsResponse" => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendValueErrorsResponse
      case "savingsAmendInvalidBodyResponse" => IndividualsSavingsIncomeApi.AmendSavingsIncomeJson.savingsAmendInvalidBodyResponse

      // ----- individuals-income-received-api -----
      case "iirSavingsAmendValueErrorsResponse"           => AmendSavingsIncomeJson.iirSavingsAmendValueErrorsResponse
      case "iirSavingsAmendInvalidBodyResponse"           => AmendSavingsIncomeJson.iirSavingsAmendInvalidBodyResponse
      case "iirInsurancePoliciesAmendValueErrorsResponse" => IirAmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendValueErrorsResponse
      case "iirInsurancePoliciesAmendRefAndEventErrorsResponse" =>
        IirAmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendRefAndEventErrorsResponse
      case "iirInsurancePoliciesAmendInvalidBodyResponse" => IirAmendInsurancePoliciesIncomeJson.iirInsurancePoliciesAmendInvalidBodyResponse
      case "iirForeignAmendValueErrorsResponse"           => AmendForeignIncomeJson.iirForeignIncomeAmendValueErrorsResponse
      case "iirForeignAmendInvalidBodyResponse"           => AmendForeignIncomeJson.iirForeignIncomeAmendInvalidBodyResponse
      case "iirPensionsAmendValueErrorsResponse"          => AmendPensionsIncomeJson.iirPensionsAmendValueErrorsResponse
      case "iirPensionsAmendInvalidBodyResponse"          => AmendPensionsIncomeJson.iirPensionsAmendInvalidBodyResponse
      case "iirPensionsAmendInvalidBodyResponseV2"        => AmendPensionsIncomeJson.iirPensionsAmendInvalidBodyResponseV2
      case "iirOtherAmendValueErrorsResponse"             => AmendOtherIncomeJson.iirOtherAmendValueErrorsResponse
      case "iirOtherAmendInvalidBodyResponse"             => AmendOtherIncomeJson.iirOtherAmendInvalidBodyResponse
      case "iirOtherIncomeAmendInvalidDateResponse"       => AmendOtherIncomeJson.iirOtherIncomeAmendInvalidDateResponse
      case "RULE_UNALIGNED_CESSATION_TAX_YEAR"            => CommonErrorsJson.RULE_UNALIGNED_CESSATION_TAX_YEAR
      case "iirDividendsAmendValueErrorsResponse"         => AmendDividendsIncomeJson.iirDividendsAmendValueErrorsResponse
      case "iirDividendsAmendInvalidBodyResponse"         => AmendDividendsIncomeJson.iirDividendsAmendInvalidBodyResponse
      case "iirDividendsAmendInvalidBodyResponseV2"       => AmendDividendsIncomeJson.iirDividendsAmendInvalidBodyResponseV2
      case "iirOtherEmploymentAmendValueErrorsResponse"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendValueErrorsResponse
      case "iirOtherEmploymentAmendInvalidBodyResponse"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendInvalidBodyResponse
      case "iirOtherEmploymentAmendInvalidDateResponse"   => AmendOtherEmploymentIncomeJson.iirOtherEmploymentAmendInvalidDateResponse

      case "RULE_MAXIMUM_SAVINGS_ACCOUNTS_LIMIT" => AddUkSavingsAccountJson.RULE_MAXIMUM_SAVINGS_ACCOUNTS_LIMIT
      case "RULE_DUPLICATE_ACCOUNT_NAME"         => AddUkSavingsAccountJson.RULE_DUPLICATE_ACCOUNT_NAME

      case "iirCustomEmploymentAddValueErrorsResponse"   => AddCustomEmploymentJson.iirCustomEmploymentAddValueErrorsResponse
      case "iirCustomEmploymentAddInvalidBodyResponse"   => AddCustomEmploymentJson.iirCustomEmploymentAddInvalidBodyResponse
      case "iirCustomEmploymentAmendValueErrorsResponse" => AmendCustomEmploymentJson.iirCustomEmploymentAmendErrorsResponse
      case "iirCustomEmploymentAmendInvalidBodyResponse" => AmendCustomEmploymentJson.iirCustomEmploymentAmendInvalidBodyResponse

      case "iirFinancialDetailsAmendInvalidResponse"       => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendInvalidResponse
      case "iirFinancialDetailsAmendMissingErrorsResponse" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendMissingErrorsResponse
      case "iirFinancialDetailsAmendValueErrorsResponse"   => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendValueErrorsResponse
      case "iirFinancialDetailsAmendEmptyBenefitsInKindResponse" =>
        AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyBenefitsInKindResponse
      case "iirFinancialDetailsAmendEmptyDeductionsResponse" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyDeductionsResponse
      case "iirFinancialDetailsAmendEmptyStudentLoansResponse" =>
        AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyStudentLoansResponse
      case "iirFinancialDetailsAmendEmptyObjectsResponse" => AmendEmploymentFinancialDetailsJson.iirFinancialDetailsAmendEmptyObjectsResponse
      case "iirRuleInvalidSubmissionPensionScheme"        => AmendEmploymentFinancialDetailsJson.ruleInvalidSubmissionPensionSchemeResponse

      case "iirOtherCapitalGainsInvalidRequestResponse" =>
        CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST_RESPONSE
      case "iirOtherCapitalGainsMissingFieldsResponse" => CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS_RESPONSE
      case "RULE_DISPOSAL_DATE"                        => CreateAndAmendOtherCapitalGains.RULE_DISPOSAL_DATE
      case "RULE_DISPOSAL_DATE_NOT_FUTURE"             => CreateAndAmendOtherCapitalGains.RULE_DISPOSAL_DATE_NOT_FUTURE
      case "RULE_ACQUISITION_DATE"                     => CreateAndAmendOtherCapitalGains.RULE_ACQUISITION_DATE
      case "PPD_SUBMISSION_ID_NOT_FOUND"               => CreateAmendPPDJson.PPD_SUBMISSION_ID_NOT_FOUND
      case "DUPLICATED_PPD_SUBMISSION_ID"              => CreateAmendPPDJson.DUPLICATED_PPD_SUBMISSION_ID
      case "INCORRECT_DISPOSAL_TYPE"                   => CreateAmendPPDJson.INCORRECT_DISPOSAL_TYPE
      case "TAX_YEAR_NOT_ENDED"                        => CreateAmendPPDJson.RULE_TAX_YEAR_NOT_ENDED
      case "iirPPDMissingFieldsResponse"               => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MISSING_FIELD_RESPONSE
      case "iirPPDInvalidRequestResponse"              => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_REQUEST_RESPONSE
      case "iirPPDInvalidDateResponse"                 => CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_DATE_RESPONSE

      case "iirCgtResidentialPropertyMissingFieldsResponse" =>
        CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS_RESPONSE
      case "iirCgtResidentialPropertyInvalidRequestResponse" =>
        CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST_RESPONSE
      case "RULE_ACQUISITION_DATE_AFTER_DISPOSAL_DATE" =>
        CreateAndAmendCgtResidentialPropertyDisposals.RULE_ACQUISITION_DATE_AFTER_DISPOSAL_DATE
      case "RULE_COMPLETION_DATE" =>
        CreateAndAmendCgtResidentialPropertyDisposals.RULE_COMPLETION_DATE
      case "RULE_DISPOSAL_DATE_CGT_Disposals" =>
        CreateAndAmendCgtResidentialPropertyDisposals.RULE_DISPOSAL_DATE
      case "RULE_DISPOSAL_DATE_CGT_Disposals_V2" =>
        CreateAndAmendCgtResidentialPropertyDisposals.RULE_DISPOSAL_DATE_V2

      case "RULE_DELETE_FORBIDDEN_INCOME_RECEIVED" => DeleteCustomEmploymentJson.RULE_DELETE_FORBIDDEN_INCOME_RECEIVED

      // ----- individuals-capital-gains-income-api -----
      case "OtherCapitalGainsInvalidRequestResponse" =>
        IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_INVALID_REQUEST_RESPONSE
      case "OtherCapitalGainsMissingFieldsResponse" =>
        IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.CREATE_AND_AMEND_OTHER_CAPITAL_GAINS_MISSING_FIELDS_RESPONSE
      case "RULE_DISPOSAL_DATE_ERROR"            => IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.RULE_DISPOSAL_DATE
      case "RULE_DISPOSAL_DATE_NOT_FUTURE_ERROR" => IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.RULE_DISPOSAL_DATE_NOT_FUTURE
      case "RULE_ACQUISITION_DATE_ERROR"         => IndividualsCapitalGainsIncomeApi.CreateAndAmendOtherCapitalGains.RULE_ACQUISITION_DATE
      case "PPD_SUBMISSION_ID_NOT_FOUND_ERROR"   => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.PPD_SUBMISSION_ID_NOT_FOUND
      case "DUPLICATED_PPD_SUBMISSION_ID_ERROR"  => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.DUPLICATED_PPD_SUBMISSION_ID
      case "INCORRECT_DISPOSAL_TYPE_ERROR"       => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.INCORRECT_DISPOSAL_TYPE
      case "TAX_YEAR_NOT_ENDED_ERROR"            => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.RULE_TAX_YEAR_NOT_ENDED
      case "PPDMissingFieldsResponse"            => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD_MISSING_FIELD_RESPONSE
      case "PPDInvalidRequestResponse"           => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_REQUEST_RESPONSE
      case "PPDInvalidDateResponse"              => IndividualsCapitalGainsIncomeApi.CreateAmendPPDJson.CREATE_AND_AMEND_PPD_INVALID_DATE_RESPONSE
      case "CgtResidentialPropertyMissingFieldsResponse" =>
        IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_MISSING_FIELDS_RESPONSE
      case "CgtResidentialPropertyInvalidRequestResponse" =>
        IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.CREATE_AND_AMEND_CGT_RESIDENTIAL_PROPERTY_INVALID_REQUEST_RESPONSE
      case "RULE_ACQUISITION_DATE_AFTER_DISPOSAL_DATE_ERROR" =>
        IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.RULE_ACQUISITION_DATE_AFTER_DISPOSAL_DATE
      case "RULE_COMPLETION_DATE_ERROR" => IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.RULE_COMPLETION_DATE
      case "RULE_DISPOSAL_DATE_CGT" =>
        IndividualsCapitalGainsIncomeApi.CreateAndAmendCgtResidentialPropertyDisposals.RULE_DISPOSAL_DATE

      // ----- individuals-other-income-api -----
      case "amendValueErrorsResponse" => CreateAmendOtherIncomeJson.amendValueErrorsResponse
      case "amendInvalidBodyResponse" => CreateAmendOtherIncomeJson.amendInvalidBodyResponse
      case "amendInvalidDateResponse" => CreateAmendOtherIncomeJson.amendInvalidDateResponse

      // ----- individuals-dividends-income-api -----
      case "dividendsIncomeAmendValueErrorsResponse"   => CreateAmendDividendsJson.amendValueErrorsResponse
      case "dividendsIncomeAmendInvalidBodyResponse"   => CreateAmendDividendsJson.amendInvalidBodyResponse
      case "ukDividendsIncomeAmendValueErrorsResponse" => CreateAmendUkDividendsAnnualSummaryJson.amendValueErrorsResponse

      // Individuals Insurance Policies Income API
      case "insurancePoliciesAmendValueErrorsResponse"       => AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendValueErrorsResponse
      case "insurancePoliciesAmendRefAndEventErrorsResponse" => AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendRefAndEventErrorsResponse
      case "insurancePoliciesAmendInvalidBodyResponse"       => AmendInsurancePoliciesIncomeJson.insurancePoliciesAmendInvalidBodyResponse

      // ----- individuals-disclosures-api -----
      case "RETRIEVE_ITSA_STATUS_19_20"             => CreateAmendItsaStatusJson.RETRIEVE_ITSA_STATUS_19_20
      case "AMENDED_ITSA_STATUS_19_20"              => CreateAmendItsaStatusJson.AMENDED_ITSA_STATUS_19_20
      case "AMENDED_ITSA_STATUS_19_20_WITH_HISTORY" => CreateAmendItsaStatusJson.AMENDED_ITSA_STATUS_19_20_WITH_HISTORY
      case "ITSA_STATUS_19_20_23_24"                => CreateAmendItsaStatusJson.ITSA_STATUS_19_20_23_24
      case "ITSA_STATUS_19_20_23_24_WITH_HISTORY"   => CreateAmendItsaStatusJson.ITSA_STATUS_19_20_23_24_WITH_HISTORY

      // ----- individuals-disclosures-api -----
      case "iDisclosuresAmendValueErrorsResponse"    => DisclosuresJson.iDisclosuresAmendErrorsResponse
      case "iDisclosureMissingFieldResponse"         => DisclosuresJson.iDisclosuresAmendMissingFieldResponse
      case "RULE_VOLUNTARY_CLASS2_CANNOT_BE_CHANGED" => DisclosuresJson.RULE_VOLUNTARY_CLASS2_CANNOT_BE_CHANGED

      case "RULE_ACTIVE_MARRIAGE_ALLOWANCE_CLAIM" => MarriageAllowanceJson.RULE_ACTIVE_MARRIAGE_ALLOWANCE_CLAIM
      case "RULE_DECEASED_RECIPIENT"              => MarriageAllowanceJson.RULE_DECEASED_RECIPIENT
      case "RULE_INVALID_REQUEST"                 => MarriageAllowanceJson.RULE_INVALID_REQUEST

      // ----- individuals-foreign-income-api -----
      case "ifiCreateAmendValueErrorsResponse" => IfiCreateAmendForeignIncomeJson.createAmendValueErrorsResponse
      case "ifiCreateAmendInvalidBodyResponse" => IfiCreateAmendForeignIncomeJson.amendInvalidBodyResponse

      // ----- individuals-pensions-income-api -----
      case "ipiAmendValueErrorsResponse" => PensionsIncomeAmendJson.pensionsAmendValueErrorsResponse
      case "ipiAmendInvalidBodyResponse" => PensionsIncomeAmendJson.pensionsAmendInvalidBodyResponse

      // ----- individuals-state-benefits-api -----
      case "iStateBenefitsAmendValueErrorsResponse" => AmendStateBenefitJson.iStateBenefitsAmendValueErrorsResponse
      case "iStateBenefitsAmendInvalidBodyResponse" => AmendStateBenefitJson.iStateBenefitsAmendInvalidBodyResponse
      case "RULE_START_DATE_AFTER_TAX_YEAR_END"     => AmendStateBenefitJson.RULE_START_DATE_AFTER_TAX_YEAR_END
      case "RULE_END_DATE_BEFORE_TAX_YEAR_START"    => AmendStateBenefitJson.RULE_END_DATE_BEFORE_TAX_YEAR_START

      case "iStateBenefitsAddInvalidBodyResponse" => CreateStateBenefitJson.iStateBenefitsAddInvalidBodyResponse
      case "iStateBenefitsAddValueErrorsResponse" => CreateStateBenefitJson.iStateBenefitsAddValueErrorsResponse
      case "RULE_BENEFIT_TYPE_EXISTS"             => CreateStateBenefitJson.RULE_BENEFIT_TYPE_EXISTS

      case "iStateBenefitsAmendAmountsValueErrorsResponse" => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsValueErrorsResponse
      case "iStateBenefitsAmendAmountsInvalidBodyResponse" => AmendStateBenefitAmountsJson.iStateBenefitsAmendAmountsInvalidBodyResponse

      case "iStateBenefitsRetrieveStateBenefitResponse"         => RetrieveStateBenefitJson.iStateBenefitsRetrieveStateBenefitResponse
      case "iStateBenefitsRetrieveCustomerAddedBenefitResponse" => RetrieveStateBenefitJson.iStateBenefitsRetrieveCustomerAddedBenefitResponse
      case "iStateBenefitsRetrieveCustomerAddedBenefitNoAmountsResponse" =>
        RetrieveStateBenefitJson.iStateBenefitsRetrieveCustomerAddedBenefitNoAmountsResponse
      case "iStateBenefitsRetrieveHmrcAmendedAmountsResponse" => RetrieveStateBenefitJson.iStateBenefitsRetrieveHmrcAmendedAmountsResponse

      // ----- individuals-reliefs-api -----
      case "reliefInvestmentsAmendValueErrorsResponse" => ReliefInvestmentsJson.reliefInvestmentsAmendValueErrorsResponse
      case "reliefInvestmentsAmendIncorrectOrEmptyBodyErrorsResponse" =>
        ReliefInvestmentsJson.reliefInvestmentsAmendIncorrectOrEmptyBodyErrorsResponse
      case "foreignReliefsAmendValueErrorsResponse"         => ForeignReliefsJson.foreignReliefsAmendValueErrorsResponse
      case "foreignReliefsAmendIncorrectBodyErrorResponse"  => ForeignReliefsJson.foreignReliefsAmendIncorrectBodyErrorResponse
      case "otherReliefsAmendValueErrorsResponse"           => OtherReliefsJson.otherReliefsAmendValueErrorsResponse
      case "otherReliefsAmendIncorrectBodyErrorsResponse"   => OtherReliefsJson.otherReliefsAmendIncorrectBodyErrorsResponse
      case "pensionReliefsAmendValueErrorsResponse"         => PensionReliefsJson.pensionReliefsAmendValueErrorsResponse
      case "pensionsReliefsAmendIncorrectBodyErrorResponse" => PensionReliefsJson.pensionsReliefsAmendIncorrectBodyErrorResponse

      case "AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_RESPONSE" =>
        CharitableGivingReliefsJson.AMEND_CHARITABLE_GIVING_RELIEFS_VALUE_ERRORS_RESPONSE

      // ----- individuals-expenses-api -----
      case "AMEND_OTHER_EXPENSES_VALUE_ERRORS_RESPONSE" => OtherExpensesJson.amendOtherExpensesValueErrorsResponse
      case "CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_RESPONSE" =>
        EmploymentsExpensesJson.CREATE_AND_AMEND_EMPLOYMENT_EXPENSES_VALUE_ERRORS_RESPONSE
      case "EMPLOYMENT_EXPENSES_TAX_YEAR_NOT_ENDED"          => EmploymentsExpensesJson.EMPLOYMENT_EXPENSES_TAX_YEAR_NOT_ENDED
      case "EXPENSES_RULE_INVALID_SUBMISSION_PENSION_SCHEME" => EmploymentsExpensesJson.RULE_INVALID_SUBMISSION_PENSION_SCHEME

      // ----- property-business-api -----
      // Annual Submission
      case "amendAnnualSubmissionValueErrorsResponse" => AmendAnnualSubmissionJson.amendAnnualSubmissionValueErrorsResponse

      case "RULE_OVERLAPPING_PERIOD"      => Def2CreatePeriodSummaryJson.RULE_OVERLAPPING_PERIOD
      case "RULE_MISALIGNED_PERIOD"       => Def2CreatePeriodSummaryJson.RULE_MISALIGNED_PERIOD
      case "RULE_NOT_CONTIGUOUS_PERIOD"   => Def2CreatePeriodSummaryJson.RULE_NOT_CONTIGUOUS_PERIOD
      case "RULE_DUPLICATE_SUBMISSION_PB" => Def2CreatePeriodSummaryJson.RULE_DUPLICATE_SUBMISSION
      case "TAX_YEAR_NOT_SUPPORTED"       => CommonErrorsJson.RULE_TAX_YEAR_NOT_SUPPORTED

      // ----- property-business-api V2 -----
      case "AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_RESPONSE"        => AmendPeriodSummaryJsonDef2.amendPeriodSummaryValueErrorsResponse
      case "AMEND_FOREIGN_PROPERTY_VALUE_ERRORS_RESPONSE_TY2425" => AmendPeriodSummaryJsonDef2.amendPeriodSummaryValueErrorsResponseTY2425
      case "RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE"            => PropertyBusinessSharedErrors.RULE_TYPE_OF_BUSINESS_INCORRECT_RESPONSE
      case "AMEND_FOREIGN_PERIOD_RULE_TYPE_OF_BUSINESS_INCORRECT_PATHS_RESPONSE" =>
        AmendPeriodSummaryJsonDef2.RULE_INCORRECT_OR_EMPTY_BODY_PATH_RESPONSE
      case "RULE_PROPERTY_INCOME_ALLOWANCE" => PropertyBusinessSharedErrors.RULE_PROPERTY_INCOME_ALLOWANCE
      case "RULE_DUPLICATE_COUNTRY_CODE"    => PropertyBusinessSharedErrors.RULE_DUPLICATE_COUNTRY_CODE

      // ----- property-business-api V3 -----
      case "RULE_BUSINESS_INCOME_PERIOD_RESTRICTION" => V3PropertyBusinessErrors.RULE_BUSINESS_INCOME_PERIOD_RESTRICTION

      // ----- property-business-api V2 -----
      // Annual Submission
      case "createAmendUKPropAnnualSubmissionValueErrorsResponse" =>
        CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionValueErrorsResponse
      case "createAmendUKPropAnnualSubmissionInvalidBodyResponse" =>
        CreateAmendUKPropAnnualSubmissionJson.createAmendUKPropAnnualSubmissionInvalidBodyResponse

      // Period Summary
      case "createAmendAnnualSubmissionValueErrorsResponse" =>
        CreateAmendForeignPropertyAnnualSubmissionJson.createAmendAnnualSubmissionValueErrorsResponse
      case "createAmendForeignPropAnnualSubmissionInvalidBodyResponse" =>
        CreateAmendForeignPropertyAnnualSubmissionJson.createAmendForeignPropAnnualSubmissionInvalidBodyResponse

      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_BOTH_EXPENSES"       => AmendUkPropertyPeriodSummaryJson.bothExpensesSuppliedResponse
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_VALUE_FORMAT"        => AmendUkPropertyPeriodSummaryJson.valueFormatResponse
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_VALUE_FORMAT_TY2425" => AmendUkPropertyPeriodSummaryJson.valueFormatResponseTY2425
      case "AMEND_UK_PROPERTY_PERIOD_SUMMARY_EMPTY_ITEMS"         => AmendUkPropertyPeriodSummaryJson.emptyItemsResponse
//      case "RULE_INVALID_SUBMISSION_PERIOD_UK_PROPERTY"     => CreateUKPropPeriodSummaryJson.RULE_INVALID_SUBMISSION_PERIOD
//      case "RULE_INVALID_SUBMISSION_END_DATE_UK_PROPERTY"   => CreateUKPropPeriodSummaryJson.RULE_INVALID_SUBMISSION_END_DATE
//      To be reinstated, see MTDSA-15575

      // ----- property-business-api V5 -----
      case "createAmendAnnualSubmissionValueErrorsResponseV5" =>
        CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.createAmendAnnualSubmissionValueErrorsResponse
      case "createAmendForeignPropAnnualSubmissionInvalidBodyResponseV5" =>
        CreateAmendForeignPropertyAnnualSubmissionJsonV5_def1.createAmendForeignPropAnnualSubmissionInvalidBodyResponse
      case "PropertyBusinessRuleTypeOfBusinessIncorrectV5" =>
        CreateAmendUKPropAnnualSubmissionJson.PROPERTY_BUSINESS_RULE_TYPE_OF_BUSINESS_INCORRECT
      case "createAmendAnnualSubmissionValueErrorsResponseV5_def2" =>
        CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.createAmendAnnualSubmissionValueErrorsResponse
      case "createAmendForeignPropAnnualSubmissionInvalidBodyResponseV5_def2" =>
        CreateAmendForeignPropertyAnnualSubmissionJsonV5_def2.createAmendForeignPropAnnualSubmissionInvalidBodyResponse
      case "PropertyBusinessRuleTypeOfBusinessIncorrectV5_def2" =>
        CreateAmendUKPropAnnualSubmissionJson.PROPERTY_BUSINESS_RULE_TYPE_OF_BUSINESS_INCORRECT
      // ----- self-employment-business-api ----
      case "RULE_OVERLAPPING_PERIOD_SE"                    => CreateSEPeriodSummaryJsonV3.createSEOverlappingPeriod
      case "RULE_MISALIGNED_PERIOD_SE"                     => CreateSEPeriodSummaryJsonV3.createSEMisalignedPeriod
      case "RULE_NOT_CONTIGUOUS_PERIOD_SE"                 => CreateSEPeriodSummaryJsonV3.createSENotContiguousPeriod
      case "RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES_SE"     => CreateSEPeriodSummaryJsonV3.createSENotAllowedConsolidatedExpenses
      case "RULE_TAX_YEAR_NOT_SUPPORTED_SE"                => CreateSEPeriodSummaryJsonV3.createSETaxYearNotSupported
      case "RULE_DUPLICATE_SUBMISSION_SE"                  => CreateSEPeriodSummaryJsonV3.createSEDuplicateSubmission
      case "RULE_INVALID_SUBMISSION_PERIOD_SE"             => CreateSEPeriodSummaryJsonV3.createSEInvalidSubmissionPeriod
      case "RULE_INVALID_SUBMISSION_END_DATE_SE"           => CreateSEPeriodSummaryJsonV3.createSEInvalidSubmissionEndDate
      case "BOTH_EXPENSES_SUPPLIED_SE"                     => CreateSEPeriodSummaryJsonV3.createSEBothExpensesSupplied
      case "AMEND_SE_RULE_ALLOWANCE_NOT_SUPPORTED"         => AmendSEAnnualSubmissionJsonV3.allowanceNotSupportedErrorResponse
      case "AMEND_SE_RULE_WRONG_TPA_AMOUNT_SUBMITTED"      => AmendSEAnnualSubmissionJsonV3.wrongTpaAmountSubmittedErrorResponse
      case "RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES"        => AmendSEPeriodSummaryJsonV3.RULE_NOT_ALLOWED_CONSOLIDATED_EXPENSES
      case "RULE_BUSINESS_INCOME_PERIOD_RESTRICTION_SE_V3" => CreateSEPeriodSummaryJsonV3.RULE_BUSINESS_INCOME_PERIOD_RESTRICTION_V3

      case "EARLY_DATA_SUBMISSION_NOT_ACCEPTED_SE" => CreateAmendSECumulativePeriodSummaryJsonV4.earlyDataSubmissionNotAccepted
      case "START_DATE_NOT_ALIGNED_SE"             => CreateAmendSECumulativePeriodSummaryJsonV4.startDateNotAligned
      case "END_DATE_NOT_ALIGNED_SE"               => CreateAmendSECumulativePeriodSummaryJsonV4.endDateNotAligned
      case "MISSING_SUBMISSION_DATES_SE"           => CreateAmendSECumulativePeriodSummaryJsonV4.missingSubmissionDates
      case "START_END_DATE_NOT_ALLOWED_SE"         => CreateAmendSECumulativePeriodSummaryJsonV4.startEndDateNotAccepted
      case "OUTSIDE_AMENDMENT_WINDOW_SE"           => CreateAmendSECumulativePeriodSummaryJsonV4.outsideAmendmentWindow
      case "BOTH_EXPENSES_SUPPLIED_SE_V4"          => CreateAmendSECumulativePeriodSummaryJsonV4.bothExpensesSupplied
      case "TAX_YEAR_NOT_SUPPORTED_SE"             => CreateAmendSECumulativePeriodSummaryJsonV4.taxYearNotSupported

      // ----- individuals-business-eops-api V1 -----
      case "BUSINESS_EOPS_RULE_ALREADY_SUBMITTED"              => SubmitBusinessEOPSResponseJsonV1.RULE_ALREADY_SUBMITTED
      case "BUSINESS_EOPS_RULE_EARLY_SUBMISSION"               => SubmitBusinessEOPSResponseJsonV1.RULE_EARLY_SUBMISSION
      case "BUSINESS_EOPS_RULE_LATE_SUBMISSION"                => SubmitBusinessEOPSResponseJsonV1.RULE_LATE_SUBMISSION
      case "BUSINESS_EOPS_RULE_CONSOLIDATED_EXPENSES"          => SubmitBusinessEOPSResponseJsonV1.RULE_CONSOLIDATED_EXPENSES
      case "BUSINESS_EOPS_RULE_MISMATCHED_START_DATE"          => SubmitBusinessEOPSResponseJsonV1.RULE_MISMATCHED_START_DATE
      case "BUSINESS_EOPS_RULE_MISMATCHED_END_DATE"            => SubmitBusinessEOPSResponseJsonV1.RULE_MISMATCHED_END_DATE
      case "BUSINESS_EOPS_RULE_CLASS4_OVER_16"                 => SubmitBusinessEOPSResponseJsonV1.RULE_CLASS4_OVER_16
      case "BUSINESS_EOPS_RULE_CLASS4_PENSION_AGE"             => SubmitBusinessEOPSResponseJsonV1.RULE_CLASS4_PENSION_AGE
      case "BUSINESS_EOPS_RULE_FHL_PRIVATE_USE_ADJUSTMENT"     => SubmitBusinessEOPSResponseJsonV1.RULE_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT" => SubmitBusinessEOPSResponseJsonV1.RULE_NON_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_NON_MATCHING_PERIOD"            => SubmitBusinessEOPSResponseJsonV1.RULE_NON_MATCHING_PERIOD
      case "BUSINESS_EOPS_RULE_BUSINESS_VALIDATION_FAILURE"    => SubmitBusinessEOPSResponseJsonV1.RULE_BUSINESS_VALIDATION_FAILURE

      // ----- individuals-business-eops-api V2 -----
      case "BUSINESS_EOPS_RULE_ALREADY_SUBMITTED_V2"                  => SubmitBusinessEOPSResponseJsonV2.RULE_ALREADY_SUBMITTED
      case "BUSINESS_EOPS_RULE_EARLY_SUBMISSION_V2"                   => SubmitBusinessEOPSResponseJsonV2.RULE_EARLY_SUBMISSION
      case "BUSINESS_EOPS_RULE_LATE_SUBMISSION_V2"                    => SubmitBusinessEOPSResponseJsonV2.RULE_LATE_SUBMISSION
      case "BUSINESS_EOPS_RULE_BVR_MISMATCHED_START_DATE_V2"          => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_MISMATCHED_START_DATE
      case "BUSINESS_EOPS_RULE_BVR_CLASS4_OVER_16_V2"                 => SubmitBusinessEOPSResponseJsonV2.RULE_RULE_BVR_CLASS4_OVER_16
      case "BUSINESS_EOPS_RULE_BVR_CLASS4_PENSION_AGE_V2"             => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_CLASS4_PENSION_AGE
      case "BUSINESS_EOPS_RULE_NON_MATCHING_PERIOD_V2"                => SubmitBusinessEOPSResponseJsonV2.RULE_NON_MATCHING_PERIOD
      case "BUSINESS_EOPS_RULE_BVR_CONSOLIDATED_EXPENSES_V2"          => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_CONSOLIDATED_EXPENSES
      case "BUSINESS_EOPS_RULE_BVR_END_DATE_SHORT_V2"                 => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_END_DATE_SHORT
      case "BUSINESS_EOPS_RULE_BVR_END_DATE_EXCEEDS_V2"               => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_END_DATE_EXCEEDS
      case "BUSINESS_EOPS_RULE_BVR_FHL_PRIVATE_USE_ADJUSTMENT_V2"     => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_BVR_NON_FHL_PRIVATE_USE_ADJUSTMENT_V2" => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_NON_FHL_PRIVATE_USE_ADJUSTMENT
      case "BUSINESS_EOPS_RULE_BVR_UK_PROPERTY_MULTIPLE_ERRORS_V2"    => SubmitBusinessEOPSResponseJsonV2.RULE_BVR_UK_PROPERTY_MULTIPLE_ERRORS
      case "RULE_BUSINESS_VALIDATION_FAILURE_V2"                      => SubmitBusinessEOPSResponseJsonV2.RULE_BUSINESS_VALIDATION_FAILURE

      // ----- individuals-business-eops-api V3 -----
      case "RULE_BUSINESS_INCOME_PERIOD_RESTRICTION_V3" => SubmitBusinessEOPSResponseJsonV3.RULE_BUSINESS_INCOME_PERIOD_RESTRICTION_V3

      // Obligations API

      case "NO_OBLIGATIONS_FOUND"                         => RetrieveEOPSJson.NO_OBLIGATIONS_FOUND
      case "DYNAMIC_DATES_1"                              => RetrieveEOPSJson.DYNAMIC_DATES_1
      case "DYNAMIC_FINAL_DEC_TY_1"                       => RetrieveEOPSJson.DYNAMIC_FINAL_DEC_TY_1
      case "DYNAMIC_FINAL_DEC_TY_2"                       => RetrieveEOPSJson.DYNAMIC_FINAL_DEC_TY_2
      case "DYNAMIC_FINAL_DEC_TY_3"                       => RetrieveEOPSJson.DYNAMIC_FINAL_DEC_TY_3
      case "RetrieveEOPSDynamicDatesCurrentOpen_Response" => RetrieveEOPSJson.RetrieveEOPSDynamicDatesCurrentOpen_Response
      case "RetrieveEOPSDynamicDatesCurrent_Response"     => RetrieveEOPSJson.RetrieveEOPSDynamicDatesCurrent_Response
      case "retrieveObligations_DYNAMIC_DATES_Open"       => RetrieveEOPSJson.retrieveObligations_DYNAMIC_DATES_Open

      // ----- self-Assessment-TestSupport-api -----

      case "RULE_PROPERTY_BUSINESS_ADDED" => CommonErrorsJson.RULE_PROPERTY_BUSINESS_ADDED
      case "NO_BUSINESS_FOUND"            => CommonErrorsJson.NO_BUSINESS_FOUND
      */
      case _                              => "{}"
    }

  }

}
