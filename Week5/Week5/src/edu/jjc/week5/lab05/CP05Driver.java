package edu.jjc.week5.lab05;

import java.util.Scanner;
//Oscar Alcantar
//Lab 05 - Week 5
// Description : Working on loops Driver File
public class CP05Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many cars do you want to enter: ");
        int carNumbers = sc.nextInt();

        Car[] cars = new Car[carNumbers];

        for (int i = 0; i < carNumbers; i++) {
            System.out.print("Enter car name: ");
            String carName = sc.next();
            Car car = new Car(carName);
            cars[i] = car;
        }

        for (int i = 0; i < carNumbers; i++) {
            System.out.println(cars[i].toString() + " ");
        }
    }

}
