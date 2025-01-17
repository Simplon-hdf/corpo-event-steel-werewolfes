package com.yferdin.corpo_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private UserRepository userRepository;

    public boolean login(String email, String password) {
        User user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return true; 
        }
        return false; 
    }
    public User getUser(String email) {
    	User user = userRepository.findByEmail(email);
    	return user;
    }
}

