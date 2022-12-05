package Utilities;

import java.util.Arrays;

public class ArraysUtility {

    public static int[] merge(int[] arr1, int[] arr2){

        int[] arr3 = new int[arr1.length+arr2.length];
        // to make sure that 3rd array has enough capacity. not less/not more than needed

        int k=0;
        // will use as an index number of 3rd array. assigned outside the loop in order to be used outside later on


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];
        }
        return arr3;
    }

    public static double[] merge(double[] arr1, double[] arr2){

        double[] arr3 = new double[arr1.length+arr2.length];
        // to make sure that 3rd array has enough capacity. not less/not more than needed

        int k=0;
        // will use as an index number of 3rd array. assigned outside the loop in order to be used outside later on


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];
        }
        return arr3;
    }

    public static char[] merge(char[] arr1, char[] arr2){

        char [] arr3 = new char[arr1.length+arr2.length];
        // to make sure that 3rd array has enough capacity. not less/not more than needed

        int k=0;
        // will use as an index number of 3rd array. assigned outside the loop in order to be used outside later on


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];
        }
        return arr3;
    }

    public static String[] merge(String[] arr1, String[] arr2){

        String [] arr3 = new String[arr1.length+arr2.length];
        // to make sure that 3rd array has enough capacity. not less/not more than needed

        int k=0;
        // will use as an index number of 3rd array. assigned outside the loop in order to be used outside later on


        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];
        }
        return arr3;
    }

    public static int[] reverse(int[] array){
        int[] reverse = new int[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static double[] reverse(double[] array){
        double[] reverse = new double[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }


    public static char[] reverse(char[] array){
        char[] reverse = new char[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static String[] reverse(String[] array){
        String[] reverse = new String[array.length];

        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[j] = array[i];
        }
        return reverse;
    }

    public static int[] addElement(int[] array, int element){

        int[] arrayNew = Arrays.copyOf(array,array.length+1);
        arrayNew[arrayNew.length-1] = element;
        return arrayNew;
    }

    public static char[] addElement(char[] array, char element){

        char[] arrayNew = Arrays.copyOf(array,array.length+1);
        arrayNew[arrayNew.length-1] = element;
        return arrayNew;
    }

    public static double[] addElement(double[] array, double element){

        double[] arrayNew = Arrays.copyOf(array,array.length+1);
        arrayNew[arrayNew.length-1] = element;
        return arrayNew;
    }

    public static String[] addElement(String[] array, String element){

        String[] arrayNew = Arrays.copyOf(array,array.length+1);
        arrayNew[arrayNew.length-1] = element;
        return arrayNew;
    }

    public static boolean contains(int[] array, int element){

        for (int eachElement : array) {
            if(eachElement==element){
               return true;
            }
        }
        return false;
        }

    public static boolean contains(char[] array, char element){

        for (char eachElement : array) {
            if(eachElement==element){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(double[] array, double element){

        for (double eachElement : array) {
            if(eachElement==element){
                return true;
            }
        }
        return false;
    }

    public static boolean contains(String[] array, String element){

        for (String eachElement : array) {
            if(eachElement.equals(element)){
                return true;
            }
        }
        return false;
    }
    public static int[] replace(int[] array, int index, int newElement){
        // int[] newArray= Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }
    public static double[] replace(double[] array, int index, double newElement){
        // double[] newArray= Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }
    public static char[] replace(char[] array, int index, char newElement){
        // int[] newArray= Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static String[] replace(String[] array, int index, String newElement){
        // int[] newArray= Arrays.copyOf(array, array.length);
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static int[] replaceAll(int[] array, int oldElement, int newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static double[] replaceAll(double[] array, double oldElement, double newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static char[] replaceAll(char[] array, char oldElement, char newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldElement) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static String[] replaceAll(String[] array, String oldElement, String newElement) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldElement)) {
                array[i] = newElement;
            }
        }
        return array;
    }

    public static int[] insert(int[] array, int index, int newElement){
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static double[] insert(double[] array, int index, double newElement){
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static char[] insert(char[] array, int index, char newElement){
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }

    public static String[] insert(String[] array, int index, String newElement){
        for (int i = 0; i < array.length; i++) {
            if(i==index){
                array[i]=newElement;
            }
        }
        return array;
    }
    public static int[] swap(int[] array, int x, int y){ // index at x and index at y
        int temp;
        for (int i = 0; i < array.length; i++) {
            if(i==x){
                temp=array[i];
                array[i]=array[y];
                array[y]=temp;
            }
        }
        return array;
    }

    public static double[] swap(double[] array, int x, int y){ // index at x and index at y
        double temp;
        for (int i = 0; i < array.length; i++) {
            if(i==x){
                temp=array[i];
                array[i]=array[y];
                array[y]=temp;
            }
        }
        return array;
    }
    public static char[] swap(char[] array, int x, int y) { // index at x and index at y
        char temp;
        for (int i = 0; i < array.length; i++) {
            if (i == x) {
                temp = array[i];
                array[i] = array[y];
                array[y] = temp;
            }
        }
        return array;
    }
    public static String[] swap(String[] array, int x, int y){ // index at x and index at y
        String temp="";
        for (int i = 0; i < array.length; i++) {
            if(i==x){
                temp=array[i];
                array[i]=array[y];
                array[y]=temp;
            }
        }
        return array;
    }

   //TODO
    public static int[] remove(int[] array, int index){
        int[] newArray = new int[array.length-1];
        //array = {10,20,30,40}==> 10,20,40
        int i = 0;
        for (int each : array) {
            if (each == array[index]) {
                continue;
            }
            newArray[i++] = each;
        }
        return newArray;
    }
    public static double[] remove(double[] array, int index){
        double[] newArray = new double[array.length-1];
        //array = {10,20,30,40}==> 10,20,40
        int i = 0;
        for (double each : array) {
            if (each == array[index]) {
                continue;
            }
            newArray[i++] = each;
        }
        return newArray;
    }
    public static char[] remove(char[] array, int index){
        char[] newArray = new char[array.length-1];
        //array = {10,20,30,40}==> 10,20,40
        int i = 0;
        for (char each : array) {
            if (each == array[index]) {
                continue;
            }
            newArray[i++] = each;
        }
        return newArray;
    }
    public static String[] remove(String[] array, int index){
        String[] newArray = new String[array.length-1];
        //array = {10,20,30,40}==> 10,20,40
        int i = 0;
        for (String each : array) {
            if (each == array[index]) {
                continue;
            }
            newArray[i++] = each;
        }
        return newArray;
    }
//exclude all dups
   /* public static int[] removeDups(int[] array){

        //use contains to check

    }*/

}
