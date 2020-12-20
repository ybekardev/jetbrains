package org.jetBrains.designpatterns.facade;

public class StereoSystem {

    private String description;
    private String trackTitle;
    protected int volume;

    StereoSystem(){
        this.description = "Stereo system";
    }

    void on(){
        System.out.println(description + " is turning on");
    }

    void off(){
        System.out.println(description + " is turning off");
    }

    void playTrack(String title){
        this.trackTitle = title;
        System.out.println(title + " is playing");
    }

    public void pause(){
        System.out.println("Track " + trackTitle + " is paused");
    }
    public String getTrackTitle(){
        return ("The current playing song is: " + trackTitle);
    }

    public void setVolume(int volume){
        if(volume > 100){
            this.volume = 100;
        }else {
            this.volume = volume;
        }
    }
    public int getVolume(){
        return volume;
    }
}
