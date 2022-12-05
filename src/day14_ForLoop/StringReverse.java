package day14_ForLoop;
//REVIEWED
public class StringReverse {
    public static void main(String[] args) {
        // LOGIC YOU MUST KNOW FOR EVERY INTERVIEW
    String str = "Java";//avaJ
                //0123

        String reverse="";//"a" should be added to reverse. "b" should be added etc
        for (int i = str.length()-1; i>=0 ; i--) { //>=0 because we go in reverse direction
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);

        System.out.println("__________");
        String name = "Ermer Keneshbekovich Apazov";
        String result=reverse(name);
        System.out.println(result);

    }
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i>=0 ; i--) { //>=0 because we go in reverse direction
            reverse+=str.charAt(i);
        }
        return reverse;
    }


}
