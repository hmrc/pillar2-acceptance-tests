package uk.gov.hmrc.test.ui.cucumber.stepdefs

import org.apache.pekko.actor.ActorSystem
import org.apache.pekko.stream.Materializer
import play.api.libs.ws.DefaultBodyWritables.writeableOf_urlEncodedSimpleForm
import play.api.libs.ws.StandaloneWSResponse
import play.api.libs.ws.ahc.StandaloneAhcWSClient

import scala.concurrent.Await
import scala.concurrent.duration._

class ApiLoginSteps extends CommonFunctions {

  // Shared ActorSystem and Materializer
  implicit val system: ActorSystem = ActorSystem("ApiSystem")
  implicit val materializer: Materializer = Materializer(system)

  var responseStatus: Int = 0
  var responseBody: String = ""

  Given("""I login to gg sign in page""") { () =>
    println("This is test")

    // Create the WS Client
    val wsClient = StandaloneAhcWSClient()

    try {
      // Define the URL and form data
      val url = "https://www.staging.tax.service.gov.uk/auth-login-stub/gg-sign-in"
      val formData = Map(
        "redirectionUrl"                      -> "/report-pillar2-top-up-taxes",
        "credentialStrength"                  -> "strong",
        "confidenceLevel"                     -> "50",
        "affinityGroup"                       -> "Organisation",
        "email"                               -> "user@test.com",
        "enrolment[0].name"                   -> "HMRC-PILLAR2-ORG",
        "enrolment[0].taxIdentifier[0].name"  -> "PLRID",
        "enrolment[0].taxIdentifier[0].value" -> "XMPLR0012345674",
        "enrolment[0].state"                  -> "Activated",
        "authorityId"                         -> ""
      )

      // Make the POST request
      val responseFuture = wsClient
        .url(url)
        .addHttpHeaders("Content-Type" -> "application/x-www-form-urlencoded")
        .post(formData)

      // Await the response
      val response: StandaloneWSResponse = Await.result(responseFuture, 10.seconds)

      // Capture response details
      responseStatus = response.status
      responseBody = response.body

      // Log response
      println(s"Status: $responseStatus")
      println(s"Body: $responseBody")

    } catch {
      case e: Exception =>
        println(s"Error occurred during API call: ${e.getMessage}")
    } finally {
      // Close the client
      wsClient.close()
    }
  }

  // Optionally, add a method to clean up resources if necessary
  def terminateResources(): Unit = {
    system.terminate()
  }
}