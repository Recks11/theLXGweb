package com.thelxg.controllers;

import com.thelxg.components.savePlayerAndSendMail;
import com.thelxg.data.Services.pinService;
import com.thelxg.data.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rex on 29/06/2017.
 */
@Controller
@RequestMapping("phy_register")
public class phyRegisterController {

    private final savePlayerAndSendMail saveAndSend;
    private final pinService pinService;
    private final Player playerBean;

    @Autowired
    public phyRegisterController(Player playerBean, pinService pinService, savePlayerAndSendMail saveAndSend) {
        this.playerBean = playerBean;
        this.pinService = pinService;
        this.saveAndSend = saveAndSend;
    }

    @RequestMapping("/io")
    public String registerPlayer(Model model) {

        model.addAttribute("title", "Register - TheLXG");
        model.addAttribute("playerObject", playerBean);
        return "phy_register";
    }

    @RequestMapping("/pin")
    public @ResponseBody
    String checkPin() {

        //  System.out.println(pinService.getPin());
        return pinService.getPin();
    }


    @PostMapping("/io")
    public String phyRegisterPlayer(@RequestBody Player play) {

        play.setReference("Registered physically");
        saveAndSend.savePlayer(play);
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
