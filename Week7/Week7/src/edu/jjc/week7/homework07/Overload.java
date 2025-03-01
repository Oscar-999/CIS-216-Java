package edu.jjc.week7.homework07;
//Oscar Alcantar
//Homework07
// Description : Write a main method that prompts the user per the instructions below and calls one of four
//overloaded computeHighNum methods. Display the results of each method call.

import java.util.Scanner;


public class Overload {

    //2 int params
    public static int computeHighNum(int a,int b){
        return (a > b) ? a : b;
    };
    // 3 int param
    public static int computeHighNum(int a,int b, int c){
        if (a > b && a > c) {
            return a;
        } else if (b >c) {
            return b;
        } else {
            return c;
        }
    };
    // 2 double parms
    public static double computeHighNum(double a,double b){
        return (a > b) ? a : b;
    };
    // 3 int double
    public static double computeHighNum(double a,double b, double c){
        if (a >b && a> c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    };


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // Prmpt for two int
        System.out.print("Enter 2 integers, separated by a space, on a single line: ");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Highest number is " + computeHighNum(int1, int2));

        // Prompt for three ints
        System.out.print("Enter 3 integers, separated by spaces, on a single line: ");
        int int3 = sc.nextInt();
        int int4 = sc.nextInt();
        int int5 = sc.nextInt();
        sc.nextLine();
        System.out.println("Highest number is " + computeHighNum(int3, int4, int5));

        // Prompt for two doubles
        System.out.print("Enter 2 doubles, separated by a space, on a single line: ");
        double double1 = sc.nextDouble();
        double double2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Highest number is " + computeHighNum(double1, double2));

        // prompt for three doubles
        System.out.print("Enter 3 doubles, separated by spaces, on a single line: ");
        double double3 = sc.nextDouble();
        double double4 = sc.nextDouble();
        double double5 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Highest number is " + computeHighNum(double3, double4, double5));

        sc.close();

    }
}
