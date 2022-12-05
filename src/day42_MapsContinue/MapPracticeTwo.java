package day42_MapsContinue;

import java.time.LocalDate;
import java.util.*;

public class MapPracticeTwo {
    public static void main(String[] args) {

        Map<String,Object> person1 = new LinkedHashMap<>();
        person1.put("name","Arthur");
        person1.put("gender",'M');//Wrapper CLass to Character
        person1.put("age",32);
        person1.put("job_title","Developer");
        person1.put("salary",100000.50);//Wrapper Class autoboxing
        person1.put("married",true);
        person1.put("hireDate", LocalDate.of(2021,10,12));
        System.out.println(person1.get("name"));
        System.out.println(person1);

        Map<String,Object> person2 = new LinkedHashMap<>();
        person2.put("name","Nora");
        person2.put("gender",'F');//Wrapper CLass to Character
        person2.put("age",30);
        person2.put("job_title","Back-end Developer");
        person2.put("salary",90000);//Wrapper Class autoboxing
        person2.put("married",true);
        person2.put("hireDate", LocalDate.of(2022,1,11));

        System.out.println(person2.get("name"));
        System.out.println(person2);

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


        System.out.println("-----------------------List of Maps-------IMPORTANT-----------------");
        List<Map<String,Object>> listOfMaps = new ArrayList<>();
        listOfMaps.add(person1);
        listOfMaps.add(person2);
        listOfMaps.addAll(Arrays.asList(person3,person4,person5));
        System.out.println(listOfMaps);

        for( Map<String,Object> eachMap : listOfMaps){
            System.out.println(eachMap);
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
                System.out.println(eachEntry);
            }
        }
        System.out.println("---------- HIRE DATE   REQUIRES CASTING---------------");
        for( Map<String,Object> eachMap : listOfMaps){
            for (Map.Entry<String, Object> eachEntry : eachMap.entrySet()) {
     if(eachEntry.getKey().equals("hireDate")){
         if( ((LocalDate)eachEntry.getValue()).getYear()==2022){
             System.out.println(eachMap.get("name"));
         }
     }
            }
        }
        System.out.println("-----------------------Replace a single value-------------IMPORTANT-----------------");
        listOfMaps.get(0).replace("name","Vasyl");

        listOfMaps.get(listOfMaps.size()-1).replace("salary", ((Integer)listOfMaps.get(listOfMaps.size()-1).get("salary"))+50000 );
        listOfMaps.get(1).replace("age", ((Integer)listOfMaps.get(1).get("age"))+4);


        System.out.println(listOfMaps);


        System.out.println("-----------------------------_CARS_----------------------");
        Map<String,Object> car1 = new LinkedHashMap<>();
        car1.put("brand","BMW");
        car1.put("model","X5");
        car1.put("year",2017);
        car1.put("color","red");
        car1.put("price",37000);
        Map<String,Object> car2 = new LinkedHashMap<>();
        car2.put("brand","BMW");
        car2.put("model","X6");
        car2.put("year",2015);
        car2.put("color","black");
        car2.put("price",25000);
        Map<String,Object> car3 = new LinkedHashMap<>();
        car3.put("brand","Audi");
        car3.put("model","A7");
        car3.put("year",2019);
        car3.put("color","silver");
        car3.put("price",45000);
        Map<String,Object> car4 = new LinkedHashMap<>();
        car4.put("brand","Audi");
        car4.put("model","A4");
        car4.put("year",2013);
        car4.put("color","blue");
        car4.put("price",15000);
        List<Map<String, Object>>cars = new ArrayList<>();
        cars.addAll(Arrays.asList(car1,car2,car3,car4));
        System.out.println(cars);


    }
}
