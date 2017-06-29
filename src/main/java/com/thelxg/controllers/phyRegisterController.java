package com.thelxg.controllers;

import com.thelxg.data.Services.pinService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.Services.sendNotification;
import com.thelxg.data.models.components.e_mail_Message;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Created by rex on 29/06/2017.
 */
@Controller
@RequestMapping("phy_register")
public class phyRegisterController{

    private final pinService pinService;
    private final playerService playerService;
    private final player playerBean;
    private final sendNotification notification;
    @Autowired
    public phyRegisterController(player playerBean, sendNotification notification, playerService playerService, pinService pinService) {
        this.playerBean = playerBean;
        this.notification = notification;
        this.playerService = playerService;
        this.pinService = pinService;
    }

    @RequestMapping("/io")
    public String registerPlayer(Model model){

        model.addAttribute("title","Register - TheLXG");
        model.addAttribute("playerObject", playerBean);
        return "phy_register";
    }
    @RequestMapping("/pin")
    public @ResponseBody String checkPin(){

        System.out.println(pinService.getPin());
        return pinService.getPin();
    }


    @PostMapping("/io")
    public String phyRegisterPlayer(@RequestBody player play){

        Random rand = new Random();
        int value = rand.nextInt(99);
        int value2 = rand.nextInt(99);

        String identityNumber = "TheLXG-Phy"+value+"1"+value2+"-"+play.getAlias();
        play.setPlayerId(identityNumber);
        e_mail_Message e_mail = new e_mail_Message();
        e_mail.setMessage(play);/*sets player Object mail is sent to and embeds details to message.*/
        //String fullName = play.getFirstName()+" "+ play.getLastName();
        Date date = new Date();
        play.setDate(date);
        playerService.addPlayer(play);
        notification.sendEmail(play, e_mail);
        return "index";
    }



    @ModelAttribute("locationList")
    public List<String> getWebFrameworkList() {
        List<String> locationList = new ArrayList<String>();
        locationList.add("Lagos Island");
        locationList.add("Lagos Mainland");

        return locationList;
    }
}
