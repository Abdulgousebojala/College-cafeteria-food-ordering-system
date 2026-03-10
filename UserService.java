package com.example.demo.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Register new user
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    // Login user
    public User loginUser(User user) {

        User dbUser = userRepository.findByEmail(user.getEmail());

        if (dbUser != null && dbUser.getPassword().equals(user.getPassword())) {
            return dbUser;
        }

        return null;
    }

    // Get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Find user by email
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}