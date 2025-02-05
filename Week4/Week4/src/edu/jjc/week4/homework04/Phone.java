package edu.jjc.week4.homework04;
//Oscar Alcantar
//Homework Week 4
//Description : The JJC Phone Store needs a program to compute phone charges for some phones sold in the
//store. There are two different pricing systems, depending on the phone purchased. Tax must be
//added on after the phone charge is computed. Each customer gets a neatly formatted receipt
//displayed to the screen
public class Phone {
    public Phone(double phonePrice, boolean isIphone, int yearsApplecare) {
        this.phonePrice = phonePrice;
        this.isIphone = isIphone;
        this.yearsApplecare = yearsApplecare;
    };
    //Getters and Setters
    public double getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(int phonePrice) {
        this.phonePrice = phonePrice;
    }

    public boolean getIsIphone() {
        return isIphone;
    }

    public void setIphone(boolean iphone) {
        isIphone = iphone;
    }

    public int getYearsApplecare() {
        return yearsApplecare;
    }

    public void setYearsApplecare(int yearsApplecare) {
        this.yearsApplecare = yearsApplecare;
    }

    public double getTotalPurchase(){
        double subtotal = getPhonePrice();
        if(getIsIphone()) {
            //Ternary operator so if it is only one year 12% price or 10% price times the amnt of years
            double appleCarePrice = (getYearsApplecare() == 1) ?
                    getPhonePrice() * 0.12
                    : getPhonePrice() * 0.10 * getYearsApplecare();
            subtotal += appleCarePrice;
        }
        double tax = subtotal * 0.05;

        return subtotal + tax;

    };

    private double phonePrice;
    private boolean isIphone;
    private int yearsApplecare;

}
