package com.thelxg.controllers;

import com.thelxg.components.KnockOutApiService;
import com.thelxg.data.Services.KnockoutScoreService;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.groupsService;
import com.thelxg.data.Services.tableService;
import com.thelxg.data.models.features.KnockoutScore;
import com.thelxg.data.models.features.fixtures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by rex on 24/05/2017.
 */
@Controller
@RequestMapping("/")
public class homeController {

    @Autowired
    private KnockOutApiService knockOutApiService;
    @Autowired
    private KnockoutScoreService knockoutScoreService;
    private final fixtureService fixtureService;
    private final tableService tableService;
    private final groupsService groupsService;

    @Autowired
    public homeController(fixtureService fixtureService, tableService tableService, groupsService groupsService) {
        this.fixtureService = fixtureService;
        this.tableService = tableService;
        this.groupsService = groupsService;
    }


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

        List<fixtures> fixturesList = fixtureService.getUngeneratedFixtures();
        model.addAttribute("title", "TheLXG - Fixtures");
        model.addAttribute("fixtures",fixturesList);
        return "allFixtures";
    }

    @RequestMapping("/tables")
    public String getTables(Model model){

        int numberOfGroups = groupsService.getLastGroup().getGroupNumber();

        model.addAttribute("title", "TheLXG - Tables");
        model.addAttribute("numberOfGroups", numberOfGroups);
        model.addAttribute("tables",tableService.getAllTables());
        return "playerTables";
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
                "            [\"Courage (Bayern Munich)\", \"The Brazillian (Barcelona)\"],\n" +
                "            [\"Taheewobarca (Barcelona)\", \"Clint (Real Madrid)\"],\n" +
                "            [\"Dewaleofficial (chelsea)\", \"A-boy (Real Madrid)\"],\n" +
                "            [\"Finian (Chelsea)\", \"Sly_14 (Real madrid)\"]\n";

        return knockOutApiService.GetScoresApi(1,2,3,4,5,players);
    }

    @RequestMapping( value = "/Seed2ScoreAPI", produces = "application/json")
    @ResponseBody
    public String seed3ScoreApi(){

       String players = "[\"DD DOX (Bayern Muich)\",\"Stevonchy (Real Madrid)\"],\n" +
               "  [\"Mo_jnr (Chelsea)\",\"Ayenibolt (real madrid)\"],\n" +
               "  [\"BoxRay 19 (Juventus)\",\"Tao20(realmadrid)\"],\n" +
               "  [\"Magnanimous (Real Madrid)\",\"#Greyharrison (Barcelona)\"],\n" +
               "  [\"Great ndidi (real Madrid)\",\"Imperator (Real Madrid)\"],\n" +
               "  [\"Eazzie_J (Barcelona)\",\"Ayo.ak (Manchester United)\"],\n" +
               "  [\"Sir Maff (Arsenal)\",\"David01 (Bayern Munich)\"],\n" +
               "  [\"Iamdamilare (Real madrid)\",\"Kayjay (real Madrid)\"],\n" +
               "  [\"Daniel (Bayern Munich)\",\"Jaydikoh (Manchester United)\"],\n" +
               "  [\"Folk da one (Bayern Munich)\",\"Dipps the Baba (Manchester United)\"],\n" +
               "  [\"Mr. Oga (Bayern Munich)\",\"The_arogs (Real Madrid)\"],\n" +
               "  [\"Gbovo (Manchester United)\",\"Michelwizzy123 (Real Madrid)\"],\n" +
               "  [\"Bugatti (Liverpool)\",\"Regnum044 (Real Madrid)\"],\n" +
               "  [\"Lems (Real Madrid)\",\"Chi (Juventus)\"],\n" +
               "  [\"Still_drew_ (Real Madrid)\",\"bensonladi87 (Juventus)\"],\n" +
               "  [\"Donald_e (FC Barcelona)\",\"roga_roga (Chelsea)\"]\n";


        return knockOutApiService.GetScoresApi(6,7,8,9,10,players);
    }
}
