package com.thelxg.data.Services.Impl;

import com.thelxg.data.Services.sendNotification;
import com.thelxg.components.EMailMessage;
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
    private SimpleMailMessage mailMessage;

    @Autowired
    public sendNotificationImpl(SimpleMailMessage mailMessage, JavaMailSender mailSender) {
        this.mailMessage = mailMessage;
        this.mailSender = mailSender;
    }

    @Override
    public boolean sendEmail(player player, EMailMessage e_mail) {

        // creates a simple e-mail object
        mailMessage.setTo(player.getEmail());
        mailMessage.setFrom("noreply@thelxg.com.ng");
        mailMessage.setSubject("The LXG - Registration");
        mailMessage.setText(e_mail.getMessage());
        System.out.println("Mail Sent to "+ player.getEmail());

        // sends the e-mail

        try {
            mailSender.send(mailMessage);
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.err.println(ex.getMessage());
        }
        return true;
    }
}
