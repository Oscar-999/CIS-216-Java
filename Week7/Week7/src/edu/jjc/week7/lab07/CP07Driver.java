package edu.jjc.week7.lab07;

import java.util.Scanner;

public class CP07Driver {
    public static void main(String[] args) {
        Player person1 = new Player();
        Player person2 = new Player("Warlord",50);
        System.out.println("Player with no argument constructor" + person1);
        System.out.println("Player with  argument constructor" + person2);
    }
}
