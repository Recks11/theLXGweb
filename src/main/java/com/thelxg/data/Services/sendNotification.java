package com.thelxg.data.Services;

import com.thelxg.components.EMailMessage;
import com.thelxg.data.models.player;

/**
 * Created by rex on 07/06/2017.
 */
public interface sendNotification {

    void sendEmail(player player, EMailMessage e_mail);
}
