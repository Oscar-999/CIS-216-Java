package jjc.edu.week16.homework16;
//Oscar Alcantar
//Homework16
//Description: Create a program that performs various String handling functions.
import java.util.Scanner;

public class StringProgram {
    public static void main(String[] args) {
        //Setup scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Type some text and press enter: ");
        String text = input.nextLine(); //Save user input to var text

        //Display original input
        System.out.println("\nWords printed forward: ");
        System.out.println(text);
        //Split method separates sentence by space
        String[] words = text.split(" ");
        System.out.println("\nWords printed backward: ");
        for (int i = words.length - 1; i >= 0; i--) { //Starts from last index to the first index.
            System.out.print(words[i] + " "); // Prints index which is a word + space
        }

        //Count how many words
        System.out.println("\n\nThe text contains " + words.length + " words.\n");


        //Longest and shortest word

        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
            else if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
        }

        // Print longest and shortest word
        System.out.println("Longest word is: " + longestWord);
        System.out.println("Shortest word is: " + shortestWord);

        // Close the scanner
        input.close();

    }
}
