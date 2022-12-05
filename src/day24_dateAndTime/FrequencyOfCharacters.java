package day24_dateAndTime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "aaabbbbddddd"; //a3b4d5
        String result="";
         // we use split method to convert str into Array. toCharArray can't be used, because it can't be converted to asList(primitive?)
        // We'll convert it into collection by using asList

        for(String each : str.split("")){
            int frequency=Collections.frequency(Arrays.asList(str.split("")),each);
            if(!(result.contains(each))){
                result+=each+frequency;
            }
        }
        System.out.println(result);

    }
}
