package day28_OOPIntro.Encapsulation.person;

import java.time.LocalDate;

public class Person {
    private String name;
    private int age;
    private char gender;
    private LocalDate dob;

    public Person(String name, int age, char gender, LocalDate dob) {
       setName(name);
        setAge(age);
        setGender(gender);
        setDob(dob);
    }

    public String getName() {
        if(name==null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name) {
        if(name.isBlank() || name.isEmpty()){
            System.err.println("Invalid name input");
            System.exit(1);
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>120){
            System.out.println("Invalid age input");
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(!(gender=='F' || gender=='M'|| gender=='m' || gender=='f')){
            System.err.println("Invalid gender input");
            System.exit(1);
        }
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        if(dob.isAfter(LocalDate.now())){
            System.out.println("Invalid date of birth input");
            System.exit(1);
        }
        this.dob = dob;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }
}

/*
Variables:
name, age, gender,dateOfBirth

name:(set) cannot be null, empty, blank (get) if null-unknown

age: cannot be <0 or >120

gender: can only be F or M

dob: cannot be after today

Add constructor to set all the fields, check the object
Add toString()
 */