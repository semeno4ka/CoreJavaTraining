package day28_OOPIntro.Encapsulation.student;

public class TestStudent {
    public static void main(String[] args) {


            Student s1 =new Student();
            //s1.age=-100;
            // anyone can access and change to invalid age. To gain control, you should change access modifier to private
            // with private, you can set conditions in setter method such as which age is valid and not
            s1.setAge(20);
            s1.setName("Aaron");
        System.out.println(s1.getName());
        System.out.println(s1.getAge());

    }
}
