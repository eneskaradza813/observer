package javamail;

import javax.mail.AuthenticationFailedException;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class JavaMail {

    public static void main(String[] args) {

      Properties props = new Properties();
      
      props.setProperty("mail.smtp.host", "smtp.gmail.com");
      props.setProperty("mail.smtp.socketFactory.port", "465");
      
      props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
      props.setProperty("mail.smtp.auth", "true");
      props.setProperty("mail.smtp.port", "465");
      
      Session session = Session.getInstance(props, new Authenticator() {
          
          @Override
          protected PasswordAuthentication getPasswordAuthentication()
          {
             return new PasswordAuthentication("email@gmail.com", "password");
          }
});
      
      try
      {
          
      Message message = new MimeMessage(session);
      message.setFrom(new InternetAddress("from@gmail.com"));
      message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("to@mail.com"));
      message.setSubject("Java text Mail");
      message.setText("Goodbye");
      
      Transport.send(message);
      
          System.out.println("message sent");
      }
      catch(MessagingException exc)
      {
          System.out.println("Error: " + exc.getMessage() );
      }
      
        
        
    }

}
