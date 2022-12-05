package day20_forEach;

import jdk.swing.interop.SwingInterOpUtils;

import javax.sound.midi.Soundbank;

public class ForEachLoop {
    public static void main(String[] args) {
        /*
        There must be a data structure in order to use Each Loop: Array, Collection, Map
        Iteration order and number of iterations are fixed
        Does not have index numbers, iterates ELEMENTS, cannot become infinite, finishes when no elements left
        Only iterates From FIRST to LAST
         */
        int[] numbers ={10,20,30,40,50};

        //                                 REGULAR LOOP
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }

        System.out.println();
        System.out.println("------------ FOR EACH LOOP------------");
        for (int each : numbers) { //as a result, you get a variable, that contains each element of given dataStructure(numbers)
            System.out.print(each+" ");
        }






    }
}
