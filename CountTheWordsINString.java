package GFG.Strings.Extra;

import java.util.Arrays;
import java.util.List;

//How do you count the number of words in String?
public class CountTheWordsINString {
    public static void main(String[] args) {
        String sentence = "Hello world, how are you?";
        int wordCount = countWords(sentence);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        // Split the sentence into words using whitespace as the delimiter
        List<String> wordsList = Arrays.asList(sentence.split("\\s+"));

        // Return the number of words
        return wordsList.size();

    }
}
