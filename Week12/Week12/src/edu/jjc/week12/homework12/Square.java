package edu.jjc.week12.homework12;

public class Square extends Rectangle {
    private double side;
    public Square(int side) {
        //Using the rectangle constructor which takes l w so we need to put side twice as the l w
        super(side,side);
        this.side = side;


    }
    //Overide the default toString but using the same area func from rectangle using super
    @Override
    public String toString() {
        return "Square (side: " + side + ") Area: " + calculateArea();
    }
}
