package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import com.example.demo.Security.JwtUtil;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        return userRepository.save(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody User user) {

        User dbUser = userRepository.findByEmail(user.getEmail());

        if (dbUser != null &&
                passwordEncoder.matches(
                        user.getPassword(),
                        dbUser.getPassword())) {

            return jwtUtil.generateToken(dbUser.getEmail());
        }

        return "Invalid Credentials";
    }
}