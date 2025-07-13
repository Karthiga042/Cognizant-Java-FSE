package com.cognizant.jwtauthservice.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.crypto.SecretKey;
import jakarta.servlet.http.HttpServletRequest;
import java.util.Base64;
import java.util.Date;

@RestController
public class AuthController {

    // Secure key (>= 256 bits)
    private final SecretKey key = Keys.hmacShaKeyFor("my-super-secret-key-1234567890-my-secure-jwt!".getBytes());

    @GetMapping("/authenticate")
    public ResponseEntity<?> authenticate(HttpServletRequest request) {
        String authHeader = request.getHeader("Authorization");
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            return ResponseEntity.status(401).body("Missing or invalid Authorization header.");
        }

        // Decode username and password
        String[] credentials = new String(Base64.getDecoder()
                .decode(authHeader.substring(6))).split(":");

        if (credentials.length < 2) {
            return ResponseEntity.status(401).body("Invalid credentials format.");
        }

        String username = credentials[0];
        String password = credentials[1];

        // Hardcoded user check
        if ("user".equals(username) && "pwd".equals(password)) {
            String jwt = Jwts.builder()
                    .setSubject(username)
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hour
                    .signWith(key, SignatureAlgorithm.HS256)
                    .compact();

            return ResponseEntity.ok().body("{\"token\":\"" + jwt + "\"}");
        }

        return ResponseEntity.status(403).body("Invalid credentials");
    }
}
