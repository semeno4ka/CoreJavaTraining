package day15_whileLoop;
//REVIEWED
public class RemoveDuplicates {
    public static void main(String[] args) {

        String str="aabbbcccc"; // cant simply remove, string is immutable
        String result=""; // to store final result abc//Add a character IF IT IS NOT ADDED YET

        //need to get every single character of the string //length() instead of length()-1 because we need a number it will be repeated, but not a character
        for (int i =0; i < str.length() ; i++) {//i: represents the index numbers of str starting from zero to last index
            //System.out.println(str.charAt(i)); shows all the characters
            char each =str.charAt(i); // each character of the String str

            if(!result.contains(""+each)){// contains requires String, not char value, that is why we need to convert Char to String by adding ""
                result+=each;// if the String result does not contain the character of Str yet, the character will be added
            } //    !result.contains(each) if the string already contains, character will not be added
        }   System.out.println(result);

    }
}
