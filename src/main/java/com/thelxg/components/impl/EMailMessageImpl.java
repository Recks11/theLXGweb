package com.thelxg.components.impl;

import com.thelxg.components.eMailMessage;
import com.thelxg.data.Services.fixtureService;
import com.thelxg.data.models.features.fixtures;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by rex on 12/06/2017.
 */
@Component
public class EMailMessageImpl implements eMailMessage {


    private String message;

    @Autowired
    private fixtureService fixtureService;

    public void setMessageForPlayer(player player){

        String theMessage = " Hello " + player.getFullName() + ", \n" +
                "\n" +
                "You have successfully registered for LXG '17 FIFA Competition. \n" +
                "Your details are \n" +
                "Player ID = " + player.getPlayerId() + "\n" +
                "Last Name = " + player.getLastName() + "\n" +
                "First Name = " + player.getFirstName() + "\n" +
                "Alias = " + player.getAlias() + "\n" +
                "Team Selected = " + player.getTeamSelected() + "\n" +
                "Location = " + player.getLocation() + "\n" +
                "\n\n" +
                "Remember, Your Unique ID is "+player.getPlayerId()+"\n" +
                "\n" +" Please download the rulebook from the website \n \n"+
                "Details on your venue and fixture will be sent to you soon \n"+
                "if you have any problems or enquiries contact us at \n"+
                "info@thelxg.com.ng " +
                "or call +234 808 772 0872," +
                " +234 817 698 9182";


        this.message = theMessage;
    }

    public void setMessageForFixture(player player){

        String matches[] = new String[4];
        List<fixtures> fixturesList = fixtureService.getFixturesByAlias(player.getAlias());
        for(int i = 0; i < 4; i++){
            matches[i] = fixturesList.get(i).getTime();
        }

        String theMessage = " Hello " + player.getFullName() + ", \n" +
                "\n" +
                "You have been drafted in group "+player.getPlayerGroup()+" \n"+
                "Your Matches will take place on: \n"
                        + matches[0] +"\n"+
                         matches[1] +"\n"+
                         matches[2] +"\n"+
                         matches[3] +"\n"+
                "Please be present at least 10 minutes before your match or risk forfeiting the match\n\n\n"+
                "The Venue for the competition is Hitbox Games, Leisure Mall, Adeniran Ogunsanya, Surulere, Lagos. \n"+
                "if you have any problems or enquiries contact us at \n"+
                "info@thelxg.com.ng " +
                "or call +234 808 772 0872," +
                " +234 817 698 9182";


        this.message = theMessage;
    }

    public String getMessage(){
        return message;
    }


}
