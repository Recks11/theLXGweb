package com.thelxg.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rex on 24/05/2017.
 */
@Controller
@RequestMapping("/")
public class homeController {


    @RequestMapping
    public String homePage(Model model){

        model.addAttribute("title", "Home - TheLXG");
        return "index";
    }

    @RequestMapping("favicon.ico")
    public String favicon() {
        return "forward:/resources/images/favicon.ico";
    }
    @RequestMapping("/event")
    public String eventDetails(){

        return "eventDetails";
    }
}
