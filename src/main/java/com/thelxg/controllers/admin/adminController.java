package com.thelxg.controllers.admin;

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

    @Autowired
    public adminController(playerService players) {
        this.players = players;
    }

    @RequestMapping
    public String adminHome(Model model){

        model.addAttribute("numberRegistered", players.getAllPlayers().size());
        model.addAttribute("mainlandRegistered", players.getPlayersInLocation("Lagos Mainland").size());
        model.addAttribute("islandRegistered", players.getPlayersInLocation("Lagos Island").size());
        return "admin/index";
    }
}
