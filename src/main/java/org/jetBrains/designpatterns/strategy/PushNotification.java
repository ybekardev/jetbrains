package org.jetBrains.designpatterns.strategy;

public class PushNotification implements SendingMethod{
    private final boolean magicFlag;
    public PushNotification(boolean magicFlag){
        this.magicFlag = magicFlag;
    }

    @Override
    public void send(String from, String to, String msg) {
        System.out.println(String.format("\nSending the push notification from %s , to %s", from, to));
        System.out.printf("The message is: %s", msg );
    }
}
