package day09Switch_and_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int month= 5;
        String days="";
        switch(month) {
            case 2: days="28 Days"; break; // goes the first, because special case and it will be checked first
            case 1: case 3: case 5: case 7: case 8:case 10:case 12: days="30 Days"; break;
            case 4: case 6: case 9: case 11: days="30 Days"; break;
            default: days="Invalid";
            }
        }}
