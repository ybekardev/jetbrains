package org.jetBrains.designpatterns.builder;

public class AlertDialogTest {

    public static void main(String[] args) {

        AlertDialog allArgConst = new AlertDialog.Builder()
                .setTitle("Two buttons dialog")
                .setText("Click 'Okay' or 'Cancel'")
                .setApplyButton("Okay")
                .setCancelButton("Cancel")
                .setPicture("The SS of the process")
                .setFooter("Sending note...")
                .build();

        System.out.println(allArgConst);

        AlertDialog multipleArgs = new AlertDialog.Builder()
                .setTitle("Json App")
                .setApplyButton("OK")
                .setCancelButton("NO")
                .build();

        System.out.println(multipleArgs);
    }
}
