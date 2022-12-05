package day03_variables;

public class PrimitiveDataTypesIntro_2 {

    public static void main(String[] args) {
        //DataType variableName = Data

        //char accepts a single character (Unicode)
        char c = 'a'; // '' is used for single characters only in char
        char b = '@';
        // char also have a ramge which is values from 0 to 65,535

        System.out.println("______________");

        char ch1 = 'A';
        char chr = 65; // 65 is the same as "A" in ASCII table. Figures represent symbols and characters.
        // you can either use a character or the number associated with it

        char ch3 = 13000;
        System.out.println(ch3);
        // will print out a character associated with this number. No '' required for numbers

        int sum = 'A' + 'B';
        // 65 + 66
        System.out.println(sum); // you will print out the numbers associated with the letters

       // char ch4 = -100; // it is out of char range

     //boolean r1 = 123; //error
        // boolean r2 = 2.5; // error It could only be assigned to TRUE or FALSE expression
        // boolean r3 = "Java"; //error

        boolean r4 = true;
        boolean r5 = false;
        boolean r6 = 100 > 10; // true
        boolean r7 = 0 < -1; //false
        System.out.println(r6);
        System.out.println(r7);

    }
}
