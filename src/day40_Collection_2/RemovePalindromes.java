package day40_Collection_2;

import Utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemovePalindromes {
    public static void main(String[] args) {
        // REMOVE PALINDROMES
//todo
        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Python","Cydeo","Car","level","civic","radar","kayak","reviver","racecar"));

        Iterator<String> it = names.iterator();
while(it.hasNext()){
    String each = it.next();

    String reverse = "";
    for (int i = each.length()-1; i >=0 ; i--) {
        reverse+=each.charAt(i);
    }
    if(each.equalsIgnoreCase(reverse)){
        it.remove();
    }
}
        System.out.println(names);//[Java, Python, Cydeo, Car]

        System.out.println("---------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Java","Python","Cydeo","Car","level","civic","radar","kayak","reviver","racecar"));

        names2.removeIf(p-> StringUtility.reverse(p).equalsIgnoreCase(p));
        System.out.println(names2);//[Java, Python, Cydeo, Car]
        // names2.removeIf(p-> new StringBuilder(p).reverse().toString().equalsIgnoreCase(p) );



    }
}
