package day17;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "aabbbccccddddd";
        String result = "";//a2b3c4d5
        // a  b  c  d
        // 2  3  4  5    should fiqure out frequency in the 1st place


        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);  // the character we check first, then go one by one(if without outer loop)
            int count = 0; // will count how many times character appeared

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) { // we have to assign char ch first, because it will then be the one from outer loop
                    count++;
                }
            }
            //need to delete dublictes


            if(result.contains(""+ch)){
                continue;
            }
            result+=ch+""+count;// !!!! ch+count gets executed first. that is why should cast to String, otherwise will get numbers of char number+count number
        }
        System.out.println(result);
    }
}
/*
aabbbcccc
a2b3c4
 */