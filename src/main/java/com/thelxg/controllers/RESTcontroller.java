package com.thelxg.controllers;

import com.thelxg.components.KnockOutApiService;
import com.thelxg.data.Services.KnockoutScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTcontroller {

    private final KnockOutApiService knockOutApiService;

    @Autowired
    public RESTcontroller(KnockOutApiService knockOutApiService) {
        this.knockOutApiService = knockOutApiService;
    }

    @RequestMapping( value = "/Seed1ScoreAPI", produces = "application/json")
    @ResponseBody
    public String seed2ScoreApi(){

        String players = "   [\"Ose_ (Manchester United)\", \"Mr. Micheal (Manchester United)\"],\n" +
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

    @RequestMapping( value = "/FinalScoreAPI", produces = "application/json")
    @ResponseBody
    public String FinalScoreApi(){

        String players ="[\"godMC (Juventus)\" , \"obinna1231 (Barcelona)\"],\n" +
                "[\"Ify30 (real Madrid)\" , \"The Brazilian (Barcelona)\"],\n" +
                "[\"Magnanimous (Real Madrid)\" , \"KayJay (real Madrid)\"],\n" +
                "[\"Mr_Oga (Bayern Munchen)\" , \"Bugatti (Liverpool)\"]";


        return knockOutApiService.GetFinalsScoresApi(11,12,13, players);
    }



}
