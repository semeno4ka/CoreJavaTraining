package day30_Constructor.typesOfInheritance;

import java.time.LocalDate;

public class Person {

    private String name;
    private int age;
    private char gender;
    private LocalDate dob;

    public Person(String name, char gender, LocalDate dob) {
        setName(name);
        setGender(gender);
        setDob(dob);// we do not include Age, because we can calculate the age ourselves
        setAge(LocalDate.now().getYear()-dob.getYear());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=0){
            System.err.println("Invalid age "+age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

   public void eat(){
       System.out.println(name+" eats a lot");
   }
   public void drink(){
       System.out.println(name+ " drinks a lot");
   }
   public void sleep(){
       System.out.println(name+ " sleeps a lot");
   }


    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dob=" + dob +
                '}';
    }
}
