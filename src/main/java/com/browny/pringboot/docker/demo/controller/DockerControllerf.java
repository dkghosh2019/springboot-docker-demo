package com.browny.pringboot.docker.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DockerControllerf {
    @GetMapping(value="/test-docker")
    public String getDockerMsg(){
        return "Docker demo using Spring Boot";
    }
}
