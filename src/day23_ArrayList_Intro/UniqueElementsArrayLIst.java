package day23_ArrayList_Intro;

import java.util.ArrayList;

public class UniqueElementsArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");
        names.add("Shukir");
        names.add("Marika");
        names.add("Marika");

        String unique="";
        for (String eachName : names) {
            if(names.indexOf(eachName)==names.lastIndexOf(eachName)){
                unique+=eachName+" ";// for first unique can use break;
            }
        }
        System.out.println(unique);


    }
}
