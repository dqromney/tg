package com.iag1.tg.client;

import com.iag1.tg.model.Group;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

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

        return response;
    }
}
