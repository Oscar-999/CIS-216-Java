package edu.jjc.week13.Lab13;
//Oscar Alcantar
//Lab13: The objective of this lab project is to introduce students to Java exception handling
//mechanisms, including try-catch blocks, multiple-catch blocks
public class TryCatchLab {

    public static void main(String[] args) {
        //num variables
        int a=10;
        int b=0;

        try  {
            //division b 0 returns arithmetic exception to be printed
            int result=a/b;
    } catch (ArithmeticException e) {
        System.out.println("ArithmeticException");}
    }

}
