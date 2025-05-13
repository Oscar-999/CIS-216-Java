package edu.jjc.week11.homework11;
//Oscar Alcantar
//Homework11
//Description : You will build a portfolio containing the stock prices of 20 companies. The portfolio will be built by flipping a coin and adding a Technology company or a Manufacturing company to the portfolio based on the outcome of the coin flip. Your program will use four classes to demonstrate inheritance: Company, Technology, Manufacturer and Portfolio (the driver class). The details of these classes are outlined below

public class Manufacturer extends Company {
    //Construsctor
    public Manufacturer(double stockPrice) {
        super(stockPrice);
    }

    @Override
    public String toString() {
        return String.format("%-15s %s", "Manufacturer", super.toString());

    }
}
