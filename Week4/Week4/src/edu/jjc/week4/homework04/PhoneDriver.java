package edu.jjc.week4.homework04;

import java.util.Scanner;

public class PhoneDriver {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the price of the phone> ");
        double price = sc.nextDouble();

        System.out.println("Is the phone an Iphone (Y/N)?> ");
        String iphoneAnswer = sc.next();
        boolean isIphone;
        if (iphoneAnswer.equals("Y") || iphoneAnswer.equals("y")) {
            isIphone = true;
        }else is{
            isIphone = false;
        }

        Phone phone = new Phone(price,isIphone, appleCareYears);


    }
}
