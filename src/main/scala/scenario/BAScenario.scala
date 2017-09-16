package scenario

import io.gatling.core.Predef._
import io.gatling.http.Predef._

/**
  * Created by romain on 23/03/2017.
  */
object BAScenario {


  val scn = scenario("Check server status")
    .exec(
      http("Home page")
        .get("/")
        .check(status.is(200)))

}
