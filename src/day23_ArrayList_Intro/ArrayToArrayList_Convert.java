package day23_ArrayList_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList_Convert {
    public static void main(String[] args) {

        String[] arr = {"A", "B","C","D"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list);


        System.out.println("__________________Vice Versa______________");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Java", "Python","C#"));
        String[]  languages = list2.toArray(new String[0]);// [list2.size()]
        System.out.println(Arrays.toString(languages));


        ArrayList<Integer> nums =new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        Integer[] num=nums.toArray(new Integer[0]);
        System.out.println(Arrays.toString(num));


    }
}
