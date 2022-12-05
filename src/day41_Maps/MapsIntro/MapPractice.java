package day41_Maps.MapsIntro;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        // for data type we use Object, because we will end up using all sort of data
        Map<String,Object> person1 = new LinkedHashMap<>();
        person1.put("name","Arthur");
        person1.put("gender",'M');//Wrapper CLass to Character
        person1.put("age",32);
        person1.put("job_title","Developer");
        person1.put("salary",100000.50);//Wrapper Class autoboxing
        person1.put("married",true);
        System.out.println(person1);
        System.out.println(person1.get("name"));//Arthur
        System.out.println(person1.get("married"));//true
        System.out.println(person1.get("job_title"));//Developer




    }

}
