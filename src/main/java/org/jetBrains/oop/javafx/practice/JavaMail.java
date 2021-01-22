package org.jetBrains.oop.javafx.practice;
/*
import org.apache.logging.log4j.message.Message;
import org.jetBrains.oop.javafx.Session;
import org.junit.jupiter.api.Test;

import javax.mail.*;
import javax.mail.internet.*;
import javax.mail.search.FlagTerm;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.security.NoSuchProviderException;
import java.util.Properties;

public class JavaMail {
}


    public static void google() throws MessagingException {
        //String host = "smtp.gmail.com";
        String host = "imap.gmail.com";
        String username = "chemistryhps@gmail.com";
        String password = "0571850246Yb";
        Properties props = new Properties();
        props.setProperty("mail.smtp.ssl.enable", "true");
        //IMAP work off a different port (143 for non-secure, 993 for secure) to sendmail (25) and I suspect that's blocked.
        //props.setProperty("mail.smtp.port", "88");
        props.setProperty("mail.smtp.port", "465");
        //props.put("mail.smtp.port", 143);
        props.setProperty("mail.store.protocol", "imap");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.connectiontimeout", "5000");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // set any other needed mail.smtp.* properties here

        org.jetBrains.oop.javafx.Session session = org.jetBrains.oop.javafx.Session.getInstance(props);
        MimeMessage msg = new MimeMessage(session);
        // set the message content here
        //Transport.send(msg, username, password);
        org.jetBrains.oop.javafx.Session mailSession = org.jetBrains.oop.javafx.Session.getInstance(props);
        Store store = mailSession.getStore("imap");
        store.connect(host, username, password);
    }

    @Test
    public void test() throws MessagingException, NamingException {
        //readAmail();
        google();
        System.out.println("hi");

        String host = "pop.gmail.com";// change accordingly
        String storeType = "pop3";
        String username = "chemistryhps@gmail.com";// change accordingly
        String password = "0571850246Yv";// change accordingly

        //check(host, storeType, username, password);
    }

    public void readAmail() throws NamingException, MessagingException {
        InitialContext ic = new InitialContext();
        String snName = "java:comp/env/mail/MyMailSession";
        //Session session = (javax.mail.Session)ic.lookup(snName);
        Properties props = new Properties();
        props.setProperty("mail.smtp.ssl.enable", "true");
        props.setProperty("mail.smtp.port", "465");
        props.setProperty("mail.store.protocol", "imap");
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.connectiontimeout", "5000");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        org.jetBrains.oop.javafx.Session session = org.jetBrains.oop.javafx.Session.getInstance(props);
        //props = session.getProperties();

        Store store = session.getStore();
        store.connect("imap.gmail.com", "chemistryhps@gmail.com", "0571850246Yb");

        Folder folder = store.getFolder("INBOX");
        org.apache.logging.log4j.message.Message[] messages = folder.getMessages();
    }

    public void check(String host, String storeType, String user, String password)
    {
        try {

            //create properties field
            Properties properties = new Properties();

            properties.put("mail.pop3.host", host);
            properties.put("mail.pop3.port", "465");
            properties.put("mail.pop3.starttls.enable", "true");
            org.jetBrains.oop.javafx.Session emailSession = org.jetBrains.oop.javafx.Session.getDefaultInstance(properties);

            //create the POP3 store object and connect with the pop server
            Store store = emailSession.getStore("pop3s");

            store.connect(host, user, password);

            //create the folder object and open it
            Folder emailFolder = store.getFolder("INBOX");
            emailFolder.open(Folder.READ_ONLY);

            // retrieve the messages from the folder in an array and print it
            org.apache.logging.log4j.message.Message[] messages = emailFolder.getMessages();
            System.out.println("messages.length---" + messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                org.apache.logging.log4j.message.Message message = messages[i];
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());

            }

            //close the store and folder objects
            emailFolder.close(false);
            store.close();

        } catch (java.security.NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void checkMail(String host, String storeType, String user, String password) {
        try {

            // create properties
            Properties properties = new Properties();

            properties.put("mail.imap.host", host);
            properties.put("mail.imap.port", "465");
            properties.put("mail.imap.starttls.enable", "true");
            properties.put("mail.imap.ssl.trust", host);

            org.jetBrains.oop.javafx.Session emailSession = org.jetBrains.oop.javafx.Session.getDefaultInstance(properties);

            // create the imap store object and connect to the imap server
            Store store = emailSession.getStore("imap");

            store.connect(host, user, password);

            // create the inbox object and open it
            Folder inbox = store.getFolder("Inbox");
            inbox.open(Folder.READ_WRITE);

            // retrieve the messages from the folder in an array and print it
            org.apache.logging.log4j.message.Message[] messages = inbox.search(new FlagTerm(new Flags(Flags.Flag.SEEN), false));
            System.out.println("messages.length---" + messages.length);

            for (int i = 0, n = messages.length; i < n; i++) {
                Message message = messages[i];
                message.setFlag(Flags.Flag.SEEN, true);
                System.out.println("---------------------------------");
                System.out.println("Email Number " + (i + 1));
                System.out.println("Subject: " + message.getSubject());
                System.out.println("From: " + message.getFrom()[0]);
                System.out.println("Text: " + message.getContent().toString());

            }

            inbox.close(false);
            store.close();

        } catch (NoSuchProviderException e) {
            e.printStackTrace();
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        String host = "imap.gmail.com";
        String mailStoreType = "imap";
        String username = "chemistryhps@gmail.com";
        String password = "0571850246Yb";

        checkMail(host, mailStoreType, username, password);

    }

    @Test
    public void checkAnEmail() throws MessagingException {
        String host = "imap.gmail.com";
        String user = "chemistryhps@gmail.com";
        String password = "0571850246Yb";
        //create properties field
        Properties properties = new Properties();

        properties.put("mail.pop3.host", host);
        properties.put("mail.pop3.port", "465");
        properties.put("mail.pop3.starttls.enable", "true");
        properties.put("mail.pop3.connectiontimeout", "5000");
        org.jetBrains.oop.javafx.Session emailSession = org.jetBrains.oop.javafx.Session.getDefaultInstance(properties);

        //create the POP3 store object and connect with the pop server
        Store store = emailSession.getStore("imap");

        store.connect(host, user, password);

  */
