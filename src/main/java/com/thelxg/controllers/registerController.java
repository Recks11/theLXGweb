package com.thelxg.controllers;

import com.thelxg.data.Services.playerService;
import com.thelxg.data.Services.sendNotification;
import com.thelxg.data.Services.teamsService;
import com.thelxg.data.models.components.e_mail_Message;
import com.thelxg.data.models.player;
import com.thelxg.data.models.teams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by rex on 26/05/2017.
 */
@Controller
@RequestMapping("/enter")
public class registerController {

    private final sendNotification notification;
    private final teamsService teamService;
    private final playerService playerService;
    private final player playerBean;

    @Autowired
    public registerController(player playerBean, playerService playerService, teamsService teamService, sendNotification notification) {
        this.playerBean = playerBean;
        this.playerService = playerService;
        this.teamService = teamService;
        this.notification = notification;
    }


    @RequestMapping("/")
    public String register(Model model){

        model.addAttribute("title","Register - TheLXG");
        model.addAttribute("playerObject", playerBean);
        return "register";
    }

    @PostMapping("/")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String registerPlayer(@RequestBody player play){

        e_mail_Message e_mail = new e_mail_Message();
        e_mail.setMessage(play);/*sets player Object mail is sent to and embeds details to message.*/
        //String fullName = play.getFirstName()+" "+ play.getLastName();
        Date date = new Date();
        play.setDate(date);
        playerService.addPlayer(play);
        notification.sendEmail(play, e_mail);

        return "index";
    }

    @RequestMapping("/rest")
    public @ResponseBody String restSetviec(@ModelAttribute("playerObject")player play, HttpServletRequest request){
        System.out.println( request.toString());
        System.out.println(play.toString());

        return play.toString();


    }

    @ModelAttribute("locationList")
    public List<String> getWebFrameworkList() {
        List<String> locationList = new ArrayList<String>();
        locationList.add("Lagos Island");
        locationList.add("Lagos Mainland");

        return locationList;
    }
    @ModelAttribute("amountPay")
    public String setPayAmount(){
        //2 thousand naira in kobo
        return "200000";
    }


    @ModelAttribute
    public void addTeams(Model model){

        List<teams> englishTeams = teamService.getTeamByRegion("ENG");
        List<teams> frenchTeams = teamService.getTeamByRegion("FRA");
        List<teams> italianTeams = teamService.getTeamByRegion("ITA");
        List<teams> germanTeams = teamService.getTeamByRegion("GER");
        List<teams> spanishTeams = teamService.getTeamByRegion("SPA");

        model.addAttribute("englishTeams",englishTeams);
        model.addAttribute("frenchTeams",frenchTeams);
        model.addAttribute("germanTeams",germanTeams);
        model.addAttribute("italianTeams",italianTeams);
        model.addAttribute("spanishTeams",spanishTeams);
    }
}