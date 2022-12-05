package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Java","Java","Java","C#","C#","Ruby","Swift","Swift","Java"));
        // Previous way
        for (int i = 0; i < names.size(); i++) {
            if(names.get(i).equals("Java")){
                names.set(i,"Python");
            }
        }

        //Better way
        Collections.replaceAll(names, "Java","Python");// names is a Collection
        System.out.println(names);
        int countPython=Collections.frequency(names,"Python");
        System.out.println(countPython);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(10,20,20,30,40,40,50,50,50,60,60,50));
        for (Integer each : numbers) {
            if(Collections.frequency(numbers,each)==1){
                System.out.println(each);
            }
        }



    }
}
