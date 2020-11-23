package org.jetBrains.designpatterns.facade;

public class CarFacade {

    private Engine engine;
    private HeatedSeats heatedSeats;
    private StereoSystem stereoSystem;

    CarFacade(Engine engine, HeatedSeats heatedSeats, StereoSystem stereoSystem){
        this.engine =engine;
        this.heatedSeats = heatedSeats;
        this.stereoSystem = stereoSystem;
    }

    public void turnOnCar(){
        engine.on();
        heatedSeats.on();
        stereoSystem.on();
    }

    public void turnOffCar(){
        engine.off();
        heatedSeats.off();
        stereoSystem.off();
        stereoSystem.pause();
    }

    public void increaseHeatedSeats(){
        heatedSeats.increaseHeatLevel();
    }

    public void playTrack(String title){
        stereoSystem.playTrack(title);
    }

}
