package com.example.helloworld;

import java.lang.ref.Cleaner;
import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.print("Hello World");

//        int number = -5;
//        System.out.println(number);
//        long myLong = 5;
//        System.out.println(myLong);
//        //long is for bigger numbers
//
//        double myDouble = 4.5;
//        float myFloat =(float) 4.5;
//        //float is for smaller number
//
//        char myChar = 'B';
//        //int,long - double,float - char are Primitive Data Types
//
//        String name = "Baturay";
//        System.out.println(name);
//        // String is a class
//
//        boolean myBoolean = false; // or true
//        //conditional statements

        System.out.println("Welcome to Wonderland!");
        System.out.println("May I have your name, please?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello Mr/Mrs/Miss " + name + "!");


        System.out.println("Shall we begin the game?");
        System.out.println("\t1. Yes, please.");
        System.out.println("\t0. No, I need a bit time. :P");

        int beginAnswer = scanner.nextInt();

        while (beginAnswer != 1) {
            System.out.println("Shall we begin the game?");
            System.out.println("\t1. Yes, please.");
            System.out.println("\t1. No, I need a bit time. :P");

            beginAnswer = scanner.nextInt();
        }

        Random random = new Random();
        int x = random.nextInt(20) + 1;
        System.out.print("Guess a number, please: ");
        int userInput = scanner.nextInt();

        int timesTried = 0;
        boolean hasWon = false;
        boolean shouldFinish = false;

        while (!shouldFinish) {
            timesTried++;

            if (timesTried < 5) {
                if (userInput == x) {
                    hasWon = true;
                    shouldFinish = true;
                } else if (userInput > x) {
                    System.out.println("Guess lower!");
                    userInput = scanner.nextInt();
                } else {
                    System.out.println("Guess higher!");
                    userInput = scanner.nextInt();
                }
            } else {
                shouldFinish = true;
            }
        }


        if (hasWon) {
            System.out.println("Congratulations! you have guessed in your " + timesTried + " guess.");
        } else {
            System.out.println("Game Over! You are outta limit. :(");
            System.out.println("The number was " + x + "!");
        }

    }
}



