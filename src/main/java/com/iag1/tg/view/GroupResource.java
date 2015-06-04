package com.iag1.tg.view;

import com.iag1.tg.model.Group;
import com.iag1.tg.repository.GroupRepository;
import com.iag1.tg.repository.GroupRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;


/**
 * Group Resources.
 * <p/>
 * Created by dqromney on 5/26/15.
 */
@Path("groups")
public class GroupResource {

    private GroupRepository groupRepository = new GroupRepositoryStub();

    @GET @Path("test1")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Response getAllGroups() {

        List<Group> groups = groupRepository.findAllGroups();
        System.out.println(groups.toString());
        GenericEntity<List<Group>> entity = new GenericEntity<List<Group>>(groups) {};

        return Response.ok(entity).build();
    }

}
