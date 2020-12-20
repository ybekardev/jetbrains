package org.jetBrains.oop.javagcore;

public class InstantMethod {

    static class Clock {

        int hours = 12;
        int minutes = 00;

        void next() {
            if (this.minutes < 60) {
                minutes++;
            }
            if (this.minutes == 60) {
                this.minutes = 0;
                this.hours++;
            }
            if (this.hours == 13) {
                this.hours = 1;
            }
        }
       /* void next() {
                for(; hours <= 12; hours++){
                    for(; minutes <=59; minutes++){
                        System.out.println("time is: " + hours + ":" + minutes);
                    }
                }
        }*/
    }

    public static void main(String[] args) {
        Clock clock = new Clock(); // time is 12:00
        clock.next(); // time is 12:01
        clock.hours = 10;
        clock.minutes = 59;
        clock.next();
    }

}
