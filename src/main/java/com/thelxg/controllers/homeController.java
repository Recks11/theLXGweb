package com.thelxg.controllers;

import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.models.features.fixtures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rex on 24/05/2017.
 */
@Controller
@RequestMapping("/")
public class homeController {

    @Autowired
    private fixtureService fixtureService;


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
    public String eventDetails(Model model){

        model.addAttribute("title", "Event Details - TheLXG");
        return "eventDetails";
    }
    @RequestMapping("/aboutUs")
    public String aboutUs(Model model){

        model.addAttribute("title", "TheLXG - about");
        return "aboutUs";
    }

    @RequestMapping("/fixtures")
    public String getFixtures(Model model){

        List<fixtures> fixturesList = fixtureService.getAllFixtures();
        model.addAttribute("title", "TheLXG - Fixtures");
        model.addAttribute("fixtures",fixturesList);
        return "allPlayers";
    }
}
