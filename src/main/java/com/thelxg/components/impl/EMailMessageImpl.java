package com.thelxg.components.impl;

import com.thelxg.components.eMailMessage;
import com.thelxg.data.models.player;
import org.springframework.stereotype.Component;

/**
 * Created by rex on 12/06/2017.
 */
@Component
public class EMailMessageImpl implements eMailMessage {


    private String message;


    public void setMessage(player player){

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
                "\n" +
                "Details on your venue and fixture will be sent to you soon \n"+
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
