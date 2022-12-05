package day33_Abstraction.employeeTask;

public class TestEmployeeObjects {
    public static void main(String[] args) {

        Teacher e1 = new Teacher("Elena",27,'F',"djhsgf","Math teacher",67000);
        Tester e2 =new Tester("Mike",31,'M',"7643ghjf","SDET", 97000);
        Developer e3 =new Developer("Fil",33,'M',"hdfgsk","Software Developer",143000,"Java");
        Driver e4 = new Driver("Joe",43,'M',"weuyr","Driver Long",45000);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e4);

        e1.work();
        e2.work();
        e3.work();
        e4.work();
    }
}
