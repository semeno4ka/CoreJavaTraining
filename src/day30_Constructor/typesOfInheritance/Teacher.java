package day30_Constructor.typesOfInheritance;

import java.time.LocalDate;

public class Teacher extends Employee {

    public Teacher(String name, char gender, LocalDate dob, String jobTitle, String employeeID, double salary) {
        super(name, gender, dob, jobTitle, employeeID, salary);
    }

    public void teach(){
        System.out.println(getName()+ " is teaching");
    }
}
