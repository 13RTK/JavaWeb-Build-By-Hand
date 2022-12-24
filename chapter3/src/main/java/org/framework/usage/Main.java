package org.framework.usage;

import org.framework.usage.entity.User;
import org.framework.usage.service.UserServiceImpl;
import org.smart4j.framework.HelperLoader;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        HelperLoader.init();
        UserServiceImpl userService = new UserServiceImpl();
        List<User> userList = userService.getUserList();
        System.out.println(userList);
    }
}
