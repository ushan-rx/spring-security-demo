package org.example.springsecuritydemo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("hello")
    public String HelloPage(HttpServletRequest request){
        return "hellooo "+ request.getSession().getId();

    }
}
