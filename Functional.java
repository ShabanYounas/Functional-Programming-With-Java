package com.company;
import com.sun.source.tree.IfTree;

import java.util.Scanner;
import java.util.function.Function;

import java.io.*;
// Input output on some basic level
//Conversation Between family
public class Functional {
    /*static void mymethod() {

    }*/
    /*static void WhatHappened(){
        System.out.println( "what happened");
    }*/

    public static void main(String[] args) throws InterruptedException {
        //System.out.println("Hello and welcome home you cheeky Sod How are you");
        Scanner scanner = new Scanner(System.in);

        String firstName;
        String lastName;
        String birthdayMonth;
        int age;
        int day;
        int month;
        int year;
        String correction;
        String Information;


        System.out.println("how old are you?");
        age = scanner.nextInt();
        if (age <= 18) {
            System.out.println("Are you studying");
        } else if (age >= 19) {
            System.out.println("dammmnnnn you old");
            Thread.sleep(3000);
            System.out.println("chill chill i am joking");
        }


        System.out.println("which month is your birthday?");
        birthdayMonth = scanner.next();


        Thread.sleep(1000);

        System.out.println("whats your first name");
        firstName = scanner.next();

        Thread.sleep(3000);

        System.out.println("whats your Last name");
        lastName = scanner.next();

        Thread.sleep(3000);

        System.out.println("what day were you born");
        day = scanner.nextInt();
        if (day == 22) {
            System.out.println("OMG thats same as me");
        }
        Thread.sleep(1000);

        System.out.println("what month were you born in");

        month = scanner.nextInt();
        if (month == 4) {
            System.out.println("I were born in the same month");
        }

        System.out.println("what year were you born in");
        year = scanner.nextInt();
        if (year == 1993) {
            System.out.println("OMG we share the same birthday");
        }
        System.out.println(
                "so far this is what i have" +
                " Your Firstname which if " + firstName +
                        " Your last name " + lastName +
                " The month of your Birthday " + birthdayMonth +
                " Your age which is " + age + " The day you were born " +
                " The month you were born " + month +
                        " and finally the year you were born in " + year);

        Thread.sleep(2000);
        System.out.println("is this correct please answer true or false ");
        correction = scanner.next();
        // if types yes then finish the run and display a message that show that its been stored correctly.
        scanner.close();
        System.out.println(scanner);
    }

}




