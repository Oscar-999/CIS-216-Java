package edu.jjc.week4.lab4;

//Name: Oscar Alcantar
//Assignment: Week4 Lab3
//Description: Write a Java program with two classes using selection.

public class Car {
    public int getNumberDoors() {
        return numberDoors;
    }

    public void setNumberDoors(int numberDoors) {
        this.numberDoors = numberDoors;
    }
    public String getCarType() {
        if (numberDoors <= 2) {
            return "sports car";
        }
        else {
            return "sedan";
        }
    }

    private int numberDoors;


}
