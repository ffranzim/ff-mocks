package br.com.franzim.mocks

import br.com.franzim.mocks.model.WrapperHTTP
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/mock-no-ar")
@Produces(MediaType.APPLICATION_JSON)
class MockNoAr {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun isRunning() = WrapperHTTP("get", "Mock está no ar!");

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    fun isRunning() = "\"result\" : \"Mock está no ar!\"";
}