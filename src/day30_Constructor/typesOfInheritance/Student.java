package day30_Constructor.typesOfInheritance;


import java.time.LocalDate;

public class Student extends Person {
     private char grade;

     private String studentID;

     public Student(String name, char gender, LocalDate dob, char grade, String studentID) {
          super(name, gender, dob);
          setGrade(grade);
          setStudentID(studentID);
     }

     public char getGrade() {
          return grade;
     }

     public void setGrade(char grade) {
          this.grade = grade;
     }

     public String getStudentID() {
          return studentID;
     }

     public void setStudentID(String studentID) {
          this.studentID = studentID;
     }

     public void study(){
          System.out.println(getName()+ " is studying a lot");
     }



}
