package com.instead.of.me.insteadofme.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/dev")
public class DevController {

  @GetMapping
  public String test() {
    return "test";
  }
}
