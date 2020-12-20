package org.jetBrains.designpatterns.singleton;

import java.util.Arrays;

public enum EnumSingleton {

    WEEKDAYS("Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday", "Sunday");
    private String[] days;
    EnumSingleton(String ... days) {
        this.days = days;
    }
    // EnumSingleton(String monday, String tuesday, String wednesday,
    // String thursday, String friday, String saturday, String sunday) {}
    public String[] getDays() {
        return this.days;
    }

    @Override
    public String toString() {
        return "EnumSingleton{" + "days=" + Arrays.toString(days) + '}';
    }

    public static void main(String[] args) {
        System.out.println(EnumSingleton.WEEKDAYS);
        String[] ls = null;
        for(int i = 0; i < EnumSingleton.WEEKDAYS.getDays().length; i++){
            ls = EnumSingleton.WEEKDAYS.getDays();
            System.out.println(ls[i]);
        }
        //with for each
        for(String s : ls){
            System.out.println(s);
        }
    }
}