/*      //create the folder object and open it
        Folder emailFolder = store.getFolder("INBOX");
        emailFolder.open(Folder.READ_ONLY);

        // retrieve the messages from the folder in an array and print it
        Message[] messages = emailFolder.getMessages();
        System.out.println("messages.length---" + messages.length);*//*

    }
}
*/
/*
* Set up IMAP
Step 1: Check that IMAP is turned on
On your computer, open Gmail.
In the top right, click Settings Settings and then See all  settings.
Click the Forwarding and POP/IMAP tab.
In the "IMAP access" section, select Enable IMAP.
Click Save Changes.
Step 2: Change SMTP & other settings in your email client
Use the table below to update your client with the correct information. For help updating your settings, search your email client's Help Center for instructions on setting up IMAP.

Incoming Mail (IMAP) Server
imap.gmail.com

Requires SSL: Yes

Port: 993

Outgoing Mail (SMTP) Server
smtp.gmail.com

Requires SSL: Yes

Requires TLS: Yes (if available)

Requires Authentication: Yes

Port for SSL: 465

Port for TLS/STARTTLS: 587

Full Name or Display Name	Your name
Account Name, User name, or Email address	Your full email address
Password	Your Gmail password
*
*
* SMTP is the industry standard protocol for sending email.
* If you’re looking to send email, then you’ll use SMTP instead of IMAP. An SMTP relay service can help you send email without having to build your own SMTP server.
IMAP is one of the most common protocols for receiving email. IMAP syncs messages across all devices.
POP3 is another protocol for receiving email on a single device. Using POP3 means that your email will be accessible offline and deleted from the server.*//*
*/