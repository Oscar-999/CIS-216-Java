package edu.jjc.week5.homework05;
//Oscar Alcantar
//Homework - 5
//Product class

public class Product {
    private double price;
    private double totalSales = 0.00;
//Constructor
    public Product(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
    //Update Total Sales method mulitplys quantity by the price of the product and adds that to the
    //already existing sales
    public void updateTotalSales(int quantity) {
        setTotalSales(getTotalSales() + quantity * getPrice());
    }
}
