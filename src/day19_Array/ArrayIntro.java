package day19_Array;
import java.util.Arrays;
public class ArrayIntro {
    public static void main(String[] args) {
        //---------------------- A R R A Y --------------------------//

        /*
        Data structure - stores data for efficiency in use.
        Allows to store it in organized manner

        1. Array                 2.Collection                3.Map

        Special type of Variable, which holds multiple values of the same data type.
        Array size is fixed.But it is not immutable. Fixed is just the size of the array(how many elements are stored)

        Supports primitives and non=primitives
        It is an order data structure. Every element has its index number(0~n)

        Two ways to declare an array: ( one-dimensional arrays )
        1. [] is a must in between dataType and variableName:            int [] scores; String [] names;
        2. [] is a must after dataType and variableName:                 int scores[];  String names[];

        Since it is array variable, its size has to be fixed. a NEW keyword is a must for declaration.
               1 way                                             2 way
        int [] scores;                                   int[] scores = new int[4];          size is 4 variables
        scores = new int[4];                             String[] names =new String[5];       size is 5 names

        You can change the elements inside the array, but not the number of elements stored.

        int[] myList = {1,2,3,4,5...} when you know the elements for sure.
        int[] myLis = new int[5]  when you don't know exact elements. only its number


         */
        //       REGULAR WAY
             int score1 = 85;
             int score2 = 75;
             int score3 = 65;
             int score4 = 55;
             int score5 = 95;

        System.out.println("-------------------------------------------");

        //                          ARRAY
        /*
        - to finish declaration, have to provide the size.Can't be less/more than declared size
        - if you do not "toString" it, it will print hashcode
        - Arrays Utility Class: presented in "java.util" as Arrays =>      java.util.Arrays; to call (Arrays.toString());
        - if you do not specify each of the element, you will get "0" or "null" by default in the print statement
        - index of current example: 0, 1, 2, 3, 4 (just like length -1/size-1)

                            Assigning values to Array Elements

        - elements can be accessed by using [] by using index number and assigning the value to the index:  scores[2] = 78;
        - you can change the value of the element at any index number, but not the number of elements
        - if you declare another array object with the same name later on, the previous object goes to garbage collection
          and all the elements will go to garbage as well

          Example:
          scores = new int[100];//0~99 will erase previous array object
          scores = new int[50];// 0~49 will erase previous array object.
          System.out.println(Arrays.toString(scores));// will reference the last array [50], everything prior will go to garbage


         A R R A Y    O B J E C T S

         - you may have several Array variables that will reference the same Array object
         Example:
         int[] arr1 = {10,20,20};
         int[] arr2 = arr1;
         int[] arr3 = arr2;

         Variables are different, yet the object it reference is the same. The output for all will be arr1
         arr1[0] =1000;
         arr2[2] =3000;
         Whenever you make changes in any of those variables, the original object will change, because IT IS ONE object

         Variables will be in STACK
         the OBJECT will be in HEAP


         String[] a1 = {"Kate","Filipp"}'  => will go to garbage collection
         a1 = new String[]{"James","Daniel"};
         Will get "James" and "Daniel"

         Unlike variable, different objects cannot reference one variable.
         Only one different variables can reference one object

         */


        int[] scores = new int[5];
        System.out.println(Arrays.toString(scores));
        scores[2] = 78;
        scores[0] = 85;
        scores[1] = 65;
        scores[3] = 88;
        scores[4] = 95;

        System.out.println(scores[2]);// returns the value of index 2


        //                To print out all elements use LOOP
        for (int i = 0; i <scores.length; i++) {// provide the length/size of the array object. i: index numbers of scores
            System.out.println(scores[i]);
        }

        //            The length in terms of arrays is a variable, not a method, like in previous topics.

        System.out.println(scores[scores.length-1]);






    }
}
