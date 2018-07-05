package com.thelxg.controllers;

import com.thelxg.data.Services.*;
import com.thelxg.data.models.features.Feedback;
import com.thelxg.data.models.features.fixtures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Date;
import java.util.List;

/**
 * Created by rex on 24/05/2017.
 */
@Controller
@RequestMapping("/")
public class homeController {

    private final FeedbackService feedbackService;
    private final fixtureService fixtureService;
    private final tableService tableService;
    private final groupsService groupsService;

    @Autowired
    public homeController(fixtureService fixtureService, tableService tableService, groupsService groupsService,
                          FeedbackService feedbackService) {
        this.fixtureService = fixtureService;
        this.tableService = tableService;
        this.groupsService = groupsService;
        this.feedbackService = feedbackService;
    }


    @RequestMapping
    public String homePage(Model model) {

        model.addAttribute("title", "LXG - Home");
        model.addAttribute("feedbackObject", new Feedback());
        return "index";
    }

    @RequestMapping("favicon.ico")
    public String favicon() {
        return "forward:/resources/images/favicon1.ico";
    }

    @RequestMapping("apple-touch-icon")
    public String touchIcon() {
        return "forward:/resources/images/favicon.ico";
    }

    @RequestMapping("/event")
    public String eventDetails(Model model) {

        model.addAttribute("title", "Event Details - LXG' 17");
        return "eventDetails";
    }

    @RequestMapping("/aboutUs")
    public String aboutUs(Model model) {

        model.addAttribute("title", "LXG - about");
        return "aboutUs";
    }

    @GetMapping("/gallery")
    public String showGallery(Model model) {

        model.addAttribute("title", "LXG' 17 - Gallery");
        return "gallery";
    }

    @RequestMapping("/fixtures")
    public String getFixtures(Model model) {

        List<fixtures> fixturesList = fixtureService.getUngeneratedFixtures();
        model.addAttribute("title", "LXG17' - Fixtures");
        model.addAttribute("fixtures", fixturesList);
        return "allFixtures";
    }

    @RequestMapping("/tables")
    public String getTables(Model model) {

        int numberOfGroups = groupsService.getLastGroup().getGroupNumber();

        model.addAttribute("title", "LXG17 - Tables");
        model.addAttribute("numberOfGroups", numberOfGroups);
        model.addAttribute("tables", tableService.getAllTables());
        return "playerTables";
    }

    @PostMapping("/sendFeedback")
    public String sendFeedback(Model model, @ModelAttribute("feedbackObject") Feedback feedback) {

        feedback.setDate(new Date());
        feedbackService.saveFeedback(feedback);
        return "redirect:/";
    }

    @RequestMapping("/knockoutSeed1")
    public String viewKnockoutSeed1() {


        return "KnockoutStages";
    }

    @RequestMapping("/knockoutSeed2")
    public String viewKnockoutSeed2() {


        return "KnockoutStagesSeed2";
    }

    @RequestMapping("/finals")
    public String viewFinalKnockout() {


        return "FinalKnockoutStages";
    }
}
