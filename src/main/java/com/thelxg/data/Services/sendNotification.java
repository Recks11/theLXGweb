package com.thelxg.data.Services;

import com.thelxg.components.eMailMessage;
import com.thelxg.data.models.player;

/**
 * Created by rex on 07/06/2017.
 */
public interface sendNotification {

    boolean sendEmail(player player, eMailMessage e_mail);
}
