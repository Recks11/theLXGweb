package com.thelxg.controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.thelxg.data.Services.*;
import com.thelxg.data.models.features.KnockoutScore;
import com.thelxg.data.models.features.fixtures;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/admin/competition")
public class updateFixturesController {

    private final KnockoutScoreService knockoutScoreService;
    private final fixtureService fixturesService;
    private final groupsService groupService;
    private final playerService player;
    private final tableService tableService;

    @Autowired
    public updateFixturesController(fixtureService fixturesService, groupsService groupService, playerService player, tableService tableService, KnockoutScoreService knockoutScoreService) {
        this.fixturesService = fixturesService;
        this.groupService = groupService;
        this.player = player;
        this.tableService = tableService;
        this.knockoutScoreService = knockoutScoreService;
    }

    /*
    * @TODO
    * make fixtures get data by time
    * that is fixtureService.getFixturesByMatchTime;
    * */
    int start = 0;
    int end = 0;

    @RequestMapping("/fixtures/{startFixtureNumber}/{endFixtureNumber}")
    public String getFixtures(Model model,
                              @PathVariable("startFixtureNumber") int startFixtureNumber,
                              @PathVariable("endFixtureNumber") int endFixtureNumber) {

        this.start = startFixtureNumber;
        this.end = endFixtureNumber;

        List<fixtures> fixturesList = new ArrayList<fixtures>();
        for (int i = startFixtureNumber; i <= endFixtureNumber; i++) {


            List<fixtures> listOfFixtures = fixturesService.getUngeneratedFixturesByGroupNumber(Integer.toString(i));
            fixturesList.addAll(listOfFixtures);
        }

        model.addAttribute("fixtures", fixturesList);
        model.addAttribute("fixtureObject", new fixtures());

        return "admin/pages/adminFixtures";
    }

    @PostMapping("/change.score")
    public String updateScore(Model model, @ModelAttribute("fixtureObject") fixtures fixture) {

        String start = Integer.toString(this.start);
        System.out.println("Data added: " + fixture.toString());
        fixtures updatedFixture = fixturesService.getFixturesById(fixture.getId());
        updatedFixture.setHomeScore(fixture.getHomeScore());
        updatedFixture.setAwayScore(fixture.getAwayScore());
        fixturesService.updateFixture(updatedFixture);
        System.out.println(updatedFixture);

        int end = Integer.parseInt(updatedFixture.getGroup());
        int actual = Integer.parseInt(updatedFixture.getGroup());

        return "redirect:/admin/competition/fixtures/" + actual + "/" + end;
    }

    @GetMapping("/fixtures/knockout/{startFixtureNumber}")
    public String showKnockoutScores(Model model,
                                     @PathVariable("startFixtureNumber") int startFixtureNumber){

        model.addAttribute("knockoutFixture",knockoutScoreService.getScoresByRound(startFixtureNumber));
        model.addAttribute("knockoutObject", new KnockoutScore());
        return "admin/pages/adminKnockout";
    }

    @PostMapping("/knock.Score")
    public String updateKnockoutScore(Model model,
                                      @ModelAttribute("knockoutObject") KnockoutScore knockoutMatchScore) {

        System.out.println(knockoutMatchScore.toString());
        KnockoutScore score = knockoutScoreService.getScoreById(knockoutMatchScore.getId());
        score.setAwayScore(knockoutMatchScore.getAwayScore());
        score.setHomeScore(knockoutMatchScore.getHomeScore());
        knockoutScoreService.updateScore(score);

//        return "admin/pages/adminKnockout";
        return "redirect:/admin/competition/fixtures/knockout/" + score.getRoundNumber();
    }

    @GetMapping("/done/{fixtureId}")
    public String done(@PathVariable("fixtureId") long fixtureId) {

        tableService.generateTableForFixture(fixtureId);
        return "redirect:/admin/competition/fixtures/" + start + "/" + end;
    }

    @GetMapping("/results")
    public String getResults(Model model){


        model.addAttribute("fixtures", fixturesService.getFixturesWithTableGenerated());
        return "admin/pages/adminResults";
    }
}
