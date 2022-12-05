package day42_MapsContinue;

import day33_Abstraction.employeeTask.Developer;
import day35_PolymorphismIntro.transportationTask.Car;

import java.time.LocalDate;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapPracticeFour {
    public static void main(String[] args) {
        Map<String,Object> person1 = new LinkedHashMap<>();
        person1.put("name","Arthur");
        person1.put("gender",'M');//Wrapper CLass to Character
        person1.put("age",32);
        person1.put("job_title","Developer");
        person1.put("salary",100000);//Wrapper Class autoboxing
        person1.put("married",true);
        person1.put("hireDate", LocalDate.of(2021,10,12));

        Map<String,Object> person2 = new LinkedHashMap<>();
        person2.put("name","Nora");
        person2.put("gender",'F');//Wrapper CLass to Character
        person2.put("age",30);
        person2.put("job_title","Back-end Developer");
        person2.put("salary",90000);//Wrapper Class autoboxing
        person2.put("married",true);
        person2.put("hireDate", LocalDate.of(2022,1,11));

        Map<String,Object> person3 = new LinkedHashMap<>();
        person3.put("name","Fiona");
        person3.put("gender",'F');//Wrapper CLass to Character
        person3.put("age",39);
        person3.put("job_title","Front-end Developer");
        person3.put("salary",99000);//Wrapper Class autoboxing
        person3.put("married",false);
        person3.put("hireDate", LocalDate.of(2019,3,30));

        Map<String,Object> person4 = new LinkedHashMap<>();
        person4.put("name","Mark");
        person4.put("gender",'M');//Wrapper CLass to Character
        person4.put("age",40);
        person4.put("job_title","Developer");
        person4.put("salary",129000);//Wrapper Class autoboxing
        person4.put("married",false);
        person4.put("hireDate", LocalDate.of(2017,3,12));

        Map<String,Object> person5 = new LinkedHashMap<>();
        person5.put("name","Melanie");
        person5.put("gender",'F');//Wrapper CLass to Character
        person5.put("age",27);
        person5.put("job_title","Developer");
        person5.put("salary",78000);//Wrapper Class autoboxing
        person5.put("married",false);
        person5.put("hireDate", LocalDate.of(2022,9,2));


        System.out.println("----------------------MAP OF MAPS--------------------------");
        Map<Integer, Map<String,Object>> mapOfMaps = new LinkedHashMap<>();
        mapOfMaps.put(0,person1);// contains person 1 map, key is zero
        mapOfMaps.put(1,person2);
        mapOfMaps.put(2,person3);
        mapOfMaps.put(3,person4);
        mapOfMaps.put(4,person5);
        System.out.println(mapOfMaps);

        System.out.println(mapOfMaps.get(1));

        mapOfMaps.get(1).replace("salary",120000);

        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            System.out.println(eachValue);
        }
        System.out.println("---------------------------------------------");
        for (Map<String, Object> eachValue : mapOfMaps.values()) {
            for (Map.Entry<String, Object> eachEntry : eachValue.entrySet()) {
                if(eachEntry.getKey().equals("salary")){
                    eachEntry.setValue((Integer)eachEntry.getValue()+10000);
                }
            }
        }

        System.out.println(mapOfMaps);

        System.out.println("---------------------------------------------");// whenever it is an Object, it can be used in Map
        Map< Map<String, Integer >, Map <String,Integer>> mapOfMap2 = new LinkedHashMap<>();

        Map<int[], List<Integer>> map2 = new LinkedHashMap<>();
        Map<Developer, Car>map3 = new LinkedHashMap<>();
    }
}
