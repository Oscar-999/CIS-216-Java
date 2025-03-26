package edu.jjc.week11.lab11;
//Oscar Alcantar
//Lab 11
//Description : In this project, you will build four classes. Three classes represent classes in an inheritance
//hierarchy, and one is a driver
public class CP11 {
    public static void main(String[] args) {
        // Invoke classes
        Electronics electronic = new Electronics("Samsung");
        Computer computer = new Computer("Windows", "Ailenware");
        Phone phone = new Phone("111-111-111", "Macos", "Apple");
        //Print Statements
        System.out.println(electronic);
        System.out.println(computer);
        System.out.println(phone);
    }
}
