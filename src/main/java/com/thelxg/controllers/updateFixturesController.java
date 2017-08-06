package com.thelxg.controllers;

import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.groupsService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.Services.tableService;
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

    private final fixtureService fixturesService;
    private final groupsService groupService;
    private final playerService player;
    private final tableService tableService;

    @Autowired
    public updateFixturesController(fixtureService fixturesService, groupsService groupService, playerService player, tableService tableService) {
        this.fixturesService = fixturesService;
        this.groupService = groupService;
        this.player = player;
        this.tableService = tableService;
    }

    /*
    * @TODO
    * make fixtures get data by time
    * that is fixtureService.getFixturesByMatchTime;
    * */
    int start = 0;
    int  end = 0;
    @RequestMapping("/fixtures/{startFixtureNumber}/{endFixtureNumber}")
    public String getFixtures(Model model,
                              @PathVariable("startFixtureNumber") int startFixtureNumber,
                              @PathVariable("endFixtureNumber") int endFixtureNumber){

        this.start = startFixtureNumber;
        this.end = endFixtureNumber;

        List<fixtures> fixturesList = new ArrayList<fixtures>();
        for(int i = startFixtureNumber; i <= endFixtureNumber; i ++ ){


            List<fixtures> listOfFixtures = fixturesService.getUngeneratedFixturesByGroupNumber(Integer.toString(i));
            fixturesList.addAll(listOfFixtures);
        }

        model.addAttribute("fixtures", fixturesList);
        model.addAttribute("fixtureObject", new fixtures());

        return "admin/pages/adminFixtures";
    }

    @PostMapping("/change.score")
    public String updateScore(Model model, @ModelAttribute("fixtureObject") fixtures fixture){

        String start = Integer.toString(this.start);
        System.out.println("Data added: "+fixture.toString());
        fixtures updatedFixture = fixturesService.getFixturesById(fixture.getId());
        updatedFixture.setHomeScore(fixture.getHomeScore());
        updatedFixture.setAwayScore(fixture.getAwayScore());
        fixturesService.updateFixture(updatedFixture);
        System.out.println(updatedFixture);

        int end = Integer.parseInt(updatedFixture.getGroup());
        int actual = Integer.parseInt(updatedFixture.getGroup());
        this.start = actual;
        this.end = end;
        return "redirect:/admin/competition/fixtures/"+actual+"/"+end;
    }

    @GetMapping("/done/{fixtureId}")
    public String done(@PathVariable("fixtureId") long fixtureId){

        tableService.generateTableForFixture(fixtureId);
        return "redirect:/admin/competition/fixtures/"+start+"/"+end;
    }
}
