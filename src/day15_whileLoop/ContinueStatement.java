package day15_whileLoop;
//REVIEWED
public class ContinueStatement {
    public static void main(String[] args) {
        /*
        skips the specified iteration
         */

        for (int i = 1; i <6 ; i++) {
            if(i==4){// if I want to skip one of the statements, such as 4
                continue;
            }
            System.out.println(i);// you give a continue statement BEFORE print statement, unlike break
        }

        System.out.println("-----------");
        // find the sum if all the even numbers between 50-100
        for (int i = 50; i <101 ; i++) {
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();// need to paste new line in order for next print statement have a different line

        for (int i = 50; i < 101; i+=2) {// the 1st even number:50, then 52,54,56 etc till 100
            // since all even go +2, then we can change the condition
            System.out.print(i+ " ");
        }
        System.out.println();// need to paste new line in order for next print statement have a different line
        for (int i = 50; i <101 ; i++) {
            if(i%2!=0){
                continue;// will skip odd numbers, numbers which ARE not EVENLY divisible by 2
            }
            System.out.print(i+" ");
        }
        System.out.println();// need to paste new line in order for next print statement have a different line
    }
}
