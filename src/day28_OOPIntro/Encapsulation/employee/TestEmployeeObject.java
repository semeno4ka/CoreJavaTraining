package day28_OOPIntro.Encapsulation.employee;

public class TestEmployeeObject {
    public static void main(String[] args) {
        Employee e1 = new Employee(120000,"Mark","Java Developer",27);
        e1.setSalary(100000);
        System.out.println(e1.getSalary());
        e1.setName("Alice");
        System.out.println(e1.getName());
        System.out.println(e1);

    }
}
