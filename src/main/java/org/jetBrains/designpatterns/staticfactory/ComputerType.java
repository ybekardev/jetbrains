package org.jetBrains.designpatterns.staticfactory;

public enum ComputerType {

    COMPUTER("machine"), PC("type"), LAPTOP("type");

    private String[] dsc;
    ComputerType(String ... dsc){
        this.dsc = dsc;
    }

}
