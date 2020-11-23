package org.jetBrains.designpatterns.singleton;

public class Singleton {

    //The pattern ensures that there is only one instance of the class and provides global access to it for the outer world.
    private static volatile Singleton instance = null; // volatile guarantees the visibility for other threads of writes to that variable
    private Singleton(){ }

        public static synchronized Singleton getInstance(){ //if you add sync in the method name it will be thread-safe
        if(instance == null){
            //lazy instantiating
            //the singleton instance is not created until the getInstance method is called for the first time. This technique ensures that singleton instances are created only when needed.
            synchronized (Singleton.class){
                //first instantiation is null and the object will be created once and it will not be kept as null next time and the same object/value will be used in the other calls
            if(instance == null) {
                instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
