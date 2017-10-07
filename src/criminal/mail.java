package criminal;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class mail{
    mail(){
      // Recipient's email ID needs to be mentioned.
      String to = "97kshitij@gmail.com";//change accordingly

      // Sender's email ID needs to be mentioned
      String from = "bcrohitsharma@gmail.com";//change accordingly
      final String username = "bcrohitsharma@gmail.com";//change accordingly
      final String password = "whatismyname";//change accordingly

      // Assuming you are sending email through relay.jangosmtp.net
      String host = "smtp.gmail.com";

      Properties props = new Properties();
      props.put("mail.smtp.auth", "true");
      
//      props.put("mail.smtp.host", "192.168.100.12");
//      props.put("mail.debug", "true");
//      props.put("mail.smtp.port", "3128");
    //  props.put("mail.smtp.starttls.enable", "true");
      
      props.put("mail.smtp.starttls.enable", "true");
      props.put("mail.smtp.host", host);
      props.put("mail.smtp.port", "587");

      // Get the Session object.
      Session session = Session.getInstance(props,
      new javax.mail.Authenticator() {
         protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication(username, password);
         }
      });

      try {
         // Create a default MimeMessage object.
         Message message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.setRecipients(Message.RecipientType.TO,
         InternetAddress.parse(to));

         // Set Subject: header field
         message.setSubject("Forget Password Request");

         // Now set the actual message
         message.setText("Hello Admin, your password is rova");
         //if want to send message in bold then have to use charset and utfs..
        // message.setContent("<b>Hello</b>","text/html;charset=utf-8");

         // Send message
         Transport.send(message);

         System.out.println("Message  Sent successfully....");

      } catch (MessagingException e) {
            throw new RuntimeException(e);
      }
   }
   public static void main(String[] args) {new mail();}
   static void x(){new mail();}
}
