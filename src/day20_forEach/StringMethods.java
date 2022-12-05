package day20_forEach;

import Utilities.ArraysUtility;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cydeo School";

        //created a char array from a string. the size of the array is the length of str
        // we have used replace to get rid of the space in between word. Can be just str.toCharArray();
        char[] ch= str.replace(" ","").toCharArray();
        System.out.println(Arrays.toString(ch));


        System.out.println("_______SPLIT__________");

        String str2="Today is a great day to learn Java";
        String[] words =str2.split(" ");
        // can be split by anything, like single word "great", where great is not included, just divides the string in two parts
        System.out.println(Arrays.toString(words));


        System.out.println("-------------REVERSE SENTENCE-----------");

        String sentence ="I love Java";
        String[] s=ArraysUtility.reverse(sentence.split(" ")); // Get an array with each word
        System.out.println(Arrays.toString(s));
        String reversedSentence = ""; //"Java love I"
        for (int i = 0; i < s.length; i++) {
            reversedSentence+=s[i]+" ";
        }
        System.out.println(reversedSentence);
    }
}
