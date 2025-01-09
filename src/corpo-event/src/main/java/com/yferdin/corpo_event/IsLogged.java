package com.yferdin.corpo_event;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/")
public class IsLogged {
    @GetMapping("/islogged")
    private String islogged() {
    	return "islogged";
    }
    
}