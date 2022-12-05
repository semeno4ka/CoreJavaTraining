package day19_Array;
import java.util.Arrays;
public class ArraysPractice_One {
    public static void main(String[] args) {

        String[] myGroup = new String[5];
        myGroup[0]="Gulcin";                    // first
        myGroup[myGroup.length-1]="Aseel";      // last
        myGroup[2]="Sumeye";
        myGroup[1]="Abidullah";
        myGroup[3]="Khashavar";

        System.out.println(Arrays.toString(myGroup));
        myGroup[1]= "Kuzzat";
        System.out.println(Arrays.toString(myGroup));

        //            To print all the names in reverse order

        for (int i = myGroup.length-1; i >=0 ; i--) {
            System.out.println(myGroup[i]);
        }

        System.out.println("-------------------------------");
        /* To iterate data structure from the beginning:        myGroup.fori+enter
                                          the reverse:          myGroup.forr+enter
        for (int i = 0; i < myGroup.length; i++) {}
        for (int i = myGroup.length - 1; i >= 0; i--) {}*/


    }
}
