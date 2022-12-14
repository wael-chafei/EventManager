package com.example.demo.controller;
 
import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Vector;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.User;
import com.example.demo.service.LoginService;

 

 
 
@RestController
public class LoginController<E> {
@Autowired
    private LoginService userService;
 
                                  
  
 
    @RequestMapping("login")
    public Vector<User> login(@RequestBody User user ) {
    
     User	 oauthUser = userService.login(user.getUsername(), user.getPassword());
     Vector<User> tab = new Vector<User>();
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
    	tab.addElement(oauthUser); 
  
     return tab;
    
    
     } else {
     return tab;
    
    
     }
 
}
    

 
}