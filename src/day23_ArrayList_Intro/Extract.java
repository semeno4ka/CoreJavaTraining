package day23_ArrayList_Intro;

import java.util.ArrayList;

public class Extract {
    public static void main(String[] args) {

        String str="ABCD123$%#@&456EFG!";
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<String> list3 = new ArrayList<>();

        for (int i = 0; i <str.length() ; i++) {
            if(Character.isDigit(str.charAt(i))){
                list1.add(""+str.charAt(i));
            }else if(Character.isLetter(str.charAt(i))){
                list2.add(""+str.charAt(i));
            }else if(!Character.isLetterOrDigit(str.charAt(i))){
                list3.add(""+str.charAt(i));
            }
        }
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

    }
}
/*
 Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */


