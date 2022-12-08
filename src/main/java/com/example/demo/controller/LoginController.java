package com.example.demo.controller;
 
import java.util.Objects;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entities.Login;
import com.example.demo.service.LoginService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
 

 
 
@RestController
public class LoginController {
@Autowired
    private LoginService userService;
 
                                  
  
 
    @RequestMapping("login")
    public String login(@RequestBody Login user ) {
    
     Login oauthUser = userService.login(user.getUsername(), user.getPassword());
    
 
     System.out.print(oauthUser);
     if(Objects.nonNull(oauthUser))
     {
  
     return "success";
    
    
     } else {
     return "failed";
    
    
     }
 
}
    
    @RequestMapping(value = {"/logout"}, method = RequestMethod.POST)
    public String logoutDo(HttpServletRequest request,HttpServletResponse response)
    {
    
  
        return "redirect:/login";
    }
 
}