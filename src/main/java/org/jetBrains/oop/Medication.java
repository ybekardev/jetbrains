package org.jetBrains.oop;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Medication {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Patience Name:");
        String patientName = scan.nextLine();
        System.out.println("Enter Location:");
        String location = scan.nextLine();
        System.out.println("Enter Bin Size:");
        String binSize = scan.nextLine();
        System.out.println("Enter Medication Name:");
        String medicationName = scan.nextLine();
        System.out.println("Enter Medication ID:");
        String medicationId = scan.nextLine();
        System.out.println("Enter Patience Medication Take:");
        int patienceMedicationTake = scan.nextInt();

        int totalMedicationInventory;
        int remainingMedication;

        switch (binSize) {
            case "large":
                System.out.println("Patience Name: \n" + patientName);
                System.out.println("Location: \n" + location);
                System.out.println("Large store: 2 bins - 15 units");
                System.out.println("Medication Name: \n" + medicationName);
                System.out.println("Medication ID: \n" + medicationId);
                totalMedicationInventory = 2*15;
                remainingMedication = totalMedicationInventory-patienceMedicationTake;
                System.out.println(remainingMedication + " - " + totalMedicationInventory);
                if(remainingMedication < (totalMedicationInventory/5)){
                    System.out.println("Action required!!! \nRefill needed, remaining medication amount: " + remainingMedication);
                }
                break;
            case "medium":
                System.out.println("Patience Name: \n" + patientName);
                System.out.println("Location: " + location);
                System.out.println("Medium store: 5 bins - 10 units");
                System.out.println("Medication Name: \n" + medicationName);
                System.out.println("Medication ID: \n" + medicationId);
                totalMedicationInventory = 5 * 10;
                remainingMedication = totalMedicationInventory - patienceMedicationTake;
                if(remainingMedication < (totalMedicationInventory/5)){
                    System.out.println("Action required!!! \nRefill needed, remaining medication amount: " + remainingMedication);
                }
                break;
            case "small":
                System.out.println("Patience Name: \n" + patientName);
                System.out.println("Location: " + location);
                System.out.println("Small store: 3 bins - 5 units");
                System.out.println("Medication Name: \n" + medicationName);
                System.out.println("Medication ID: \n" + medicationId);
                totalMedicationInventory = 3 * 5;
                remainingMedication = totalMedicationInventory - patienceMedicationTake;
                if(remainingMedication < (totalMedicationInventory/5)){
                    System.out.println("Action required!!! \nRefill needed, remaining medication amount: " + remainingMedication);
                }
                break;
            default:
                System.out.println("Invalid Entry!");
                break;
        }

    }
}
