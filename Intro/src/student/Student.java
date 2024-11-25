package student;

public class Student {
    //initialize variables
    private String name;
    private int RollNumber;
    private char grade;
    private  String email;

    //constructor
    public Student(String name, int RollNumber, char grade, String email){
        this.name = name;
        this.RollNumber = RollNumber;
        this.grade = grade;
        this.email = email;

    }

    //setter methods

    public void setName(String name){
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    //getter methods

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return RollNumber;
    }

    public String getEmail() {
        return email;
    }

    public char getGrade() {
        return grade;
    }
}
