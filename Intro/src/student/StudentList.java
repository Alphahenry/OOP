package student;
import  java.util.ArrayList;
public class StudentList {
   // initisalize list
    private ArrayList<Student> students_list;


    //constructor
    public  StudentList(ArrayList<Student> students_list){
        this.students_list = students_list;
    }

    public  void addStudent(Student student){
        students_list.add(student);
        System.out.println("Student added: " + student.getName());

    }
}
