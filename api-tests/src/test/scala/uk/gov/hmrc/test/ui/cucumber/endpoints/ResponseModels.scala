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

import play.api.libs.json._
//import uk.gov.hmrc.integration.cucumber.models.BusinessDetailsApi.listAllBusinesses.ListBusinessesResponse
import uk.gov.hmrc.test.ui.cucumber.models.SubscriptionApi.SubscriptionDataResponse
import BasePage._
object ResponseModels {

  def checkAgainstExpectedModel(responseName: String, expectedBody: Option[String] = None): Unit = {
    responseName match {

      case "SubmissionApiResponse"           => checkResponseBodyStructure[SubscriptionDataResponse](response.body)


      // ----- cis-deductions-api -----


      /*
      case "cisDeductionsRetrieveResponse" => checkResponseBodyStructure[RetrieveCisDeductions](response.body)
      // -----obligations api-----
      case "retrieveCrystallisationObligationsResponseV1" => checkResponseBodyStructure[RetrieveCrystallisationObligationsResponseV1](response.body)
      case "retrieveCrystallisationObligationsResponseV2" => checkResponseBodyStructure[RetrieveCrystallisationObligationsResponseV2](response.body)
      case "RetrieveEOPSResponse"                         => checkResponseBodyStructure[RetrieveEOPSResponse](response.body)
      case "RetrievePeriodicObligationsResponse"          => checkResponseBodyStructure[RetrievePeriodicObligationsResponse](response.body)

      // ----- individuals charges api -----
      // V2
      case "Def1_RetrievePensionChargesResponseV2" =>
        checkResponseBodyStructure[Def1_RetrievePensionChargesResponseV2](response.body)
      case "RetrievePensionChargesResponseV2Optional" =>
        checkResponseBodyStructure[Def1_RetrievePensionChargesResponseV2](
          response.body,
          Some(IndividualsChargesPensionsResponseJsonV2.GET_PENSION_CHARGES_OPTIONAL))
      case "Def2_RetrievePensionChargesResponseV2" =>
        checkResponseBodyStructure[Def2_RetrievePensionChargesResponseV2](response.body)

      // ----- individuals-reliefs-api -----
      case "RetrieveReliefInvestments"       => checkResponseBodyStructure[RetrieveReliefInvestments](response.body)
      case "RetrieveOtherReliefs"            => checkResponseBodyStructure[RetrieveOtherReliefs](response.body)
      case "RetrieveForeignReliefs"          => checkResponseBodyStructure[RetrieveForeignReliefs](response.body)
      case "RetrievePensionReliefsResponse"  => checkResponseBodyStructure[RetrievePensionReliefsResponse](response.body)
      case "RetrieveCharitableGivingReliefs" => checkResponseBodyStructure[RetrieveCharitableGivingReliefs](response.body)

      // ----- individual-losses-api ----
      // V4
      case "AmendBFLoss"         => checkResponseBodyStructure[AmendBFLoss](response.body)
      case "ListBFLosses"        => checkResponseBodyStructure[ListBFLosses](response.body)
      case "CreateBFLoss"        => checkResponseBodyStructure[CreateBFLoss](response.body)
      case "RetrieveBFLoss"      => checkResponseBodyStructure[RetrieveBFLoss](response.body)
      case "AmendLossClaim"      => checkResponseBodyStructure[AmendLossClaim](response.body)
      case "CreateLossClaim"     => checkResponseBodyStructure[CreateLossClaim](response.body)
      case "LossClaim"           => checkResponseBodyStructure[RetrieveLossClaim](response.body)
      case "ListLossClaims"      => checkResponseBodyStructure[ListLossClaims](response.body)
      case "AmendLossClaimOrder" => checkResponseBodyStructure[AmendLossClaimOrder](response.body)
      // V5
      case "AmendLossClaimV5"    => checkResponseBodyStructure[AmendLossClaimV5](response.body)
      case "CreateLossClaimV5"   => checkResponseBodyStructure[CreateLossClaimV5](response.body)
      case "RetrieveLossClaimV5" => checkResponseBodyStructure[RetrieveLossClaimV5](response.body)
      case "ListLossClaimsV5"    => checkResponseBodyStructure[ListLossClaimsV5](response.body)
      case "ListBFLossesV5"      => checkResponseBodyStructure[ListBFLossesV5](response.body)
      case "AmendBFLossV5"       => checkResponseBodyStructure[AmendBFLossV5](response.body)
      case "CreateBFLossV5"      => checkResponseBodyStructure[CreateBFLossV5](response.body)
      case "RetrieveBFLossV5"    => checkResponseBodyStructure[RetrieveBFLossV5](response.body)

      // ----- individual-calculations-api -----

      // V5
      case "TriggerSATaxCalculationV5"                     => checkResponseBodyStructure[TriggerSATaxCalculation](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV5"        => checkResponseBodyStructure[RetrieveSATaxCalculation](response.body)
      case "RetrieveSelfAssessmentTaxCalculationMandatory" => checkResponseBodyStructure[RetrieveSATaxCalculationMandatory](response.body)
      case "ListSATaxCalculationsV5"                       => checkResponseBodyStructure[ListSATaxCalculationsV5](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV5_Def1"   => checkResponseBodyStructure[RetrieveSATaxCalculationV5_Def1](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV5_Def2"   => checkResponseBodyStructure[RetrieveSATaxCalculationV5_Def2](response.body)
      // V6
      case "TriggerSATaxCalculationV6"                   => checkResponseBodyStructure[TriggerSATaxCalculation](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV6"      => checkResponseBodyStructure[RetrieveSATaxCalculation](response.body)
      case "ListSATaxCalculationsV6"                     => checkResponseBodyStructure[ListSATaxCalculationsV6](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV6_Def1" => checkResponseBodyStructure[RetrieveSATaxCalculationV6_Def1](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV6_Def2" => checkResponseBodyStructure[RetrieveSATaxCalculationV6_Def2](response.body)
      // V7
      case "TriggerSATaxCalculationV7"                   => checkResponseBodyStructure[TriggerSATaxCalculation](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV7"      => checkResponseBodyStructure[RetrieveSATaxCalculation](response.body)
      case "ListSATaxCalculationsV7"                     => checkResponseBodyStructure[ListSATaxCalculationsV7](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV7_Def1" => checkResponseBodyStructure[RetrieveSATaxCalculationV7_Def1](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV7_Def2" => checkResponseBodyStructure[RetrieveSATaxCalculationV7_Def2](response.body)
      case "RetrieveSelfAssessmentTaxCalculationV7_Def3" => checkResponseBodyStructure[RetrieveSATaxCalculationV7_Def3](response.body)

      // ----- self-assessment-biss-api -----
      case "RetrieveBissResponseV2" => checkResponseBodyStructure[RetrieveBissResponseV2](response.body)

      // ----- self-assessment-bsas-api -----

      // V2
      case "BsasIdResponse"                        => checkResponseBodyStructure[BsasIdResponse](response.body)
      case "ListBsasResponse"                      => checkResponseBodyStructure[ListBsasResponse[BusinessSourceSummary]](response.body)
      case "ListSEBsasResponse"                    => checkResponseBodyStructure[ListBsasResponse[SEBusinessSourceSummary]](response.body)
      case "ListUkPropertyBsasResponse"            => checkResponseBodyStructure[ListBsasResponse[UkPropertyBusinessSourceSummary]](response.body)
      case "RetrieveUkPropBsasResponseV2"          => checkResponseBodyStructure[RetrieveUkPropBsasResponseV2](response.body)
      case "RetrieveSEBsasResponseV2"              => checkResponseBodyStructure[RetrieveSEBsasResponseV2](response.body)
      case "RetrieveSEBsasAdjustmentsResponseV2"   => checkResponseBodyStructure[RetrieveSEBsasAdjustmentsResponseV2](response.body)
      case "RetrieveUkPropBsasAdjustmentsResponse" => checkResponseBodyStructure[RetrieveUkPropBsasAdjustmentsResponse](response.body)
      case "RetrieveForeignPropBsasResponse"       => checkResponseBodyStructure[RetrieveForeignPropBsasResponse](response.body)

      // V3
      case "TriggerBsasResponseV3"             => checkResponseBodyStructure[TriggerBsasResponse](response.body)
      case "RetrieveSEBsasResponseV3"          => checkResponseBodyStructure[RetrieveSEBsasResponseV3](response.body)
      case "RetrieveSEBsasResponseV4"          => checkResponseBodyStructure[RetrieveSEBsasResponseV4](response.body)
      case "RetrieveUkPropBsasResponseV3"      => checkResponseBodyStructure[RetrieveUkPropBsasResponseV3](response.body)
      case "ListBsasResponseV3"                => checkResponseBodyStructure[ListBsasResponseV3](response.body)
      case "RetrieveForeignPropBsasResponseV3" => checkResponseBodyStructure[RetrieveForeignPropBsasResponseV3](response.body)

      // V4
      case "RetrieveUkPropBsasResponseV4"      => checkResponseBodyStructure[RetrieveUkPropBsasResponseV4](response.body)
      case "RetrieveForeignPropBsasResponseV4" => checkResponseBodyStructure[RetrieveForeignPropBsasResponseV4](response.body)

      // V5
      case "TriggerBsasResponseV5"             => checkResponseBodyStructure[TriggerBsasResponseV5](response.body)
      case "ListBsasResponseV5"                => checkResponseBodyStructure[ListBsasResponseV5](response.body)
      case "RetrieveSEBsasResponseV5"          => checkResponseBodyStructure[RetrieveSEBsasResponseV5](response.body)
      case "RetrieveForeignPropBsasResponseV5" => checkResponseBodyStructure[RetrieveForeignPropBsasResponseV5](response.body)
      case "RetrieveUkPropBsasResponseV5"      => checkResponseBodyStructure[RetrieveUkPropBsasResponseV5](response.body)

      // V6
      case "TriggerBsasResponseV6"                  => checkResponseBodyStructure[TriggerBsasResponseV6](response.body)
      case "RetrieveForeignPropBsasResponseV6_Def1" => checkResponseBodyStructure[RetrieveForeignPropBsasResponseV6_Def1](response.body)
      case "RetrieveForeignPropBsasResponseV6_Def2" => checkResponseBodyStructure[RetrieveForeignPropBsasResponseV6_Def2](response.body)
      case "RetrieveUkPropBsasResponseV6_Def1"      => checkResponseBodyStructure[RetrieveUkPropBsasResponseV6_Def1](response.body)
      case "RetrieveUkPropBsasResponseV6_Def2"      => checkResponseBodyStructure[RetrieveUkPropBsasResponseV6_Def2](response.body)
      case "RetrieveSEBsasResponseV6_Def1"          => checkResponseBodyStructure[RetrieveSEBsasResponseV6_Def1](response.body)
      case "RetrieveSEBsasResponseV6_Def2"          => checkResponseBodyStructure[RetrieveSEBsasResponseV6_Def2](response.body)
      case "ListBsasResponseV6"                     => checkResponseBodyStructure[ListBsasResponseV6](response.body)
      case "RetrieveForeignPropertyCumulativeSummaryResponseV5_Def1" =>
        checkResponseBodyStructure[RetrieveForeignPropertyCumulativeSummaryResponseV5_Def1](response.body)

      // ----- self-assessment-accounts-api -----
      case "RetrieveCodingOutStatusResponse"             => checkResponseBodyStructure[RetrieveCodingOutStatusResponse](response.body)
      case "RetrieveCodingOutUnderpaymentsResponse"      => checkResponseBodyStructure[RetrieveCodingOutUnderpayments](response.body)
      case "RetrieveSelfAssessmentChargeHistoryResponse" => checkResponseBodyStructure[RetrieveSelfAssessmentChargeHistoryResponse](response.body)
      case "ListPaymentsAndAllocationDetailsResponse"    => checkResponseBodyStructure[ListPaymentsAndAllocationDetailsResponse](response.body)

      // ----- business-details-api -----
      //case "ListBusinessesResponse"          => checkResponseBodyStructure[ListBusinessesResponse](response.body)


      case "RetrieveBusinessDetailsResponse" => checkResponseBodyStructure[RetrieveBusinessDetailsResponse](response.body)

      // ----- individuals-income-received-api -----
      case "SavingsIncome"                  => checkResponseBodyStructure[SavingsIncome](response.body)
      case "SavingsIncomeResponse"          => checkResponseBodyStructure[SavingsIncome](response.body)
      case "ForeignIncome"                  => checkResponseBodyStructure[ForeignIncome](response.body)
      case "ForeignIncomeResponse"          => checkResponseBodyStructure[ForeignIncome](response.body)
      case "PensionsIncome"                 => checkResponseBodyStructure[PensionsIncome](response.body)
      case "PensionsIncomeResponse"         => checkResponseBodyStructure[PensionsIncome](response.body)
      case "OtherIncome"                    => checkResponseBodyStructure[OtherIncome](response.body)
      case "OtherIncomeResponse"            => checkResponseBodyStructure[OtherIncome](response.body)
      case "OtherEmploymentIncome"          => checkResponseBodyStructure[OtherEmploymentIncome](response.body)
      case "OtherEmploymentIncomeResponse"  => checkResponseBodyStructure[OtherEmploymentIncome](response.body)
      case "DividendsIncome"                => checkResponseBodyStructure[DividendsIncome](response.body)
      case "DividendsIncomeResponse"        => checkResponseBodyStructure[DividendsIncome](response.body)
      case "UkDividendsIncomeResponse"      => checkResponseBodyStructure[RetrieveUkDividendsIncome](response.body)
      case "ListUkSavingsAccounts"          => checkResponseBodyStructure[ListUkSavingsAccounts](response.body)
      case "UkSavingsAccountIncomeResponse" => checkResponseBodyStructure[RetrieveUkSavingsAccount](response.body)
      // ----- v2 -----
      case "OtherIncomeResponseV2"     => checkResponseBodyStructure[OtherIncomeV2](response.body)
      case "SavingsIncomeResponseV2"   => checkResponseBodyStructure[SavingsIncomeV2](response.body)
      case "PensionsIncomeResponseV2"  => checkResponseBodyStructure[PensionsIncomeV2](response.body)
      case "DividendsIncomeResponseV2" => checkResponseBodyStructure[DividendsIncomeV2](response.body)

      case "AddUkSavingsAccount" => checkResponseBodyStructure[AddUkSavingsAccount](response.body)

      case "Employment"          => checkResponseBodyStructure[Employment](response.body)
      case "AddCustomEmployment" => checkResponseBodyStructure[AddCustomEmployment](response.body)
      case "ListEmployments"     => checkResponseBodyStructure[ListEmployments](response.body)
      case "FinancialDetails"    => checkResponseBodyStructure[FinancialDetails](response.body)

      case "RetrieveOtherDisposalsAndGainsResponse"   => checkResponseBodyStructure[RetrieveOtherDisposalsAndGains](response.body)
      case "RetrieveAllDisposalsAndOverridesResponse" => checkResponseBodyStructure[RetrieveAllDisposalsAndOverrides](response.body)

      case "NonPayeEmploymentIncome" => checkResponseBodyStructure[NonPayeEmploymentIncome](response.body)

      // ----- individuals-employment-income-api  -----
      case "ieiAddCustomEmployment" => checkResponseBodyStructure[IndividualsEmploymentsIncomeApi.v1.employments.AddCustomEmployment](response.body)
      case "ieiEmployment"          => checkResponseBodyStructure[IndividualsEmploymentsIncomeApi.v1.employments.Employment](response.body)
      case "ieiFinancialDetails" =>
        checkResponseBodyStructure[IndividualsEmploymentsIncomeApi.v1.employmentFinancialDetails.FinancialDetails](response.body)
      case "ieiListEmployments" => checkResponseBodyStructure[IndividualsEmploymentsIncomeApi.v1.employments.ListEmployments](response.body)
      case "ieiNonPayeEmploymentIncome" =>
        checkResponseBodyStructure[IndividualsEmploymentsIncomeApi.v1.nonPAYE.NonPayeEmploymentIncome](response.body)
      case "ieiOtherEmploymentIncomeResponse" =>
        checkResponseBodyStructure[IndividualsEmploymentsIncomeApi.v1.otherEmploymentIncome.OtherEmploymentIncome](response.body)

      // ----- individuals-capital-gains-income-api -----
      case "OtherDisposalsAndGainsResponse"   => checkResponseBodyStructure[OtherDisposalsAndGainsResponse](response.body)
      case "AllDisposalsAndOverridesResponse" => checkResponseBodyStructure[AllDisposalsAndOverridesResponse](response.body)

      // ----- savings income -----
      case "SavingsIncomeResponseV1"               => checkResponseBodyStructure[SavingsIncomeV1](response.body)
      case "SavingsAddUkSavingsAccount"            => checkResponseBodyStructure[SavingsAddUkSavingsAccount](response.body)
      case "SavingsUkSavingsAccountIncomeResponse" => checkResponseBodyStructure[SavingsRetrieveUkSavingsAccount](response.body)
      case "SavingsListUkSavingsAccounts"          => checkResponseBodyStructure[SavingsListUkSavingsAccounts](response.body)

      // ----- individuals-other-income-api -----
      case "IndividualsOtherIncomeResponse" => checkResponseBodyStructure[OtherIncomeApi](response.body)

      // ----- individuals-dividends-income-api -----
      case "IndividualsDividendsIncomeResponse"     => checkResponseBodyStructure[DividendsIncomeApi](response.body)
      case "UkDividendsIncomeAnnualSummaryResponse" => checkResponseBodyStructure[UkDividendsIncomeAnnualSummary](response.body)

      // ----- individuals-insurance-policies-api -----
      case "InsurancePoliciesIncome"         => checkResponseBodyStructure[InsurancePoliciesIncome](response.body)
      case "InsurancePoliciesIncomeResponse" => checkResponseBodyStructure[InsurancePoliciesIncome](response.body)

      // ----- individuals-foreign-income-api -----
      case "ifiRetrieveResponse" =>
        checkResponseBodyStructure[uk.gov.hmrc.integration.cucumber.models.IndividualsForeignIncome.v1.ForeignIncome](response.body)

      // ----- individuals-pension-income-api -----
      case "ipiRetrieveResponse" =>
        checkResponseBodyStructure[uk.gov.hmrc.integration.cucumber.models.IndividualsPensionsIncomeApi.PensionsIncome](response.body)

      // ----- individual-disclosures-api -----
      case "RetrieveDisclosuresResponse" => checkResponseBodyStructure[Disclosures](response.body, expectedBody)

      // ----- individual-state-benefits-api -----
      case "CreateStateBenefit"              => checkResponseBodyStructure[CreateStateBenefit](response.body)
      case "ListStateBenefits"               => checkResponseBodyStructure[ListBenefits](response.body)
      case "ShortListStateBenefitAmounts"    => checkResponseBodyStructure[ShortListStateBenefitAmounts](response.body)
      case "ShortCustomerAddedStateBenefits" => checkResponseBodyStructure[ShortCustomerAddedStateBenefits](response.body)

      // ----- individuals-expenses-api -----
      case "RetrieveOtherExpensesResponse"      => checkResponseBodyStructure[RetrieveOtherExpensesResponse](response.body)
      case "RetrieveEmploymentExpensesResponse" => checkResponseBodyStructure[RetrieveEmploymentExpensesResponse](response.body)

      // ----- other-deductions-api -----
      case "RetrieveOtherDeductionsResponse" => checkResponseBodyStructure[RetrieveOtherDeductionsResponse](response.body)

      // ----- property-business-api -----
      case "CreatePropertyPeriodSummaryResponse"        => checkResponseBodyStructure[CreatePropertyPeriodSummaryResponse](response.body)
      case "RetrieveUKPropertyPeriodSummaryResponse"    => checkResponseBodyStructure[RetrieveUKPropertyPeriodSummaryResponse](response.body)
      case "ListPropertyPeriodSummariesResponse"        => checkResponseBodyStructure[ListPropertyPeriodSummariesResponse](response.body)
      case "RetrieveUKPropertyAnnualSubmissionResponse" => checkResponseBodyStructure[RetrieveUKPropertyAnnualSubmissionResponse](response.body)
      case "RetrieveForeignPropertyAnnualSubmissionResponse" =>
        checkResponseBodyStructure[RetrieveForeignPropertyAnnualSubmissionResponse](response.body)
      case "RetrieveForeignPropertyPeriodSummaryResponse" => checkResponseBodyStructure[RetrieveForeignPropertyPeriodSummaryResponse](response.body)
      case "RetrieveUkPropertyPeriodSummaryResponse"      => checkResponseBodyStructure[RetrieveUKPropertyPeriodSummaryResponse](response.body)

      // ----- property-business-api v4 (no Hateoas) -----
      case "CreatePropertyPeriodSummaryResponseV4" => checkResponseBodyStructure[CreatePropertyPeriodSummaryResponseV4](response.body)
      case "CreateHistoricUKPropertyPeriodSummaryResponseV4" =>
        checkResponseBodyStructure[CreateHistoricUKPropertyPeriodSummaryResponseV4](response.body)
      case "CreateHistoricNonFhlUKPropertyPeriodSummaryResponseV4" =>
        checkResponseBodyStructure[CreateHistoricNonFhlUKPropertyPeriodSummaryResponseV4](response.body)
      case "CreateHistoricFhlUKPropertyPeriodSummaryResponseV4" =>
        checkResponseBodyStructure[CreateHistoricFhlUKPropertyPeriodSummaryResponseV4](response.body)
      case "ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponseV4" =>
        checkResponseBodyStructure[ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponseV4](response.body)
      case "ListHistoricUKPropertyPeriodSummariesResponseV4" =>
        checkResponseBodyStructure[ListHistoricUKPropertyPeriodSummariesResponseV4](response.body)

      case "RetrieveUKPropertyAnnualSubmissionResponseV4" =>
        checkResponseBodyStructure[RetrieveUKPropertyAnnualSubmissionResponseV4](response.body)
      case "RetrieveForeignPropertyPeriodSummaryResponseV4" =>
        checkResponseBodyStructure[RetrieveForeignPropertyPeriodSummaryResponseV4](response.body)
      case "RetrieveForeignPropertyAnnualSubmissionResponseV4" =>
        checkResponseBodyStructure[RetrieveForeignPropertyAnnualSubmissionResponseV4](response.body)
      case "ListPropertyPeriodSummariesResponseV4" =>
        checkResponseBodyStructure[ListPropertyPeriodSummariesResponseV4](response.body)

      // ----- property-business-api v5 -----
      case "RetrieveUKPropertyAnnualSubmissionResponseV5_def1" =>
        checkResponseBodyStructure[RetrieveUKPropertyAnnualSubmissionResponseV5_def1](response.body)
      case "RetrieveUKPropertyAnnualSubmissionResponseV5_def2" =>
        checkResponseBodyStructure[RetrieveUKPropertyAnnualSubmissionResponseV5_def2](response.body)
      case "RetrieveForeignPropertyAnnualSubmissionResponseV5_def1" =>
        checkResponseBodyStructure[RetrieveForeignPropertyAnnualSubmissionResponseV5_def1](response.body)
      case "RetrieveForeignPropertyAnnualSubmissionResponseV5_def2" =>
        checkResponseBodyStructure[RetrieveForeignPropertyAnnualSubmissionResponseV5_def2](response.body)

      // ░▒▓▓▓ Historic Property Business API V2 ▓▓▓▒░
      case "RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse" =>
        checkResponseBodyStructure[RetrieveHistoricFhlUKPropertyAnnualSubmissionResponse](response.body)

      case "RetrieveHistoricFhlUKPropertyPeriodSummaryResponse" =>
        checkResponseBodyStructure[RetrieveHistoricFhlUkPiePeriodSummaryResponse](response.body)
      case "RetrieveHistoricNonFhlUKPropertyPeriodSummaryResponse" =>
        checkResponseBodyStructure[RetrieveHistoricNonFhlUkPropertyPeriodSummaryResponse](response.body)
      case "RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse" =>
        checkResponseBodyStructure[RetrieveHistoricNonFhlUKPropertyAnnualSubmissionResponse](response.body)

      case "CreateHistoricUKPropertyPeriodSummaryResponse" => checkResponseBodyStructure[CreateHistoricUKPropertyPeriodSummaryResponse](response.body)
      case "CreateHistoricNonFhlUKPropertyPeriodSummaryResponse" =>
        checkResponseBodyStructure[CreateHistoricNonFhlUKPropertyPeriodSummaryResponse](response.body)
      case "CreateHistoricFhlUKPropertyPeriodSummaryResponse" =>
        checkResponseBodyStructure[CreateHistoricFhlUKPropertyPeriodSummaryResponse](response.body)
      case "CreateAmendHistoricNonFhlUKPropertyAnnualSubmissionResponse" =>
        checkResponseBodyStructure[CreateAmendHistoricNonFhlUKPropertyAnnualSubmissionResponse](response.body)
      case "CreateAmendHistoricFhlUKPropertyAnnualSubmissionResponse" =>
        checkResponseBodyStructure[CreateAmendHistoricFhlUKPropertyAnnualSubmissionResponse](response.body)

      case "ListHistoricUKPropertyPeriodSummariesResponse" => checkResponseBodyStructure[ListHistoricUKPropertyPeriodSummariesResponse](response.body)

      case "ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse" =>
        checkResponseBodyStructure[ListHistoricNonFHLUKPropertyIncomeAndExpensesPeriodSummaryResponse](response.body)

      // ----- self-employment-business-api -----
      case "RetrieveSEAnnualSubmissionResponse"        => checkResponseBodyStructure[RetrieveSEBusinessAnnualSummary](response.body)
      case "RetrieveSEAnnualSubmissionResponseV4_Def1" => checkResponseBodyStructure[Def1_RetrieveSEBusinessAnnualSummary](response.body)
      case "RetrieveSEAnnualSubmissionResponseV4_Def2" => checkResponseBodyStructure[Def2_RetrieveSEBusinessAnnualSummary](response.body)
      case "RetrieveSEAnnualSubmissionResponseV4_Def3" => checkResponseBodyStructure[Def3_RetrieveSEBusinessAnnualSummary](response.body)
      case "CreateSEPeriodSummaryResponse"             => checkResponseBodyStructure[CreateSEPeriodSummaryResponse](response.body)
      case "RetrieveSEPeriodSummaryResponseV3"         => checkResponseBodyStructure[RetrieveSEPeriodSummaryBodyV3](response.body)
      case "RetrieveSECumulativePeriodSummaryResponse" => checkResponseBodyStructure[RetrieveSECumulativePeriodSummaryBody](response.body)
      case "ListSEPeriodSummaries"                     => checkResponseBodyStructure[ListSEPeriodSummaries](response.body)

      // ----- self-assessment-individual-details-api -----
      case "RetrieveItsaStatusResponse" => checkResponseBodyStructure[RetrieveItsaStatusResponse](response.body)

      // ----- test-support-api -----

      case "ListCheckpointsResponseV1"    => checkResponseBodyStructure[ListCheckpointsResponseV1](response.body)
      case "CreateTestBusinessResponseV1" => checkResponseBodyStructure[CreateTestBusinessResponseV1](response.body)

      case "HateoasLinks" => checkResponseBodyStructure[HateoasLinks](response.body)
      */
      case _              => checkResponseBodyStructure[notFound](response.body)

    }
  }

  def checkResponseBodyStructure[A: Writes](body: String, expectedBody: Option[String] = None)(implicit rds: Reads[A]): Unit = {
    Json
      .parse(body)
      .validate[A]
      .fold(
        invalid =>
          scala.Predef
            .assert(assertion = false, s"JSON Response did not match the expected format and could not be parsed.\nErrors: $invalid\n${errorLog()}"),
        valid =>
          if (expectedBody.isDefined) {
            Json.toJson(valid) shouldBe Json.parse(expectedBody.get)
          } else {
            scala.Predef.assert(assertion = true)
          }
      )
  }

  case class notFound(notFound: String)

  object notFound {
    implicit val writes: OFormat[notFound] = Json.format[notFound]
  }

}
