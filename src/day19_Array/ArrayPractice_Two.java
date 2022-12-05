package day19_Array;

import java.util.Arrays;

public class ArrayPractice_Two {
    public static void main(String[] args) {

        int[] arr1 = new int[100];
        // One way =>
       /* arr1.fori
        for (int i = 0, j = 1; i < arr1.length; i++, j++) { //i: is index j: is the number we assign
            arr1[i] = j;
        }*/

        // Second way =>
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
        System.out.println("arr1= "+Arrays.toString(arr1));

        System.out.println("---------------------"); // REVERSE

        int[] arr2 = new int[100];

        for (int i = 0, j =100; i < arr2.length; i++, j--) {
            arr2[i]=j;
        }

        System.out.println("arr2= " + Arrays.toString(arr2));

    }
}
