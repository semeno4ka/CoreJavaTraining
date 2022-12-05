package day42_MapsContinue;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsMethods {
    public static void main(String[] args) {
/*
putAll(map)  - add one map to another map
equals(map)  - checks if one map has the same value of objects in the same order
 */
        Map<String,String> map =new TreeMap<>();
        map.put("CO2","Josh");
        map.put("CO4","Jack");
        map.put("CO6","Alice");
        map.put("CO8","Kate");
        map.put("CO10","Fil");
// adds pairs, not object itself, that is why TreeMap pairs are accepted into LinkedHashMap, because you do not add objects, but pairs
        Map<String,String> employees =new LinkedHashMap<>();
        employees.putAll(map);
        System.out.println(employees);
        System.out.println(map==employees);//false, since they are not the same objects, theu have differetn memory allocation
        System.out.println(map.equals(employees));//true  if the same and in the same order
    }
}
