package edu.jjc.week10.homework10;
//Oscar Alcantar
//Homework10
// Description : Write a Java application that uses overloaded constructors, overloaded functions and random
//number generation to simulate a game of rock, paper, scissors between a player and the  computer

import java.util.Scanner;

public class RPSDriver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors\n");

        // Player but dont assign any value for loop
        Player user = null;

        //Extra Credit try catch and error thrpwn
        String badInput = "";
        while (user == null) {
            try {
                System.out.print("Type rock, paper, or scissors: ");
                String input = sc.nextLine();
                badInput = input.toLowerCase();
                user = new Player(input); // This line will add the play to the player overide the player on line 15
            } catch (IllegalArgumentException e) {
                // This line returns the message setup in the class for setplay
                System.out.println("\nYou played: " + badInput); // you want to show the bad play they entered
                System.out.println(e.getMessage());
            }
        }
        //Computers Play

        Player computer = new Player(); // Will fill with random int


        // Determine winner
        determineWinner(user, computer);
        sc.close();


    }
    public static void determineWinner(Player user, Player computer) {
        String userPlay = user.toString();
        String computerPlay = computer.toString();

        //Print the two plays
        System.out.println("\nYou played: " + userPlay);
        System.out.println("Computer played: " + computerPlay);

        if (userPlay.equals(computerPlay)) {
            System.out.println("\nIt's a tie!");
        } else if ((userPlay.equals("Rock") && computerPlay.equals("Scissors")) ||
                (userPlay.equals("Paper") && computerPlay.equals("Rock")) ||
                (userPlay.equals("Scissors") && computerPlay.equals("Paper"))) {
            System.out.println("\nYou win!");
        } else {
            System.out.println("\nComputer wins!");
        }
    }
}
