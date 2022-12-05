package day05_Operators;

public class ShorthandOperators {
    public static void main(String[] args) {

        //Assignment Operator changes the value
        int a =20;
        System.out.println(a);//20
        System.out.println(a); //20

        a = 40;//stays with the same variable, no need to declare a new one
        System.out.println(a);//40

        a = 90;
        System.out.println(a);//90 always gives the last value assigned

        //Addition Assignment Operator (Increases the value by any number)
        double balance = 100;
        balance +=1000;// balance will be reassigned balance = 100+1000
        System.out.println(balance);
        balance += 500;// last balance 1100 + 500
        System.out.println(balance);

        //Subtraction Assignment
        balance -=1000; // current balance - 1000
        System.out.println(balance);

        //Multiplication Assignment

        double salary = 45000;
        salary*=2;// doubles the initial salary 45000*2 Multiplies by whatever number you print
        System.out.println(salary);
        salary*=3;
        System.out.println(salary);

        double doge = 0.00123;
        doge*= 1000;
        System.out.println(doge);

        //Division Assignment

        doge/=2;
        System.out.println(doge);

        salary/=1.5;
        System.out.println(salary);

        //Remainder Assignment
        int b = 39;
        b %= 7; // b = 39 % 7
        System.out.println(b);

    }
}
