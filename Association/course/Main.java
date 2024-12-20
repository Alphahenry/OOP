package Association.course;
//association between class Book and class Library.
//This type of association is aggregation where Book is independent of Class Library
public class Main {
    public static void main(String[] args) {

        //testing independence of class Book

        Book bk1 = new Book();

        bk1.setAuthor("hmasik");
        bk1.setTitle("art of scoring");
        bk1.displayDetails();

        
        
    }

}
