package org.jetBrains.designpatterns.strategy;

public class Client {

    public static void main(String[] args) {
        MessageSender sender = new MessageSender();
        sender.setMethod(new SendingEmail());
        sender.send("alice@gmail.com", "bob@gmail.com", "Welcome to the class!");

        sender.setMethod(new SendingSms());
        sender.send("816 820 6512", "816 832 7110", "School meeting!");

        sender.setMethod(new PushNotification(true));
        sender.send("john@gmail.com", "mike@yahoo.com", "Homework");
    }
}
