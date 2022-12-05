package day17_CustomClasses;

public class UniqueCharacters_I {
    public static void main(String[] args) {
        String str="aabcccd";

        String unique="";
        for (int i = 0; i <str.length() ; i++) {
            char each =str.charAt(i);
            if(str.indexOf(each)==str.lastIndexOf(each)){
                unique+=each;
            }
        }
        System.out.println(unique); //bd


      /*  // TRY TO FIGURE OUT WHY
        String unique2="";

        for (int i = 0; i <str.length() ; i++) {
            if(str.indexOf(i)==str.lastIndexOf(i)){
                unique2+=str.charAt(i);
            }
        }
        System.out.println(unique2); // aabcccd !!!!*/
    }
}
