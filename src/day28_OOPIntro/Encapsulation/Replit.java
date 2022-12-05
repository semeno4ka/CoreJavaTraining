package day28_OOPIntro.Encapsulation;

public class Replit {
    public static void main(String[] args) {


        String[] str = {"1","bc","1","dc","dc"};
        System.out.println(getDup(str));
    }
    public static int getDup(String[] str){
        int dup=0;
        int result=0;
        for (String each : str) {
            for (String each2 : str) {
                if(each==each2){
                    dup++;
                }
            }
            result+=dup;
        }
        result=dup-str.length;
        return result;
    }
}
