package day11_StringMethods;

public class StringMethodThree {
    public static void main(String[] args) {
        //------------------------------------IS EMPTY------------------ creates boolean conditions
        //if string is empty, it returns you true, if not-false
        String word = "Wooden Spoon";
        boolean r1 = word.isEmpty();
        System.out.println(r1);//false
        String word2 = "";// if there is space it means it's not empty
        boolean r2=word2.isEmpty();
        System.out.println(r2);

        //-----------------------------BLANK------------if the string has nothing, but the space
        String str = "     ";
        boolean r0 = str.isEmpty();//false, cause space is a character, yet->
        System.out.println(r0);
        boolean r3= str.isBlank();//true
        System.out.println(r3);

        //--------------------------EQUALS-------------------
        String str1 = "Cydeo"; // used string literal "" will be stored at String Pool
        String str2 = new String("Cydeo");// stored outside the pool
        // Since the objects are different, you can't compare it with == sign, only through equals()
        boolean result = str1.equals(str2);// true. Can skip creating boolean and System.out.println(str1.equals(str2));
        System.out.println(result);
        System.out.println(str1.equals(str2));// !!!!!IS CASE SENSITIVE!!!!!!!!

        //TO AVOID CASE SENSITIVITY----------EQUALS IGNORE CASE-------------------
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s1.equalsIgnoreCase(s2));//TRUE

        //----------------------------CONTAINS--------------
        String students = "Hasan, Naran, Sumeye, Nataliia";
        // find if Ahmed is in the string
        boolean hasAhmed= students.contains("Ahmed"); //will return true/false CANNOT IGNORE CASE SENSITIVITY
        System.out.println(hasAhmed);
        //----------------to avoid case sensitivity
        String  sentence = "My favorite programming language is JAVA";
        boolean hasJava= sentence.toLowerCase().contains("java");
        System.out.println("hasJava = " + hasJava);// will work only if all java is lower case

        //------------------------STARTS WITH--------------
        String name = "Michael";
        boolean l=name.startsWith("D");// will check the first character, if you provide two characters, it will check the first two characters
        System.out.println(l);//true

        String url = "www.cydeo.com";
        boolean isValid = url.startsWith("www.");
        System.out.println(isValid);//true

        //--------------------------ENDS WITH-------------------
        String url2= "www.cydeo.com";
        boolean isValid2 = url2.endsWith(".com");
        System.out.println(isValid2);//true

        //-------
        String email = "CydeoSchool@gmail.com";
        boolean isGmail= email.endsWith("gmail.com");
        boolean isYahoo = email.endsWith("yahoo.com");
        boolean isHotMail = email.endsWith("hotmail.com");
        System.out.println("isGmail: "+isGmail);
        System.out.println("isYahoo: "+isYahoo);
        System.out.println("isHotMail: "+isHotMail);







    }
}
