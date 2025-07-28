package me.suren.db_api.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/db-api")
public class DbController {

    @GetMapping("/test")
    public String test() {
        return "Hi!";
    }
}
