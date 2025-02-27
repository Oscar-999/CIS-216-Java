package edu.jjc.week7.lab07;

public class Player {

    private String name;
    private int level;


    public Player(String name, int level) {
        setName(name);
        setLevel(level);
    }
    public Player() {
        setName("Knight");
        setLevel(1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }





    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", level=" + getLevel() +
                '}';
    }
}
