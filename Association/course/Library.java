package Association.course;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List <Book>  books;


    public Library(String name){
        this.name = name;
        books = new ArrayList<>();


    }

    //add book
    public void addBook(Book book){
        books.add(book);
    }

    //show all books

    public void showBooks(){
        System.out.println("Books written by :" + name);
        for (Book book : books) {
            book.displayDetails();
        }
    }



     
}
