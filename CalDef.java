
package com.company;

import java.util.Scanner;

public class CalDef {

    public static void main(String[] args) {
        double weightP, heightIn, age, bmr;
        String gender, yOrN;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the TDEE & BMR Calculator");

        do {
            weightP = Validator.getDouble(keyboard, "Enter your weight in pounds:", 10, 800);
            heightIn = Validator.getDouble(keyboard, "Enter your height in inches:", 24, 120);
            age = Validator.getDouble(keyboard, "Enter your age in years:", 1, 130);
            System.out.println("Enter your gender (male or female):");
            gender = keyboard.nextLine();
            CalDefMethods.genderValid(gender);

            bmr = CalDefMethods.bmrCalc(weightP, heightIn, age, gender);
            CalDefMethods.tdeeCalc(bmr);
            System.out.println("Continue? (Y/N)");
            yOrN = keyboard.nextLine();
            yOrN = CalDefMethods.yOrNValid(yOrN);
        }while (yOrN.equalsIgnoreCase("y"));
        System.out.println("Thanks for your time");
    }

}
