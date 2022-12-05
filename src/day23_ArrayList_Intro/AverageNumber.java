package day23_ArrayList_Intro;

import java.util.ArrayList;

public class AverageNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);//0
        list.add(30);//1
        list.add(40);//2
        list.add(50);//3
        list.add(60);//4
        list.add(70);//5


        System.out.println(list);
        int sum=0;
        double average=0;
        for (Integer each : list) {
            sum+=each;
        }
        average=sum/ (double)list.size();
        System.out.println(average);

    }
}
