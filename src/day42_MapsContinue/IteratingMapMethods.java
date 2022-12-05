package day42_MapsContinue;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMapMethods {
    public static void main(String[] args) {

        /*
        Entry- combination of key and value

        You can iterate keys, values, or pairs(entry)

        keySet() -  will get you all the keys and returns the SET of those keys(Set because Dups not allowed)
        values()  -  get every single value as a COLLECTION, not set, because there might be dups
        entrySet()        - returns Entry Interface(sub Interface of Map interface), that is why you have to call it from Map

        getKey()
        getValue()        - returns the key and the value separately
        setValue()        -  to change the Value during Iteration of Entry

         */
        System.out.println("-----------------Key Iteration------------------");
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Daniel",95000);
        map.put("Emily",100000);
        map.put("Bella",85000);
        map.put("Aaron",150000);
        map.put("Chris",93000);
        map.put("Breanna",78000);

        // if I need every single key of the map, you need to iterate by the Key
        for (String eachKey : map.keySet()) {
            System.out.println(eachKey); // same as regular print keySet() but line by line
        }
        System.out.println(map.keySet());//[Daniel, Emily, Bella, Aaron, Chris, Breanna]

        System.out.println("-----------------------------------");
       // How to double salary for each employee? USe replace
        System.out.println(map);

        for (String eachKey : map.keySet()) {
           map.replace(eachKey,map.get(eachKey)*2);
        }
        System.out.println(map);

        System.out.println("-----------------Value Iteration------------------");
        //values()
        for (Integer eachValue : map.values()) {
            System.out.println(eachValue);// just the salary
        }
        System.out.println("------------------------------------------------");
        // salary less then 90K
        for (Integer each : map.values()) {
            if(each<190000){ // do not forget that we've doubled the salary
                System.out.println(each);
            }
        }

        System.out.println("-----------------Entry Iteration------------------");
        // entrySet()
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            System.out.println(eachEntry);// returns the pairs
            System.out.println(eachEntry.getKey());
            System.out.println(eachEntry.getValue());
        }
        System.out.println("------------------------------------------------");
        for (Map.Entry<String, Integer> eachEntry : map.entrySet()) {
            String eachKey = eachEntry.getKey();
            Integer eachValue = eachEntry.getValue();
            System.out.println(eachKey+" : "+eachValue);
            eachEntry.setValue(eachValue/2);
        }
        System.out.println(map);
    }
}
