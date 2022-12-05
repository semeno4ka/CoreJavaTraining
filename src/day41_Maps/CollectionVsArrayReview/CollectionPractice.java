package day41_Maps.CollectionVsArrayReview;

import day30_Constructor.typesOfInheritance.Employee;

import java.lang.reflect.Array;
import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.addAll(Arrays.asList(1,2,3,4,5,6));
        List<Integer> l2 = new ArrayList<>();
        l2.addAll(Arrays.asList(1,2,3,4,5,6));

        List<List<Integer>> list = new ArrayList<>(); //List of List, it is not multidimensional
        list.addAll(Arrays.asList(l1,l2));
        list.add(l1);
        list.add(l2);

        List<Set<Integer>> list2 = new ArrayList<>();
        List<int[]> list3 = new ArrayList<>();

        System.out.println(list);

        //6 out of second array
        System.out.println(list.get(1).get(5));//[ 6]
        for (List<Integer> eachList : list) {
            for (Integer eachElement : eachList) {
                System.out.println(eachElement);
            }
        }


/*
        List<int[][]> list4 = new ArrayList<>();
        as long as <Object> is inside int[][] is an object
 */

        System.out.println("------------------------");
        List<Set<Integer>> listOfSets = new ArrayList<>();
        listOfSets.add(new LinkedHashSet<>());//0
        listOfSets.add(new LinkedHashSet<>());//1
        listOfSets.add(new LinkedHashSet<>());//2
        listOfSets.add(new LinkedHashSet<>());//3
        // the size is 4
        System.out.println(listOfSets);
        //{10,5,20}
        listOfSets.get(0).addAll(Arrays.asList(10,5,20,10,5,20));
        System.out.println(listOfSets); //Dups not allowed
        listOfSets.get(1).addAll(Arrays.asList(15,30,30));
        System.out.println(listOfSets);


        System.out.println("------------------------");
        List<int[]> listOfArrays = new ArrayList<>();
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9,10};
        listOfArrays.add(arr1);
        listOfArrays.add(arr2);

        System.out.println(Arrays.toString( listOfArrays.get(0)));
        System.out.println(listOfArrays);
        listOfArrays.get(0)[2]=30; // changed 3 from index 0 at index 2 to 30
        System.out.println(Arrays.toString( listOfArrays.get(0)));

        System.out.println("------------------------");
        List<List<Employee>> teams = new ArrayList<>();




    }
}
