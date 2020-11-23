package org.jetBrains.designpatterns.decorator;

public class Task {

    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(
                new SeniorJavaDeveloper(
                        new JavaDeveloper()));

        System.out.println(developer.makeJob());

        Developer javaDeveloper = new JavaDeveloper();
        System.out.println(javaDeveloper.makeJob());
    }
}
