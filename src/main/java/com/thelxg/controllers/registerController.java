package com.thelxg.controllers;

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

    private final playerService playerService;
    private final player playerBean;

    @Autowired
    public registerController(player playerBean, playerService playerService) {
        this.playerBean = playerBean;
        this.playerService = playerService;
    }


    @RequestMapping("/")
    public String register(Model model){

        model.addAttribute("title","Register - TheLXG");
        model.addAttribute("playerObject", playerBean);
        return "register";
    }

    @RequestMapping("/rest")
    public @ResponseBody String restSetviec( @ModelAttribute("playerObject")player play, HttpServletRequest request){
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

    @ModelAttribute("teamCountry")
    public List<String> setTeamCountry(){
        List<String> countryList = new ArrayList<String>();
        countryList.add("England");
        countryList.add("france");
        countryList.add("Germany");
        countryList.add("italy");
        countryList.add("Spain");

        return countryList;
    }

    @ModelAttribute("team")
    public List<String> setTeam(){
        List<String> teamList = new ArrayList<String>();
        teamList.add("scam");
        teamList.add("scam");
        teamList.add("scam");
        teamList.add("scam");
        teamList.add("scam");

        return teamList;
    }

    @PostMapping("/")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public String registerPlayer(@RequestBody player play){

        playerService.addPlayer(play);
        return "index";
    }
}