package com.user.management.service;

import com.user.management.user.User;

import java.util.List;

public interface RemoteUserService {
    List<User> getAll();
    User getById(String id);
    User create(User user);
    User update(String id, User user);
    User patch(String id, User user);
    void delete(String id);
}