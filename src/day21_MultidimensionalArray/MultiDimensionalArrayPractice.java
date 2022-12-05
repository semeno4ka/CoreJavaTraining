package day21_MultidimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayPractice {
    public static void main(String[] args) {

        // toString() is only for Single Array
        //deepToString() is for multiDimensional Arrays

        String[] group1 = {"James","Daniel","Jessica","Mark"}; // 4 names
        String[] group2 = {"Ivan","Vasyl","Petr","Eugine"}; // 3 names
        String[] group3 = {"Tom","Kate","Alice","Pavel","John"}; // 5 names
        String[] group4 = {"Ali","Mehmet"}; // 2 names

        System.out.println("------------------FOR LOOP------------------------");

        String[][] groups = {group1,group2,group3,group4};
        for (int i = 0; i < groups.length; i++) {// 0.1.2.3
            String[] eachGroups=groups[i];
           System.out.println(Arrays.toString(eachGroups));
            for (int j = 0; j < groups[i].length; j++) {
                String eachStudent=eachGroups[j];
                System.out.println(eachStudent);
            }
        }
        System.out.println("------------------FOR EACH------------------------");

        for (String[] eachGroup : groups) {
            System.out.println(Arrays.toString(eachGroup));
            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }
        }

        System.out.println("------------------FOR EACH and FOR LOOP mixed------------------------");

        for (int i = groups.length - 1; i >= 0; i--) {
            String[] eachGroupsReverse=groups[i];
            System.out.println(Arrays.toString(eachGroupsReverse));
            for (String eachNames : eachGroupsReverse) {
                System.out.println(eachNames);
            }
        }

    }
}
