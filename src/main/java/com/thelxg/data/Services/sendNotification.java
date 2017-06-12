package com.thelxg.data.Services;

import com.thelxg.data.models.components.e_mail_Message;
import com.thelxg.data.models.player;

/**
 * Created by rex on 07/06/2017.
 */
public interface sendNotification {

    boolean sendEmail(player player,e_mail_Message e_mail);
}
