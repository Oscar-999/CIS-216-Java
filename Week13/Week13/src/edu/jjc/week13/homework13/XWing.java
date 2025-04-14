package edu.jjc.week13.homework13;

public class XWing extends Spaceship{
    // extending the spaceship class an id is needed
    public XWing(int id){
        super(id);
    }
    //Using the Spaceship to string to obtain the cords
    @Override
    public String toString() {
        return String.format("%-8s -> %s", "X-Wing", super.toString());
    }



};
