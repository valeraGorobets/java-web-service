package api_package;

import java.util.Date;
import java.sql.Timestamp;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/login")
public class ApiService {

    //
    // http://localhost:8080/api/login/
    //
    @Path("")
    @GET
    @Produces("text/html")
    public String generateWarningPage() {
        return "<html>" +
                    "<body>" +
                        "<h1>Can't identify user</h1>" +
                    "</body>" +
                "</html>";
    }

    // http://localhost:8080/api/login/{name}
    @Path("{name}")
    @GET
    @Produces("text/html")
    public String generateGreetingPage(@PathParam("name") String loginName) {
        Date date= new Date();
        long time = date.getTime();
        Timestamp timestamp = new Timestamp(time);

        return "<html>" +
                    "<body>" +
                        "<h1>Hello " + loginName + "!</h1>" +
                        "<h2>Logged at: " + timestamp + "</h2>" +
                    "</body>" +
                "</html>";
    }

}
