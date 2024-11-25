/*Student management System
* //datafields of students:
* 1.name
* 2.reg no
* 3.grade
* 4.email
*
* setters and getter for these grades:
*
*
* */


package student;

public class Main {
    public static void main(String[] args) {
        // create object

        Student s1 = new Student("Happy",334,'A',"happyfor me@gmail.com");

        System.out.println("The name of the student is:" + s1.getName());
        System.out.println("Roll number: " + s1.getRollNumber());
        System.out.println("Grade: " + s1.getGrade());
        System.out.println("The email is: " + s1.getEmail());
    }
}
