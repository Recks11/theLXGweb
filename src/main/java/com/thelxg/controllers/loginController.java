package com.thelxg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by rex on 30/06/2017.
 */
@Controller
public class loginController {


    @RequestMapping("/login")
    public String login(@RequestParam(value="error", required = false)String error,
                        @RequestParam(value="logout", required = false)String logout,
                        Model model){

        if(error != null){
            model.addAttribute("error", "invalid username or password");
        }

        if(logout != null){
            model.addAttribute("message","You have been logged out");
        }

        return "login";
    }
}
