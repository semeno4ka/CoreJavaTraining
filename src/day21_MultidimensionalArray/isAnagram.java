package day21_MultidimensionalArray;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        String str1="heart";
        String str2="earth";
        //String[] a1= str1.split("");//h,e,a,r,t  => one possibility
        char[] a1=str1.toCharArray();
        char[] a2=str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        boolean isAnagram = Arrays.equals(a1,a2);
        System.out.println("isAnagram = " + isAnagram);
    }
}
