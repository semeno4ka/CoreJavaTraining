package day15_whileLoop;
//REVIEWED
public class BreakStatement {
    public static void main(String[] args) {
        /*Jump statement: jumps out from the method
        1. return statement       2. break statement        3. continue statement(has to be placed ALL the time)
        Break and continue can change the flow of the loop statement
        Break: exits the loop, no matter how many cycles are left.
        It can ba a random condition, doesn't have to be connected to loop statement conditions
        Break statement works with EITHER switch or LOOP


        CONTINUE has to be within the Loop and will skip certain statements within this Loop*/

        for (int i = 1; i <10 ; i++) {// 10 not included for 10 print statement
            //condition for terminating Loop: if it reaches 6, terminate the loop. Condition will be printed
            if(i==6){ // if it reaches 6 the condition ALSO SHOULD NOT BE PRINTED (6 should not be printed)
                 break; //0,1,2,3,4,5 (6 is not a number, 6 is the number the statement will be printed)
            }System.out.println(i);
            //before printing 6, I want to exit loop without changing Loop condition
           // System.out.println(i);// 6 will not be printed
        }


        System.out.println("_______________");
        for (char i = 'A'; i <='Z' ; i++) {//++ goes to forward direction, -- backward
            // break statement forces the Loop to be terminated, to be false
          //  System.out.println(i);

            if(i=='J'){
              //  System.out.println("Loop terminanted");// anything you want to print, should be BEFORE BREAK, NOTHING AFTER BREAK GETS EXECUTED
                break;// we CANNOT put if with the break, because nothing will be printed at all, since it has BREAK
                // break statement can be placed anywhere in the statement
            } //System.out.println(i); J will nnot be printed
        }


        System.out.println("________________");
        for (;;) {
            System.out.println("Hello"); // it is an ifinite Loop and will be printed forever
            break; // UNLESS you put break which will EXIT the Loop
            //System.out.println("World");// will always be an error, since comes after BREAK
        }

        System.out.println("------------------");
        for (int i = 10; i <21 ; i++) {// 11 iterations total
           if(i%2==0){ //(otherwise you can do !i%2==0)
               continue;
           }
            System.out.println(i);
        }
        System.out.println("---------------------");
        for (char i = 'A'; i <='G' ; i++) {
            if(i=='B'){    // can apply || (&& is not used, because i  has ONE character At A TIME.
                // Both can't be at the same time)
                continue;
            }
            if(i=='E'){
                continue;
            }
            System.out.println(i);
        } // without {} the loop will only be able to print desired number of statement once, the rest of the statements will be printed only one time




    }
}
