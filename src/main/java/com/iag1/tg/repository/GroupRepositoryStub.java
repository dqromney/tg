package com.iag1.tg.repository;

import com.iag1.tg.model.Group;

import java.util.ArrayList;
import java.util.List;

/**
 * Group Repository Stub.
 *
 * Created by dqromney on 5/26/15.
 */
public class GroupRepositoryStub implements GroupRepository {

    @Override
    public List<Group> findAllGroups() {

        List<Group> groups = new ArrayList<Group>();

        groups.add(new Group("Food Storage", "Topics regarding food storage."));
        groups.add(new Group("Giants", "Topics regarding giants today and in the past."));
        groups.add(new Group("Book of Mormon", "Topics regarding the Book of Mormon."));

        return groups;
    }
}
