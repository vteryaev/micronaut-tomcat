package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.time.LocalDateTime;

@Controller
public class HelloController {

    @Get("/hello")
    String hello() {
        return "Hello " + LocalDateTime.now();
    }

}
