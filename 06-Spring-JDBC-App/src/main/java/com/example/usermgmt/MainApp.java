package com.example.usermgmt;

import com.example.usermgmt.config.AppConfig;
import com.example.usermgmt.model.User;
import com.example.usermgmt.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        UserService service = context.getBean(UserService.class);

        // Register a new user
        User u = new User();
        u.setName("Sumanth");
        u.setEmail("sumanth@gmail.com");
        service.registerUser(u);

        // List users
        service.listUsers().forEach(user ->
                System.out.println(user.getId() + ": " + user.getName() + " - " + user.getEmail()));

        context.close();
    }
}
