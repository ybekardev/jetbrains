package org.jetBrains.designpatterns.template;

public class TestTemplate {
    public static void main(String[] args) {
        Worker programmer = new Programmer();
        Worker actor = new Actor();

        programmer.workingProcess();
        actor.workingProcess();

        programmer.work();
        programmer.goToWork();
        programmer.goHome();

        actor.work();
        actor.goToWork();
        actor.goHome();

    }
}
