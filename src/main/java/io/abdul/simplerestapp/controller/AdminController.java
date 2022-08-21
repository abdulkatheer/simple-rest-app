package io.abdul.simplerestapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AdminController {
   private final Environment environment;

   @GetMapping("/admin")
   public String sayHello() {
      return "Hi there, ADMIN API here. I'm RUNNING ON " + environment.getProperty("local.server.port");
   }
}
