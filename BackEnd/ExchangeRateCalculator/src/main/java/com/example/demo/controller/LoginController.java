package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.entities.AdminDetails;
import com.example.demo.repositories.AdminRepository;
 
import jakarta.servlet.http.HttpSession;
 
@Controller
public class LoginController {
    @Autowired
    private AdminRepository AdminRepository;
    

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }
    @GetMapping("/AdminAccess")
    public String adminPage() {
    	return "AdminAccess";
    }
    @GetMapping("/UserAccess")
    public String userpage() {
    	return "UserAccess";
    }
  
    @PostMapping("/login")
    public String login(@RequestParam String user, @RequestParam String pass, HttpSession session) {
        AdminDetails userFromDB = AdminRepository.findByUsernameAndPassword(user,pass);
       
        if (userFromDB != null) {
            session.setAttribute("loggedInUser", userFromDB);
            return "redirect:/AdminAccess"; 
        } else {
            return "redirect:/UserAccess";
        }
    }
}