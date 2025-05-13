package jjc.edu.week14.homework14;
//Oscar Alcantar
//Homework14
//Description : You will still build a portfolio containing the stock prices of 20 companies. Replace the
//functionality for generating random companies with functionality to read company data from a
//sequential access plain text file
public class Technology extends Company{
    //Constructor
    public Technology(double stockPrice){
        super(stockPrice);
    }
    // Will print technology and then the tostring of Compant
    @Override
    public String toString() {
        return String.format("%-15s %s", "Technology", super.toString());
    }
}
