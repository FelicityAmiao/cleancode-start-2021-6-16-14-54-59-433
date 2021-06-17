package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {

    public static final String WORD_SEPARATOR = " ";

    public static String pigIt(String str) {
        String[] punctuation={".",",","-",":",";","!","?"};
        String[] word = str.split(WORD_SEPARATOR);
        for (int i = 0; i < word.length; i++){
            if (isCurrentWordContainsPunctuation(punctuation, word[i])) {
                moveCurrentWordFirstCharToEndAddAy(word, i);
            }
        }
        return String.join(WORD_SEPARATOR, word);
    }

    private static void moveCurrentWordFirstCharToEndAddAy(String[] word, int i) {
        char c = word[i].charAt(0);
        word[i] = word[i].substring(1);
        word[i] = word[i].replace(word[i], word[i] + c + "ay");
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
