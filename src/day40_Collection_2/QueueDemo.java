package day40_Collection_2;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue1 = new PriorityQueue<>();// random order
        Queue<Integer> queue2 = new ArrayDeque<>(); // keeps insertion order
        Queue<Integer> queue3 = new LinkedList<>();
        System.out.println("--------------------------------");
        List<Integer> list = new LinkedList<>();
        System.out.println("--------------------------------");
        queue1.addAll(Arrays.asList(100,200,300,40,90));
        queue1.addAll(Arrays.asList(100,200,300,40,90));
        queue1.addAll(Arrays.asList(100,200,300,40,90));
        System.out.println(queue1);// ACCEPTS DUPS, ORDER IS RANDOM, DOES NOT ACCEPT NULL, FIFO ORDER
        int firstEl = queue1.poll();// => first in first out, will return the first added element and will remove it
        System.out.println(firstEl);//40
        System.out.println(queue1);// removes 1st 40
        queue1.poll();
        queue1.poll();
        queue1.poll();
        System.out.println(queue1);// will remove additional 3 elements which were added first
        System.out.println("-------------------ARRAYDEQUEUE____________________-");

        queue2.addAll(Arrays.asList(100,200,300,40,90));
        queue2.addAll(Arrays.asList(100,200,300,40,90));
        queue2.addAll(Arrays.asList(100,200,300,40,90));
        System.out.println(queue2);// [100, 200, 300, 40, 90, 100, 200, 300, 40, 90, 100, 200, 300, 40, 90]
        queue2.poll();//100
        System.out.println(queue2);//[200, 300, 40, 90, 100, 200, 300, 40, 90, 100, 200, 300, 40, 90]
        queue2.poll();
        queue2.poll();
        System.out.println(queue2);//[40, 90, 100, 200, 300, 40, 90, 100, 200, 300, 40, 90]
        //LINKEDLIST
        System.out.println("-----------------------LINKEDLIST-----------------------");
         queue3.addAll(Arrays.asList(100,200,300,40,90)); // KEEPS INSERTION ORDER, ACCEPTS NULL, HAS INDEX NUMBERS, however requires casting
        queue3.addAll(Arrays.asList(null,null,null));
         queue3.poll();//100
        System.out.println(queue3);
        System.out.println(   ((LinkedList)queue3).get(3)  );
        list.addAll(Arrays.asList(100,200,300,40,90));
        System.out.println(list);//[100, 200, 300, 40, 90]
        System.out.println(list.get(0));//100
        ((LinkedList)list).poll(); // have to cast, works both ways
        System.out.println(list);//[ 200, 300, 40, 90]







    }
}
