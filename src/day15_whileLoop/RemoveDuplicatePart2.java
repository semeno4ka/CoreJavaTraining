package day15_whileLoop;

public class RemoveDuplicatePart2 {
    public static void main(String[] args) {
        String str = "xyzxyzxyz";
        String result="";// a new string with the result will always be needed, because no work CAN be performed on original string, since it immutable

        for (int i = 0; i <str.length() ; i++) {// "<" includes length()-1
            if ( result.contains(""+str.charAt(i) ) ) { // if the character is already contained in new string, we skip it
                continue;
            }
            result+=str.charAt(i);// all characters are added

        }
        System.out.println(result);
    }
}
