package com.thelxg.components.impl;

import com.thelxg.components.eMailMessage;
import com.thelxg.components.groupsAndFixtures;
import com.thelxg.components.sendNotification;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.Services.groupsService;
import com.thelxg.data.Services.playerService;
import com.thelxg.data.models.features.fixtures;
import com.thelxg.data.models.features.groups;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.joda.time.*;
import org.joda.time.format.*;

import java.util.ArrayList;
import java.util.List;

@Service
public class groupsAndFixturesImpl implements groupsAndFixtures {

    private final sendNotification sendMail;
    private final fixtureService fixtureService;
    private final playerService playerService;
    private final fixtures fixture;
    private final groupsService groupService;
    @Autowired
    private eMailMessage eMail;

    @Autowired
    public groupsAndFixturesImpl(fixtureService fixtureService, playerService playerService, fixtures fixture, groupsService groupService, sendNotification sendMail) {
        this.fixtureService = fixtureService;
        this.playerService = playerService;
        this.fixture = fixture;
        this.groupService = groupService;
        this.sendMail = sendMail;
    }

    public boolean generateFixtures(){

        List<player> playerList = new ArrayList<player>(playerService.getPlayersWIthNonGeneratedFixtures());
        groups group =  groupService.getLastGroup();
        int numberOfGroupsWithFixturesBeingGenerated = group.getGroupNumber();
        System.out.println("number of groups: " + numberOfGroupsWithFixturesBeingGenerated);
        List playersInLastGroup = playerService.getPlayersInGroup(group.getGroupNumber());

//        if(playersInLastGroup.size() < 5){
//            numberOfGroupsWithFixturesBeingGenerated -= 1;
//        }
        System.out.println("number of groups after check: " + numberOfGroupsWithFixturesBeingGenerated);
        System.out.println("PlayerList: " + playerList.size());

        for(int i = 0; i <= numberOfGroupsWithFixturesBeingGenerated; i++){ //iterates through player group[i]
            List<player> groupList = new ArrayList<player>(playerService.getPlayersInGroup(i));
            System.out.println("group Number: "+ i);


            for(int j = 0; j < groupList.size() - 1; j++){//iterates through players in group [i]
                System.out.println("group Size "+ groupList.size());


                //if(!playerList.isEmpty() && (playerList.size() % 2 == 0)) {
                    for(int k = 0;k < groupList.size(); k++){//iterates through player[k] in group[j]
                        //for group[i] match player k with player l
                        player homePlayer = groupList.get(k);
                        if(k == 4){
                            homePlayer.setFixtureGenerated(true);
                            playerService.updatePlayer(homePlayer);
                        }else {
                            for (int l = k + 1; l < groupList.size(); l++) {
                                fixture.setHomePlayer(homePlayer.getAlias());
                                fixture.setHomeTeam(homePlayer.getTeamSelected());
                                //AwayPlayer
                                player awayPlayer = groupList.get(l);
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


    public boolean generateGroups(){

        groups group =  groupService.getLastGroup();
        List<player> playersNotInGroup = new ArrayList<player>(playerService.getAllPlayersNotInGroup());
        List<player> playersInLastGroup = new ArrayList<player>(playerService.getPlayersInGroup(group.getGroupNumber()));


        //Variables
        int groupNumber = group.getGroupNumber();
        int updatedNumber = groupNumber + 1;
        int numberOfPlayersInLastGroup = playersInLastGroup.size();
        int numberOfPlayersNotInGroup = playersNotInGroup.size();

        System.out.println("\n players not in groups: "+numberOfPlayersNotInGroup+"\n");

        System.out.println("\n players in Last group: "+numberOfPlayersInLastGroup+"\n");



        if((numberOfPlayersInLastGroup > 0 && numberOfPlayersInLastGroup < 5) && (numberOfPlayersNotInGroup > 0 && numberOfPlayersNotInGroup <= 4 )){
            for(int i = 0; i < numberOfPlayersInLastGroup - 1; i++) {
                player playerToBeAddedToGroup = playersNotInGroup.get(i);
                playerToBeAddedToGroup.setPlayerGroup(groupNumber);
                System.out.println("Player upgating: "+ playersNotInGroup);
                System.out.println("Number "+ groupNumber);
                playerService.updatePlayer(playerToBeAddedToGroup);
            }
            return true;
        }

        if(numberOfPlayersNotInGroup > 0){
            for(int i = 1; i <= numberOfPlayersNotInGroup; i++){
                player playerToBeAddedToGroup = playersNotInGroup.get(i-1);
                playerToBeAddedToGroup.setPlayerGroup(updatedNumber);
                playerService.updatePlayer(playerToBeAddedToGroup);

                if (i % 5 == 0){
                    playerToBeAddedToGroup = playersNotInGroup.get(i-1);
                    playerToBeAddedToGroup.setPlayerGroup(updatedNumber);
                    playerService.updatePlayer(playerToBeAddedToGroup);
                    updatedNumber ++;
                    group.setGroupNumber(updatedNumber);
                    groupService.setGroupNumber(group);
                }
            }
        }
        return true;
    }
    public boolean sendFixtureMail(player player){

        return sendMail.sendFixtureMail(player, eMail);
    }
}
