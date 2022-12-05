package day13_CustomMethodPart2;

public class CustomMethodReturn {
    /*
    not every method requires parameters. if it's just a print statement within the method, no parameter is required
    will return the value, which can be used later on for coding

    public static int sum(int num1, int num2){
    int result;
    result=num1+num2;
    return result;
    total= sum(num1,num2) you reused the value assigning it to total. If you use void, you are not able to reuse the result
     */
    public static void main(String[] args) {
       int sum= addition(3,5);//returns data that's why I can assign it to a variable. You can do anything with it in the code
       int sq=square(9);
       int cub=cube(9);
        System.out.println(sum + ", " + sq+ ", "+cub);
    }
    //*modifier  *specifier *return type(expected output of the method, the data type you need) *method  *method name *parameter
    // a method can return ONLY ONE VALUE at a time, which is specified as return type (do not confuse with parameter, parameter is the input)
    public static int addition(int num1, int num2){
        int result = num1+num2; // if the return type was void, you will be able to print out the sum, but you cannot use the result
        return result;// In return method RETURN is used in the end, however, it also can be used in void to give a command to exit, not to use a value
    }

    public static int square(int n1){
        int square=n1*n1;
        return square;// if you need to narrow, you will place casting in between return and square (return (short) square)!!!!!
    }

    public static int cube(int n1){
        int cube=square(n1)*n1; // EXAMPLE of reusing another return method within a different return method
        return cube;
    }





}
