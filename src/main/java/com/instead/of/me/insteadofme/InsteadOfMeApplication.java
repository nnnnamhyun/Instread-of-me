package com.instead.of.me.insteadofme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class InsteadOfMeApplication {

  public static void main(String[] args) {
    SpringApplication.run(InsteadOfMeApplication.class, args);
  }

}
