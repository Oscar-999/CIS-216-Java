package edu.jjc.week12.homework12;
//Oscar Alcantar
//Homework12: The objective of this project is to reinforce understanding of polymorphism and inheritance
//concepts in object-oriented programming by implementing a simple shape hierarchy and an
//area calculator
public class Rectangle extends Shape {
    //data members
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

// Same override to calculate area for the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle (width: " + width + ", length: " + length + ") Area: " + calculateArea();
    }
}
