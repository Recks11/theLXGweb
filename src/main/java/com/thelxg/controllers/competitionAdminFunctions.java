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

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/admin/players")
public class competitionAdminFunctions {

    private final fixtureService fixtureService;
    private final playerService playerService;
    private final groupsAndFixtures groupsAndFixtures;

    @Autowired
    public competitionAdminFunctions(groupsAndFixtures groupsAndFixtures, fixtureService fixtureService, playerService playerService) {
        this.groupsAndFixtures = groupsAndFixtures;
        this.fixtureService = fixtureService;
        this.playerService = playerService;
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

        for(int i = 9;i < 15; i ++) { //iterate through fixtures
            List<player> playerList = playerService.getPlayersInGroup(i);


            for (player play : playerList) {

                groupsAndFixtures.sendFixtureMail(play);
            }
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/fixtures/listEmails")
    public String sendListMail(){

        List<String> list = new ArrayList<String>();
        for(int i = 1;i < 15; i ++) { //iterate through fixtures
            List<player> playerList = playerService.getPlayersInGroup(i);


            for (player play : playerList) {

                list.add("Full Name: "+play.getFullName()+"- Alias: "+play.getAlias()+ " Club: "+ play.getTeamSelected() +"\n");
                System.out.println(play.getEmail()+"\n");
            }
        }

        System.out.println(list);
        return "admin/pages/generateFixtures";
    }

    @GetMapping("/fixtures/getFixtures")
    public String sendFixtures(){
        List<String> scoreList = new ArrayList<String>();
        List<fixtures> fixturesList = new ArrayList<fixtures>();

        for (fixtures fixture : fixturesList){
            scoreList.add(fixture.viewScore());
        }

        System.out.println(scoreList);
        return "admin/pages/generateFixtures";
    }

}
