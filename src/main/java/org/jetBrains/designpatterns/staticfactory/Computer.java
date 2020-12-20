package org.jetBrains.designpatterns.staticfactory;

public class Computer {

    //getters and setters can be used to pull in factory client class
    private ComputerType computerType;
    private long ram;
    private long cpu;
    private double screenSize;

    public Computer(){}

    public Computer(long ram, long cpu, double screenSize, ComputerType type) {
        this.ram = ram;
        this.cpu = cpu;
        this.screenSize = screenSize;
        this.computerType = type;
        System.out.println("This is the " + computerType + " properties: " +
                "\nram: " + ram + "\ncpu: " + cpu + "\nscreenSize: " + screenSize + "\ntype: " + type);
    }



}
