package com.example.usermgmt.dao;

import com.example.usermgmt.model.User;
import java.util.List;

public interface UserDAO {
    void save(User user);
    List<User> findAll();
    void deleteById(int id);
}
