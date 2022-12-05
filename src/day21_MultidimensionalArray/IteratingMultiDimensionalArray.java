package day21_MultidimensionalArray;

import java.sql.SQLOutput;
import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        // index of elemenet    0 1  2      0  1  2  3 4    0   1
             int[][] arr2D ={ {10,20,30}, {40,50,60,70,80},{90,100}};
        // Index 1D Array:         0            1              2


        //                       GET ACCESS TO ELEMENTS


          for(int i = 0; i< arr2D.length; i++){// i: index number of each Array

              int[] each1D = arr2D[i];
              System.out.println( Arrays.toString(each1D) ); // will print out each array

              for (int j = 0; j < each1D.length; j++) { //j: index number of elements in each 1D array
                  int eachElement = each1D[j];
                  System.out.println(eachElement);
              }

          }

        //                   SHORTCUT FOR FOR LOOP

        for (int i = arr2D.length - 1; i >= 0; i--) {  // arr2D.forr
            for (int j = arr2D[i].length - 1; j >= 0; j--) { //arr[i].forr
                System.out.println(arr2D[i][j]);
            }
        }

          //                 EASIER WAY TO GET ACCESS TO ELEMENTS

        for( int[] each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray));

            for( int each1DElement: each1DArray){
                System.out.println(each1DElement);
            }
        }

        //                SHORTCUT FOR EACH LOOP

        for (int[] each1DArray : arr2D) {// arr2D.for
            for (int i : each1DArray) {// each1DArray.for

            }
        }


    }
}
