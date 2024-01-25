package com.tweetero.api.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.tweetero.api.models.UserModel;
import com.tweetero.api.repository.UsersRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/users")
public class UsersController {

  final UsersRepository usersRepository;
  UsersController(UsersRepository userRepository){ 
    this.usersRepository = userRepository;
  }

  @PostMapping("/")
  public String createUser(@RequestBody UserModel user) {
    UserModel hasUser = usersRepository.findOne(user);

    usersRepository.save(user);
    return "Usuario cadastrado!";
  }
}
