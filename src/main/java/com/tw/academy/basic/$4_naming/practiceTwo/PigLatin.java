package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    public static final String WORD_SEPARATOR = " ";
    public static final String DECODED_SUFFIX = "ay";

    public static String pigIt(String sentence) {
        String[] punctuation={".",",","-",":",";","!","?"};
        String[] words = sentence.split(WORD_SEPARATOR);
        for (int i = 0; i < words.length; i++){
            if (isCurrentWordContainsPunctuation(punctuation, words[i])) {
                moveCurrentWordFirstCharToEndAddAy(words, i);
            }
        }
        return String.join(WORD_SEPARATOR, words);
    }

    private static void moveCurrentWordFirstCharToEndAddAy(String[] word, int i) {
        char firstLetter = word[i].charAt(0);
        word[i] = word[i].substring(1);
        word[i] = word[i].replace(word[i], word[i] + firstLetter + DECODED_SUFFIX);
    }

    private static boolean isCurrentWordContainsPunctuation(String[] punctuation, String s) {
        for (int j = 0; j < punctuation.length; j++) {
            if(s.contains(punctuation[j])) {
                return false;
            }
        }
        return true;
    }
}
