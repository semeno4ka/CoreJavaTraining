package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4};
        int[] arr2 ={5,6,7};

        int[] arr3 = new int[arr1.length+arr2.length];
        // to make sure that 3rd array has enough capacity. not less/not more than needed

        int k=0;
        // will use as an index number of 3rd array. assigned outside the loop in order to be used outside later on


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];
        }

        System.out.println(Arrays.toString(arr3));

        System.out.println("____________________");

        int[] a1 ={10,20,30,40,50,60};
        int[] a2 ={70,80,90,100};

        int[] a3 = ArraysUtility.merge(a1,a2);
        System.out.println(Arrays.toString(a3));

        double[] b1 = {10.5, 5.5, 3.5, 6.5, 8.5};
        double[] b2 = {20.5, 15.5, 13.5};

        double[] b3=ArraysUtility.merge(b1,b2);
        System.out.println(Arrays.toString(b3));

        System.out.println("____________________");


        char[] ch1 = {'A','B','C','d','e'};
        char[] ch2 = {'X','Y','z'};

        char[] ch3=ArraysUtility.merge(ch1,ch2);
        System.out.println(Arrays.toString(ch3));

        System.out.println("____________________");

        String[] s1={"Hello my"};
        String[] s2={"friend"};
        String[] s3=ArraysUtility.merge(s1,s2);
        System.out.println(Arrays.toString(s3));

    }
}
/*
write a program that can merge two arrays of integers
        Ex:
            arr1 = {1,2,3,4}
            arr2 = {5,6}

        output
            arr3 = {1,2,3,4,5,6}
 */