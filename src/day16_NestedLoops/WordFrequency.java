package day16_NestedLoops;

public class WordFrequency {
    public static void main(String[] args) {


        String sentence="Java JAva JaVa JavA";
        String word ="Java";
        int count=0;// contains the frequency of the word

        sentence=sentence.toLowerCase();
        word=word.toLowerCase();

        while(sentence.contains(word)){
            count++;
            sentence=sentence.replaceFirst(word,"");
            // we delete the word each time, so that the loop isn't infinite
            //the while loop will stop when all java will be replaced
        }
        System.out.println(count);

    }
}
