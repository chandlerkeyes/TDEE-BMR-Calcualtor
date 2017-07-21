package com.company;

import java.util.Scanner;

/**
 * Created by chand on 6/30/2017.
 */

public class CalDefMethods {
    public static Scanner keyboard = new Scanner(System.in);

    public static double bmrCalc(double weightP, double heightIn, double age, String gender) {
        double bmr;
        double weightKg = 0.454 * weightP;
        double heightCm = 2.54 * heightIn;

        if (gender.equalsIgnoreCase("female")) {
            bmr = (10 * weightKg) + (6.25 * heightCm) - (5 * age) - 161;
        } else {
            bmr = (10 * weightKg) + (6.25 * heightCm) - (5 * age) + 5;
        }
        return bmr;
    }

    public static double tdeeCalc(double bmr) {
        double tdee = 0;
        //CalDefMethods.checkActivity();

        System.out.println("Which of the following describes you?");
        System.out.println("A. Very Active B. Moderately Active C. Lightly Active D. Non-Active");
        String active = keyboard.nextLine();
        String routine = CalDefMethods.routineValid(active);
          if (routine.equalsIgnoreCase("a")) {
            tdee = bmr * 1.725;
        } else if (routine.equalsIgnoreCase("b")) {
            tdee = bmr * 1.55;
        } else if (routine.equalsIgnoreCase("c")) {
            tdee = bmr * 1.375;
        } else if (routine.equalsIgnoreCase("d")) {
            tdee = bmr * 1.2;
        }
        System.out.println("Your TDEE is " + tdee + " and your BMR is " + bmr);
        return tdee;
    }
    public static String yOrNValid(String yOrN) {
        while (!yOrN.equalsIgnoreCase("y") && !yOrN.equalsIgnoreCase("n")) {
            System.out.println("Invalid Input. Please enter Y or N: ");
            yOrN = keyboard.nextLine();
        }
        return yOrN;
    }
    public static String genderValid(String gender) {
        while (!gender.equalsIgnoreCase("male") && !gender.equalsIgnoreCase("female")) {
            System.out.println("Invalid Input. Please enter male or female: ");
            gender = keyboard.nextLine();
        }
        return gender;
    }
    public static String routineValid(String routine) {
        while ((!routine.equalsIgnoreCase("a")) && (!routine.equalsIgnoreCase("b")) &&
                (!routine.equalsIgnoreCase("c")) && (!routine.equalsIgnoreCase("d"))){
            System.out.println("Invalid Input. Please enter A, B, C, D: ");
            routine = keyboard.nextLine();
        }
        return routine;
    }

}
