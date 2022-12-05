package day21_MultidimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice2 {
    public static void main(String[] args) {
        int[][] arr2D1= {{1,2},{3,4,5}};
        int[][] arr2D2={{6,7,8,9,},{10,11},{12,13,14}};
        int[][] arr2D3={{15,16,17,18}};
        // Index of Elements                          0,1     0,1,2    0,1,2,3     0,1     0,1,2        0,1,2,3
        // Index of 2D Arrays                          0       1          0         1       2              0
        int[][][] arr3D={arr2D1,arr2D2,arr2D3};// { {{1,2},{3,4,5}}, {{6,7,8,9,},{10,11},{12,13,14}},{{15,16,17,18}} };
        // Index of 3D array                               0                   1                           2
        // [][][]  =>  []Index of 2D Array   []Index of 1D Array    []Index of Elements

        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));// since we print 3D Array, we use deepToString()
        System.out.println(Arrays.toString(arr3D[0][1]));// Here we use toString, since we are printing Single Array
        System.out.println(arr3D[1][0][1]);// no need for method, because we print Element, not Array


        System.out.println("______________________________________________________");

        for (int i = 0; i < arr3D.length; i++) {// i: for every 2D index
            int[][] each2D=arr3D[i];
            System.out.println(Arrays.deepToString(each2D));
            for (int j = 0; j < each2D.length; j++) {// j: for every 1D index
                int[] each1D=each2D[j];
                System.out.println(Arrays.toString(each1D));
                for (int k = 0; k < each1D.length; k++) {// k: for each element
                    int eachElement=each1D[k];
                    System.out.println(eachElement);
                }
            }
        }

    }
}
