package day23_ArrayList_Intro;

import java.util.ArrayList;

public class MultiplyOdd {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer each : list) {
            if(each%2!=0){
                System.out.print(each*2+" ");
            }else{
                System.out.print(each+" ");
            }
        }
    }
}
/*
write a program that can multiply each odd number by 2
                ex: list = [1,2,3,4,5];
                    output: [2,2,6,4,10]

                   */