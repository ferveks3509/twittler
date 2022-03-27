package com.example.twittler.service;

import com.example.twittler.model.User;
import com.example.twittler.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void editUser(User user) {
        userRepository.save(user);
    }

    public User findById(int id) {
        return userRepository.findById(id).get();
    }
}
