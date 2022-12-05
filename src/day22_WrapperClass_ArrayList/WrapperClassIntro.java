package day22_WrapperClass_ArrayList;

public class WrapperClassIntro {
    public static void main(String[] args) {
        /*
        Can convert primitive to object and object to primitive
        Array: size fixed, supports both primitive and non-primitive. Can be multidimensional
        Collection: size is dynamic, do not support primitives
        Map: size is dynamic, do not support primitives

        For that, you can convert primitive to object and use Collection and Map
        You have 8 Wrapper classes as you have 8 primitive data types.

        java.lang (package we need to import in order to use Wrapper). Imported implicitly! (automatically)

        byte     =>   Byte          From Primitive to Wrapper Class is autoboxing
        short    =>   Short         From Non-primitive to Primitive is unboxing
        int      =>   Integer
        long     =>   Long
        float    =>   Float
        double   =>   Double
        char     =>   Character
        boolean  =>   Boolean
         */

        int b1= 100; //  => to convert it into an Object you use Integer

        double c1=b1;
        long c2=b1; // no error because for primitive, casting is performed implicitly

        // No casting is performed in Wrapper Class, you have to use SAME data type CLass
        Integer b2 =b1;// the wrapping is performed automatically in the background

        char ch ='A';
        Character ch2=ch;// Autoboxing

        double d1=5.5;
        Double d2=d1;// Autoboxing

        Integer n1=20;
        int n2=n1;
        long n3=n1; // no error, because implicit casting works for primitives

        Character g1 ='Z';
        char g2=g1; // unboxing



    }
}
