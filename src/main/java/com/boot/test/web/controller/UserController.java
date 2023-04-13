package com.boot.test.web.controller;

import com.boot.test.entities.User;
import com.boot.test.repositories.UserRepository;
import com.boot.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path="/")
    public @ResponseBody Iterable<User> getAllUsers() {
        return this.userService.getAll();
    }
    @RequestMapping(path="/random")
    public @ResponseBody Optional<User> getRandomUser() {
        long count = this.userService.count();
        int randomId = (int) ((Math.random() * (count - 1)) + 1);
        return this.userService.getById(randomId);
    }
}
