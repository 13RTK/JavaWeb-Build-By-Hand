package org.framework.usage.service;

import org.framework.usage.entity.User;
import org.framework.usage.util.JDBCUtil;
import org.smart4j.framework.annotation.Inject;
import org.smart4j.framework.annotation.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Inject
    JDBCUtil jdbcUtil;

    public List<User> getUserList() {
        return jdbcUtil.getUserList();
    }
}
