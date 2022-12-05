package day04_Concatenations;

public class PrimitiveTypeCasting {

    public static void main(String[] args) {
       //--------Implicit Casting
       byte a = 15;
       short b = a;
       int c = a;
       // how the compiler does it: short b = (short)a;
        System.out.println("b = " + b);
        long d = 1000L;
        float f = d;
        System.out.println("f = " + f);

        //--------Explicit Casting
        int x = 100;
        byte y = (byte)x;

        float z = 20.8f;
        short s = (short)z; // you will get only integer number

        double n1 = 2.5;
        byte n2 = (byte)n1;

        System.out.println("n2 = " + n2); // the value will be printed as integer 2

        int num = 500;
        byte num2 = (byte)num; //since 500 is out of byte range, it wont cast it correctly and the computer will print out some random numbers
        System.out.println("num2 = " + num2);

        int q = 50000;
        short h = (short)q; // will be printed put as some random negative number, since it's out of the short range
        System.out.println("h = " + h);

        double e = 3000.5;
        int i = (int)e;
        System.out.println("i = " + i);

        int o = 100;
        double g = o;// will return decimal number from integer .0 will be added in the end
        System.out.println("g = " + g);

    }
}
/* Casting - assigns one primitive type to another ( among numbers, not string or boolean)Only from byte to double
------IMPLICIT
- can be implicit (doesn't require casting operator) and explicit(requires casting operator)
- implicit goes from smallest to the largest. byte a = 25; int b = a; converts automatically by compiler with no special statements
- it converts one type of data type into another
- goes from smallest to the largest: from byte to double

------EXPLICIT
-casting the largest to the smallest ( the other way around)
- you MUST use the casting operator
 */