package day22_WrapperClass_ArrayList;

import java.util.ArrayList;

public class IteratingArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers. add(100);
        numbers. add(200);
        numbers. add(300);
        numbers. add(400);
        numbers. add(500);
        numbers.add(3,255);//100,200,300,255,400,500

        for (int i = 0; i < numbers.size(); i++) {
            int each = numbers.get(i);
            System.out.println(each);
        }

        for (int i = numbers.size() - 1; i >= 0; i--) {
            int eachReverse=numbers.get(i);
            System.out.println(eachReverse);
        }

        for (Integer eachNumber : numbers) {
            System.out.println(eachNumber);
        }

    }
}
