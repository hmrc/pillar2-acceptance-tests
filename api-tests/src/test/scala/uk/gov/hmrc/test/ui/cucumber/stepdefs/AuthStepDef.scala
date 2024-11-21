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

import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage.taxPayer
import uk.gov.hmrc.test.ui.cucumber.endpoints.Auth.TestUserCreation._
import uk.gov.hmrc.test.ui.cucumber.endpoints.BasePage._

class AuthStepDef extends BaseStepDef {

  // Authorised on API Platform
  Given("""^an individual is authorised on the API Platform$""") { () =>
    if (env == "local") taxPayer = createLocalTestUser(AffinityGroup.Individual)
    else taxPayer = createUserAuthorisedOnApiPlatform(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent is authorised on the API Platform$""") { () =>
    if (env == "local") taxPayer = createLocalTestUser(AffinityGroup.Agent)
    else taxPayer = createAgentUserAuthorisedOnApiPlatform()
    printTaxPayer()
  }

  // Authorised
  Given("""^an individual is authorised$""") { () =>
    taxPayer = createLocalTestUser(AffinityGroup.Individual)
    printTaxPayer()
  }
  Given("""^an organisation is authorised$""") { () =>
    taxPayer = createLocalTestUser(AffinityGroup.Organisation)
    printTaxPayer()
  }

  Given("""^an agent is authorised$""") { () =>
    taxPayer = createLocalTestUser(AffinityGroup.Agent)
    printTaxPayer()
  }

  Given("""^a Main Agent$""") { () =>
    if (env == "local") taxPayer = createLocalTestUser(AffinityGroup.Agent)
    else taxPayer = createAgentUserAuthorisedOnApiPlatform()

    printTaxPayer()
  }

  Given("""^a Supporting Agent$""") { () =>
    if (env == "local") taxPayer = createLocalTestUser(AffinityGroup.Agent, supportingAgentEnrolment = true)
    else taxPayer = createAgentUserAuthorisedOnApiPlatform(supportingAgentEnrolment = true)

    printTaxPayer()
  }

  // Invalid nino
  Given("""^an individual uses wrong nino$""") { () =>
    taxPayer = createLocalTestUserWithInvalidNino(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent uses wrong client nino$""") { () =>
    taxPayer = createLocalTestUserWithInvalidNino(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Mtditid doesn't match nino used, in business details repo (des-simulator)
  Given("""^an individual's enrolment contains wrong mtditid$""") { () =>
    taxPayer = createLocalTestUserWithNoMatchingMtditid(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent's delegated enrolment contains wrong mtditid$""") { () =>
    taxPayer = createLocalTestUserWithNoMatchingMtditid(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Invalid bearer token
  Given("""^an individual has an invalid bearer token$""") { () =>
    taxPayer = createLocalTestUserWithInvalidBearerToken(AffinityGroup.Individual)
    printTaxPayer()
  }

  Given("""^an agent has an invalid bearer token$""") { () =>
    taxPayer = createLocalTestUserWithInvalidBearerToken(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Not enrolled for mtd-sa
  Given("""^an individual is not enrolled for mtd-sa$""") { () =>
    taxPayer = createLocalTestUserWithInvalidEnrolment(AffinityGroup.Individual)
    printTaxPayer()
  }

  // Agent is not enrolled, but client is enrolled
  Given("""^an agent is not enrolled for agent services$""") { () =>
    taxPayer = createLocalTestUserWithInvalidEnrolment(AffinityGroup.Agent)
    printTaxPayer()
  }

  // Agent is enrolled, and client is enrolled, but agent is not linked to client
  Given("""^an agent is not authorised by the client$""") { () =>
    taxPayer = createLocalAgentNotAuthorisedForClient()
    printTaxPayer()
  }

}
