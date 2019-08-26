package com.john.crush.service;

import org.springframework.stereotype.Service;

import com.john.crush.entity.User;
import com.john.crush.user.CrmUser;

import java.util.List;

@Service
public interface UserService {
    public User findById(int id);

    public User findByUsername(String username);

    public User findByEmail(String email);

    public User saveUser(CrmUser crmUser);

    public User saveUser(User user);

    public void update(User user);

    public void deleteById(int id);

    public List<User> findAll();
}
