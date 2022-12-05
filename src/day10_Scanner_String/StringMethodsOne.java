package day10_Scanner_String;


import java.util.Scanner;

public class StringMethodsOne {
    public static void main(String[] args) {

        String str = "Cydeo";
        // index: 01234
        char firstChar = str.charAt(0);// specify the index of the character you need
        char secondChar = str.charAt(1);
        char thirdChar = str.charAt(2);
        char forthChar = str.charAt(3);
        char fifthChar = str.charAt(4);

        //char sixthChar = str.charAt(7);// cannot be less than zero, can't be called cause there are no index number for this one


        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(forthChar);
        System.out.println(fifthChar);

       // System.out.println(sixthChar);

        System.out.println("-------");
        String sentence = "Java Programming Language";// space is also a character
        // How many characters the string has? ->
        int length = sentence.length();
        System.out.println(length);
        int lastIndex = length -1;
        System.out.println(lastIndex);

        System.out.println("-------");
        String s1= "Wooden Spoon";
        char f = s1.charAt(0);
        int length2 = s1.length();
        int lastIndex2 =s1.length() -1;
        char l = s1.charAt(lastIndex2);

        System.out.println(f + " " + l);

        System.out.println("-------");

        String name1 = "Umran";
        String name2 = new String("Umran");
        System.out.println(name1 == name2);// false
        System.out.println(name1.equals(name2));// compare the value in the objects, not the objects itself. Since they have same literals, they will return true

        System.out.println("-------");

        String r1 = "Java";
        String r2 = "Java";//r1 and r2 are stored as one object in the pool
        String r3 = "java";
        String r4 = new String("Java"); // not equal to r1,r2 and r3
        System.out.println(r1==r2);//true
        System.out.println(r2==r3);//false
        System.out.println(r1==r3);//false


        System.out.println(r1.equals(r4));//equal, since compares just the text
        System.out.println(r1.equals(r3));// false, since Lower case and Upper case are different

        System.out.println("-------");

        Scanner input = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Are you a US citizen?yes/no");
        String answer = input.next();

        if(age>=21 && answer.equals("yes") ) {// checks the visible text. Should though use same Lower or Upper case
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible to vote");
        }
        input.close();


    }
}
