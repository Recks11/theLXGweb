package com.thelxg.components.impl;

import com.thelxg.components.eMailMessage;
import com.thelxg.components.savePlayerAndSendMail;
import com.thelxg.data.Services.FiestaPlayerService;
import com.thelxg.data.Services.playerService;
import com.thelxg.components.sendNotification;
import com.thelxg.data.models.FiestaPlayer;
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
public class SavePlayerAndSendMailImpl implements savePlayerAndSendMail {

    private final eMailMessage eMail;
    private final playerService playerService;
    private final FiestaPlayerService fiestaService;
    private final sendNotification sendMailNotification;

    @Autowired
    public SavePlayerAndSendMailImpl(playerService playerService, sendNotification sendMail, eMailMessage eMail, FiestaPlayerService fiestaService) {
        this.playerService = playerService;
        this.sendMailNotification = sendMail;
        this.eMail = eMail;
        this.fiestaService = fiestaService;
    }


    public void savePlayer(@RequestBody player play){

        Random rand = new Random();
        int value = rand.nextInt(99);
        int value2 = rand.nextInt(99);

        String identityNumber = "TheLXG-Phy"+value+"1"+value2+"-"+play.getAlias();
        play.setPlayerId(identityNumber);
//        eMail.setMessageForPlayer(play);/*sets player Object mail is sent to and embeds details to message.*/
        Date date = new Date();
        play.setDate(date);
        playerService.addPlayer(play);

        if(sendMailNotification.sendEmail(play, eMail,"The LXG - Registration")){
            play.setMailStatus("mail sent");
        }else{
            play.setMailStatus("mail not sent");
        }

        playerService.updatePlayer(play);

    }

    @Override
    public boolean saveFiestaPlayer(FiestaPlayer fiestaPlayer) {

        Random rand = new Random();
        int value = rand.nextInt(99);
        int value2 = rand.nextInt(99);

        String identityNumber = "LXG'17-FIESTA"+value+"1"+value2+"-"+fiestaPlayer.getAlias();
        fiestaPlayer.setPlayerId(identityNumber);
//        eMail.setMessageForPlayer(play);/*sets player Object mail is sent to and embeds details to message.*/
        Date date = new Date();
        fiestaPlayer.setDate(date);
        fiestaService.addPlayer(fiestaPlayer);

        if(sendMailNotification.sendFiestaEmail(fiestaPlayer, eMail,"LXG'17 FIESTA - Registration")){
            fiestaPlayer.setMailStatus("mail sent");
        }else{
            fiestaPlayer.setMailStatus("mail not sent");
        }

        fiestaService.updatePlayer(fiestaPlayer);
        return false;
    }
}
