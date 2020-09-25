package com.ashwin.java.resource.api;

import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class PingController {
    @GetMapping
    public ResponseEntity<String> ping() {
        return ResponseEntity.ok("pong");
    }

    @GetMapping(path = "/reflect")
    public ResponseEntity<MultiValueMap<String, String>> reflect(@RequestParam MultiValueMap<String, String> parameters) {
        System.out.println(parameters);
        return ResponseEntity.ok(parameters);
    }
}
