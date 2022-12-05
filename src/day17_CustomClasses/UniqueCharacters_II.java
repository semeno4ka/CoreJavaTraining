package day17_CustomClasses;

public class UniqueCharacters_II {
    public static void main(String[] args) {
        String str="aabcccd";
        String unique="";
        // figure out hoe many times each character appears

        // without the outter Loop you have to check each character manually

        for (int j = 0; j < str.length(); j++) {
            // 1st character check, second cycle second character check, third cycle 3rd character check

            char ch= str.charAt(j);// we check first character first with every single character of the string
            int frequency=0; // we don't know yet hoe many times it appears
             // each cycle frequency will be reset

            for (int i = 0; i <str.length() ; i++) {// check how many times the ch appeared
                if (str.charAt(i) == ch) { //means this ch character appeared in the str,
                    frequency++; //if appeared, we add +1Ò
                }
            }

            if(frequency== 1){ // if the frequency is one, then it's unique
                unique+=ch; // still within the outer loop
        }


        }

        System.out.println(unique); //bd



    }
}
