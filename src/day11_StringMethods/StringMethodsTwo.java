package day11_StringMethods;

public class StringMethodsTwo {
    public static void main(String[] args) {

        //-----------------------------REPLACE------------------replaces old value with a new
        String sentence = "I love Python, Python is the best programming language, and Python is in high demand";
        //need to replace Python with Java
        sentence = sentence.replace("Python","Java");// all PYTHON will be replaced
        // first goes WHAT value you want to replace, second with WHAT you want to replace. It creates a new string with the same characters except for Python

        System.out.println(sentence);


        //-----------------------------replacing single character
        String word ="Java";
        word = word.replace('a','e');// You can use "a" because it's basically will do the same
        System.out.println(word);//Jeve

        //-----------------------------REPLACE FIRST----------------replaces just the first value
        String sentence2= "I love Java, Java is cool";
        sentence2.replace("Java","Python");//will replace all Java
        sentence2=sentence2.replaceFirst("Java","Python");//replaces the first Java

        String sentence3 = "Java is fun, Java is cool, Java is amazing";
        // to replace THE SECOND JAVA
        sentence3= sentence3.replaceFirst(", Java", ", Python");// will replace the First matching one
        System.out.println(sentence3);//Java is fun, Python is cool, Java is amazing

        //----------------------------SUBSTRING--------------creates subvalues
        String sentence4 = "I love Java Programming";// Java index 7891011(space included in the end) ALWAYS end it one character plus
        String languageName = sentence4.substring(7,10+1);// the ending index is always excluded in substring
        System.out.println(languageName);
        //--------------
        String sentence5 = "Today is Sunday, Tomorrow is Monday";//9-14+1
        String today=sentence5.substring(9,14+1);
        System.out.println(today);

        //--------------------------------------------------
        String email= "gmail@yahoo.com";// find the domain. to find it we need to take characters after @ and before .(dot)
        int beginning = email.indexOf("@")+1;// will return the index of the character right after @
        int ending = email.lastIndexOf(".");// uses only the last dot
        String domain = email.substring(beginning,ending);// everything is included, starting from beginning to the end
        System.out.println(domain);

        //--------------------------------------------------
        String sentence6 = "I Love Java programming";
        String language=sentence6.substring(7);
        System.out.println(language);// IF YOU DO NOT SPECIFY THE END IT WILL PRINT OUT EVERYTHING STARTING FROM THE BEGINNING
        //String r = sentence6.substring(7, sentence6.length()+1); //is another way to do it, yet the first is the best

        //--------------------------------------------------
        String sentence7 = "Today is Sunday, tomorrow is Monday";
        int lastSpace = sentence7.lastIndexOf((" "));
        String tomorrow= sentence7.substring((lastSpace)+1);// or sentence7.substring(sentence7,lastIndexOf(" ")+1)
        System.out.println(tomorrow);

        //-----------------------------------REPEAT-----------------------you just provide a nu,ber of times you want to repeat it
        String str = "Python";
        String result=str.repeat(10);
        System.out.println(result);//10 Python back to back
        result = (str + " ").repeat(10);// if you need spacce, if you need new line add \n
        System.out.println(result);

















    }
}
