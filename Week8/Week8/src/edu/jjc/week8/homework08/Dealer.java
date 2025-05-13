package edu.jjc.week8.homework08;

//Oscar Alcantar
//Homework 7
//Description : Write a Java application to handle adding, deleting, and printing cars from a dealer inventory,
//using the Java ArrayList class

import java.util.ArrayList;
import java.util.Scanner;

public class Dealer {
    public static void main(String[] args) {
    ArrayList<Car> cars = new ArrayList<Car>();
    Scanner sc = new Scanner(System.in);

    int choice;

        System.out.println("Welcome to the JJC Car Dealership Inventory Program");
        do {
        displayMenu();// Calls display menu and it assigns that value to choice variable
        choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                addData(cars);
                break;
                case 2:
                    deleteData(cars);
                    break;
                    case 3:
                        printData(cars);
                        break;

                        case 4:
                            break;

        }
    } while (choice != 4); // Stops the loop when a user exits
    sc.close();
    }

    // Menu
    public static void displayMenu() {
        System.out.println("\n1. Add a car to inventory");
        System.out.println("2. Delete a car from inventory");
        System.out.println("3. Print inventory");
        System.out.println("4. Exit\n");
        System.out.print("Your choice: ");
    }
    public static void addData(ArrayList<Car> cars) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type of Car: ");
        String make = sc.nextLine();
        System.out.print("Price of Car: ");
        int price = sc.nextInt();
        //Adding a new Car object into array with the usr defined make and price
        cars.add(new Car(make, price));

    }
    public static void deleteData(ArrayList<Car> cars) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type of Car to delete: ");
        String make = sc.nextLine();
        //Sets user make to variable

        for (int i = 0; i < cars.size(); i++) {
            //Checks array to see if any of the makes using getMake() matches the user defined make
            if (cars.get(i).getMake().equalsIgnoreCase(make)) {
                cars.remove(i);// Remove that car object out of the array
                System.out.println(make + " deleted from inventory");
                return;
            }
            else {
                System.out.print("No such car in inventory\n");
            }
        }
    }
    public static void printData(ArrayList<Car> cars) {
        System.out.printf("%-10s %10s\n", "Make", "Price");
        System.out.println("----            -----");
        for (Car car : cars) { // Enhanced 4 loop
            System.out.printf("%-10s %10d\n", car.getMake(), car.getPrice());
        }
    }


}
