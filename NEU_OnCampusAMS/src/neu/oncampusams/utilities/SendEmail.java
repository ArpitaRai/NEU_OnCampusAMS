/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package neu.oncampusams.utilities;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author arpitarai
 */
public class SendEmail {

    public static EmailInfo mail(EmailInfo emailInfo) {
        String to;
        to = emailInfo.getGmailId();
        //to= "returi.s@northeastern.edu";
        String from = "northeasternuniversity3@gmail.com";

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", 587);

        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {

            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("northeasternuniversity3@gmail.com", "jlqqcngdhkrqbmrm");
            }
        });

        try {
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            //msg.setText("Hello Srushty");
            msg.setText(emailInfo.getBody());
            msg.setSubject(emailInfo.getSubjectLine());
            //msg.setSubject("This is subject!");
            Transport.send(msg);
            System.out.print("Message sent Successfully");
            emailInfo.setBody("Message Successfully Sent");
            return emailInfo;
        } catch (MessagingException ex) {
            ex.printStackTrace();
        }
        emailInfo.setBody("Message Failed try again with correct details!");
        return emailInfo;
    }
}
