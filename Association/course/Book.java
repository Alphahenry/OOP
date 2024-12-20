package Association.course;
//class for Books
public class Book {
    //encapsulate the datafields
   
   private String title;
   private String author;

   //constructor

   public Book(){

   }

   public Book (String title, String author){
          this.author = author;
          this.title = title;
   }

   //setter methods

   public void setAuthor(String author){
         this.author = author;
   }

   public void setTitle(String title){
       this.title = title;
   }

   //getter methods
   public String getTitle(){
     return title;
   }

   public String getAuthor(){
    return author;
   }

   public void displayDetails(){
    System.out.println("The author is :" +author);
    System.out.println("The title is :" + title);

     
   }





}
