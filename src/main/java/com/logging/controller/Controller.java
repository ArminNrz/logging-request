package com.logging.controller;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api")
public class Controller {

    @GetMapping("/{id}")
    public String getInfo(@PathVariable Long id) {

        log.info("Request for getting info by id: {}", id);

        return "return some info....";
    }
}
