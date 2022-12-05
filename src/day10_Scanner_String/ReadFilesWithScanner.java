package day10_Scanner_String;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadFilesWithScanner {
    public static void main(StringInDetails[] args) throws IOException {
        Scanner scan = new Scanner(Path.of("src/day10_Scanner_String/Test.txt"));//path from root
        //error in the scanner have to avoid for a moment

        System.out.println(scan.nextLine());// with scan.next() will print the first word of the file
        //scan.nextLine() will read the first line
        System.out.println(scan.nextLine());// in order to read the next line you have to call nextLine again and again
        System.out.println(scan.nextLine());
        //if there is nothing in the text file-> no such element error will appear on thr screen

        //System.out.println(scan.hasNextLine());//will return true or false (whether there is a word in the file)

        scan.close();
    }
}
