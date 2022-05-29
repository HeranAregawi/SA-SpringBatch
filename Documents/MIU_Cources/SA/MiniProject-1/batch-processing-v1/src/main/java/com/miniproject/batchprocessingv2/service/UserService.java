package com.miniproject.batchprocessingv2.service;

import com.miniproject.batchprocessingv2.domain.Role;
import com.miniproject.batchprocessingv2.domain.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);

    Role saveRole(Role role);

    void addRoleToUser(String username, String rolename);

    User getUser(String username);

    List<User> getUsers();


}
