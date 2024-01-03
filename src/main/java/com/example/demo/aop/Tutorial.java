package com.example.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Tutorial {

  @After("execution(String *..*AopController.logtest*(..))")
  public void logoutput() {
    System.out.println("test1");
    System.out.println("“ú–{Œê");
    System.out.println("test2");
  }
}