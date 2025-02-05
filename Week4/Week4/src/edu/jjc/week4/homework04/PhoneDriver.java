package edu.jjc.week4.homework04;

import java.util.Scanner;

//Oscar Alcantar
//Homework Week 4
//Description : The JJC Phone Store needs a program to compute phone charges for some phones sold in the
//store. There are two different pricing systems, depending on the phone purchased. Tax must be
//added on after the phone charge is computed. Each customer gets a neatly formatted receipt
//displayed to the screen

public class PhoneDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //Asks user for price and if it is an iphone
        System.out.print("Enter the price of the phone> ");
        double price = sc.nextDouble();

        System.out.print("Is the phone an Iphone (Y/N)?> ");
        String iphoneAnswer = sc.next();
        //Logic for appleCareYears
        boolean isIphone;
        isIphone = iphoneAnswer.equalsIgnoreCase("Y");
        int appleCareYears = 0;
        //This will only run if it is an iphone
        if(isIphone) {
            while(appleCareYears < 1) {
                System.out.print("Enter the number of years of AppleCare> ");
                appleCareYears = sc.nextInt();
                if (appleCareYears < 1) {
                    System.out.println("Number of years for AppleCare must be at least 1.");
                }
            }
        }
        //Printing out Results
        Phone phone = new Phone(price,isIphone, appleCareYears);
        System.out.printf("Price of phone         $%.2f%n", phone.getPhonePrice());
        System.out.printf("Total purchase         $%.2f%n", phone.getTotalPurchase());

        sc.close();

    }
}
