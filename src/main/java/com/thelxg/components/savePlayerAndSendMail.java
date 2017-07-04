package com.thelxg.components;

import com.thelxg.data.Services.playerService;
import com.thelxg.data.Services.sendNotification;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Date;
import java.util.Random;

/**
 * Created by rex on 04/07/2017.
 */
@Component
public class savePlayerAndSendMail {

    private final EMailMessage eMail;
    private final playerService playerService;
    private final sendNotification sendMail;

    @Autowired
    public savePlayerAndSendMail(playerService playerService, sendNotification sendMail, EMailMessage eMail) {
        this.playerService = playerService;
        this.sendMail = sendMail;
        this.eMail = eMail;
    }


    public void savePlayer(@RequestBody player play){

        Random rand = new Random();
        int value = rand.nextInt(99);
        int value2 = rand.nextInt(99);

        String identityNumber = "TheLXG-Phy"+value+"1"+value2+"-"+play.getAlias();
        play.setPlayerId(identityNumber);
        eMail.setMessage(play);/*sets player Object mail is sent to and embeds details to message.*/
        Date date = new Date();
        play.setDate(date);
        playerService.addPlayer(play);
        sendMail.sendEmail(play, eMail);
    }
}
