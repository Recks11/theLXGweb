package com.thelxg.controllers;

import com.thelxg.components.groupsAndFixtures;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.features.fixtures;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/admin/players")
public class competitionAdminFunctions {

    @Autowired
    private fixtureService fixtureService;
    @Autowired
    private playerService playerService;
    private final groupsAndFixtures groupsAndFixtures;

    @Autowired
    public competitionAdminFunctions(groupsAndFixtures groupsAndFixtures) {
        this.groupsAndFixtures = groupsAndFixtures;
    }

    @RequestMapping("/fixtures")
    public String fixtures(Model model){

        model.addAttribute("playerList", "unfetched");

        model.addAttribute("groupListStatus", "groups not generated");
        return "admin/pages/generateFixtures";
    }

    @GetMapping("/fixtures/generate")
    public String generateFixtures(Model model){

        if(groupsAndFixtures.generateFixtures()){
            System.out.println("fixtures generated");
        }else{
            model.addAttribute("playerList","empty or odd number");
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/fixtures/generateGroup")
    public String generateGroups(Model model){

        if(groupsAndFixtures.generateGroups()){
            model.addAttribute("groupListStatus", "groups generated");
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/fixtures/sendMailForMorningGroup")
    public String sendFixtureMail(){

        for(int i = 1;i < 5; i ++) {
            List<player> playerList = playerService.getPlayersInGroup(i);


            for (player play : playerList) {

                groupsAndFixtures.sendFixtureMail(play);
            }
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/fixtures/sendMailForEveningGroup")
    public String sendAgainFixtureMail(){

        for(int i = 5;i < 9; i ++) { //iterate through fixtures
            List<player> playerList = playerService.getPlayersInGroup(i);


            for (player play : playerList) {

                groupsAndFixtures.sendFixtureMail(play);
            }
        }

        return "admin/pages/generateFixtures";
    }

}
