package day19_Array;

public class ArrayPractice_MaxAndMin {

    public static void main(String[] args) {

        //       M A X I M U M     N U M B E R

        int[] numbers = {100, 20, 500, 40, -10, 30};
        int max = numbers[0]; // make an assumption, then will compare

        for (int i = 1; i < numbers.length; i++) { // start from 1, because 0 is already assigned
            if(numbers[i] > max){ //i: 1,2,3,4,5,
                max = numbers[i]; // if true, replaces current
            }
        }
        System.out.println("max number = " + max);

        //       M I N I M U M      N U M B E R

        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]< min){//if true, replaces current
                min=numbers[i];
            }
        }
        System.out.println("minimum number = "+min);


    }
}
