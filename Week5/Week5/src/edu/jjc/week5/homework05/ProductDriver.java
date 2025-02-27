package edu.jjc.week5.homework05;
//Oscar Alcantar
//Homework - 5
//Summary: Write a Java application that calculates total retail values for a series of inventory
//items input by the user.

import java.util.Scanner;

public class ProductDriver
{
    public static void main(String[] args) {
        //Five product objects created
        Product product1 = new Product(2.98);
        Product product2 = new Product(4.50);
        Product product3 = new Product(9.98);
        Product product4 = new Product(4.29);
        Product product5 = new Product(8.67);

        Scanner sc = new Scanner(System.in);

        while(true) {
            // Asks user for which product number they want to access
            System.out.print("Product Number: ");
            int productNum = sc.nextInt();

            if (productNum == 0) break;
            // Asks user how many products where sold to the corresponding product they just typed.
            System.out.print("Quantity Sold: ");
            int quantitySold = sc.nextInt();
            // This switch statement uses the product number the user typed
            switch(productNum) {
                case 1: product1.updateTotalSales(quantitySold); break;
                case 2: product2.updateTotalSales(quantitySold); break;
                case 3: product3.updateTotalSales(quantitySold); break;
                case 4: product4.updateTotalSales(quantitySold); break;
                case 5: product5.updateTotalSales(quantitySold); break;
                default: System.out.println("Invalid Product Number");
            }


        }
        // Display the formatted Products and the price corresponding with each
        System.out.print("\nTotal Sales\n===========\n");
        System.out.printf("Product 1: $%,10.2f%n",product1.getTotalSales());
        System.out.printf("Product 2: $%,10.2f%n",product2.getTotalSales());
        System.out.printf("Product 3: $%,10.2f%n",product3.getTotalSales());
        System.out.printf("Product 4: $%,10.2f%n",product4.getTotalSales());
        System.out.printf("Product 5: $%,10.2f%n",product5.getTotalSales());


    }
}
