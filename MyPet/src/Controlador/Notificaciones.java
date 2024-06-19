package Controlador;

import javax.mail.*;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.InternetAddress;

import java.net.InetAddress;
import java.util.Properties;
import java.sql.*;
import Modelo.SQLConnection;
import java.util.List;
import java.util.ArrayList;

public class Notificaciones {

    public static void sendEmail(String body){

        final String senderEmail = "mypetcr2024@gmail.com"; //Correo
        final String senderPassword = "bbhm jsfu qzxi idbl" ;//Contra
        final String asunto = "Alerta de seguridad";

        //Protocolo de gmail
        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();

        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "465");
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        Session session = Session.getInstance(properties,
            new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(senderEmail, senderPassword);
                }
        });

        session.setDebug(true);

        try {
            MimeMessage mensaje = new MimeMessage(session);
            mensaje.setFrom(new InternetAddress(senderEmail));

            List destinatarios = getEmails();
            System.out.println(destinatarios);
            String recipientList = String.join(",", destinatarios);
            InternetAddress[] recipientAddresses = InternetAddress.parse(recipientList);

            mensaje.addRecipients(Message.RecipientType.TO, recipientAddresses);
            mensaje.setSubject(asunto);
            mensaje.setText(body);
            System.out.println("Comienza envio");

            //Enviar Correo
            Transport.send(mensaje);
            System.out.println("Mensaje enviado");

            //
        } catch(MessagingException ex){
            ex.printStackTrace();
        }
    }

    private static List<String> getEmails(){
        List<String> emails = new ArrayList<>();
        try{
            Connection connection = SQLConnection.getConnection();
            String sql = "EXEC dbo.CorreosAdmin" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                emails.add(resultSet.getString(1));
            }
            connection.close();
        } catch (SQLException ex) {
            System.out.println("problemas con las mascotas");
        }
        System.out.println(emails);
        return emails;
    }


}
