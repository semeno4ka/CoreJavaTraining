package day09Switch_and_Scanner;

import java.util.Scanner;

public class Eligible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        String eligible = "";
        eligible=(num>=21)?"You are eligible":"You are not eligible";
        System.out.println(eligible);
        input.close();
// index number starts from ZERO and then goes one by one in order
    }
}
