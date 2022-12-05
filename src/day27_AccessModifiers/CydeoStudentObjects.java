package day27_AccessModifiers;

public class CydeoStudentObjects {
    public static void main(String[] args) {

        System.out.println(CydeoStudent.schoolName);

        CydeoStudent student1= new CydeoStudent("Ekaterina",29,'F');
        CydeoStudent student2= new CydeoStudent("Alena",30,'F');

        System.out.println(student1);
        System.out.println(student2);

        System.out.println(student1.schoolName);// calling through an objects is just for particular example. Should be Class Name
        System.out.println(student2.schoolName);

        System.out.println(CydeoStudent.secretCode);


    }
}
