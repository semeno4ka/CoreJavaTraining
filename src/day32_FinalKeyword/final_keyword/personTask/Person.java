package day32_FinalKeyword.final_keyword.personTask;

import java.time.LocalDate;

public class Person {
    private String name;// value will be given by default
    private final char gender;// will be error in the beginning until you assign a value
    private final int age; // for final default value will not be given.
    private final LocalDate dob;// you can read unchangeable data, so you need getter, but you cannot set new value, no need for setter

    public Person(String name, char gender, LocalDate dob) {
        setName(name);
        if(!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender "+gender);
            System.exit(1);
        }
        this.gender = gender;// if you need conditions to final variables, you should set them within constructor
        this.dob = dob;
        this.age = LocalDate.now().getYear()-dob.getYear();

    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setName(String name) { // setter can be used after the object is created. For final variables, if the object is created it already cannot be changed
        this.name = name;
    }

    public static final int numberOfHeads;// will be error in the beginning until you assign a value
    static{
        numberOfHeads=1;
    }

    public void eat(){
        System.out.println(name + " is eating");
    }
    public void drink(){
        System.out.println(name + " is drinking");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
    public final void breath(){
        System.out.println(name+ " is breathing");// will stay same for every person
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dob=" + dob +
                '}';
    }
}
