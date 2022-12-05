package day21_MultidimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        System.out.println("____________MULTI DIMENSIONAL ARRAY INTRO_________________");
        /*
        Array: special variable, size fixed for ALL Arrays
        -Single Dimensional Array :[] used for containing multiple elements
        -Multi Dimensional Array : [] [] an Array of Arrays. Contains multiple Arrays
        Should have at least two Arrays [] [] to be Multi Dimensional (two-dimensional, three-dimensional etc)

        int[][] array2D = new int[3][];
        int[][] array2D = { {1,2}, {3,4,5}, {6,7,8} };

        N dimensional array contains(N-1) dimensional arrays:

        toString() is only for Single Array
        deepToString() is for multiDimensional Arrays

        two-dimensional array contains several single dimensional
        three-dimensional array contains several TWO-dimensional arrays
        four-dimensional array contains several THREE-dimensional arrays etc
         */
        int[]  arr1 = {10,20,30};
        int[]  arr2 = {40,50,60,70,80};
        int[]  arr3 = {90,100};


        //Index: length-1     0               1            2
        int[][] arr2D ={ {10,20,30}, {40,50,60,70,80},{90,100}};// can contain any number of single dimensional Arrays
        //Index:          0  1  2     0  1  2   3  4    0  1
        System.out.println(arr2D.length);

        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(Arrays.toString(arr2D[1]));

        System.out.println(arr2D[2][0]);




    }
}
