package com.it.demo.service;

import com.it.demo.model.User;

import java.util.List;

public interface UserService {

    public List<User> selectUserListByAll(User user);
}
