package com.thelxg.data.Services.Impl;

import com.thelxg.components.eMailMessage;
import com.thelxg.data.Services.sendNotification;
import com.thelxg.data.models.player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by rex on 12/06/2017.
 */
@Service
public class sendNotificationImpl implements sendNotification {



    private final JavaMailSender mailSender;
    private final SimpleMailMessage mailMessage;

    @Autowired
    public sendNotificationImpl(SimpleMailMessage mailMessage, JavaMailSender mailSender) {
        this.mailMessage = mailMessage;
        this.mailSender = mailSender;
    }

    @Override
    public boolean sendEmail(player player, eMailMessage e_mail) {

        // creates a simple e-mail object
        mailMessage.setTo(player.getEmail());
        mailMessage.setFrom("noreply@thelxg.com.ng");
        mailMessage.setSubject("The LXG - Registration");
        e_mail.setMessage(player);
        mailMessage.setText(e_mail.getMessage());

        // sends the e-mail

        try {
            mailSender.send(mailMessage);
            System.out.println("Mail Sent to "+ player.getEmail());
            player.setMailStatus("Mail sent");
            return true;
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.out.println("Mail not sent to "+ player.getEmail());
            player.setMailStatus("Mail not sent");
            System.err.println(ex.getMessage());
            return false;
        }
    }
}
