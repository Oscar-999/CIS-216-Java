package edu.jjc.week13.homework13;
import java.util.Random;
//Oscar Alcantar
//Homework 13
//Description General Leia must rescue Luke Skywalker from his Jedi Island Retreat. To prepare for this
//mission, she asks her assistants Rey and Finn to create a squadron of twenty ships. Rey thinks
//the squadron should include Speeders, and Finn thinks the squadron should include X-Wings.
//So, they compromise by flipping a Jakkuan coin. If it lands on heads, they add a Speeder to the
//squadron, and if it lands on tails, they add an X-Wing. They then ask R2-D2 to create a hologram
//report of their squadron details, which is displayed to General Leia
public class SpaceshipDriver {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 1; i <= 20; i++) {
            //For loop will start at 1 for id 1 and end at id 20
            Spaceship ship;
            // will randomly return true or false so it its 50 50
            if (rand.nextBoolean()) {

                ship = new Speeder(i);
            }else {
                ship = new XWing(i);
            }
            System.out.println(ship);//Will call the 2 string on the ship at the loop

        }
    }
}
