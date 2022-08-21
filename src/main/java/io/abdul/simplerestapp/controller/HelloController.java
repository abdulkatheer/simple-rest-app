package io.abdul.simplerestapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HelloController {
   private final Environment environment;

   @GetMapping("/hello")
   public String sayHello() {
      return "Hi there, I'm RUNNING ON " + environment.getProperty("local.server.port");
   }
}
