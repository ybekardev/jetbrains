package org.jetBrains.designpatterns.template;

public abstract class Worker {

    public void work(){
        goToWork();
        goHome();
    }

    public void goToWork(){
        System.out.println("Going to the work");
    }

    public void goHome(){
        System.out.println("Going home");
    }

    public abstract void workingProcess();

}
