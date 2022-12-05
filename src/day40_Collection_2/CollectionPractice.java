package day40_Collection_2;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new Vector<>(); // List can be reference type to any of its subclass
        Collection <Integer> collection = new ArrayList<>();// Only Reference type METHODS can be CALLED
        collection.add(10);
        collection.addAll(Arrays.asList(10,20,10,20,300,400));
        System.out.println(((ArrayList)collection).get(0)); //Does not have access to subclass methods, requires DOWNCASTING
        //System.out.println((Stack)collection).pop());//Class Cast Execption sincer Collection contains ArrayList, which has no 'IS_A' relation with Stack
        System.out.println("------------------");
        Collection<Integer> collection2 = new HashSet<>();
        collection2.addAll(Arrays.asList(10,20,10,20,300,400));
        System.out.println(collection2);
        //System.out.println((ArrayList)collection2).get(4));//Class Cast Execption
        System.out.println(new ArrayList<>(collection2).get(3));
    }
}
