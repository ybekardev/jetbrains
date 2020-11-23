package org.jetBrains.designpatterns.strategy;

public class SendingSms implements SendingMethod{
    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("\nSending SMS from %s , to %s", from, to));
        System.out.printf("The message is: %s", msg );
    }
}
