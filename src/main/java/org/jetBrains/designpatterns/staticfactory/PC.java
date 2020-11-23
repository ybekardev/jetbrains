package org.jetBrains.designpatterns.staticfactory;

public class PC extends Computer {

    public PC(long ram, long cpu, double screenSize, ComputerType type) {
        super(ram, cpu, screenSize, type);
    }

}
