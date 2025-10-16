package uk.gov.hmrc.test.ui.cucumber.stepdefs

import uk.gov.hmrc.test.ui.pages._

object NFMSteps {

  // ^(.*) logs in NFM name page for Pillar2$
  def givenXLogsInNFMNamePageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMName(name)
          case _                   => AuthLoginPage.loginToNFMName(name)
        }
  }

  // ^(.*) logs in NFM address page for Pillar2$
  def givenXLogsInNFMAddressPageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMAddress(name)
          case _                   => AuthLoginPage.loginToNFMAddress(name)
        }
  }

  // ^(.*) logs in NFM Contact Name page for Pillar2$
  def givenXLogsInNFMContactNamePageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMContactName(name)
          case _                   => AuthLoginPage.loginToNFMContactName(name)
        }
  }

  // ^(.*) logs in NFM Contact Email page for Pillar2$
  def givenXLogsInNFMContactEmailPageForPillar2(name: String): Unit = {
        name match {
          case "Organisation User" => AuthLoginPage.loginToNFMContactEmail(name)
          case _                   => AuthLoginPage.loginToNFMContactEmail(name)
        }
  }

}
