package day40_Collection_2;

import java.util.*;

public class IterableExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,1,10));
      /*  for (Integer each : list) {
            if(each<5){
                list.remove(each);
            }
        }
        System.out.println(list);// ConcurrentModificationException */

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<5){
                list.remove(i);
            }
        }
        System.out.println(list);//[2, 4, 5, 2, 4, 5, 6, 7, 8, 9, 10] DOES NOT PERFORM ACTIONS CORRECTLY

        System.out.println("--------------------------");
        List<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,1,10));
        //<5
        Iterator<Integer> it= list2.iterator();// since its checking all the elements it's easier to assign it ot variable
        while(it.hasNext()){// as long as there is en element that can be iterated
           Integer each = it.next();// you get each of the element
            if(each<5){
                it.remove();// remove method of iterator, not remove method of collection
            }
        }
        System.out.println(list2);//[5, 5, 6, 7, 8, 9, 10]

        // WHile loop is preffered with iterator
        System.out.println("-----------------------------");
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,1,10));
        // FOR LOOP EXAMPLE <5
        for (Iterator<Integer> i=list3.iterator(); i.hasNext();){
            Integer each= i.next();
            if(each<5){
                i.remove();
            }
        }
        System.out.println(list3);//[5, 5, 6, 7, 8, 9, 10]


        System.out.println("--------------------------");
        List<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,1,10));
        // REMOVE IF <5 contains iterator by default, same as while loop in example above
        list4.removeIf(p-> p<5);
        System.out.println(list4);//[5, 5, 6, 7, 8, 9, 10]

        System.out.println("--------------------------");
        List<Integer> list5 = new LinkedList<>();
        list5.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,6,7,8,9,1,10));
        list5.removeIf(p-> p<5);
        System.out.println(list5);//[5, 5, 6, 7, 8, 9, 10]
    }
}
