package com.example.demo.controller;


import com.example.demo.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController

public class UserController {
    public List<User> user =new ArrayList<>();
    public UserController() {
        user.add(new User(1, "John", 25, "NewYork"));
        user.add(new User(2, "Jane", 22, "NewYork"));
        user.add(new User(3, "Doe", 30, "NewYork"));
    }

    @GetMapping("/users/filter")
    public List<User> filterUsers(@RequestParam(required = false) Integer age, @RequestParam(required = false) String city) {
        return user.stream()
                .filter(u -> (age == null || u.getAge()== age) && (city == null || u.getCity().equals(city)))
                .collect(Collectors.toList());
    }
}
