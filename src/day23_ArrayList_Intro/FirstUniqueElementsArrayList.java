package day23_ArrayList_Intro;

import java.util.ArrayList;

public class FirstUniqueElementsArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(6);


        for (Integer element : list) {
            int frequency =0;
            for (Integer each : list) {
                if(each==element){
                    frequency++;
                }
            }

            if(frequency==1){
                System.out.println(element);
                break; // since it will break after the first unique element, we don't need to count all unique, just the first appeared
            }
        }








    }
}
/*
 Write a program that can return the first unique elements from an array list
            Ex:
                ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

            output:
                2
 */