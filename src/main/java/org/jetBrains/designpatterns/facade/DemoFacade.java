package org.jetBrains.designpatterns.facade;

public class DemoFacade {

    public static void main(String[] args) throws InterruptedException {

        Engine engine = new Engine();
        HeatedSeats heatedSeats = new HeatedSeats();
        StereoSystem stereoSystem = new StereoSystem();

        CarFacade carFacade = new CarFacade(engine, heatedSeats, stereoSystem);

        carFacade.turnOnCar();
        System.out.println("Welcome \nPlease have a rest");
        for(int i = 1; i < 5; i++){
            Thread.sleep(2000);
            System.out.println("Driving your Tesla to work " + i + " km");
            switch (i){
                case 1:
                    Thread.sleep(2000);
                    carFacade.playTrack("Muslum Gurses - Hangimiz sevmedik");
                    break;
                case 2:
                    Thread.sleep(2000);
                    carFacade.playTrack("Sammy Flash -  Alla Yar");
                    break;
                case 3:
                    Thread.sleep(2000);
                    carFacade.playTrack("TRIO MARA - Gula Min");
                    break;
                case 4:
                    Thread.sleep(2000);
                    carFacade.playTrack("Risgar Oskan - Nabinim Ez Nabinim");
                    break;
                default:
                    System.out.println("Ergun Plakta calmayan sarki daha cikamistir :)");
            }
        }
        System.out.println("We have arrived, enjoy your work");
        carFacade.turnOffCar();
    }
}
