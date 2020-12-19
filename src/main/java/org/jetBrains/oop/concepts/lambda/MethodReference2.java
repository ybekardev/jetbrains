package org.jetBrains.oop.concepts.lambda;

public class MethodReference2 {

    public static void main(String[] args) {
        //Calc calc = new Calc();
        //calc.add(3, 8);

        //reference to static method
        //Calculator cRef = Calc::add;
        //cRef.add(5,9);

        //reference to non-static method
        Calc calc = new Calc();
        Calculator cRef = calc::letsAdd;
        cRef.add(2,8);

        Messenger mRef = Message::new;
        mRef.getMessage("Good Bye");
    }
}

interface Calculator {
    void add(int num1 , int num2);
}

class Calc {
    public static void add(int num1, int num2){
        System.out.println(num1 + num2);
    }
    public void letsAdd(int num1, int num2){
        System.out.println(num1 + num2);
    }
}

interface Messenger {
    Message getMessage(String msg);
}

class Message {
    Message(String msg){
        System.out.println("Message is : " + msg);
    }
}