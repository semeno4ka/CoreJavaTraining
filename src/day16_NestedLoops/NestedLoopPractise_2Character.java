package day16_NestedLoops;

public class NestedLoopPractise_2Character {
    public static void main(String[] args) {
        String str ="aaaabggbbcyyccddeeeeff";

        String result="";


        for (int j = 0; j < str.length(); j++) {

            char ch =str.charAt(j);// each character of str
            int count=0;

            for (int i = 0; i < str.length(); i++) {
                // resposible for comparing ch to each character of str and return the frequency of ch

                if(str.charAt(i) == ch){ //each charater of str
                    count++;
                }
            }

            if(count==2 && !result.contains(""+ch)){
                result+=ch;
            }
        }
        System.out.println(result);



    }
}
