package org.jetBrains.oop.javafx.practice;

import java.text.ParseException;

public class EpochTime {


    void epochTime() throws ParseException {
        //How to get the current epoch time in …
        long epochCurrentTime = System.currentTimeMillis() / 1000;
        System.out.println(epochCurrentTime);

        //Convert from human-readable date to epoch
        long dateToEpoch = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").parse("07/07/2020 01:00:00").getTime() / 1000;
        System.out.println(dateToEpoch);

        //Convert from epoch to human-readable date
        String epochToDate = new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date(epochCurrentTime * 1000));
        System.out.println(epochToDate);
    }



}
