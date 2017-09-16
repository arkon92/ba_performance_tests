package simulation

import io.gatling.core.Predef._
import io.gatling.http.Predef._


/**
  * Created by romain on 23/03/2017.
  */
class BASimulation extends Simulation {

  val httpConf = http.baseURL("http://localhost:9000")

  setUp(
    scenario("Check server status")
      .exec(
        http("Home page")
          .get("/")
          .check(status.is(200))).inject(atOnceUsers(1))
  ).protocols(httpConf)

}
