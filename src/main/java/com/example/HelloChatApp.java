package com.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloChatApp {
    @Get("/")
    public String index() {
        return "Hello World Chat App";
    }
}
