package day11_StringMethods;

public class StringMethod1 {
    public static void main(String[] args) {
        String str1 = "CYDEO SCHOOL";
        //String is immutable, it can't be modified.Keep it in mind.ALWAYS
        str1.toLowerCase();// will return all letters in Lower Case
        System.out.println(str1);//returns Upper Case cannot modify the object already declared. You have to create a new String
        //In order to change it, you may reassign the variable to a new value
        str1 = str1.toLowerCase();
        System.out.println(str1);//returns lower case


        //--------------------UPPERCASE AND LOWER CASE----------------
        String str2= "java programming";// IS IMMUTABLE UP UNTIL YOU REASSIGN IT
        str2.toUpperCase();//will return lower case until you reassign it
        str2=str2.toUpperCase();
        System.out.println(str2);
        // If the String was NOT Immutable, you would not need = assign

        //--------------------UPPERCASE AND LOWER CASE----------------

        String word = "Wooden Spoon";

        word.toUpperCase();//WOODEN SPOON
        word.toLowerCase();//wooden spoon
        System.out.println(word);// will anyway print out the first word if you do not reassign word== either one of the Upper or Lower

        //--------------------TRIM--------------------------------to delete any additional spaces (white space)
        String str4 = "       Cydeo School";
        System.out.println(str4);// will print out with white space. to avoid it use trim method
        str4.trim(); // will not remove anything until you reassign the str4
        str4=str4.trim();
        System.out.println(str4);// will return "Cydeo School"


        //------------------------INDEX Of------------------return index number of a specified character
        String sentence1 = "Today is Sunday, and we have Java Class";
        int index1=sentence1.indexOf('w');//will look for this character from left to right
        System.out.println(index1);

        String s1 = "I love Java Programming";
        int firstA=s1.indexOf('a');
        System.out.println(firstA);// will return the number of the first 'a'
        int secondA = s1.indexOf("a ");

        String s2 = "Java Python Javascript Cydeo Python";
        int a1=s2.indexOf('a');
        System.out.println(a1);
        int a2 = s2.indexOf("a ");// or you can int a2=s2.indexOf("va")+1   or int a2= s2.indexOf("a Python")
        //you have to make it unique so the program understands which one you need
        int a3 = s2.indexOf("av");//has two matches right now and will return the first. You have to add more characters to specify which one you need
        int a3anotherway=s2.indexOf("avaS");
        int a4 = s2.indexOf("aS");// there is just one match


        //-------------------------LAST INDEX OF------------------starts the search of right to left
        String w = "Java";
        System.out.println(w.indexOf('a'));// searches from left to right
        //will return 1
        System.out.println(w.lastIndexOf('a'));// will return 3

        String w2 = "Java Python Javascript Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));// will start from the last character-15
        System.out.println(w2.lastIndexOf('P'));//29









    }
}
