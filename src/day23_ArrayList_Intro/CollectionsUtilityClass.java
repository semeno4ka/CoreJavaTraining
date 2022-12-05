package day23_ArrayList_Intro;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtilityClass {
    public static void main(String[] args) {
        /*
        Collections Utility provides methods to manipulate Utilities
        import java.util.Collections;
        min()
        max()
        sort()
        reverse()
        swap()
        replaceAll()
        frequency()

         */

        System.out.println("_______________Max() and Min()_________________________");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int max = Collections.max(list);
        int min = Collections.min(list);
        System.out.println("min = " + min);
        System.out.println("max = " + max);

        System.out.println("____________________Sort()___________________________");

        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("Alena","Sumeye","Gadir","Muhtar"));
        Collections.sort(list2);
        System.out.println(list2);


        System.out.println("____________________Reverse()________________________");

        Collections.reverse(list2);
        System.out.println(list2);

        System.out.println("___________________Swap()____________________________");
        ArrayList<String> developers = new ArrayList<>();
        developers.addAll(Arrays.asList("Gadir", "Hasan","Bilal"));
        Collections.swap(developers, 0,developers.size()-1);//SWAP FIRST AND LAST
        System.out.println(developers);
    }
}
