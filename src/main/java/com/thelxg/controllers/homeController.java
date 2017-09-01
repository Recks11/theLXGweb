package com.thelxg.controllers;

import com.thelxg.components.KnockOutApiService;
import com.thelxg.data.Dao.FeedbackDao;
import com.thelxg.data.Services.*;
import com.thelxg.data.models.features.Feedback;
import com.thelxg.data.models.features.KnockoutScore;
import com.thelxg.data.models.features.fixtures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rex on 24/05/2017.
 */
@Controller
@RequestMapping("/")
public class homeController {

    private final FeedbackService feedbackService;
    private final KnockOutApiService knockOutApiService;
    private final KnockoutScoreService knockoutScoreService;
    private final fixtureService fixtureService;
    private final tableService tableService;
    private final groupsService groupsService;

    @Autowired
    public homeController(fixtureService fixtureService, tableService tableService, groupsService groupsService,
                          FeedbackService feedbackService, KnockOutApiService knockOutApiService, KnockoutScoreService knockoutScoreService) {
        this.fixtureService = fixtureService;
        this.tableService = tableService;
        this.groupsService = groupsService;
        this.feedbackService = feedbackService;
        this.knockOutApiService = knockOutApiService;
        this.knockoutScoreService = knockoutScoreService;
    }


    @RequestMapping
    public String homePage(Model model){

        model.addAttribute("title", "Home - LXG17");
        model.addAttribute("feedbackObject", new Feedback());
        return "index";
    }

    @RequestMapping("favicon.ico")
    public String favicon() {
        return "forward:/resources/images/favicon.ico";
    }

    @RequestMapping("/event")
    public String eventDetails(Model model){

        model.addAttribute("title", "Event Details - LXG17");
        return "eventDetails";
    }
    @RequestMapping("/aboutUs")
    public String aboutUs(Model model){

        model.addAttribute("title", "LXG17' - about");
        return "aboutUs";
    }
    @GetMapping("/gallery")
    public String showGallery(Model model){

        model.addAttribute("title", "LXG17' - Gallery");
        return "gallery";
    }

    @RequestMapping("/fixtures")
    public String getFixtures(Model model){

        List<fixtures> fixturesList = fixtureService.getUngeneratedFixtures();
        model.addAttribute("title", "LXG17' - Fixtures");
        model.addAttribute("fixtures",fixturesList);
        return "allFixtures";
    }

    @RequestMapping("/tables")
    public String getTables(Model model){

        int numberOfGroups = groupsService.getLastGroup().getGroupNumber();

        model.addAttribute("title", "LXG17 - Tables");
        model.addAttribute("numberOfGroups", numberOfGroups);
        model.addAttribute("tables",tableService.getAllTables());
        return "playerTables";
    }

    @PostMapping("/sendFeedback")
    public String sendFeedback(Model model, @ModelAttribute("feedbackObject") Feedback feedback){

        feedback.setDate(new Date());
        feedbackService.saveFeedback(feedback);
        return "redirect:/";
    }

    @RequestMapping("/knockoutSeed1")
    public String viewKnockoutSeed1(){


        return "KnockoutStages";
    }

    @RequestMapping("/knockoutSeed2")
    public String viewKnockoutSeed2(){


        return "KnockoutStagesSeed2";
    }

    @RequestMapping( value = "/Seed1ScoreAPI", produces = "application/json")
    @ResponseBody
    public String seed2ScoreApi(){

        String players = "            [\"Ose_ (Manchester United)\", \"Mr. Micheal (Manchester United)\"],\n" +
                "            [\"Jayblingz (Manchester United)\", \"OTIS101 (Manchester United)\"],\n" +
                "            [\"Eze_ (Real Madrid)\", \"godMC (Juventus)\"],\n" +
                "            [\"Mr. chuck (Juventus)\", \"Phelps (Bayern Munich)\"],\n" +
                "            [\"Sage The Alien (Chelsea)\", \"Drakkanoir (Bayern Munich)\"],\n" +
                "            [\"Don AJ (Real madrid)\", \"Malieq (chelsea)\"],\n" +
                "            [\"Richdom 619 (Manchester United)\", \"Obinna 1231 (Barcelona)\"],\n" +
                "            [\"Radi (Juventus)\", \"Iykee_ (Bayern Munich)\"],\n" +
                "            [\"Dipo (Real madrid)\", \"Mysterious (Chelsea)\"],\n" +
                "            [\"Lord mo_ (Chelsea)\", \"The black dean (Bayern Munich)\"],\n" +
                "            [\"Derek_misfits (Barcelona)\", \"King Josh (Manchester United)\"],\n" +
                "            [\"Gunju (Barcelona)\", \"ify 30 (real Madrid)\"],\n" +
                "            [\"Courage (Bayern Munchen)\", \"The Brazillian (Barcelona)\"],\n" +
                "            [\"Taheewobarca (Barcelona)\", \"Clint (Real Madrid)\"],\n" +
                "            [\"Dewaleofficial (chelsea)\", \"A-boy (Real Madrid)\"],\n" +
                "            [\"Finian (Chelsea)\", \"Sly_14 (Real madrid)\"]\n";

        return knockOutApiService.GetScoresApi(1,2,3,4,5,players);
    }

    @RequestMapping( value = "/Seed2ScoreAPI", produces = "application/json")
    @ResponseBody
    public String seed3ScoreApi(){

       String players = "[\"DD DOX (Bayern Munchen)\",\"Stevonchy (Real Madrid)\"],\n" +
               "  [\"Mo_jnr (Chelsea)\",\"Ayenibolt (real madrid)\"],\n" +
               "  [\"BoxRay 19 (Juventus)\",\"Tao20(Real madrid)\"],\n" +
               "  [\"Magnanimous (Real Madrid)\",\"#Greyharrison (Barcelona)\"],\n" +
               "  [\"Great ndidi (Real Madrid)\",\"Imperator (Real Madrid)\"],\n" +
               "  [\"Eazzie_J (Barcelona)\",\"Ayo.ak (Manchester United)\"],\n" +
               "  [\"Sir Maff (Arsenal)\",\"David01 (Bayern Munchen)\"],\n" +
               "  [\"Iamdamilare (Real madrid)\",\"Kayjay (real Madrid)\"],\n" +
               "  [\"Daniel (Bayern Munchen)\",\"Jaydikoh (Manchester United)\"],\n" +
               "  [\"Folk da one (Bayern Munchen)\",\"Dipps the Baba (Manchester United)\"],\n" +
               "  [\"Mr. Oga (Bayern Munchen)\",\"The_arogs (Real Madrid)\"],\n" +
               "  [\"Gbovo (Manchester United)\",\"Michelwizzy123 (Real Madrid)\"],\n" +
               "  [\"Bugatti (Liverpool)\",\"Regnum044 (Real Madrid)\"],\n" +
               "  [\"Lems (Real Madrid)\",\"Chi (Juventus)\"],\n" +
               "  [\"Still_drew_ (Real Madrid)\",\"Malieq (chelsea)\"],\n" +
               "  [\"Donald_e (FC Barcelona)\",\"roga_roga (Chelsea)\"]\n";


        return knockOutApiService.GetScoresApi(6,7,8,9,10,players);
    }
}
