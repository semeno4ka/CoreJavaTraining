package day40_Collection_2;

import java.util.*;

public class IterablePracticeOne {
    public static void main(String[] args) {


List<String> names = new ArrayList<>();
names.addAll(Arrays.asList("Ahmed","ahmed","AhMed","John","Ercon","Daniel","Mustafa","Mohhamed","AHmed","ahmed","Yulia","CHris"));

Iterator<String> it = names.iterator();
while(it.hasNext()){
    String each = it.next();
    if(each.equalsIgnoreCase("ahmed")){
        it.remove();
    }
}
        System.out.println(names);//[John, Ercon, Daniel, Mustafa, Mohhamed, Yulia, CHris]

        System.out.println("--------------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed","ahmed","AhMed","John","Ercon","Daniel","Mustafa","Mohhamed","AHmed","ahmed","Yulia","CHris"));
names2.removeIf(p-> p.equalsIgnoreCase("ahmed"));
        System.out.println(names2);//[John, Ercon, Daniel, Mustafa, Mohhamed, Yulia, CHris]

        System.out.println("------------------VERY IMPORTANT--------------------");
  List<Integer> numbers = new ArrayList<>();
  numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9));
  // find N's largest number
        int n = 5;

        for (int i = 0; i < n-1; i++) {// the key is to give here the right condition n-1, since we need the n's and thus the largest left will be n's
            numbers.removeIf(p-> Collections.max(numbers) == p);
        }
        int max= Collections.max(numbers);
        System.out.println(max);

    }
}
