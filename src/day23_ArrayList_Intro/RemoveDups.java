package day23_ArrayList_Intro;

import java.util.ArrayList;

public class RemoveDups {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Vasyl");
        names.add("Vasyl");
        names.add("Sumeye");
        names.add("Sumeye");
        names.add("Ali");
        names.add("Sumeye");

        ArrayList<String> nonDup = new ArrayList<>();

        for (String eachName : names) {
            if(nonDup.contains(eachName)){
                continue;
            }
            nonDup.add(eachName);
        }

        names = nonDup; // if you no longer need the original ArrayList, you can assign nonDup to names
        System.out.println(names);

    }
}
