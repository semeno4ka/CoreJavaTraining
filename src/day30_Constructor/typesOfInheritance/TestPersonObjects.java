package day30_Constructor.typesOfInheritance;

import java.time.LocalDate;

public class TestPersonObjects {
    public static void main(String[] args) {


        Student s1 = new Student("Mike",'M', LocalDate.of(2004,10,12),'A',"STD5654");
        Employee e1 = new Employee("John",'M',LocalDate.of(1992,9,12),"QA","QA56564",110000);
        President p1 = new President("Donuld",'M',LocalDate.of(1973,5,17),LocalDate.of(2016,1,18));
        Teacher t1 = new Teacher("Muhtar",'M',LocalDate.of(1978,4,24),"Java Teacher","JZH",98000);

        s1.study();
        e1.work();
        p1.lie();
        t1.teach();
        System.out.println(t1.getName());
        s1.eat();
        e1.eat();
        p1.eat();
        t1.eat();
    }
}
