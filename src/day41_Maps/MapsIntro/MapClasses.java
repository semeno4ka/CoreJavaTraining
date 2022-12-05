package day41_Maps.MapsIntro;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {

        //       HASHMAP

        Map<String, Integer> hashMap = new HashMap<>();
                // String- key, Integer - value
        hashMap.put("Daniel",95000);
        //size 1, one pair inside a map
        hashMap.put("Emily",100000);
        hashMap.put("Bella",85000);
        // size 3, order random {Emily=100000, Daniel=95000, Bella=85000}
        hashMap.put(null,null); //accepts both Null
        hashMap.put("Daniel",150000);
        hashMap.put("Chris",null);
        System.out.println("HashMap: "+hashMap);// size 5 , only Last Daniel accepted, 1st deleted, since key cannot be duplicated,this way you can update data

        //        LinkedlinkedHashMap


        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Daniel",95000);
        linkedHashMap.put("Emily",100000);
        linkedHashMap.put("Bella",85000);
        linkedHashMap.put(null,null); //accepts both Null
        linkedHashMap.put("Daniel",150000);
        linkedHashMap.put("Chris",null);
        System.out.println("LinkedHashMap: "+linkedHashMap);// The only difference is that it keeps insertion order, the rest is teh same as HashMAp


        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Daniel",95000);
        treeMap.put("Emily",100000);
        treeMap.put("Bella",85000);
        //treeMap.put(null,null); CANNOT BE NULL, but the Value can
        treeMap.put("Chris",null);
        treeMap.put("Daniel",150000);
        System.out.println("TreeMap:+ "+treeMap);// CANNOT ACCEPT KEY AS NULL, but the Value can, THE KEYS ORDER IS SORTED

        Map<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("Daniel",95000);
        hashTable.put("Emily",100000);
        hashTable.put("Bella",85000);
        try {// we use tryCatch in order for the code to keep running. The data will not be included, but at least the program will run,and we will see what causes a problem
            hashTable.put(null, null);//KEY CANNOT BE NULL
        }catch(RuntimeException e){
            e.printStackTrace();
        }//KEY CANNOT BE NULL
        //hashTable.put("Chris",null); VALUE CANNOT BE NULL AS WELL
        hashTable.put("Daniel",150000);// KEEPS THE LAST INSERTED IF THE KEY IS DUPLICATED
        System.out.println("HashTable: "+hashTable);// Maintained RANDOM order




    }
}
/*PAir:
name and salary
Danile = 95000
Emily = 100000
Bella = 85000

 */