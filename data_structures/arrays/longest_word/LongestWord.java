package Leetcode.data_structures.arrays.longest_word;

public class LongestWord {
    public String longestWord(String sen) {
        sen = sen.replaceAll("[^a-zA-Z0-9 ]","");

        String[] words = sen.split("\\s+");

        String longestWord = "";
        int maxLength = 0;

        for(String word: words) {
            if(word.length() > maxLength) {
                maxLength = word.length();
                longestWord = word;
            }
        }
        return longestWord;
    }
}
