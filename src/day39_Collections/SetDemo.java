package day39_Collections;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new LinkedHashSet<>();
        Set<Integer> set3 = new TreeSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(1);
        set1.add(null);

        System.out.println(set1);

        System.out.println("-----------------");
    set3.addAll(Arrays.asList(10,30,20,40,60,50));// returns sorted order by default
        System.out.println(set3);


        System.out.println("----------------------------------");
//todo
        String[] words = {"Java","Java","Java","Python","Python","C#","C++","Ruby","C#","C#"};
        Set<String> noDups = new LinkedHashSet<>(Arrays.asList(words));
        System.out.println(noDups);//[Java, Python, C#, C++, Ruby]
       //However, I cannot retrieve elements since set doesnt have index
/*
        for (String eachNoDup : noDups) {
            System.out.println(eachNoDup);
        }*/

        // It is better to convert it back to ArrayLIst if you need to retrieve data=>

        words = noDups.toArray(new String[0]);// assign it back to Array
        System.out.println("Words Array: "+ Arrays.toString(words));
        System.out.println(new ArrayList<>(noDups).get(2));

        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,10,10,20,20,20,30,30,30,40,40,50,1,1,2,3,4,4,5));
        Set<Integer> sorted= new TreeSet<>(numbers);
        System.out.println(sorted);
        System.out.println(new ArrayList<>(sorted));


    }
}
