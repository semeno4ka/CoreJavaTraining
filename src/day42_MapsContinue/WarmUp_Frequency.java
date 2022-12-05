package day42_MapsContinue;

import java.util.*;

public class WarmUp_Frequency {
    public static void main(String[] args) {

        System.out.println("-------------------Frequency of Character----------------------");

        String str = "bbcccaaaaa";

        Map<Character,Integer> map = new LinkedHashMap<>();
        String[] str2 = str.split("");// b b c c c a a a a a a
        for (String each : str2) {
            int frequency = Collections.frequency(Arrays.asList(str2),each);
            System.out.println(each +" : "+ frequency);
            map.put(each.charAt(0),frequency);// need to convert a string to character, since it has just one character, we use charAt(0)
            // or you can change the Map parameter to String and keep it simply each'each'=> Map<String,Integer> map = new LinkedHashMap<>();
        }
        System.out.println(map);


        System.out.println("-------------------Unique Character----------------------");

        String s = "aabccccdeeeeef";
        Map<Character,Integer> map2 = new LinkedHashMap<>();
        for (String each : s.split("")) {
            int frequency = Collections.frequency(Arrays.asList(s.split("")), each);
            if (frequency == 1) {
                map2.put(each.charAt(0), frequency);
            }
        }
        System.out.println(map2);
/*
String str = "aabcccdeeeef";

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int frequency = Collections.frequency( Arrays.asList( str.split(""))  , each );
            if(frequency == 1)
                map. put(each.charAt(0), frequency);

        }

        System.out.println(map);
    }

}
 */

    }
}
