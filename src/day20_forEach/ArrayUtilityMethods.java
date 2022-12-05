package day20_forEach;

import java.awt.image.AreaAveragingScaleFilter;
import java.sql.Array;
import java.sql.SQLOutput;
import java.util.Arrays;

public class ArrayUtilityMethods {
    public static void main(String[] args) {
        /*
        toString()   returns a string representation of given array. Otherwise, you'll get hashcode
        equals()     return boolean, checks if both arrays are equal. Should be same elements in same order; checks Index by Index.
        sort()       returns new array in ascending order. Doesn't have to reassign, sorts within same array
        copyOf()     returns new array, copies specified array
        copyOfRange()  returns new array,copies specified range of specified array
         */

        System.out.println("---------------toString()---------------");
        int[] score={70,100,80,90,65};
        System.out.println(Arrays.toString(score));
        String result=Arrays.toString(score);
        System.out.println(result);

        System.out.println("---------------equals()---------------");

        int[] a1 ={1,2,3,4,5};// element and order MUST be the same
        int[] a2 ={1,2,3,4,5};
        int[] a3 ={2,1,3,4,5};

        boolean r1=Arrays.equals(a1,a2);
        boolean r2=Arrays.equals(a2,a3);
        System.out.println(r1); //true
        System.out.println(r2);//false

        System.out.println("---------------sort()---------------");

        int[] nums ={100,80,90,75,89,1000,500};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("Minimum number: "+nums[0]);
        System.out.println("Maximum number: "+nums[nums.length-1]);
        // in interview, you'll be asked to use loop instead of Utility sort method


        String[] b1 = {"A", "B","C"};
        String[] b2 = {"A", "C","B"};

        Arrays.sort(b1);// ABC
        Arrays.sort(b2);// ABC

        System.out.println(Arrays.equals(b1,b2));


        String[] students = {"Yaxier","Madiyar", "Ali","Abidullah","Alena"};
        System.out.println(Arrays.toString(students)); // before sorting

        Arrays.sort(students);

        System.out.println(Arrays.toString(students)); //after sorting

        System.out.println("---------------copyOf()---------------");

         int[] array = {10,20,30,40,50,60,70};
         int[] array2 = Arrays.copyOf(array, 7); // the array and the length you need
        System.out.println(Arrays.toString(array2));//[10, 20, 30, 40, 50, 60, 70]
        int[] array3 = Arrays.copyOf(array, 4); // will copy until specified length.
        System.out.println(Arrays.toString(array3)); //[10, 20, 30, 40]
        int[] array4 = Arrays.copyOf(array, 9);
        System.out.println(Arrays.toString(array4));//[10, 20, 30, 40, 50, 60, 70, 0, 0]


        int[] n1 = {1,2,3,4,5};
        int[] n2={6,7};
        int[] n3 =Arrays.copyOf(n1, n1.length+n2.length);
        System.out.println(Arrays.toString(n3));
        for (int i = 0, j = n1.length; i < n2.length; i++, j++) {
            n3[j]=n2[i];
        }
        System.out.println(Arrays.toString(n3));

        System.out.println("---------------copyOfRange()---------------");

        char[] ch = {'A','B','C','D','E','F','G'};
        // Index:     0   1   2   3   4   5   6

        char[] result1=Arrays.copyOf(ch,4); //ABCD
        System.out.println(Arrays.toString(result1));
        char[] result2=Arrays.copyOfRange(ch, 2,5); // LAST INDEX NOT INCLUDED
        System.out.println(Arrays.toString(result2));

        char[] result3 = Arrays.copyOfRange(ch,2,ch.length);// till the end of the length
        System.out.println(Arrays.toString(result3));



    }
}
