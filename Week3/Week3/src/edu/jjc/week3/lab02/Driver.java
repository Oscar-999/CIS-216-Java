package edu.jjc.week3.lab02;
//Oscar Alcantar - Lab2
//Driver class  - Calls the class car from the car.java file
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        Car car = new Car();

        String carName;

        System.out.println("Enter the car name: ");
        carName=scanner.nextLine();

        car.setName(carName);

        System.out.println(car.getName());
    }
}
