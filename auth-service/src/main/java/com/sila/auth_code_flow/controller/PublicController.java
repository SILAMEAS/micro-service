package com.sila.auth_code_flow.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PublicController {
  @GetMapping
  ResponseEntity<String> access(OAuth2AuthenticationToken token) {
    return ResponseEntity.ok("Welcome to Auth Service Controller");
  }
}
