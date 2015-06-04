package com.iag1.tg.view;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET @Path("test1")
    @Produces({MediaType.TEXT_PLAIN})
    public String getIt() {
        return "Got it!";
    }

    @GET @Path("test2")
//    @Produces({"application/xml", "application/json"})
//    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Produces({MediaType.TEXT_PLAIN})
    public String test() {
        return "Got the test!";
    }

}
