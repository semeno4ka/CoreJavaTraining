package day33_Abstraction.cydeoDevStudent;

import java.time.LocalDate;

public class TestCydeoDevStudentObject {
    public static void main(String[] args) {


        CydeoDevStudent s1 = new CydeoDevStudent("Mike",'M', LocalDate.of(2003,03,27),"dfkdk232","Zero to hero",5);
        System.out.println(s1);
        s1.eat();
        s1.drink();
        s1.sleep();
        s1.breath();
    }
}
