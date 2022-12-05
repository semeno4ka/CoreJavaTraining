package day24_dateAndTime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class PersonObjects {
    public static void main(String[] args) {
        Person[] people ={ new Person(), new Person(), new Person(),new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989,11,25));
        people[1].setInfo("Kate",'F',LocalDate.of(1954,10,17));
        people[2].setInfo("Oleg",'M',LocalDate.of(1963,9,3));
        people[3].setInfo("Muhtar",'M',LocalDate.of(1976,1,5));
        people[4].setInfo("Diana",'F',LocalDate.of(1946,10,30));

        ArrayList<Person> studentList = new ArrayList<>();
        studentList.addAll(Arrays.asList(people));// print name and doB, remove all less than 55,

        for (Person person : studentList) {
            System.out.println(person.name+" : "+ person.dateOfBirth);
        }

       studentList.removeIf( p-> p.age<55);
        System.out.println(studentList);

    }
}
