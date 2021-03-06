package com.iag1.tg.view;

import com.iag1.tg.model.Group;
import com.iag1.tg.repository.GroupRepository;
import com.iag1.tg.repository.GroupRepositoryStub;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * Group Resources.
 * <p/>
 * Created by dqromney on 5/26/15.
 */
@Path("groups") // http://localhost:8081/tg/webapi/groups
public class GroupResource {

    private GroupRepository groupRepository = new GroupRepositoryStub();

    @GET // http://localhost:8081/tg/webapi/groups
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public List<Group> getAll() {
        return groupRepository.findAllGroups();
    }

    @GET
    @Path("{groupId}") // http://localhost:8081/tg/webapi/groups/100
    @Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
    public Response getGroup(@PathParam("groupId") String pGroupId) {

        System.out.println(String.format("Getting group ID: [%1$s]", pGroupId));

        // Check for null and number of minimum digits
        if (pGroupId == null || pGroupId.length() < 2) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        Group group = groupRepository.findGroup(pGroupId);
        // Did we find a group?
        if (group == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        return Response.ok().entity(group).build();
    }
}
