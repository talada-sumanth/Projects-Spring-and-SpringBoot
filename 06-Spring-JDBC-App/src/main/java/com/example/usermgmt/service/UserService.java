package com.example.usermgmt.service;

import com.example.usermgmt.dao.UserDAO;
import com.example.usermgmt.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void registerUser(User user) {
        userDAO.save(user);
    }

    public List<User> listUsers() {
        return userDAO.findAll();
    }

    public void deleteUser(int id) {
        userDAO.deleteById(id);
    }
}
