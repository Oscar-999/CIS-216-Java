package edu.jjc.week12.homework12;
//Oscar Alcantar
//Homework12: The objective of this project is to reinforce understanding of polymorphism and inheritance
//concepts in object-oriented programming by implementing a simple shape hierarchy and an
//area calculator
public class CP12Driver {
    public static void main(String[] args) {
        //create a shape array
        Shape [] shapes = new Shape[4];
        // Initilize the shapes
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 7);
        shapes[3] = new Square(8);
        //enhanced for loop prints each shape using the tostring method calll to iself
        for (Shape s : shapes) {
            System.out.println(s);
        }

    }
}
