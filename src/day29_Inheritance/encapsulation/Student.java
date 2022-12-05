package day29_Inheritance.encapsulation;

public class Student {

    /*
    SHORTCUT FOR ERROR PRINT SERR
    Encapsulation: hiding the data by giving private access modifier


     */

    private String name;
    private int age;
    private char gender, grade;
    private String schoolName;// we still choose private because this variable might change in the future

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.err.println("Age cannot be negative "+ age);
            System.exit(1);
        }
        if(age<5 || age>90){
            System.err.println("Invalid age input " + age);
            System.exit(1);
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if(gender =='F' || gender=='M'){
            this.gender = gender;
        }else{
            System.err.println("Invalid gender input "+gender);
            System.exit(1);
        }

    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        boolean isValid = grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F';
        if (isValid) {
            this.grade = grade;
        }else{
            System.err.println("Invalid grade "+ grade);
            System.exit(1);
        }
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getName(){// READ ONLY
        //before reading the data you can also set conditions
        if(name == null){
            name = "Unknown";
        }

        return name;
    }

    public void setName(String name){ //WRITE ONLY
        if(name.isEmpty()){
            System.err.println("Invalid name");
            System.exit(1); // return; could also work if you do not neet to terminate the program
        }
        this.name = name;
    }

    public Student(String name, int age, char gender, char grade, String schoolName) {
       setName(name);
       setAge(age);
       setGender(gender);
       setGrade(grade);
       setSchoolName(schoolName);
    }
    public void study(){
        System.out.println(name+ " is studying in " + schoolName);
    }


    public String toString() {
        return "Student{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", gender = " + gender +
                ", grade = " + grade +
                ", schoolName = '" + schoolName + '\'' +
                '}';
    }
}
