package day27_AccessModifiers;

public class CydeoStudent {
     public String name;
     public int age;
     public char gender;


     public static String schoolName;// assign those in static block
     public static String secretCode;// before using static block, we have to declare those variables.
    // We declare it before Initializing, just like we do with instances before creating Constructor
    // if code is simple, like schoolName="Cydeo" can initialize right away, but better to get used to static block

    public CydeoStudent(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    static{
        schoolName="Cydeo School";
        secretCode="Wooden Spoon";
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
