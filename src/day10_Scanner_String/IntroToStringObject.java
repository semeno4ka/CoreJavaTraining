package day10_Scanner_String;
import java.sql.SQLOutput;
import java.util.Scanner;
public class IntroToStringObject {
    //String objects are a sequence of characters. Once created, they can't be changed. To modify, you have to reassign new object
    /*Two ways to create String object:
    1. By String literal ( created by using""). Has different memory allocation that new keyword (goes to String pool)
    String pool makes the process faster. It's a VIP place inside heap memory. For teh String objects that are same value, in the pool there will be
    just one place, which stores identical value, yet it will be shared between different variables that are assigned to that value
    String str="Java" will be stored with String str2="Java" in a single place( no duplication), yet shared between str and str2
    2.By new keyword: String str1=new String("Java"); It is a different object in the Heap memory outside the String pool. The objects will be dublicated
    if different variables have identical value
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = "Java";

        String s1="Cat";
        String s2="Dog";
        String s3="Cat";
        String s4="Cat";
        //in this case the memory will create just ONE object for s1, s3,s4. They all will be equal to each other
        // Stack - is where you create your variables and then stored in Heap, where (for string objects) there is a String pool

        System.out.println("________________");
        String str1= new String("Java");// will go to a string pool because you use "", yet there are two objects created one in String pool, another one in Heap
        String str2= new String("Java");// if you have two variables created with NEW, yet value written in "", there will be 3 objects created: one in String pool and TWO in heap outside the pool
        // If they are created in heap outside pool, they are two separate and independent objects and will never be equal, will always return false if compared
        //str1==str2 will return false

        String t1 = "Python";// string pool 1 object
        String t2 = new String("Python");// string pool and outside 1 object
        String t3 = new String("Python");//will be 3 objects, one in pool, two outside
        String t4 = "Python";

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        System.out.println(t1==t2);//false since it will go for the object outside the pool
        System.out.println(t2==t3);// false, even though they are made by the same method and have the same value, they are stored as separate objects
        System.out.println(t1==t4);// true, since they are identical and are stored as single value in the pool

    }
}
