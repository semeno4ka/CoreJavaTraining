package day25_Constructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {

        public String name; // always ask yourself whether it should be static or instance. When static, they will carry same info
        public int age;
        public char gender;
        public String jobTitle;
        public double salary;
        public LocalDate hireDate;
  // consider every time whether all parameters needed or maybe one can be the outcome of two others.
  // the lesser parameters the better in case some can be figured out through another
    public Employee(String name, int age, char gender, String jobTitle, double salary, LocalDate hireDate) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hireDate = hireDate;
    }


    public String toString() {// allows us to print objects
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hireDate=" + hireDate.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                '}';
    }
}
