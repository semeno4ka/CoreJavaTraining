package day26_Statics.studentTask;

import day27_AccessModifiers.AccessModifiers;

public class TestObjects {
    public static void main(String[] args) {

     Students student1 = new Students("Victor",21,'M',16);
     Students student2 = new Students("Yusuf",24,'M',17);
     Students student3 = new Students("Galya",23,'F',18);
     Students student4 = new Students("Mark",27,'M',19);
     Students student5 = new Students("Kate",29,'F',20);

     Students student6 = new Students("Yan",21,'M',21);
     Students student7 = new Students("Yana",24,'M',22);
     Students student8 = new Students("Gavina",23,'F',23);
     Students student9 = new Students("Misha",27,'M',24);
     Students student10 = new Students("Kimberly",29,'F',25);

     Students student11 = new Students("Sam",21,'M',26);
     Students student12 = new Students("Nick",24,'M',27);
     Students student13 = new Students("Chloe",23,'F',28);
     Students student14 = new Students("John",27,'M',29);
     Students student15 = new Students("Felise",29,'F',30);

     Students student16 = new Students("Ermek",21,'M',31);
     Students student17 = new Students("Sebastian",24,'M',32);
     Students student18 = new Students("Sumeye",23,'F',33);
     Students student19 = new Students("Mehmet",27,'M',34);
     Students student20 = new Students("Yulia",29,'F',35);

     Students[] students = { student2, student3,student4,student5};
     StudentsGroup group1 = new StudentsGroup("Java Turtles",465);
     System.out.println(group1);//0
        group1.addStudent(student1);//adds the object we creates. One of the first methods
        group1.addStudents(students);// add all the students from Array
        group1.addStudent("Christian",30,'M',21);// creates a new student object and adds to ArrayList

        System.out.println(group1);

        group1.removeStudent(19);
        System.out.println(group1);

        for (Students each : group1.students) {
            System.out.println(each.name+ ": "+each.id);// displays ever student
        }


        StudentsGroup group2 = new StudentsGroup("Java Rangers",466);
        group2.addStudent(student6);
        Students[] students2 = { student6, student7,student8,student9,student10};
        group2.addStudents(students2);
        System.out.println(group2);

        StudentsGroup group3 = new StudentsGroup("Java Cakes",467);
        Students[] students3 = {student11, student12, student13,student14, student15};
        group3.addStudents(students3);
        System.out.println(group3);
        StudentsGroup group4 = new StudentsGroup("Java Bytes",468);
        Students[] students4 = {student16, student17, student18, student19, student20};
        group4.addStudents(students4);
        System.out.println(group4);

        System.out.println("____________");
        System.out.println(AccessModifiers.publicData);







         // 1. create those groups and add students
        // 2. Iterate all the groups and print out the names and id of each student

    }
}
