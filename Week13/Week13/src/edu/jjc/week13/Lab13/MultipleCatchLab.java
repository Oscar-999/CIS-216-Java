package edu.jjc.week13.Lab13;
//Oscar Alcantar
//Lab13: The objective of this lab project is to introduce students to Java exception handling
//mechanisms, including try-catch blocks, multiple-catch blocks
public class MultipleCatchLab {
    public static void main(String[] args) {
        String text = null;

        try {
            System.out.println(text.length());
            //Comment out line 8 to get array index out of bounds exception

            int [] numbers = new int[10];
            numbers[11] = 1;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Generic Exception");
        }
    }
}
