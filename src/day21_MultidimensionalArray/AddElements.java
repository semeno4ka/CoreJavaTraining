package day21_MultidimensionalArray;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
        System.out.println("____________________METHOD ADD ELEMENT________________");

        /*   YOU CAN KEEP ADDING AS MANY OBJECTS AS YOU CAN ONE BY ONE BECAUSE EVERY TIME THE ARRAY WILL BE UPDATED AND
             ADDING WILL BE APPLIED TO NEW ARRAY EVERY TIME.
             THUS, YOU CAN ADD AS MANY ELEMENTS AS YOU WANT */

        int[] array ={1,2,3,4,5};
        int element =6;
        //{1,2,3,4,5,6} expected result
       // int[] arrayNew = new int[array.length+1];
        int[] arrayNew = Arrays.copyOf(array,array.length+1);
        arrayNew[arrayNew.length-1] = element;// the array at index of (length -1, which is last index) is element

        System.out.println(Arrays.toString(arrayNew));

        System.out.println("____________________APPLY METHOD ADD ELEMENT________________");

        int[] numbers = {100,90,80,70,60};
        int[] addedNumbers = ArraysUtility.addElement(numbers,50);
        System.out.println(Arrays.toString(addedNumbers));



        String[] students={"Yasin", "Sumeye", "Ermek"};
        students = ArraysUtility.addElement(students,"Kate"); // you reassign if you don't need original Array
        students = ArraysUtility.addElement(students,"Filipp");
        students = ArraysUtility.addElement(students,"Mark");
        System.out.println(Arrays.toString(students));

        int[] arr ={ 1,2,3,4,5};
        int elem=6;
        System.out.println(ArraysUtility.contains(arr,elem));

        String[] a={"one","two","three"};
        String e="on";
        System.out.println(ArraysUtility.contains(a,e));
    }
}
