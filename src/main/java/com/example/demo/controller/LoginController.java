package com.example.demo.controller;
 
import java.util.Objects;

 
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.LoginService;

 

 
 
@RestController
public class LoginController {
@Autowired
    private LoginService userService;
 
                                  
  
 
    @RequestMapping("login")
    public String login(@RequestBody User user ) {
    
     User	 oauthUser = userService.login(user.getUsername(), user.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "success";
    
    
     } else {
     return "failed";
    
    
     }
 
}
    

 
}