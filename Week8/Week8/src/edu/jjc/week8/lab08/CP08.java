package edu.jjc.week8.lab08;
//Oscar Alcantar
//Lab 8
//Description Write a Java program with one class using arrays and random number generator.
import java.security.SecureRandom;

public class CP08 {

    public static void fillArray(int[] arr) {
        // Instance Secure random object
    SecureRandom rand = new SecureRandom();
//    Assigning a random number to each index element
    for (int i = 0; i < arr.length; i++) {
        arr[i] = 1 + rand.nextInt(10);
    }
    // Prints out the index and the random number associated ith it
    for (int i = 0; i < arr.length; i++) {
        System.out.print(i + " : " + arr[i] + " \n");
    }
    }
    public static void main(String[] args) {
        SecureRandom secureRandom = new SecureRandom();
        // Returns int random number between 1,10
        int randomInt = 1 +secureRandom.nextInt(10);
        // Using the random number from the previous line as the array size
        int []arr = new int[randomInt];
        fillArray(arr);
    }


}
