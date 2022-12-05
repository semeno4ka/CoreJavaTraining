package day22_WrapperClass_ArrayList;

import Utilities.ArraysUtility;

public class TestUtility {
    public static void main(String[] args) {


        int[] numbers = {10,20,30,40,50};
        boolean has25=ArraysUtility.contains(numbers,25);
        System.out.println(has25);


    }
}
