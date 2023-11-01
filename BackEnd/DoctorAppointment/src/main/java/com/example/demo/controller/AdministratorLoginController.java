package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Administrator;
import com.example.demo.repository.AdministratorRepository;

import jakarta.servlet.http.HttpSession;

@Controller
public class AdministratorLoginController {
    @Autowired
    private AdministratorRepository administratorRepository;

    @GetMapping("/administratorlogin")
    public String loginPage() {
        return "administratorlogin"; // Assuming you have a JSP file for administrator login
    }

    @GetMapping("/welcomeadministrator")
    public String dashboardPage() {
        return "welcomeadministrator"; // Assuming you have a JSP file for the administrator's dashboard
    }

    @PostMapping("/administratorlogin")
    public String login(@RequestParam String user, @RequestParam String pass, HttpSession session) {
        Administrator administratorFromDB = administratorRepository.findByUsernameAndPassword(user, pass);

        if (administratorFromDB != null) {
            // Authentication successful
            session.setAttribute("loggedInAdministrator", administratorFromDB);
            return "redirect:/welcomeadministrator"; // Redirect to the administrator's dashboard page
        } else {
            // Authentication failed
            return "redirect:/error"; // Administrator login page with an error message
        }
    }
}
