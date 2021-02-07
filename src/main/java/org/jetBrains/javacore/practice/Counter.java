package org.jetBrains.javacore.practice;

public class Counter {
    //The keyword volatile is used for visibility.
    //To make visible changes of a value made by one thread to other threads, we should declare the field with the keyword volatile.
    private volatile int value =0;
    public void increment(){
        value++;
    }
    public int getValue(){
        return value;
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        counter.increment();
        System.out.println(counter.getValue()); //value is 1

        MyThread thread1 = new MyThread(counter);
        thread1.start();
        thread1.join();

        MyThread thread2 = new MyThread(counter);
        thread2.start();
        thread2.join();
        System.out.println(counter.getValue()); //value is 3
    }
}

class MyThread extends Thread {
    private final Counter counter;
    public MyThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        counter.increment();
    }
}