package com.yferdin.corpo_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/auth")
public class AuthController {
    @Autowired
    private AuthService authService;
    @GetMapping("/login")
    private String login() {
    	return "login";
    }
    @PostMapping("/login")
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session) {
        boolean success = authService.login(email, password);
        if (success) {
        	User user = authService.getUser(email);
        	session.setAttribute("userMail", email);
        	session.setAttribute("userRole", user.getRole());
            return "redirect:/";
        } else {
        	System.out.println("not ok");
            return "denied";
        }
    }
}