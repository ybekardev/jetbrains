package org.jetBrains.designpatterns.command;

public class HomeLights {

    public static void main(String[] args) {

        Controller controller = new Controller();
        Light light = new Light();

        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);

        controller.setCommand(lightsOn);
        controller.executeCommand();

        controller.setCommand(lightsOff);
        controller.executeCommand();


    }
}
