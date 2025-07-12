package com.cognizant.springlearn.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;

public class JwtUtil {
    private static final String SECRET_KEY = "mySecretKey";

    public static String generateToken(String username) {
        long currentTimeMillis = System.currentTimeMillis();
        long expirationMillis = currentTimeMillis + 1000 * 60 * 60;

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date(currentTimeMillis))
                .setExpiration(new Date(expirationMillis))
                .signWith(SignatureAlgorithm.HS256, SECRET_KEY)
                .compact();
    }
}
