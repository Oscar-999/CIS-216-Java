package edu.jjc.week13.homework13;
import java.util.Random;
public class SpaceshipDriver {
    public static void main(String[] args) {
        Random rand = new Random();

        for (int i = 1; i <= 20; i++) {
            //For loop will start at 1 for id 1 and end at id 20
            Spaceship ship;
            if (rand.nextBoolean()) {

                ship = new Speeder(i);
            }else {
                ship = new XWing(i);
            }
            System.out.println(ship);//Will call the 2 string on the ship at the loop

        }
    }
}
