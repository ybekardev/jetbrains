package org.jetBrains.designpatterns.template;

public class Actor extends Worker{

    @Override
    public void workingProcess() {
        System.out.println("I am an actor and read a scenario to get used to the role...");
    }
}
