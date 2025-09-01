package com.unifor.arquiteturas.service;

import com.unifor.arquiteturas.model.User;

import java.util.List;

public interface UserInterface {

    public User createUser(User user);
    public List<User> getAllUsers();
    public User getUserById(Long id);
}
