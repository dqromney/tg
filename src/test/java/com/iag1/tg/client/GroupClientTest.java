package com.iag1.tg.client;

import com.iag1.tg.model.Group;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * Group Client Test.
 * <p/>
 * Created by dqromney on 6/9/15.
 */
public class GroupClientTest {

    @Test
    public void testGet() {
        GroupClient client = new GroupClient();

        Group group = client.get("100");

        System.out.println(group);

        assertNotNull(group);
    }
}
