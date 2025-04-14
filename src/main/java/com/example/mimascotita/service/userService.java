package com.example.mimascotita.service;

import com.example.mimascotita.domain.user;
import com.example.mimascotita.infrastructure.userRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    private final userRepository userRepository;

    @Autowired
    public userService(userRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    // === Functions of service ===
}
