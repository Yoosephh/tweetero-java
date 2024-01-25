package com.tweetero.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/tweets")
public class TweetsController {

  @GetMapping("")
  public String getTweetsController() {
    return "Lista de tweets: abc";
  }

  @GetMapping("/user/{userId}")
  public String getUserTweetController(@PathVariable("id") int id) {
    return "Lista de tweets: def";
  }

  @PostMapping("/")
  public String postTweetController(@RequestBody String body) {
    return "Tweet criado com sucesso!";
  }
}
