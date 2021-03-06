package com.thelxg.controllers.admin;

import com.thelxg.components.groupsAndFixtures;
import com.thelxg.data.Services.KnockoutScoreService;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.Services.tableService;
import com.thelxg.data.models.Player;
import com.thelxg.data.models.features.KnockoutScore;
import com.thelxg.data.models.features.fixtures;
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

    private final KnockoutScoreService knockoutScoreService;
    private final tableService tableService;
    private final fixtureService fixtureService;
    private final playerService playerService;
    private final groupsAndFixtures groupsAndFixtures;

    @Autowired
    public AdminPlayerGetData(groupsAndFixtures groupsAndFixtures, fixtureService fixtureService, playerService playerService, tableService tableService, KnockoutScoreService knockoutScoreService) {
        this.groupsAndFixtures = groupsAndFixtures;
        this.fixtureService = fixtureService;
        this.playerService = playerService;
        this.tableService = tableService;
        this.knockoutScoreService = knockoutScoreService;
    }

    @RequestMapping("/")
    public String fixtures(Model model) {

        model.addAttribute("style", "danger");

        model.addAttribute("playerList", "unfetched");

        model.addAttribute("groupListStatus", "groups not generated");
        return "admin/pages/generateFixtures";
    }

    @GetMapping("/generate")
    public String generateFixtures(Model model) {

        if (groupsAndFixtures.generateFixtures()) {
            System.out.println("fixtures generated");
        } else {
            model.addAttribute("playerList", "empty or odd number");
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/generateGroup")
    public String generateGroups(Model model) {

        if (groupsAndFixtures.generateGroups()) {
            model.addAttribute("groupListStatus", "groups generated");
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/sendMailForMorningGroup")
    public String sendFixtureMail() {

        for (int i = 22; i < 28; i++) {
            List<Player> playerList = playerService.getPlayersInGroup(i);


            for (Player play : playerList) {

                groupsAndFixtures.sendFixtureMail(play);
            }
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/sendMailForEveningGroup")
    public String sendAgainFixtureMail() {

        for (int i = 15; i <= 21; i++) { //iterate through fixtures
            List<Player> playerList = playerService.getPlayersInGroup(i);


            for (Player play : playerList) {

                groupsAndFixtures.sendFixtureMail(play);
            }
        }

        return "admin/pages/generateFixtures";
    }

    @GetMapping("/listEmails")
    public String sendListMail() {

        List<String> list = new ArrayList<String>();
        for (int i = 22; i < 28; i++) { //iterate through fixtures
            List<Player> playerList = playerService.getPlayersInGroup(i);


            for (Player play : playerList) {

//                list.add("Full Name: "+play.getFullName()+"- Alias: "+play.getAlias()+ " Club: "+ play.getTeamSelected() +"\n");
                list.add("E mail: " + play.getEmail() + ",\n");
                System.out.println(play.getEmail() + "\n");
            }
        }

        System.out.println(list);
        return "admin/pages/generateFixtures";
    }

    @GetMapping("/getFixtures")
    public String sendFixtures() {
        List<String> scoreList = new ArrayList<String>();
        List<fixtures> fixturesList = fixtureService.getAllFixtures();

        for (fixtures fixture : fixturesList) {
            scoreList.add(fixture.viewFixture());
        }

        System.out.println(scoreList);
        return "admin/pages/generateFixtures";
    }


    @GetMapping("/changeTeam")
    public String changeTeam(Model model) {

        return "redirect:/admin/players/all";
    }

    @GetMapping("/generateTables")
    public String generateTables() {
        List<Player> playerList = playerService.getAllPlayersNotInTable();

        for (Player player : playerList) {
            tableService.addPlayerToTable(player);
            player.setInTables(true);
            playerService.updatePlayer(player);
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

    @GetMapping("/updateTableData")
    public String updateTable() {

        List<fixtures> fixturesList = fixtureService.getUpdatedFixtures();

        for (fixtures fixture : fixturesList) {
            tableService.generateTableForFixture(fixture.getId());
        }
        return "admin/pages/generateFixtures";
    }

    @GetMapping("/createKnockoutFixtures")
    public String createKnockoutFixtures(Model model) {

        KnockoutScore knockoutScore = new KnockoutScore(0, 0, 0, 0);

        for (int i = 1; i <= 16; i++) {
            knockoutScore.setRoundNumber(1);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(6);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(11);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);
        }

        for (int i = 1; i <= 8; i++) {
            knockoutScore.setRoundNumber(2);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(7);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(12);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);
        }

        for (int i = 1; i <= 4; i++) {
            knockoutScore.setRoundNumber(3);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(8);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(13);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);
        }

        for (int i = 1; i <= 2; i++) {
            knockoutScore.setRoundNumber(4);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(9);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);

            knockoutScore.setRoundNumber(14);
            knockoutScore.setScoreHeirachy(i);
            knockoutScoreService.saveScore(knockoutScore);
        }

        knockoutScore.setRoundNumber(5);
        knockoutScore.setScoreHeirachy(1);
        knockoutScoreService.saveScore(knockoutScore);

        knockoutScore.setRoundNumber(10);
        knockoutScore.setScoreHeirachy(1);
        knockoutScoreService.saveScore(knockoutScore);

        knockoutScore.setRoundNumber(15);
        knockoutScore.setScoreHeirachy(1);
        knockoutScoreService.saveScore(knockoutScore);

        model.addAttribute("style", "success");


        return "admin/pages/generateFixtures";
    }


}
