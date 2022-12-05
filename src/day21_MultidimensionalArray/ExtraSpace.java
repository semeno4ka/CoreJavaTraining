package day21_MultidimensionalArray;

import java.util.Arrays;

public class ExtraSpace {
    public static void main(String[] args) {
        String str="  Hello world    I   love   Java";
        str=str.trim();
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        str="";// make str empty and then concate with words

        for (String each : words) {
            if(!(each.isEmpty())){
                str+=each+" ";
            }
        }
        str=str.trim();
        System.out.println(str);
    }
}
