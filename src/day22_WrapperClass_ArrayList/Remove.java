package day22_WrapperClass_ArrayList;

public class Remove {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40};
    }
    public static int[] removeElement(int[] array, int index) {

        int[] newArray = new int[array.length - 1];
        int i = 0;
        for (int each : array) {
            if (each == array[index]) {
                continue;
            }
            newArray[i++] = each;
        }
        return newArray;

    }

    }


