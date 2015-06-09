package com.iag1.tg.client;

import com.iag1.tg.model.Group;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Group Client.
 *
 * Created by dqromney on 6/9/15.
 */
public class GroupClient {

    private Client client;

    public GroupClient() {
        this.client = ClientBuilder.newClient();
    }

    public Group get(String id) {

        WebTarget target = client.target("http://localhost:8081/tg/webapi/");

        Group response = target.path("groups/" + id).request().get(Group.class);
        // XML
        String responseXML = target.path("groups/" + id).request().get(String.class);
        // JSON
        String responseJSON = target.path("groups/" + id).request(MediaType.APPLICATION_JSON_TYPE).get(String.class);

        return response;
    }
}
