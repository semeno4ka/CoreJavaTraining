package day41_Maps.CollectionVsArrayReview;

import java.util.*;

public class ArrayPractice {
    public static void main(String[] args) {

        List<Integer> l1 =new ArrayList<>();// Object
        l1.addAll(Arrays.asList(1,2,3,4,5,6));
        List<Integer> l2 =new ArrayList<>();
        l2.addAll(Arrays.asList(7,8,9,10));
        List<Integer> l3 =new ArrayList<>();
        l3.addAll(Arrays.asList(11,12,13,14,15));

        List<Integer> [] arrayOfLists =new List[3];// AN ARRAY CAN STORE LISTS AND ALL COLLECTION TYPES
        arrayOfLists[0]=l1;//         = new List[]{l1,l2,l3};
        arrayOfLists[1]=l2;
        arrayOfLists[2]=l3;
        System.out.println(Arrays.toString(arrayOfLists));

        // update 5 to 50
        arrayOfLists[0].set(4,50);
        System.out.println(Arrays.toString(arrayOfLists));

        Set<Integer>[] arrayOfSets = new Set[5];
        System.out.println(Arrays.toString(arrayOfSets));//[null, null, null, null, null]
        arrayOfSets[0] = new LinkedHashSet<>();
        arrayOfSets[1] = new LinkedHashSet<>();
        arrayOfSets[2] = new LinkedHashSet<>();
        arrayOfSets[3] = new LinkedHashSet<>();
        arrayOfSets[4] = new LinkedHashSet<>();
        arrayOfSets[2].addAll(Arrays.asList(1,2,3,4));
        System.out.println(Arrays.toString(arrayOfSets));//[[], [], [1, 2, 3, 4], [], []]




    }
}
