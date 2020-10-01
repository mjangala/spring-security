package com.mjangala.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class DemoController {

    @GetMapping(value = "/success/auth")
    public String successfulAuth(HttpServletRequest request, HttpSession session) {
        return "You are successfully Authenticated";
    }
}
