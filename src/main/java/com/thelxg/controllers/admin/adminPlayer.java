package com.thelxg.controllers.admin;

import com.thelxg.components.eMailMessage;
import com.thelxg.components.groupsAndFixtures;
import com.thelxg.components.paginationService;
import com.thelxg.components.sendNotification;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin/players")
public class adminPlayer {

    private final playerService players;
    private final paginationService pagination;
    private final sendNotification sendMail;
    private final eMailMessage eMail;
    @Autowired
    private groupsAndFixtures groupsAndFixtures;


    @Autowired
    public adminPlayer(playerService players, paginationService pagination, sendNotification sendMail, eMailMessage eMail) {
        this.players = players;
        this.pagination = pagination;
        this.sendMail = sendMail;
        this.eMail = eMail;
    }

    @RequestMapping("/all")
    public String allPlayers(HttpServletRequest request, Model model,
                             @RequestParam(value = "playerUpdated", required = false) player player,
                             @RequestParam(value = "oldPlayerTeam", required = false) String oldTeam){

        PagedListHolder pagedList = pagination.pagedListImpl(15, request, players.getAllPlayers());
        model.addAttribute("allPlayers", pagedList);
        model.addAttribute("playerUpdated", player);
        model.addAttribute("oldPlayerTeam", oldTeam);
        return "admin/pages/allPlayers";
    }

    @GetMapping("/send/mail/{playerId}")
    public String sendMail(@PathVariable("playerId") String playerId, Model model){

        player recipient = players.getPlayerByUniqueId(playerId);

        sendMail.sendEmail(recipient, eMail,"The LXG - Registration");
        players.updatePlayer(recipient);
        return "redirect:/admin/players/all";

    }

    @GetMapping("/send/FixturesMail/{playerId}")
    public String sendFixturesMail(@PathVariable("playerId") String playerId, Model model){

        player recipient = players.getPlayerByUniqueId(playerId);

        groupsAndFixtures.sendFixtureMail(recipient);
        players.updatePlayer(recipient);
        return "redirect:/admin/players/all";

    }

    @GetMapping("/get/{playerId}")
    public String getPlayer(@PathVariable("playerId") String playerId, Model model){


        model.addAttribute("playerObject", players.getPlayerByUniqueId(playerId));

        return "admin/pages/changeTeam";

    }
    @PostMapping("/get/change.team")
    public String updatePlayer(@ModelAttribute("playerObject") player player, Model model){

        player updatedPlayer = players.getPlayerById(player.getId());
        String oldTeam = updatedPlayer.getTeamSelected();

        updatedPlayer.setTeamSelected(player.getTeamSelected());
        updatedPlayer.setTeamCountry(player.getTeamCountry());

        players.updatePlayer(updatedPlayer);
//        System.out.println(player.toString());
        model.addAttribute("playerUpdated", updatedPlayer);
        model.addAttribute("oldPlayerTeam", oldTeam);
        return "redirect:/admin/players/all";
    }

}
