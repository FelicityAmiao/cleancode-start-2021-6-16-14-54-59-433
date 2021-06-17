package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    public static final String WORD_SEPARATOR = " ";
    public static final String DECODED_SUFFIX = "ay";

    public static String pigIt(String sentence) {
        String[] punctuation={".",",","-",":",";","!","?"};
        String[] words = sentence.split(WORD_SEPARATOR);
        for (int currentWordIndex = 0; currentWordIndex < words.length; currentWordIndex++){
            if (isCurrentWordContainsPunctuation(punctuation, words[currentWordIndex])) {
                moveCurrentWordFirstCharToEndAddAy(words, currentWordIndex);
            }
        }
        return String.join(WORD_SEPARATOR, words);
    }

    private static void moveCurrentWordFirstCharToEndAddAy(String[] word, int i) {
        char firstLetter = word[i].charAt(0);
        word[i] = word[i].substring(1);
        word[i] = word[i].replace(word[i], word[i] + firstLetter + DECODED_SUFFIX);
    }

    private static boolean isCurrentWordContainsPunctuation(String[] punctuations, String s) {
        for (int currentPunctuationIndex = 0; currentPunctuationIndex < punctuations.length; currentPunctuationIndex++) {
            if(s.contains(punctuations[currentPunctuationIndex])) {
                return false;
            }
        }
        return true;
    }
}
