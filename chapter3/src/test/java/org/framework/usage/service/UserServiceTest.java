package org.framework.usage.service;

import org.framework.usage.entity.User;
import org.framework.usage.util.JDBCUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.smart4j.framework.HelperLoader;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.annotation.Service;

import java.util.List;

import static org.junit.Assert.*;

@Service
public class UserServiceTest {
    @Inject
    UserServiceImpl userService;

    @Before
    public void init() {
        HelperLoader.init();
    }


    @Test
    public void getUserList() {
        List<User> userList = userService.getUserList();

        Assert.assertEquals(2, userList.size());
    }
}