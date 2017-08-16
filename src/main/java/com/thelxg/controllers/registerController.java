package com.thelxg.controllers;

import com.thelxg.components.impl.SavePlayerAndSendMailImpl;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rex on 26/05/2017.
 */
@Controller
@RequestMapping("/enter")
public class registerController {

    private final SavePlayerAndSendMailImpl saveAndSendMail;
    private final playerService playerService;
    private final player playerBean;

    @Autowired
    public registerController(player playerBean, playerService playerService, SavePlayerAndSendMailImpl saveAndSendMail) {
        this.playerBean = playerBean;
        this.playerService = playerService;
        this.saveAndSendMail = saveAndSendMail;
    }


    @RequestMapping
    public String register(Model model){

        model.addAttribute("title","Register - TheLXG");
        model.addAttribute("playerObject", playerBean);
        return "redirect:/enter/registrationClosed";
    }

    @RequestMapping("/registrationClosed")
    public String registrationClosedPage(Model model){

        model.addAttribute("title","Closed - TheLXG");
        return "registrationClosed";
    }

    @PostMapping("/")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String registerPlayer(@RequestBody player play){

        play.setFixtureGenerated("no");
        saveAndSendMail.savePlayer(play);
        return "index";
    }

    @RequestMapping("/rest")
    public @ResponseBody String restSetviec(@ModelAttribute("playerObject")player play, HttpServletRequest request){
        System.out.println( request.toString());
        System.out.println(play.toString());

        return play.toString();
    }
    @RequestMapping("/registrationCenters")
    public String registrationCenters(Model model){
        model.addAttribute("title","Locations - TheLXG");
        return "registrationCenters";
    }
    @RequestMapping("/check-reg@theLXG")
    public String checkReg( Model model){

        model.addAttribute("numberReg", playerService.getAllPlayers().size());
        return "checkReg";

    }

    @ModelAttribute("locationList")
    public List<String> getWebFrameworkList() {
        List<String> locationList = new ArrayList<String>();
        locationList.add("Lagos Island");
        locationList.add("Lagos Mainland");

        return locationList;
    }

//    @ModelAttribute
//    public void addTeams(Model model){
//
//        List<teams> englishTeams = teamService.getTeamByRegion("ENG");
//        List<teams> frenchTeams = teamService.getTeamByRegion("FRA");
//        List<teams> italianTeams = teamService.getTeamByRegion("ITA");
//        List<teams> germanTeams = teamService.getTeamByRegion("GER");
//        List<teams> spanishTeams = teamService.getTeamByRegion("SPA");
//
//        model.addAttribute("englishTeams",englishTeams);
//        model.addAttribute("frenchTeams",frenchTeams);
//        model.addAttribute("germanTeams",germanTeams);
//        model.addAttribute("italianTeams",italianTeams);
//        model.addAttribute("spanishTeams",spanishTeams);
//    }
}