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

package uk.gov.hmrc.test.ui.cucumber.config

import com.typesafe.config.ConfigFactory

import scala.util.Try
//import uk.gov.hmrc.integration.cucumber.endpoints.BasePage.removeWhiteSpace

trait Environments {

  private val config = ConfigFactory.load("environments.conf")
  val env: String    = Option(System.getProperty("env")).getOrElse("local")

  val subscriptionApiUrl: String                       = config.getString(s"environments.$env.subscription-api")
  val saApiUrl: String                                 = config.getString(s"environments.$env.self-assessment-api")
  val individualLossesApiUrl: String                   = config.getString(s"environments.$env.individual-losses-api")
  val individualCalculationApiUrl: String              = config.getString(s"environments.$env.individual-calculations-api")
  val individualsIncomeReceivedApiUrl: String          = config.getString(s"environments.$env.individuals-income-received-api")
  val individualsCapitalGainsIncomeUrl: String         = config.getString(s"environments.$env.individuals-capital-gains-income-api")
  val individualsForeignIncomeApiUrl: String           = config.getString(s"environments.$env.individuals-foreign-income-api")
  val individualsPensionsIncomeApiUrl: String          = config.getString(s"environments.$env.individuals-pensions-income-api")
  val individualsSavingsIncomeApiUrl: String           = config.getString(s"environments.$env.individuals-savings-income-api")
  val individualsDividendsIncomeApiUrl: String         = config.getString(s"environments.$env.individuals-dividends-income-api")
  val individualsEmploymentsIncomeApiUrl: String       = config.getString(s"environments.$env.individuals-employments-income-api")
  val individualsOtherIncomeApiUrl: String             = config.getString(s"environments.$env.individuals-other-income-api")
  val individualsInsurancePoliciesIncomeApiUrl: String = config.getString(s"environments.$env.individuals-insurance-policies-income-api")
  val individualsReliefsApiUrl: String                 = config.getString(s"environments.$env.individuals-reliefs-api")
  val otherDeductionsApiUrl: String                    = config.getString(s"environments.$env.other-deductions-api")
  val propertyBusinessApiUrl: String                   = config.getString(s"environments.$env.property-business-api")
  val saAccountsApiUrl: String                         = config.getString(s"environments.$env.self-assessment-accounts-api")
  val saBissApiUrl: String                             = config.getString(s"environments.$env.self-assessment-biss-api")
  val saBsasApiUrl: String                             = config.getString(s"environments.$env.self-assessment-bsas-api")
  val businessDetailsApiUrl: String                    = config.getString(s"environments.$env.business-details-api")
  val obligationsApiUrl: String                        = config.getString(s"environments.$env.obligations-api")
  val individualsExpensesApiUrl: String                = config.getString(s"environments.$env.individuals-expenses-api")
  val individualsDisclosuresApiUrl: String             = config.getString(s"environments.$env.individuals-disclosures-api")
  val individualsStateBenefitsApiUrl: String           = config.getString(s"environments.$env.individuals-state-benefits-api")
  val individualsChargesApiUrl: String                 = config.getString(s"environments.$env.individuals-charges-api")
  val individualsBusinessEOPSApiUrl: String            = config.getString(s"environments.$env.individuals-business-eops-api")
  val selfEmploymentBusinessApiUrl: String             = config.getString(s"environments.$env.self-employment-business-api")
  val cisDeductionsApiUrl: String                      = config.getString(s"environments.$env.cis-deductions-api")
  val saTestSupportBaseUrl: String                     = config.getString(s"environments.$env.self-assessment-test-support-api")
  val saIndividualDetailsUrl: String                   = config.getString(s"environments.$env.self-assessment-individual-details-api")

  val apiPlatformTestUserUrl: String = config.getString(s"environments.$env.api-platform-test-user")

  val apiPlatformAgentsAuthUrl: String     = config.getString(s"environments.$env.api-platform-agents-auth")
  val apiPlatformAgentsAuthTestUrl: String = config.getString(s"environments.$env.api-platform-agents-auth-test")
  val multiFactorAuthenticationUrl: String = config.getString(s"environments.$env.mfa-frontend")

  val authLoginApiUrl: String  = config.getString(s"environments.$env.auth-login-api")
  val authLoginStubUrl: String = config.getString(s"environments.$env.auth-login-stub")

  object thirdPartyApp {
    val redirectUrl: String  = config.getString(s"environments.$env.third-party-application.redirect-url")
    val clientId: String     = config.getString(s"environments.$env.third-party-application.client-id")
    val clientSecret: String = config.getString(s"environments.$env.third-party-application.client-secret")
  }

  val oauthFrontendUrl: String    = config.getString(s"environments.$env.oauth-frontend")
  val oauthApiUrl: String         = config.getString(s"environments.$env.oauth-api")
  val oauthApiExtendedUrl: String = config.getString(s"environments.$env.oauth-api-extended")

  val oauthAuthorizeUrl: String =
    s"$oauthApiExtendedUrl/authorize?client_id=${thirdPartyApp.clientId}&scope=read:self-assessment+write:self-assessment+write:sent-invitations&response_type=code&redirect_uri=${thirdPartyApp.redirectUrl}&state=12345"
  /*removeWhiteSpace(s"""
       | $oauthApiExtendedUrl
       | /authorize
       | ?client_id=${thirdPartyApp.clientId}
       | &scope=read:self-assessment+write:self-assessment+write:sent-invitations
       | &response_type=code
       | &redirect_uri=${thirdPartyApp.redirectUrl}
       | &state=12345
     """.stripMargin)*/

  val confidenceLevel: Int  = config.getInt(s"environments.$env.confidence-level")
  val isEmaEnabled: Boolean = Try(config.getBoolean(s"environments.$env.ema-enabled")).getOrElse(false)

}
