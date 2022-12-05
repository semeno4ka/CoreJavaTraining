package day24_dateAndTime;



import day17.Employee;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeTask {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");
        //Print each name and Job Title
        for (Employee employee : employees) { // the fastest way to reach each element. DataType- Class to where it belongs-Employee
            System.out.println(employee.name+" : "+employee.jobTitle);
        }

        for (Employee employee : employees) {
            if(employee.jobTitle.equals("Java Developer")){
                System.out.println(employee.name);
            }
        }
        double max = employees.get(0).salary;
        double min= employees.get(0).salary;
        for (Employee each : employees) {
            if(each.salary>max){
                max = each.salary;
            }
            if(each.salary<min){
                min= each.salary;
            }
        }
        System.out.println(max);
        System.out.println(min);
        //max and min can only be applied to Int and Double type, if it is Class or any other type, it can;t be applied
        ArrayList<Employee> maleEmployees = new ArrayList<>();
        ArrayList<Employee> femaleEmployees = new ArrayList<>();

        for (Employee employee : employees) {
            if(employee.gender=='M'){
                maleEmployees.add(employee);
            }
            if(employee.gender=='F'){
                femaleEmployees.add(employee);
            }
        }
        int maleCount=maleEmployees.size();
        int femaleCount=femaleEmployees.size();
        System.out.println("femaleCount = " + femaleCount);
        System.out.println("maleCount = " + maleCount);

    }
}
