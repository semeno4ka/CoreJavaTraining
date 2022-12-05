package day26_Statics.studentTask;

public class Students {
    public String name;
    public int age;
    public char gender;
    public int id;

    public Students(String name, int age, char gender,int id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id=id;
    }

    public void study(){
        System.out.println(name + " is studying");
    }


    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                '}';
    }
}
