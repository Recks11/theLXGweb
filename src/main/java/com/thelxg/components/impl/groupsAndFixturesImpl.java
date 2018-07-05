package com.thelxg.components.impl;

import com.thelxg.components.eMailMessage;
import com.thelxg.components.groupsAndFixtures;
import com.thelxg.components.sendNotification;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.groupsService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.features.fixtures;
import com.thelxg.data.models.features.groups;
import com.thelxg.data.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class groupsAndFixturesImpl implements groupsAndFixtures {

    private final sendNotification sendMail;
    private final fixtureService fixtureService;
    private final playerService playerService;
    private final fixtures fixture;
    private final groupsService groupService;
    private final eMailMessage eMail;

    @Autowired
    public groupsAndFixturesImpl(fixtureService fixtureService, playerService playerService, fixtures fixture, groupsService groupService, sendNotification sendMail, eMailMessage eMail) {
        this.fixtureService = fixtureService;
        this.playerService = playerService;
        this.fixture = fixture;
        this.groupService = groupService;
        this.sendMail = sendMail;
        this.eMail = eMail;
    }

    public boolean generateFixtures() {

        List<Player> playerList = new ArrayList<Player>(playerService.getPlayersWIthNonGeneratedFixtures());
        groups group = groupService.getLastGroup();
        int numberOfGroupsWithFixturesBeingGenerated = group.getGroupNumber();
        System.out.println("number of groups: " + numberOfGroupsWithFixturesBeingGenerated);
        List playersInLastGroup = playerService.getPlayersInGroup(group.getGroupNumber());

//        if(playersInLastGroup.size() < 5){
//            numberOfGroupsWithFixturesBeingGenerated -= 1;
//        }
        System.out.println("number of groups after check: " + numberOfGroupsWithFixturesBeingGenerated);
        System.out.println("PlayerList: " + playerList.size());

        for (int i = 0; i <= numberOfGroupsWithFixturesBeingGenerated; i++) { //iterates through Player group[i]
            List<Player> groupList = new ArrayList<Player>(playerService.getPlayersInGroup(i));
            System.out.println("group Number: " + i);


            for (int j = 0; j < groupList.size() - 1; j++) {//iterates through players in group [i]
                System.out.println("group Size " + groupList.size());


                //if(!playerList.isEmpty() && (playerList.size() % 2 == 0)) {
                for (int k = 0; k < groupList.size(); k++) {//iterates through Player[k] in group[j]
                    //for group[i] match Player k with Player l
                    Player homePlayer = groupList.get(k);
                    if (k == 4) {
                        homePlayer.setFixtureGenerated(true);
                        playerService.updatePlayer(homePlayer);
                    } else {
                        for (int l = k + 1; l < groupList.size(); l++) {
                            fixture.setHomePlayer(homePlayer.getAlias());
                            fixture.setHomeTeam(homePlayer.getTeamSelected());
                            //AwayPlayer
                            Player awayPlayer = groupList.get(l);
                            fixture.setAwayPlayer(awayPlayer.getAlias());
                            fixture.setAwayTeam(awayPlayer.getTeamSelected());
                            //fixture group
                            fixture.setGroup(Integer.toString(i));

                            fixtureService.saveFixture(fixture);
                        }
                        homePlayer.setFixtureGenerated(true);
                        playerService.updatePlayer(homePlayer);
                    }
                }
                //  }
            }
        }
        return true;
    }


    public boolean generateGroups() {

        groups group = groupService.getLastGroup();
        List<Player> playersNotInGroup = new ArrayList<Player>(playerService.getAllPlayersNotInGroup());
        List<Player> playersInLastGroup = new ArrayList<Player>(playerService.getPlayersInGroup(group.getGroupNumber()));


        //Variables
        int groupNumber = group.getGroupNumber();
        int updatedNumber = groupNumber + 1;
        int numberOfPlayersInLastGroup = playersInLastGroup.size();
        int numberOfPlayersNotInGroup = playersNotInGroup.size();

        System.out.println("\n players not in groups: " + numberOfPlayersNotInGroup + "\n");

        System.out.println("\n players in Last group: " + numberOfPlayersInLastGroup + "\n");


        if ((numberOfPlayersInLastGroup > 0 && numberOfPlayersInLastGroup < 5) && (numberOfPlayersNotInGroup > 0 && numberOfPlayersNotInGroup <= 4)) {
            for (int i = 0; i < numberOfPlayersInLastGroup - 1; i++) {
                Player playerToBeAddedToGroup = playersNotInGroup.get(i);
                playerToBeAddedToGroup.setPlayerGroup(groupNumber);
                System.out.println("Player upgating: " + playersNotInGroup);
                System.out.println("Number " + groupNumber);
                playerService.updatePlayer(playerToBeAddedToGroup);
            }
            return true;
        }

        if (numberOfPlayersNotInGroup > 0) {
            for (int i = 1; i <= numberOfPlayersNotInGroup; i++) {
                Player playerToBeAddedToGroup = playersNotInGroup.get(i - 1);
                playerToBeAddedToGroup.setPlayerGroup(updatedNumber);
                playerService.updatePlayer(playerToBeAddedToGroup);

                if (i % 5 == 0) {
                    playerToBeAddedToGroup = playersNotInGroup.get(i - 1);
                    playerToBeAddedToGroup.setPlayerGroup(updatedNumber);
                    playerService.updatePlayer(playerToBeAddedToGroup);
                    updatedNumber++;
                    group.setGroupNumber(updatedNumber);
                    groupService.setGroupNumber(group);
                }
            }
        }
        return true;
    }

    public boolean sendFixtureMail(Player player) {

        return sendMail.sendFixtureMail(player, eMail);
    }
}
