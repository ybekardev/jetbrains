package org.jetBrains.designpatterns.singleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args) {

        System.out.println("Enter your statement selection: detailed / mini");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String selection = null;

        try{
            selection = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Factory factory = StatementFactory.getUniqueInstance();
        StatementType statementType = factory.createStatement(selection);
        System.out.println(statementType.printStatement());

    }

    //https://dzone.com/articles/singleton-design-pattern-%E2%80%93
}
