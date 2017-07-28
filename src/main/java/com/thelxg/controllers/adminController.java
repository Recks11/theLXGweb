package com.thelxg.controllers;

import com.thelxg.components.paginationService;
import com.thelxg.data.Services.playerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class adminController {

    private final playerService players;
    private final paginationService pagination;

    @Autowired
    public adminController(playerService players, paginationService pagedList) {
        this.players = players;
        this.pagination = pagedList;
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

    public String playerFunctions(){

        return "redirect:/admin/all";
    }
}
