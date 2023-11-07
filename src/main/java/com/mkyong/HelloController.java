package com.mkyong;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/welcome")
public class HelloController {

    @GetMapping
    ResponseEntity<Map<String,String>> Hello() {

        return ResponseEntity.ok().body(Map.of("Testing","Hello World, Spring Boot!"));
    }

}