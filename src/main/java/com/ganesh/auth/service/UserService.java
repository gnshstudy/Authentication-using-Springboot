package com.ganesh.auth.service;

import com.ganesh.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
