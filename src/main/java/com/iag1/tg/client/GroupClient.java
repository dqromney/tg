package com.iag1.tg.client;

import com.iag1.tg.model.Group;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Group Client.
 * <p/>
 * Created by dqromney on 6/9/15.
 */
public class GroupClient {

    private Client client;

    public GroupClient() {
        this.client = ClientBuilder.newClient();
    }

    public Group get(String id) {

        WebTarget target = client.target("http://localhost:8081/tg/webapi/");

        Response response = target.path("groups/" + id).request().get(Response.class);
        // XML
        String responseXML1 = target.path("groups/" + id).request(MediaType.APPLICATION_XML_TYPE).get(String.class);
        // or XML (default)
        String responseXML2 = target.path("groups/" + id).request().get(String.class);

        // JSON
        String responseJSON = target.path("groups/" + id).request(MediaType.APPLICATION_JSON).get(String.class);

        if (response.getStatus() != 200) {
            throw new RuntimeException(response.getStatus() + ":  there was an error on the server.");
        }

        return response.readEntity(Group.class);
    }

    public List<Group> get() {
        WebTarget target = client.target("http://localhost:8081/tg/webapi/groups");
        List<Group> response = target.path("groups").request(MediaType.APPLICATION_JSON).get(new GenericType<List<Group>>() {});
        return response;
    }
}
