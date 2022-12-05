package day41_Maps.MapsIntro;

import java.util.Map;
import java.util.TreeMap;

public class MapMethods {
    /*
    Methods:
    put(key,value)           - to insert the data or update the data
    size()                   - shows the number of pairs stored in the map
    replace(key,value)       - used for replacing, same as with put(), but replace is FASTER
    remove(key)              - will remove the pair with the matching key
    contains(key)            - true/false if the specified key contains in the map. Boolean
    containsValue(value)     - looks for a specified Value, returns boolean
    isEmpty()                - checks whether the map is empty or not
    equals()                 - compares the value of two maps
    clear()                  - will set the size of the map to ZERO
    putAll(map)  - add one map to another map
    equals(map)  - checks if one map has the same value of objects in the same order

     */

    public static void main(String[] args) {

        Map<Integer,String> map = new TreeMap<>();
        map.put(01,"Chris");
        map.put(02,"Breanna");
        map.put(03,"Mark");
        map.put(04,"Shukur");
        System.out.println(map.size());
        System.out.println(map);
        map.put(04,"Tatiana");
        System.out.println(map);
        map.put(05,null);
        System.out.println(map); // value can be changed, but keys cannot
        map.put(05,"Katerina");
        System.out.println(map);
        System.out.println(map.get(03));//Mark

        map.replace(03,"Elizabeth");
        System.out.println(map);

        map.remove(02);
        System.out.println(map);
        System.out.println(map.containsKey(04));
        System.out.println(map.containsValue("Katerina"));//true
        System.out.println(map.isEmpty());



    }
}
/*
pairs:
id and name


 */