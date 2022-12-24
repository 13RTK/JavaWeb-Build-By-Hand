package org.framework.usage.service;

import org.framework.usage.entity.User;
import org.smart4j.framework.annotation.Service;

import java.util.List;

//@Service
public interface UserService {
    List<User> getUserList();
}
