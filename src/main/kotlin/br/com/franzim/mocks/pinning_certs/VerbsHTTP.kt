package br.com.franzim.mocks.pinning_certs

import br.com.franzim.mocks.model.WrapperHTTP
import javax.ws.rs.*
import javax.ws.rs.core.MediaType
import javax.ws.rs.core.Response

@Path("/verbs-http")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class VerbsHTTP {

    @GET
    @Path("{message}")
    fun getVerb(@PathParam("message") message: String): Response {
        println(message)
        return Response.ok(WrapperHTTP("get", message)).build();
    }

}