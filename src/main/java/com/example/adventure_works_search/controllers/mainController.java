package com.example.adventure_works_search.controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;


@RestController
//@Tag(name = "example api", description = "example api")
@RequestMapping("example/")
public class mainController {

    @GetMapping("hellow-world/")
    public ResponseEntity<String> helloWorld() {
        // return ResponseEntity wiht messas

        return null;
    }

    @GetMapping("hello/")
    public String hellow(){
        return "hellow";
    }

    
}