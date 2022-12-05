package day2_escapeSequences;

public class Escape_Sequences {

    public static void main(String[] args) {//at this moment the only thing to change is "args", can be anything
        System.out.println("Hello Students!\nToday we hava Java Class.");//no need for a space in between characters
        // \n sequence starts a new line
        System.out.println("--------------");
        System.out.println("\tJava Programming Language");// \t sequence starts paragraph
        System.out.println("\t\t\tJava Developer Course Batch");
        // \t can be used several times in a row to move text closer to center
        System.out.println("\\");
        System.out.println("\\\\"); //to Print several \ you always have to put \\ which will turn out just one
        System.out.println("My favorite Tv show is \"The Big Bang Theory\"");// close the quote the same way you opened it



    }
}
/*
     1. \n  New Line
     2. \t  Paragraph Space
     3. \\  Gives printed \  Otherwise it would be an arrow because \ is reserved for sequences in Java
     4. \"  Gives Double qoute printed "
 */