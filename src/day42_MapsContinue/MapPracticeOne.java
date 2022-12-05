package day42_MapsContinue;

import java.util.HashMap;
import java.util.Map;

public class MapPracticeOne {
    public static void main(String[] args) {

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");
        System.out.println("------------------------------");
        //how many f amn d employees
         int countF=0;
         int countM=0;
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equalsIgnoreCase("F")){
                countF++;
                System.out.println(eachEntry.getKey());
            }else{
                countM++;
                System.out.println(eachEntry.getKey());
            }
        }
        System.out.println("Male: "+countM+" Female: "+countF);
        System.out.println("------------------------------");
        for (String eachValue : employeeMap.values()) {
            if(eachValue.equals("F")){
                countF++;
            }else{
                countM++;
            }
        }
        System.out.println(countF+" is Female count. Men count is: "+countM);

        System.out.println("------------------------------");
        // Switch F and M (update) to Female and Male
        for (Map.Entry<String, String> eachEntry : employeeMap.entrySet()) {
            if(eachEntry.getValue().equals("F")){
                eachEntry.setValue("Female");
            }else{
                eachEntry.setValue("Male");
            }
        }
        System.out.println(employeeMap);
    }
}
