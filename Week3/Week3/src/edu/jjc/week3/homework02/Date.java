package edu.jjc.week3.homework02;
//Oscar Alcantar - Date Class

public class Date {
    //Instance Variables
    private int month;
    private int day;
    private int year;
    //Constructor
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    //Getter for year
    public int getYear() {
        return year;
    }
    //Setter for year
    public void setYear(int year) {
        this.year = year;
    }
    //Getter for day
    public int getDay() {
        return day;
    }
    //Setter for Day
    public void setDay(int day) {
        this.day = day;
    }
    //Getter for month
    public int getMonth() {
        return month;
    }
    //Setter for Month
    public void setMonth(int month) {
        this.month = month;
    }
    // Prints out the date with the month day and year
    public void displayDate() {
        System.out.println("Date is " + month + "/" + day + "/" + year);
    }
}
