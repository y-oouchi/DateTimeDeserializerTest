package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.resource.TestResource;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class TestController {

    @PostMapping("test")
    public ResponseEntity<String> test(@RequestBody String body) {
        System.out.println(body);
        ObjectMapper mapper = new ObjectMapper();
        try {
            TestResource resource = mapper.readValue(body, TestResource.class);
            System.out.println(resource.getTestTime());
        } catch (Exception e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        
        return ResponseEntity.ok("");
    }
}
