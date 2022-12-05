package day22_WrapperClass_ArrayList;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        //Index Element    0    1   2      0   1     2      0    1   2
        int[][] array = {{100, 20, 300}, {10, 1000, 50}, {-200, 400, 0}};
        //Index Array           0              1               2

        int max = array[0][0];
        int min = array[0][0];

        for (int[] each1D : array) {
            for (int eachElement : each1D) {
                 if(eachElement>max){
                     max=eachElement;
                 }
                 if(eachElement<min){
                     min=eachElement;
                 }
            }
        } //OUTSIDE THE LOOP
        System.out.println("Max = " + max);
        System.out.println("Min = "+min);
    }
}


