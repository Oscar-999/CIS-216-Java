package edu.jjc.week4.homework04;

public class Phone {
    public Phone(int phonePrice, boolean isIphone, int yearsApplecare) {
        this.phonePrice = phonePrice;
        this.isIphone = isIphone;
        this.yearsApplecare = yearsApplecare;
    };
    //Getters and Setters
    public int getPhonePrice() {
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

    private int phonePrice;
    private boolean isIphone;
    private int yearsApplecare;

}
