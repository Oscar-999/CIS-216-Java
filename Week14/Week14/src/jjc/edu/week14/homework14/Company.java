package jjc.edu.week14.homework14;
//Oscar Alcantar
//Homework14
//Description : You will still build a portfolio containing the stock prices of 20 companies. Replace the
//functionality for generating random companies with functionality to read company data from a
//sequential access plain text file
public class Company {
    private double stockPrice;

    //getter setters
    public double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(double stockPrice) {
        this.stockPrice = stockPrice;
    }
    //Constructor
    public Company(double stockPrice) {
        setStockPrice(stockPrice);
    }
    public double updatePrice() {
        stockPrice *= 1.10;
        return 0;
    }

    @Override
    public String toString() {
        return String.format("$%.2f", getStockPrice());
    }
}
