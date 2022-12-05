package day19_Array;

import jdk.jshell.execution.JdiExecutionControl;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        char[] ascending = new char[26];  // 0~25
        char[] descending = new char[26];  //0~25
        for (int i = 0, j = 'A', k ='Z'; i < ascending.length; i++, j++,k--) {
            ascending[i] = (char)j;
            descending[i] = (char)k;
        }
        System.out.println(Arrays.toString(ascending));
        System.out.println(Arrays.toString(descending));



        char[] characters = new char[65535];
        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char)i;  // will print out ALL CHARACTERS
        }




    }

}
