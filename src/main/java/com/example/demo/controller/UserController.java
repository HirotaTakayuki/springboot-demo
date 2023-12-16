package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("users")
public class UserController {
  @Autowired
  UserService usrService;

  @GetMapping(path = "")
  String list(Model model) {
    List<User> users = usrService.findAll();
    model.addAttribute("users", users);
    return "user/list";
  }
}