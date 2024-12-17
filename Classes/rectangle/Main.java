package rectangle;

public class Main {
     public static void main(String[] args) {
    
        //create reactangle object

        Rectangle rec1 = new Rectangle();

       // getting area and parameter using default constructor
        System.out.println("The height is:"+ rec1.height);
        System.out.println("The width Is: " + rec1.width);

        System.out.println("The area is: " + rec1.getArea());
        System.out.println("The parameter is: " + rec1.getParameter());


        //getting area and parameter with parameterized constructor

        Rectangle rec2 = new Rectangle();
        rec2.setHeight(40);
        rec2.setWidth(20);

        System.out.println("The height is:"+ rec2.height);
        System.out.println("The width Is: " + rec2.width);

        System.out.println("The area is: " + rec2.getArea());
        System.out.println("The parameter is: " + rec2.getParameter());
}
}
