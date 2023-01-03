package com.brocom.ucionicaspringboot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PingController {

    @GetMapping("/")
    public String health() {
        return "Radi i GITHUB!!";
    }
}