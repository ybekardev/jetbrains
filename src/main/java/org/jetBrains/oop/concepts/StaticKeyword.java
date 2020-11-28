package org.jetBrains.oop.concepts;

import java.text.ParseException;
import java.util.Date;

public class StaticKeyword {

    public Date dateOfNow(){
        Date lastCreation = new Date();
        System.out.println(lastCreation);
        return lastCreation;
    }

    public static final Date dateNow(){
        Date date = new Date();
        System.out.println(date);
        return date;
    }

    public static void getDateNow(){
        StaticKeyword staticKeyword = new StaticKeyword();
        Date d1 = staticKeyword.dateOfNow();
        Date d2 = StaticKeyword.dateNow();
        System.out.println(d1 + " " + d2);
    }

    public static void main(String[] args) throws InterruptedException, ParseException {
        //The value of the static field is changed in the class constructor every time a new object is created.
        StaticKeyword staticKeyword = new StaticKeyword();
        Date d1 = staticKeyword.dateOfNow();
        Date d2 = StaticKeyword.dateNow();
        System.out.println(d1 + " " + d2);
        StaticKeyword.getDateNow();
        staticKeyword.dateOfNow();
        StaticKeyword.dateNow();
        System.out.println(StaticKeyword.getInstance());
        Thread.sleep(3000);
        staticKeyword.dateOfNow();
        StaticKeyword.dateNow();
        System.out.println(StaticKeyword.getInstance());

        Thread.sleep(3000);

        StaticKeyword staticKeyword2 = new StaticKeyword();
        staticKeyword2.dateOfNow();
        StaticKeyword.dateNow();
        System.out.println(StaticKeyword.getInstance());
        Thread.sleep(3000);
        staticKeyword2.dateOfNow();
        StaticKeyword.dateNow();
        System.out.println(StaticKeyword.getInstance());
        System.out.println(d1 + " " + d2);
        StaticKeyword.getDateNow();

    }


    //The pattern ensures that there is only one instance of the class and provides global access to it for the outer world.
    public static volatile Date date = null; //new Date();
    // volatile guarantees the visibility for other threads of writes to that variable

    private StaticKeyword(){ } // blocking a new object instantiating with this default constructor

    public static synchronized Date getInstance(){ //if you add sync in the method name it will be thread-safe
        if(date == null){
            //lazy instantiating
            //the singleton instance is not created until the getInstance method is called for the first time. This technique ensures that singleton instances are created only when needed.
            synchronized (StaticKeyword.class){
                //first instantiation is null and the object will be created once and it will not be kept as null next time and the same object/value will be used in the other calls
                if(date == null) {
                    date = new Date();
                }
            }
        }
        return date;
    }
}
