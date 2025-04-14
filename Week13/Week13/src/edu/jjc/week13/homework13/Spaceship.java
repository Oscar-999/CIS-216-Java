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
        // Will allow for proper alignment add  space after id
        return String.format("ID: %-3d | Coordinates: (%d, %d)", id, xCoordinate, yCoordinate);
    }

}
