package edu.jjc.week13.homework13;

public class Speeder extends Spaceship {
    //extending the spaceship class and setting an id
    public Speeder(int id) {
        super(id);
    }

    @Override
    public String toString() {
        return String.format("%-8s -> %s", "Speeder", super.toString());
    }
}
