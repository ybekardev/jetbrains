package org.jetBrains.designpatterns.decorator;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer){
        super(developer);
    }

    public String sendWeeklyReport(){
        return "Send weekly reorts to customers...";
    }

    public String makeJob(){
        return super.makeJob() + " " + sendWeeklyReport();
    }

}
