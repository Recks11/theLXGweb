package com.thelxg.components;

import com.thelxg.data.models.FiestaPlayer;
import com.thelxg.data.models.Player;

/**
 * Created by rex on 07/06/2017.
 */
public interface sendNotification {

    boolean sendFiestaEmail(FiestaPlayer fiestaPlayer, eMailMessage e_mail, String subject);

    boolean sendEmail(Player player, eMailMessage e_mail, String subject);

    boolean sendFixtureMail(Player player, eMailMessage mail);

}
