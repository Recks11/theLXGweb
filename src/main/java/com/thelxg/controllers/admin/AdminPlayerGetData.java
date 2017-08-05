package com.thelxg.controllers.admin;

import com.thelxg.components.groupsAndFixtures;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.Services.tableService;
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
@RequestMapping("/admin/players/getData")
public class AdminPlayerGetData {

    @Autowired
    private tableService tableService;
    private final fixtureService fixtureService;
    private final playerService playerService;
    private final groupsAndFixtures groupsAndFixtures;

    @Autowired
    public AdminPlayerGetData(groupsAndFixtures groupsAndFixtures, fixtureService fixtureService, playerService playerService) {
        this.groupsAndFixtures = groupsAndFixtures;
        this.fixtureService = fixtureService;
        this.playerService = playerService;
    }

    @RequestMapping("/")
    public String fixtures(Model model){

        model.addAttribute("playerList", "unfetched");

        model.addAttribute("groupListStatus", "groups not generated");
        return "admin/pages/generateFixtures";
    }

    @GetMapping("/generate")
    public String generateFixtures(Model model){

        if(groupsAndFixtures.generateFixtures()){
            System.out.println("fixtures generated");
        }else{
            model.addAttribute("playerList","empty or odd number");
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/generateGroup")
    public String generateGroups(Model model){

        if(groupsAndFixtures.generateGroups()){
            model.addAttribute("groupListStatus", "groups generated");
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/sendMailForMorningGroup")
    public String sendFixtureMail(){

        for(int i = 1;i < 5; i ++) {
            List<player> playerList = playerService.getPlayersInGroup(i);


            for (player play : playerList) {

                groupsAndFixtures.sendFixtureMail(play);
            }
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/sendMailForEveningGroup")
    public String sendAgainFixtureMail(){

        for(int i = 9;i < 15; i ++) { //iterate through fixtures
            List<player> playerList = playerService.getPlayersInGroup(i);


            for (player play : playerList) {

                groupsAndFixtures.sendFixtureMail(play);
            }
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/listEmails")
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

    @GetMapping("/getFixtures")
    public String sendFixtures(){
        List<String> scoreList = new ArrayList<String>();
        List<fixtures> fixturesList = fixtureService.getAllFixtures();

        for (fixtures fixture : fixturesList){
            scoreList.add(fixture.viewFixture());
        }

        System.out.println(scoreList);
        return "admin/pages/generateFixtures";
    }


    @GetMapping("/changeTeam")
    public String changeTeam(Model model){

        return "redirect:/admin/players/all";
    }

    @GetMapping("/generateTables")
    public String generateTables(){
        List<player> playerList = playerService.getAllPlayersNotInTable();

        for(player player : playerList){
            tableService.addPlayerToTable(player);
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/duplicateFixtures")
    public String Duplicatefixtures() {
        List<fixtures> fixturesList = fixtureService.getUnDuplicatedFixtures();

        for (fixtures fixtures : fixturesList) {
            String homeTeam = fixtures.getHomeTeam();
            String awayTeam = fixtures.getAwayTeam();
            String homePlayer = fixtures.getHomePlayer();
            String awayPlayer = fixtures.getAwayPlayer();

            fixtures.setHomeTeam(awayTeam);
            fixtures.setAwayTeam(homeTeam);
            fixtures.setHomePlayer(awayPlayer);
            fixtures.setAwayPlayer(homePlayer);

            fixtureService.saveFixture(fixtures);

        }
        return "admin/pages/generateFixtures";
    }

}
