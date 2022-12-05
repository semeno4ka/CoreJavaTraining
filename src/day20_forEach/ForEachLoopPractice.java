package day20_forEach;

import java.util.Arrays;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11};
        for (int each : numbers) {
            if(each%2!=0){
                System.out.print(each+" ");
            }
            }

        System.out.println();
        System.out.println("----------------MAX and MIN via Each Loop---------------");
        int[] nums = {100,20,30,40,5,4,3,2,1,1000,300,500};
        int max = nums[0];
        int min = nums[0];
        for (int each : nums) {
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println(max);
        System.out.println(min);

        System.out.println("----------------Merged---------------");

        int[] a1 = {10,20,30,40,50};
        int[] a2 = {60,70,80,90,100};
        int[] a3 = new int[a1.length+a2.length];
        int k=0;// k represents index of third array
        for (int each : a1) {
            a3[k++] =each;// we should make sure that index numbers of a3 keep increasing
        }
        for (int each : a2) {
            a3[k++]=each;
        }

        System.out.println(Arrays.toString(a3));

        System.out.println("------------------INITIALS----------------");

        String[] names = {"Mohammad Karimi","Vasyl Dobrianski","Gadir Ibrahimov","Abidullah Rahimi"};
        for (String each : names) {
            System.out.println(each.charAt(0)+"."+each.charAt(each.lastIndexOf(" ")+1));
        }



        }
    }

