package jjc.edu.week16.lab16;
//Oscar Alcantar
//Description
//Lab17- Reverse of a string
import java.util.Scanner;

public class StringRevers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.nextLine();

        System.out.printf("Length of string is : %d\n",str.length());

        String reversed = "";

        for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        System.out.print("Reversed string is : "+reversed);
    }
}
