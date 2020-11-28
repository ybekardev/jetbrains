package org.jetBrains.oop.concepts;

import java.util.Scanner;

public class Enums {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        UserStatus userStatus = UserStatus.valueOf(scan.nextLine());

        switch(userStatus){
            case PENDING:
                System.out.println("Pending activity");
                break;
            case ACTIVE:
                System.out.println("Active activity");
                break;
            case BLOCKED:
                System.out.println("Blocked activity");
                break;
        }

        for(UserStatus status : UserStatus.values()){
            System.out.println("\nThe Enum type: \n" +status);
        }

        System.out.println("The current enum value is : " + userStatus.name());
        System.out.println("The current enum value is : " + userStatus.valueOf(String.valueOf(userStatus)));
        System.out.println("The current enum position is : " + userStatus.ordinal());
        System.out.println("The BLOCKED enum value is : " + UserStatus.BLOCKED.ordinal());
        System.out.println("The current enum value is BLOCKED : " + userStatus.equals(UserStatus.BLOCKED));
        System.out.println("The current enum value equality : " + userStatus.equals(UserStatus.valueOf(String.valueOf(userStatus))));



        //Compare objects
        UserStatus userStatus1 = UserStatus.ACTIVE;
        UserStatus userStatus2 = UserStatus.ACTIVE;
        UserStatus userStatus3 = UserStatus.BLOCKED;

        System.out.println(userStatus1 == userStatus2); //true
        System.out.println(userStatus1.equals(userStatus2)); //true
        System.out.println(userStatus1 == userStatus3); //false



        ChargeLevel chargeLevel = ChargeLevel.valueOf(scan.nextLine());
        switch (chargeLevel){
            case LOW:
                System.out.println("Low Energy");
                break;
            case MEDIUM:
                System.out.println("Medium Energy");
                break;
            case HIGH:
                System.out.println("High Energy");
                break;
            case FULL:
                System.out.println("Full Energy");
        }

        ChargeLevel chargeLevel1 = ChargeLevel.findBySections(4);
        System.out.println(chargeLevel1);

        ChargeLevel chargeLevel2 = ChargeLevel.findByColor("green");
        System.out.println(chargeLevel2);

        for (ChargeLevel value: ChargeLevel.values()) {
            System.out.println(value.sections);
            System.out.println(value.color);
            System.out.println(value.getColor());
            System.out.println(value.getSections());

        }
    }
}
