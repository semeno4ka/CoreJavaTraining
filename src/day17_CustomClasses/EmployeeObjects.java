package day17_CustomClasses;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.setInfo("Chris",27,'M',"developer",76.000, "id097879");
        Employee employee2 = new Employee();
        employee2.setInfo("Olya",31,'F',"SDET",78.000,"id678546");
        Employee employee3 = new Employee();
        employee3.setInfo("Bob",46,'M',"SDET",165.000,"id6785642");

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);

        employee1.work();
    }
}
