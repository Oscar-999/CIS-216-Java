//Oscar Alcantar - Java Programming
//Homework 1
import java.util.Scanner;
//Simple Car input and output assignment
public class Car {
    public static void main(String[] args) {
        // Sets up the scanner for the user input
        Scanner scanner = new Scanner(System.in);
        // Variable declaration
        String name;
        //Prompts user for car name
        System.out.println("Type the name of a car:");
        //saves userinput to the name variable
        name = scanner.next();
        // Prints out the car name we typed
        System.out.printf("The car is a %s.\n", name);

    }
}
