package com.yferdin.corpo_event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import jakarta.servlet.http.HttpSession;
@Controller
@RequestMapping("/")
public class AuthController {
    @Autowired
    private AuthService authService;
    @GetMapping("/")
    private String login() {
    	return "login";
    }
    @PostMapping("/")
    public String login(@RequestParam String email, @RequestParam String password, HttpSession session, RedirectAttributes redirAttr) {
        boolean success = authService.login(email, password);
        if (success) {
        	User user = authService.getUser(email);
        	session.setAttribute("userMail", email);
        	session.setAttribute("userRole", user.getRole());
            return "redirect:/home/";
        } else {
        	redirAttr.addFlashAttribute("error", "Une erreur est survenue");
            return "redirect:/";
        }
    }
}