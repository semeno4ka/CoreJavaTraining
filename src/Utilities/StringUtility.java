package Utilities;

public class StringUtility {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Anna"));
        System.out.println(removeDup("vvvrrre"));
    }

    public static String reverse(String str) {
        String reverse = "";// to contain all the characters of the given string in reverse order
        for (int i = str.length() - 1; i >= 0; i--) { //>=0 because we go in reverse direction
            reverse += str.charAt(i); //i: index number of the given string starting from last index to index 0
        }// Char is used to get each characters of the string starting from the last to index zero
        return reverse;
    }

    public static boolean isPalindrome(String str) {
        String reverse = reverse(str);
        return str.equalsIgnoreCase(reverse);
    }

    public static int frequency(String str, String word) {
        int count = 0;

        while (str.indexOf(word) >= 0) {
            str = str.replaceFirst(word, "");
            count++;
        }
        return count;
    }

    public static String removeDup(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!(result.contains(""+each))) { // if the character is not included in  the new String
                result += each;
            }
        }
        return result;
    }

    public static int frequency(String str, char ch){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == ch){
                count++;
            }
        }
        return count;

    }

}
