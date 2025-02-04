package edu.jjc.week4.lab4;

import java.util.Scanner;

//Name: Oscar Alcantar
//Assignment: Week4 Lab3
//Description: Write a Java program with two classes using selection.

public class Driver {
    public static void main(String[] args) {

        for (int i = 1; i<=5; i++) {
            Car car = new Car();
            Scanner scanner =new Scanner(System.in);

            int doors;

            System.out.println("Enter the number of doors" + " Car"+ i + " has: ");
            doors= Integer.parseInt(scanner.nextLine());

            car.setNumberDoors(doors);

            String carType = car.getCarType();

            System.out.println("Car" + i + " is a " +carType +"\n");
        }
    }
}
