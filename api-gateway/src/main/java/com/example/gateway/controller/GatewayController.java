package com.example.gateway.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class GatewayController {
    @RequestMapping("/**")
    public ResponseEntity<String> schedule() {
        return ResponseEntity.status(HttpStatus.OK).body("Down");
    }
}