package jjc.edu.week14.lab14;

//Oscar Alcantar
//Lab12 - Working with files
import java.io.FileWriter;
import java.io.IOException;

public class HelloWorldToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt");
            writer.write("Hello World!");
            writer.close();
            System.out.println("File written successfully!");
        } catch (IOException e) {
            System.out.println("Error writing file");
            e.printStackTrace();
        }
    }
}
