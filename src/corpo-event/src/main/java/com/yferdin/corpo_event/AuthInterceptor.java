package com.yferdin.corpo_event;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;

public class AuthInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        
        if (request.getSession().getAttribute("userMail") == null) {
            
            response.sendRedirect("/");
            return false; 
        }
        return true; 
    }
}

