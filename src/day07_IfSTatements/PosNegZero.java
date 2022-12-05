package day07_IfSTatements;

public class PosNegZero {
    public static void main(String[] args) {
        int number = 0;
        String result = "";
        if(number > 0) {
            result= "Positive";
        }else if(number < 0) {
            result = "Negative";
        }else{
            result = "Zero";
        }
        System.out.println(result);
    }
}
