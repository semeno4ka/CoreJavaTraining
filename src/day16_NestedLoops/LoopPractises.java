package day16_NestedLoops;

import java.util.Scanner;

public class LoopPractises {
    public static void main(String[] args) {

        for (int i=1; i<6; i++){
            System.out.println("Hello"+i);
        }
       // i cannot be used outside the Loop. Whatever is created and assigned within Loop stays in Loop that is why it is used in a variety of Loops
       // int i=10; // have to declare the variable outside the Loop once again
        System.out.println("---------------");

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello"+i);
        }

        System.out.println("---------------");

        int j=0; //starting point as in For Loop, but outside the while Loop, since While Loop cannot initialize, it accepts condition only
        while(j<5){
            System.out.println("Hello"+j);
            j++;// the iterator works in while loop same way as in For Loop
        }
        // while is perfect when the outcome DEPENDS on codition only
        System.out.println("-----------");

        int k=0;
        do{
            System.out.println("Hi"+k);
            k++;
        }while(k<5);

        System.out.println("---------------");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your score");
        int score=input.nextInt();

        while(score>100 || score<0){// while the score is invalid
            System.out.println("Invalid score. Re-enter:");
            score=input.nextInt();
        }

        if(score>=60){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }







    }
}
