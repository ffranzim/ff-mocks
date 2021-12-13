package br.com.franzim.mocks.pinning_certs

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.containsString
import org.junit.jupiter.api.Test

@QuarkusTest
class VerbsHTTPTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/mock-no-ar")
          .then()
             .statusCode(200)
             .body(containsString("Mock está no ar!"))
//             .body(`is`("Hello RESTEasy"))
    }

}