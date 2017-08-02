package com.thelxg.controllers;

import com.thelxg.components.eMailMessage;
import com.thelxg.components.paginationService;
import com.thelxg.data.Services.playerService;
import com.thelxg.components.sendNotification;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class adminController {

    private final playerService players;
    private final paginationService pagination;
    private final sendNotification sendMail;
    private final eMailMessage eMail;

    @Autowired
    public adminController(playerService players, paginationService pagedList, sendNotification sendMail, eMailMessage eMail) {
        this.players = players;
        this.pagination = pagedList;
        this.sendMail = sendMail;
        this.eMail = eMail;
    }

    @RequestMapping
    public String adminHome(Model model){

        model.addAttribute("numberRegistered", players.getAllPlayers().size());
        model.addAttribute("mainlandRegistered", players.getPlayersInLocation("Lagos Mainland").size());
        model.addAttribute("islandRegistered", players.getPlayersInLocation("Lagos Island").size());
        return "admin/index";
    }

    @RequestMapping("/players/all")
    public String allPlayers(HttpServletRequest request, Model model){

        PagedListHolder pagedList = pagination.pagedListImpl(10, request, players.getAllPlayers());
        model.addAttribute("allPlayers", pagedList);
        return "admin/pages/allPlayers";
    }

    @GetMapping("/all/mail/{playerId}")
    public String sendMail(@PathVariable("playerId") String playerId, Model model){

        player recipient = players.getPlayerByUniqueId(playerId);

        sendMail.sendEmail(recipient, eMail,"The LXG - Registration");
        players.updatePlayer(recipient);
        return "redirect:/admin/players/all";

    }
}
