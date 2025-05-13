package edu.jjc.week12.lab12;
//Oscar Alcantar
//Lab 12 :In this project, you will build four classes. Three classes represent classes in an inheritance
//hierarchy, and one is a drive
public class CP11 {
    public static void main(String[] args) {
        //Array with 2 elements
        Animal[] animals = new Animal[2];

        Fish fish = new Fish("Fish");
        animals[0] = fish;
        Horse horse = new Horse("Horse");
        animals[1] = horse;

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
        //Loop prints out animal

        Fish fish2;
        //Downcasting animal back to fish
        fish2 = (Fish) animals[0];
        //fish2 = (Fish) animals[1]; Wont work an  Class Cast exception error

        fish2.eat();
    }
}
