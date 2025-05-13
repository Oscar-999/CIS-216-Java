package jjc.edu.week14.homework14;
//Oscar Alcantar
//Homework14
//Description : You will still build a portfolio containing the stock prices of 20 companies. Replace the
//functionality for generating random companies with functionality to read company data from a
//sequential access plain text file

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Portfolio {
    public static void main(String[] args) {
        final int SIZE = 20; // Setup the variable 20 to to be used for the loops and setting array size of 20
        Company[] companies = new Company[SIZE]; // Makes an array of comapnys size 20

        try {
            File inputFile = new File("Week12HomeworkDataFile.txt");
            Scanner scanner = new Scanner(inputFile);

            int index = 0;
            while (scanner.hasNext() && index < SIZE) {// Scanner .hasnext is checking if there is another line to go
                String type = scanner.next(); // Saves Technology or manufacture to a string
                double price = scanner.nextDouble(); // Saving the int to a double

                if (type.equalsIgnoreCase("Technology")) { // if the word is technology it will add a technology company to the array otherwise it will be a manafacturing compay
                    companies[index] = new Technology(price);
                } else {
                    companies[index] = new Manufacturer(price);
                }
                index++;
            }
            scanner.close();

            //Loop 1 - display original prices with an enhanced for loop
            System.out.println("Original Portfolio");
            for (Company company : companies) {
                System.out.println(company);
            }

            // l2 update prices, display and write to output file
            FileWriter writer = new FileWriter("UpdatedStockPrices.txt");
            System.out.println("\nUpdated Portfolio");
            for (Company company : companies) {
                company.updatePrice(); // update the current stock peice in the array of each company
                System.out.println(company); // print company
                writer.write(company.toString() + "\n"); // Write company w/ update price to new file
            }
            writer.close();



        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

