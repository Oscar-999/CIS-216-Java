package edu.jjc.week10.homework10;


import java.security.SecureRandom;
//Oscar Alcantar
//Homework10
// Description : Write a Java application that uses overloaded constructors, overloaded functions and random
//number generation to simulate a game of rock, paper, scissors between a player and the
//computer

public class Player {
    //Variables
    private int play;
    private static final SecureRandom rand = new SecureRandom();
    //constructors
    public Player(){
        setPlay();
    }

    public Player(String play){
        setPlay(play);
    }

    // getter
    private int getPlay(){
        return play;
    }
    //the overload function in order of string, int, and no params
    public void setPlay(String play){
        if (play.equalsIgnoreCase("rock")) {
            setPlay(1);
        } else if (play.equalsIgnoreCase("paper")) {
            setPlay(2);
        } else if (play.equalsIgnoreCase("scissors")) {
            setPlay(3);
        } else {
            throw new IllegalArgumentException("Invalid play\n");
        }
    }
    public void setPlay(int play){
        this.play = play;
    }
    public void setPlay(){
        setPlay(1+ rand.nextInt(3));
    }
    //to string method



    public String toString() {
        switch (getPlay()) {
            case 1: return "Rock";
            case 2: return "Paper";
            case 3: return "Scissors";
            default: return "Unknown";
        }
    }


}
