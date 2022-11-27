package com.example.demo.Controlers;

import com.example.demo.users.MyUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/user")
public class UserController {
    private final UserService userService;
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @GetMapping
    public List<MyUser> getUsers() {
        return userService.getUsers();
    }
    @PostMapping
    public void addUser(@RequestBody MyUser user) {
        userService.addUser(user);
    }
}
