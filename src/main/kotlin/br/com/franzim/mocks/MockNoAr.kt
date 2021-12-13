import br.com.franzim.mocks.model.WrapperHTTP
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/mock-no-ar")
class MockNoAr {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    fun isRunning() = WrapperHTTP("get", "no message");

//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    fun isRunning() = "\"result\" : \"Mock está no ar!\"";
}