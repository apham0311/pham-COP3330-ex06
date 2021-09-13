package org.example;
import java.util.Scanner;
import java.util.Calendar;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Anh Pham
 *
 */
public class App 
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("How old are you?");
        String ageStr = scanner.nextLine();
        boolean completed = false;
        int age = 0;
        while(!completed) {
            if (isNum(ageStr)) {
                age = Integer.parseInt(ageStr);
                completed = true;
            } else {
                System.out.println("Error! Please enter numbers only:");
                ageStr = scanner.nextLine();
            }
        }
        System.out.println("At what age would you like to retire?");
        String retireStr = scanner.nextLine();
        completed = false;
        int retire = 0;
        while(!completed) {
            if (isNum(retireStr)) {
                retire = Integer.parseInt(retireStr);
                completed = true;
            } else {
                System.out.println("Error! Please enter numbers only:");
                retireStr = scanner.nextLine();
            }
        }

        int lengthTillRetirement = retire - age;
        if(lengthTillRetirement<0) {
            System.out.println("You could have retired " + Math.abs(lengthTillRetirement) + " years ago! \n" +
                    "It is " + year + " so you could have retired in " + (year + lengthTillRetirement));
        }
        else if(lengthTillRetirement == 0) {
            System.out.println("You are able to retire now!");
        }
        else {
            System.out.println("You have " + lengthTillRetirement + " years until you can retire. \n" +
                    "It is " + year + ", so you can retire in " + (year + lengthTillRetirement));
        }

    }

    private static boolean isNum(String input) {
        boolean isNum = true;
        try {
            Integer.parseInt(input);
        }
        catch(NumberFormatException e) {
            isNum = false;
        }
        return isNum;
    }

}
