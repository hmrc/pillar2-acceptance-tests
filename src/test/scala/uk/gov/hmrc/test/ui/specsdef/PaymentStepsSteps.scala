/*
 * Copyright 2025 HM Revenue & Customs
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

package uk.gov.hmrc.test.ui.specsdef

import org.openqa.selenium.By
import uk.gov.hmrc.selenium.webdriver.Driver
import uk.gov.hmrc.test.ui.helper.*
import uk.gov.hmrc.test.ui.helper.Input.clickByCss
import uk.gov.hmrc.test.ui.pages.*

object PaymentStepsSteps {

  def thenIMakeSuccessfulPayment(): Unit = {
    OnlinePaymentPages.enterAmountAncClickContinueOnEnterPaymentAmountPage()
    OnlinePaymentPages.clickContinueOnChooseOpenBankingOrBacsPage()
    OnlinePaymentPages.enterBankNameAndClickContinueOnChooseBankPage()
    OnlinePaymentPages.enterEmailAndClickContinueOnEmailPage()
    OnlinePaymentPages.clickContinueOnCheckYourDetailsPage()
    OnlinePaymentPages.clickContinueOnGetReadyApproveThisPaymentPage()
    OnlinePaymentPages.selectBankLoginOptionAndClickContinue()
    OnlinePaymentPages.clickSubmitOnStubBankPaymentPage()
    OnlinePaymentPages.verifyPaymentAndClickHmrcOnlineAccountLinkOnPaymentCompletePage()
  }

  def thenIGoTillGetReadyToApproveYourPaymentPage(): Unit = {
    OnlinePaymentPages.enterAmountAncClickContinueOnEnterPaymentAmountPage()
    OnlinePaymentPages.clickContinueOnChooseOpenBankingOrBacsPage()
    OnlinePaymentPages.enterBankNameAndClickContinueOnChooseBankPage()
    OnlinePaymentPages.enterEmailAndClickContinueOnEmailPage()
    OnlinePaymentPages.clickContinueOnCheckYourDetailsPage()
  }

  def thenIShouldBeAbleToNavigateBackToOutstandingPaymentPage(): Unit = {
    Nav.browserBack()
    for i <- 1 to 7 do {
      clickByCss(BtnAgdKBPage.backLink)
    }
  }
}
