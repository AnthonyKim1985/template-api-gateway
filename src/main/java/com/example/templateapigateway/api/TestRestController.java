package com.example.templateapigateway.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRestController {
    private final RestTemplate restTemplate;

    @Autowired
    public TestRestController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/test")
    public String test() {
        System.err.println("test called");
        return restTemplate.getForObject("http://template-helloworld-service/hello?name=1234", String.class);
    }
}
