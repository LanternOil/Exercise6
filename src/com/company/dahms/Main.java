package com.company.dahms;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    userInput.promptInt("Please enter a whole number.");
        userInput.promptDouble("Please enter a number with a decimal place.");
    }

}

class userInput {
    public static Scanner input = new Scanner(System.in);
    public static void promptString(String message){

        String userInput = input.next();


        boolean isString = false;
        while (!isString) {
            try {
                System.out.println(message);
                Double.parseDouble(userInput);
                System.out.println("That's not a word. Try again.");
            } catch (NumberFormatException e) {
                System.out.println(userInput);
                isString=true;
            }
        }
    }

    public static void promptInt(String message){
        System.out.println(message);
        String userInput = input.nextLine();

        int userInt = 0;
        boolean isInt = false;
        while (!isInt){
            try{
                userInt = Integer.parseInt(userInput);
                System.out.println(userInt);
                isInt = true;
            }
            catch (InputMismatchException e){
                System.out.println("Incorrect data type, please try again.");
            }
        }
    }

    public static void promptDouble(String message){
        System.out.println(message);
        String userInput = input.nextLine();

        double userDouble = 0;
        boolean isDouble = false;
        while (!isDouble){
            try{
                userDouble = Double.parseDouble(userInput);
                System.out.println(userDouble);
                isDouble = true;
            }
            catch (InputMismatchException e){
                System.out.println("Incorrect data type, please try again.");
            }
        }
    }
}