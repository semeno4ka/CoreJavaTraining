package day14_ForLoop;
//REVIEWED
public class ForLoopPractise {
    public static void main(String[] args) {

   /*  for(int i=5; i<=10; i--){// if i keeps decreasing, condition will always be true. LOGICAL ERROR
       System.out.println("Hello Cydeo"); }
       System.out.println("Hello Worlds");// will never be executed, due to infinite loop. */

        //for(int i=10; i<5;)// Loop Won't be repeated, because it is false from the beginning

    /* for(int i=10; i>=5; i--){//i is 10,9,8,7,6,5
         System.out.println("Hello Cydeo");//6 times printed, to print 5 times, you have to exclude== sign
     }*/
         int sum=0;//the trick is to add it to zero.
         for(int i=1; i<=100; i++){// sum of all
         sum+=i;
     }
         System.out.println(sum);// if printing should not be repeated, you should not place it in the loop

        //ANYTHING you do inside the Loop will stay in the loop repeatidly

        for( char letter='A'; letter<='Z'; letter++){
            System.out.print(letter + " ");//you dont have 'letter' assigned out of the loop, that is why you can't print it out of the loop
     }// thank to +" " you can print without ln to print all in one line

        System.out.println();// required for the next print statement to start from a new line



        for( char ch='Z'; ch>='A'; ch--){
         System.out.print(ch);// if you do not use + " " all letters will be printed back to back
     }
        System.out.println();// after the loop use println for the next print statement start from a new line

    }
}
