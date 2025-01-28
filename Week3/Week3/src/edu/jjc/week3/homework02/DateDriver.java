package edu.jjc.week3.homework02;
//Oscar Alcantar - Homework 2
//This Driver creates a date instance the date instance prints out a date then prompts the user for new m,d,y values. The values are updated and the new date is called.
import java.util.Scanner;

public class DateDriver {
    public static void main(String[] args) {
        // initialize a date object
        Date newDate = new Date(1,28,2025);
        //Call the displays date method of the date class
        newDate.displayDate();

        //Create a scanner
        Scanner scanner = new Scanner(System.in);

        //Prompt User for new date values
        System.out.print("New Month: ");
        int month = scanner.nextInt();

        System.out.print("New Day: ");
        int day = scanner.nextInt();

        System.out.print("New Year: ");
        int year = scanner.nextInt();


        //Set new dates
        newDate.setMonth(month);
        newDate.setDay(day);
        newDate.setYear(year);

        // Print the date (Updated Values)
        newDate.displayDate();

        //Stop Scanner
        scanner.close();


    }
}
