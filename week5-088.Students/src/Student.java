/**
 * Created by Mark on 11/28/2016.
 */
public class Student {
    private String name;
    private String studentNumber;

    // A constructor that initializes the name and the student number with the given parameters.
    public Student(String name, String studentNumber){
        this.name = name;
        this.studentNumber = studentNumber;
    }

    // Returns the student name
    public String getName(){
        return this.name;
    }

    public String getStudentNumber(){
        return this.studentNumber;
    }

    public String toString(){
        return this.name + " " + "(" + this.studentNumber + ")";
    }


}
