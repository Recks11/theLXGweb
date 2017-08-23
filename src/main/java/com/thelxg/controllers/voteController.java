package com.thelxg.controllers;

import com.thelxg.data.Services.voteService;
import com.thelxg.data.models.vote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/vote")
@SessionAttributes("buttonStatus")
public class voteController {

    private final voteService votes;

//    private String buttonStatus = "";

    @Autowired
    public voteController(voteService votes) {
        this.votes = votes;
    }

    @GetMapping("/")
    public String votePage(Model model){

        List<String> playerList = new ArrayList<String>();
        List<vote> voteList = votes.getAllVotes();

        for (vote voteItem : voteList){
            playerList.add(voteItem.getPlayerAlias());
        }
        model.addAttribute("votes", playerList);
        model.addAttribute("voteObject", new vote());
//        model.addAttribute("buttonStatus", buttonStatus);
        return "votePage";
    }

    @PostMapping("/")
    public String castVote(@ModelAttribute("voteObject") vote voteObject, Model model){

        votes.voteForPlayer(voteObject.getPlayerAlias());
        model.addAttribute("buttonStatus", "disabled");
//        this.buttonStatus = "disabled";

        return "redirect:/vote/";
    }
}
