package com.iag1.tg.repository;

import com.iag1.tg.model.Group;

import java.util.List;

/**
 * Group Repository Interface.
 *
 * Created by dqromney on 5/26/15.
 */
public interface GroupRepository {

    List<Group> findAllGroups();

    Group findGroup(String pGroupId);

}
