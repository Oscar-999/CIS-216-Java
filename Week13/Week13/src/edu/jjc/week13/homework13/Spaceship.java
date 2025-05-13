package edu.jjc.week13.homework13;
//Oscar Alcantar
//Homework 13
//Description General Leia must rescue Luke Skywalker from his Jedi Island Retreat. To prepare for this
//mission, she asks her assistants Rey and Finn to create a squadron of twenty ships. Rey thinks
//the squadron should include Speeders, and Finn thinks the squadron should include X-Wings.
//So, they compromise by flipping a Jakkuan coin. If it lands on heads, they add a Speeder to the
//squadron, and if it lands on tails, they add an X-Wing. They then ask R2-D2 to create a hologram
//report of their squadron details, which is displayed to General Leia
public class Spaceship {
    //data members
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
        return String.format("ID: %-3d | Coordinates: (%d, %d)", getId(), getXCoordinate(), getYCoordinate());
    }

}
