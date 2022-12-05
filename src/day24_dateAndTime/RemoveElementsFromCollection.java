package day24_dateAndTime;

import day17_CustomClasses.Employee;


import java.util.ArrayList;
import java.util.Arrays;


public class RemoveElementsFromCollection {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println(list);
        // CANNOT PERFORM THE ACTION BECAUSE COLLECTION IS DYNAMIC
        // EVERY ELEMENTS SHIFTS AFTER EVERY REMOVAL IS PERFORMED
        //IT BASICALLY SKIPS ELEMENTS
        //YOU CAN USE REMOVE ONLY IF YOU KNOW THE ELEMENT.
        //IF THE ELEMENT IS UNKNOWN, ONLY removeIf() WILL WORK
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,4,5,6,7));
        list2.removeIf( p -> p < 4 );// variable name goes first. can be any name, data type not required. Prefered name is "p"
        System.out.println(list2);


        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java", "Python","C#","JavaScript","Rubi"));

        names.removeIf( p -> p.startsWith("J"));

        System.out.println(names);

        ArrayList<Employee> employees = new ArrayList<>();
        employees.addAll(Arrays.asList(
                new Employee(), new Employee(), new Employee(), new Employee(), new Employee()
        ));
        employees.get(0).setInfo("Josh", 34, 'M', "Java Developer", 100000, "A01");
        employees.get(1).setInfo("Emily", 40, 'F', "SDET", 90000, "A02");
        employees.get(2).setInfo("Conor", 38, 'M', "Project Manager", 130000, "A03");
        employees.get(3).setInfo("Bella", 29, 'F', "Java Developer", 95000, "A04");
        employees.get(4).setInfo("Jimmy", 54, 'M', "Data Analyst", 105000, "A05");

        employees.removeIf( p-> p.salary>100000 ); //-> error sign in Java
        for (Employee employee : employees) {
            System.out.println(employee.name+" : "+employee.salary);
        }
    }
}
