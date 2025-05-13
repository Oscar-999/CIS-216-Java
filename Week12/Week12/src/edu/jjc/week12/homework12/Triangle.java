package edu.jjc.week12.homework12;
//Oscar Alcantar
//Homework12: The objective of this project is to reinforce understanding of polymorphism and inheritance
//concepts in object-oriented programming by implementing a simple shape hierarchy and an
//area calculator
public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    //Override the calculate area method and the to string method
    @Override
    public double calculateArea() {
        return 0.5 * base*height;
    }

    @Override
    public String toString() {
        return "Triangle (base: " + base + ", height: " + height + ") Area: " + calculateArea();
    }
}
