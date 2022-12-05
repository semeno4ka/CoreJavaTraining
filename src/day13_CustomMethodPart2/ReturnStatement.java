package day13_CustomMethodPart2;
                        /*____________________THEORY________________________
                         Return Statement can be used in any method.
             In VOID it will not return value, it will only EXIT and TERMINATE the current METHOD!*/
public class ReturnStatement {
    public static void main(String[] args) {
    eligible(25);
        System.out.println("Test started");
        boolean exit = true;
        if(exit){
            return;// if exit is true, then main method gets terminated. IT IS THE LAST LINE OF THE CODE,SINCE IT'S VOID METHOD
        }//RETURN cares only about THE METHOD, not statements it is used in. That is why here it terminates main method, not if statement
        System.out.println("Test1 completed");// will never be executed, because it gets terminates before print statement

        System.out.println("Test2");
    }
    //_____________________VOID_________________________

    // void means avoid return
    public static void eligible(int age){
        if(age < 0 || age > 150){// if the condition is FASLE, then we go to execute the rest. If it is TRUE, we terminate
            System.out.println("Invalid age" + age);
            return; //exits the current method and doesn't go to check the code below
            //if the age is invalid, then the method gets terminated
        }
        if(age >=21){
            System.out.println("You are eligible to buy alcohol");
        }else{
            System.out.println("Not eligible to buy alcohol");
        }
    }


    //____________________RETURN________________________

    public static int multiplication(int n1, int n2){// USE A RETURN IN THE END IS A MUST
        int result = n1*n2;
        return result;
    }
}
