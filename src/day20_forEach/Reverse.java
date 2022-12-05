package day20_forEach;

import Utilities.ArraysUtility;

import javax.swing.text.Utilities;
import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5,};

        int[] reverse = new int[array.length];
        //j=0 can be declared outside if you need it outside later on, the loop and not included in the loop: reverse[j++]=array[i]
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        System.out.println(Arrays.toString(reverse));

        double[] a1 = {10.5, 6.7};
        double[] a2=ArraysUtility.reverse(a1);
        System.out.println(Arrays.toString(a2));


        int[] ar1 = {1, 2, 3, 4, 5,};
        int[] ar2= ArraysUtility.reverse(ar1);
        System.out.println(Arrays.toString(ar2));
    }
}
