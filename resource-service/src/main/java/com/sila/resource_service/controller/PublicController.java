package com.sila.resource_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class PublicController {
    @GetMapping
    ResponseEntity<String> accessResource(){
        return ResponseEntity.ok("Welcome to Resource Service");
    }
}
