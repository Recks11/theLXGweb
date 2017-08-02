package com.thelxg.components.impl;

import com.thelxg.components.eMailMessage;
import com.thelxg.components.sendNotification;
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
    public boolean sendFixtureMail(player player, eMailMessage mail) {

        // creates a simple e-mail object
        mailMessage.setTo(player.getEmail());
        mailMessage.setFrom("noreply@thelxg.com.ng");
        mailMessage.setSubject("TheLXG - Fixtures and Venue");
        mail.setMessageForFixture(player);
        mailMessage.setText(mail.getMessage());

        // sends the e-mail

        try {
            mailSender.send(mailMessage);
            System.out.println(mailMessage.toString());
            System.out.println("Mail Sent to "+ player.getEmail());
            player.setMailStatus("Fixture Mail sent");
            return true;
        }
        catch (MailException ex) {
            // simply log it and go on...
            System.out.println("Mail not sent to "+ player.getEmail());
            player.setMailStatus("Fixture Mail not sent");
            System.err.println(ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean sendEmail(player player, eMailMessage e_mail, String subject) {

        // creates a simple e-mail object
        mailMessage.setTo(player.getEmail());
        mailMessage.setFrom("noreply@thelxg.com.ng");
        mailMessage.setSubject(subject);
        e_mail.setMessageForPlayer(player);
        mailMessage.setText(e_mail.getMessage());

        // sends the e-mail

        try {
            mailSender.send(mailMessage);
            System.out.println(mailMessage.toString());
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
