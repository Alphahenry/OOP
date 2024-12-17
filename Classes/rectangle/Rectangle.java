package rectangle;

/*
 * 
design a class named Rectangle to represent a rectangle. The class contains:
■■ Two double data fields named width and height that specify the width and
height of the rectangle. The default values are 1 for both width and height.
■■ A no-arg constructor that creates a default rectangle.
■■ A constructor that creates a rectangle with the specified width and height.
■■ A method named getArea() that returns the area of this rectangle.
■■ A method named getPerimeter() that returns the perimeter.
Draw the UML diagram for the class then implement the class. Write a test pro-
gram that creates two Rectangle objects—one with width 4 and height 40, and
 * 
 * Write a test program that creates two Rectangle objects—one with width 4 and height 40
the other with width 3.5 and height 35.9. Display the width, height, area, and
perimeter of each rectangle in this order
 * 
 * 
 * 
 * 
 */
public class Rectangle {

    //data fields
    double width = 1;
    double height = 1;

    //default constructor
    Rectangle(){

    }

    //parameterized constructor
    Rectangle(double height, double width){
        this.height = height;
        this.width = width;

    
    }

    //set width method
    public void setWidth(double width){
        this.width = width;
    }
    //set height

    public void setHeight(double height){
        this.height = height;
    }

    //getArea

    public double getArea(){
        return width * height;

    }

    //get parameter

    public double getParameter(){
        return 2 * (width + height);
    }





    
}
