package day29_Inheritance.encapsulation;

public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Lucy",27,'F','F',"Cydeo");
        System.out.println(s1);
        s1.setSchoolName("Harvard");
        System.out.println(s1);
        System.out.println(s1.getGrade());
        s1.setGrade('B');
        System.out.println(s1.getGrade());



    }
}
