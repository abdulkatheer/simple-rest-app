package io.abdul.simplerestapp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequiredArgsConstructor
public class AppController {
   private final Environment environment;

   @GetMapping("/app/{appId}")
   public String app(@PathVariable String appId) {
      return "Hi there, This is App=" + appId + " and I'm RUNNING ON " + environment.getProperty("local.server.port");
   }
}