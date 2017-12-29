/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;

import java.security.NoSuchProviderException;
import java.security.Security;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class DataManager {

    private static Connection c;

    private static Statement getConnection() throws InstantiationException, IllegalAccessException, SQLException {
        Statement s = null;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/timetable", "root", "");
            s = c.createStatement();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return s;
    }

    public static ResultSet getdata(String query) {
        ResultSet rs = null;
        try {
            Statement s = getConnection();
            rs = s.executeQuery(query);

        } catch (InstantiationException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public static String setdata(String query) {
        String rows = "";
        try {
            Statement s = getConnection();
            rows = "" + s.executeUpdate(query);
        } catch (InstantiationException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(DataManager.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            rows = ex.getMessage();
        }
        return rows;
    }

    public void sendMail(String to, String subject, String text) throws NoSuchProviderException, AddressException {
        try {
            Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Properties props = new Properties();
            props.setProperty("mail.transport.protocol", "smtp");
            props.setProperty("mail.host", "smtp.gmail.com");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");
            props.put("mail.debug", "true");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.socketFactory.fallback", "false");
            Session session;
            session = Session.getDefaultInstance(props, new GJMailAuthenticator());
            session.setDebug(true);
            Transport transport = session.getTransport();
            InternetAddress addressFrom = new InternetAddress("sp.standardplastics@gmail.com");
            MimeMessage message = new MimeMessage(session);
            message.setSender(addressFrom);
            message.setSubject(subject);
            message.setContent(text, "text/html");
            InternetAddress addressTo = new InternetAddress(to);
            message.setRecipient(Message.RecipientType.TO, addressTo);
            transport.connect();
            Transport.send(message);
            transport.close();
            System.out.println("DONE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    class GJMailAuthenticator extends javax.mail.Authenticator {

        @Override
        protected PasswordAuthentication getPasswordAuthentication() {
            return new PasswordAuthentication("sp.standardplastics@gmail.com", "standardplastics");
        }

    }
}
