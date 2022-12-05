package day22_WrapperClass_ArrayList;

public class WrapperClassMethods {
    public static void main(String[] args) {

        /*
        Wrapper Class methods:

        parse method: converts String to primitive, returns primitive
        valueOf methods: returns Wrapper Class objects, converts String to Wrapper Class
         */
        System.out.println("              --------CONVERT STRING TO DIGIT-------------             ");
        String str = "20";
        System.out.println(str+1);//201, doesn't recognize 20 as a number

        //to convert 20 to Primitive Int =>
        int num = Integer.parseInt(str); // unboxing (object converted to primitive)

        System.out.println(num+1);// return 21

        //IN ORDER to USE the str as integer later on, we should convert it to WRapper class

        Integer num2 = Integer.valueOf(str);// A String value of 20 is converted into Object.
        System.out.println(num2);


        String s ="20.5";

        double s1=Double.parseDouble(s);  //Parse is for Primitive
        System.out.println(s1);

        Double s2=Double.valueOf(s); // Value is for OBJECTS
        System.out.println(s2);

        System.out.println(" --------BOOLEAN WITH DIGITS, LETTERS, LowerCase,UpperCase,SpecialChar, Char----------");
        String x ="true";
        boolean x1=Boolean.parseBoolean(x);
        Boolean x2=Boolean.valueOf(x);

        char ch ='A';
        boolean q1= Character.isDigit(ch);
        System.out.println(q1);
        boolean q2= Character.isLetter(ch);
        System.out.println(q2);

        boolean isLowerCase=Character.isLowerCase(ch);
        System.out.println(isLowerCase);

        boolean isUpperCase=Character.isUpperCase(ch);
        System.out.println(isUpperCase);

        boolean isSpecialChar=!Character.isLetterOrDigit(ch);
        System.out.println(isSpecialChar);
        // for true is either letter or digit, otherwise (special char) will return false or you can use LOGIC NOT

        System.out.println("      ----------FINDING SUM OF DIGIT FROM A STRING-------------");
        String string = "a1b2c3d4e5";
        int sum=0;
        for (char each : string.toCharArray()) { //string.toCharArray.for
            if(Character.isDigit(each)){
                sum+=Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);




    }
}
