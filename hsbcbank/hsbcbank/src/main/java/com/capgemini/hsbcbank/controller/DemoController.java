package com.capgemini.hsbcbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

//Class
public class DemoController {

 @RequestMapping("/hello")
 @ResponseBody

 // Method
 public String helloWorld()
 {

     // Print statement
     return "Hello Dinesh welcome to java World!";
 }
}
