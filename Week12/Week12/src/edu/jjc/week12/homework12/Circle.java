package edu.jjc.week12.homework12;
//Oscar Alcantar
//Homework12: The objective of this project is to reinforce understanding of polymorphism and inheritance
//concepts in object-oriented programming by implementing a simple shape hierarchy and an
//area calculator
public class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
//Override the default calculate area method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle (radius=" + radius + ") Area: " + calculateArea();
    }


}
