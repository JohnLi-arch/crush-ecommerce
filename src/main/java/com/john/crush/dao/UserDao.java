package com.john.crush.dao;

import java.util.List;

import com.john.crush.entity.User;

public interface UserDao {
    public User findById(int id);

    public User findByUsername(String username);

    public User findByEmail(String email);

    public User save(User user);

    public void delete(User user);

    public List<User> findAll();
}
