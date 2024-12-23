//design a class Course
/*
* Course
*-coursename
*-numofstud
* *-student[]
+Course()
*
 */
public  class Course {
    //data fields
    private  String courseName;
    private int [] students = new  int[100];//array to store num of students
    private int  numOfstudents;//counter

 //default constructor
    public Course(){

    }

    //
    public course(String courseName){
        this.courseName = courseName;

    }

    //getter method
    public  String getCourseName(){
        return courseName;
    }

 //set course

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    // add student
    public void addStudent(String student){
        students[numOfStudents] = student;
        numOfstudents++;

    }






















}