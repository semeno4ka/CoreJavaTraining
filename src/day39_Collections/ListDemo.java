package day39_Collections;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();

        List<Integer> linkedLIst = new LinkedList<>(); // add(), addAll(), remove(), removeAll(), removeIf(), retain(); => is faster

        //Node -> has pointer to next and previous nodes
         ArrayList<Integer> arr = new ArrayList<>();
        // arr.get(0);
         LinkedList<Integer>arr2 = new LinkedList<>();
       //  arr2.get(0);
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);//slower
        arrayList.get(0); // implicitly uses Array which makes it faster, since Array is the fastest
        linkedLIst.add(100);//faster
        linkedLIst.add(100);
        linkedLIst.add(100);
        linkedLIst.get(0);// implicitly uses Node<>
        arrayList.remove(0);//slower
        linkedLIst.remove(0);// faster
        arrayList.get(0);//faster
        linkedLIst.get(0);//slower



        System.out.println("---------Vector - synchronized version of Arraylist-------------");
        Vector<Integer> vector = new Vector<>();
        vector.add(100);
        vector.add(200);
        vector.add(300);
        vector.get(0);

        System.out.println("-----STACK---");
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        stack.add(1);
        stack.add(2);
        System.out.println(stack);// 0,1,2
       // stack.remove(2);
        int lastElement = stack.pop();// removes  the last added element - 2
        System.out.println(stack); //0,1
        int secondLast = stack.pop();//1 - shows which element and removes the element
        System.out.println(secondLast);
        System.out.println(stack);//0

    }
}
