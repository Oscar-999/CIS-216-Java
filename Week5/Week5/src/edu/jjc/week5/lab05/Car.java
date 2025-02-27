package edu.jjc.week5.lab05;
//Oscar Alcantar
//Lab 05 - Week 5
// Description : Working on loops Car File
public class Car {
    private String name;

    //Getter
    public String getName() {
        return name;
    }
//Constructor
    public Car(String name) {
        this.name = name;
    }
    public String toString() {
        return "This car is a " + getName();
    }

}
