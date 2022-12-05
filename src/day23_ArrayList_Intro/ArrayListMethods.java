package day23_ArrayList_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {
    public static void main(String[] args) {


        System.out.println("____________________SET()_________________________");
        // ARRAY EXAMPLE

        int[] array = {1,2,3,4,5};
        array[0]=100;
        System.out.println(Arrays.toString(array));

        // ARRAY LIST EXAMPLE

        ArrayList<String> list = new ArrayList<>();
        list.add("Eggs");
        list.add("Paper Towels");
        list.add("Apples");
        list.add("Cooking oil");
        System.out.println(list);

        list.set(2,"Oranges");// replaces
        list.add(2,"Chicken");// adds, doesnt replace
        System.out.println(list);



        System.out.println("_____________________REMOVE()_______________________");

        list.remove(0);// after removal, other Index Numbers are shifted
        list.remove("Chicken");// case sensitive.
        System.out.println(list.remove("Oranges"));//Can return boolean as well (true: is in the list, false: is not.Was removed)
        System.out.println(list);

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); //0
        numbers.add(20); //1
        numbers.add(30); //2
        numbers.add(40); //3
        numbers.add(50); //4

        //numbers.remove(20); // considers 20 as index, not as value
        boolean r1 = numbers.remove(Integer.valueOf(20)); //can be converted to boolean. Will give true:removed
        numbers.remove(Integer.valueOf(20));// should use ValueOf so that the primitive is converted to Wrapper Class and considered and OBJECT
        System.out.println(numbers);// 20 is removed
        System.out.println(r1);



        System.out.println("_____________________CLEAR()______________________________");
        // in order to remove all elements and set the size to zero

        numbers.clear();// size is set to Zero
        System.out.println(numbers);//[]
        System.out.println(numbers.size());//0



        System.out.println("______________INDEX OF() and LAST INDEX OF()______________");

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        System.out.println(names.indexOf("Vasyl"));// returns the 1st appeared - 0
        System.out.println(names.lastIndexOf("Vasyl"));//returns the first appeared from the end - 1

        System.out.println(names.lastIndexOf("Sumeye"));// returns - 5



        System.out.println("___________________CONTAINS()________________________");
        // returns boolean

        boolean hasMuhtar = names.contains("Muhtar");// false
        System.out.println(hasMuhtar);
        boolean hasALi = names.contains("Ali"); //true
        System.out.println(hasALi);

        System.out.println("_____________________EQUALS()______________________");
        //compares if ArrayLists have same elements and whether those elements have same order


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = list1;  // there will be JUST ONE OBJECT, but TWO reference variables
        // reference variables are located in STACK, objects in HEAP

        list1.add(10); // both variables will have same elements
        System.out.println(list1);//10
        System.out.println(list2);//10

        System.out.println(list1 == list2);// WILL RETURN TRUE BECAUSE ITS SAME OBJECT

        ArrayList<Integer> l1=new ArrayList<>(); // l1 and l2 are two different objects
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(1); // will be assigned only to l1, not l2
        l2.add(1);

        System.out.println(l1 == l2);// will return FALSE, since objects are different and their memory location as well

        System.out.println(l1.equals(l2));// will return TRUE if same element in the same order. COMPARES BY INDEXES

        ArrayList<Integer> n1 =new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);

        ArrayList<Integer> n2=new ArrayList<>();
        n2.add(30);
        n2.add(10);
        n2.add(20);
        System.out.println(n1);
        System.out.println(n2);
        //Have same element, yet in different order. Thus, not equal

        System.out.println(n1.equals(n2));//false


        System.out.println("______________________isEMPTY()__________________");
        // if the list has no elements

        System.out.println(n1.isEmpty());//false
        System.out.println(n2.isEmpty());//false
        n1.clear();
        n2.clear();
        System.out.println(n1.isEmpty());//true
        System.out.println(n2.isEmpty());//true





    }
}
