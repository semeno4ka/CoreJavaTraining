package day23_ArrayList_Intro;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        System.out.println("_________________ADD ALL()__________________");
        // allows to add a collection of Values. Either a ArrayList, Queue, Set

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        //will add Numbers Collection after the last index of it's initial collection. If collection was empty, will add starting index 0
        //Although SPECIFIC INDEX can be Specified =>
        list1.addAll(1,numbers); // will input right after index 0, the rest of original will be shifted to the end
        System.out.println(list1);

        System.out.println("____________________As List()___partOfAdd____________");
        //allows to pass multiple elements. Returns a List, which is a Collection type with specified elements/arrays

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(75,85,95,80,70)); //returns a List and the List is added as Collection to the ArrayList

        System.out.println(scores);


        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Gadir","Hasan","Abidulah","Bilal"));
        System.out.println(students);

        students.addAll(2,Arrays.asList("Shukur","Sumeye", "Tatiana"));
        // will insert new names starting at Index 2, the rest of original will be shifted
        System.out.println(students);

        // if you have an Array which you want to convert to ArrayList, you can use asList()
        //However, array should have non-primitive elements

        Integer[] nums = {1,2,3,4,5,6};// must be NON-Primitive
        ArrayList<Integer>  l1 = new ArrayList<>(Arrays.asList(nums));// <= can use constructor as a shortcut
        // l1.addAll(Arrays.asList(nums)); Adding this into constructor skips this step
        System.out.println(l1);


        System.out.println("____________________CONTAINS ALL()_____________________");

        ArrayList<String> employessList = new ArrayList<>();
        employessList.addAll(Arrays.asList("Gadir","Ali","Sumeye","Vasyl"));

        System.out.println(employessList);

        boolean isAlena = employessList.contains("Alena");
        boolean hasAlenaGadir = employessList.containsAll(Arrays.asList("Gadir","Alena"));
        boolean hasMuhtarAliKuzzat = employessList.containsAll(Arrays.asList("Muhtar","Ali","Kuzat"));

        System.out.println("isAlena = " + isAlena);//true
        System.out.println("hasAlenaGadir = " + hasAlenaGadir);//true
        System.out.println("hasMuhtarAliKuzzat = " + hasMuhtarAliKuzzat);//false. As long as One is False, ALL are false


        System.out.println("_____________________REMOVE ALL()_________________________");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,10,20,30,40,50,20,20,20,60,70,10,10,10));
        list.removeAll(Arrays.asList(10,20));

        System.out.println(list);


        System.out.println("_______________________RETAIN ALL()_____________means keep_________");
        // keep whatever is specified, removes the rest(unmatching)

        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Alena","Muhtar","Gadir","Ali","Madiyar","Muhtar","Alena"));
        developers.retainAll(Arrays.asList("Alena","Gadir"));// CASE SENSITIVE
        //will keep all with the same requirements
        System.out.println(developers);//Alena,Gadir, ALena


        ArrayList<String> groceries = new ArrayList<>();
        groceries.addAll(Arrays.asList("eggs","bread","berries","milk","cucumber","rice"));
        groceries.retainAll(Arrays.asList("eggs","bread","berries"));
        // retain will specify what to keep, remove all will remove what is specified
        System.out.println(groceries);






    }
}
