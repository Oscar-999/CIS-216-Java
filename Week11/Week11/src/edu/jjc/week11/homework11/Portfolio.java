package edu.jjc.week11.homework11;

import java.util.Random;

public class Portfolio {
    public static void main(String[] args) {
        //instiate random object
        Random rand = new Random();

        //conter controll loop print 20
        for (int i = 0; i < 20; i++) {
            double stockPrice = i * 0.11 + 1;
            Company company;

            // random coin flip if it is 2 tech is created otherwise Manafacture is
            if (rand.nextInt(2) == 0) {
                company = new Technology(stockPrice);
            }else {
                company = new Manufacturer(stockPrice);
            }
            //Calls company itself since we setup a toString method for each class
            System.out.println(company);
        }
    }
}
