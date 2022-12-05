package day22_WrapperClass_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods_I {
    public static void main(String[] args) {


        System.out.println("______________________SIZE()_______________________");
        // return the total number if elements of the ArrayList, return type - int. You can assign the result to primitive variable

        System.out.println("______________________ADD()_______________________");
        //CANNOT ADD AN ELEMENT IF INDEX NUMBER DOES NOT EXIST YET
        // add()  adds an element tot ArrayList, increasing the size by 1
        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Banana");
        groceryList.add("Cheese");
        groceryList.add("Bread");
        groceryList.add("Apple");
        System.out.println(groceryList);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(20);//0
        numbers.add(30);//1
        numbers.add(40);//2
        numbers.add(50);//3
        System.out.println(numbers);//20,30,40,50

        numbers.add(0,10); // will place 10 as the first number at Index 0
        System.out.println(numbers);//10,20,30,40,50
        //CANNOT ADD AN ELEMENT IF INDEX NUMBER DOES NOT EXIST YET

        System.out.println("______________________GET()_______________________");
        // returns the element of the ArrayList at the given index

        ArrayList<String> students = new ArrayList<>();
        students.add("Kate");
        students.add("Fil");
        students.add("Mark");
        students.add("John");
        System.out.println(students.size());//returns the size

        String student1= students.get(0); // inout- index number. return type, whatever type is in the ArrayList at the given index
        //Can be assigned to a variable

        String lastStudent= students.get(students.size()-1);
        System.out.println(lastStudent+" "+student1);









    }
}
