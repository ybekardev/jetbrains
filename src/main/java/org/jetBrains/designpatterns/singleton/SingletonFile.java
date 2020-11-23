package org.jetBrains.designpatterns.singleton;

import java.util.UUID;

public class SingletonFile {

    private static volatile String fileInstance;
    private SingletonFile(){}
    public static synchronized String getInstance(){
        if(fileInstance == null) {
            synchronized (SingletonFile.class) {
                if (fileInstance == null) {
                    System.out.println("Instantiation will happen only once!");
                    fileInstance = new String();
                    UUID fileName = UUID.randomUUID();
                    fileInstance = fileName.toString();
                    System.out.println(fileInstance);
                }
            }
        }
        return fileInstance;
    }




}
