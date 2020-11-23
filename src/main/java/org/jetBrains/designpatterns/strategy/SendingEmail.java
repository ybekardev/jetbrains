package org.jetBrains.designpatterns.strategy;

public class SendingEmail implements SendingMethod{
    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("\nSending an email from '%s' , to '%s'", from , to)); //used single quote ' to have the text look like 'text'
        System.out.printf("The message is: %s", msg );
    }
}
