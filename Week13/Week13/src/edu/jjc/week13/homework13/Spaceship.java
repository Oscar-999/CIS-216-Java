package edu.jjc.week13.homework13;

public class Spaceship {
    private int id;
    private int xCoordinate;
    private int yCoordinate;

    public Spaceship(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | Location: (%d, %d)", id, xCoordinate, yCoordinate);
    }

}
