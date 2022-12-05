package day14_ForLoop;
//REVIEWED
public class OverloadingTheMainMethod {
    public static void main(String[] args) {// will always run this main method because it comes directly from the library. No point in overloading it

        System.out.println('A');
    }
    public static void main(int[] args){

    }
    public static void main(double[] args){}
    public static void main(boolean[] args){}
}
