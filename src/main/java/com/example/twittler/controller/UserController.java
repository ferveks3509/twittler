package com.example.twittler.controller;

import com.example.twittler.model.User;
import com.example.twittler.service.UserService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/users")
@PreAuthorize("hasAuthority('ROLE_ADMIN')")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String getUsers(Model model){
        model.addAttribute("users",  userService.findAllUsers());
        return null;
    }

    @GetMapping("/edit")
    public String editUser(@RequestParam("id") int id, Model model) {
        model.addAttribute("user", userService.findById(id));
        return "userEdit";
    }

    @PostMapping("/save")
    public String saveUser(@RequestParam("username") String username,
                           @RequestParam("id") int id) {
        User user = userService.findById(id);
        user.setUsername(username);
        userService.editUser(user);
        return "redirect:/users";
    }
}
