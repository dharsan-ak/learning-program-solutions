package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.util.JwtUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Base64;

@RestController
public class AuthenticationController {

    @GetMapping("/authenticate")
    public String authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");

        if (authHeader != null && authHeader.startsWith("Basic ")) {
            String base64Credentials = authHeader.substring("Basic ".length());
            byte[] decoded = Base64.getDecoder().decode(base64Credentials);
            String[] credentials = new String(decoded).split(":");

            String username = credentials[0];
            String password = credentials[1];

            if (username.equals("user") && password.equals("pwd")) {
                String token = JwtUtil.generateToken(username);
                return "{\"token\": \"" + token + "\"}";
            }
        }
        return "{\"error\": \"Unauthorized\"}";
    }
}
