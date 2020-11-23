package org.jetBrains.designpatterns.strategy;

public interface SendingMethod {
    void send(String from, String to, String msg);
}
