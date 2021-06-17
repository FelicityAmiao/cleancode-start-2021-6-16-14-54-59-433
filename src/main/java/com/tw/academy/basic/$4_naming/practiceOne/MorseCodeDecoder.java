package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {

    public static final String TWO_AND_MORE_SPACE_PATTERN = "\\s{2,}";
    public static final String WORD_SEPARATOR = " ";
    public static final String LETTER_SEPARATOR = " ";
    public static final String NON_MORSE_CODE_CHAR = "null";

    public static String decode(String input) {
        String[] words = input.split(TWO_AND_MORE_SPACE_PATTERN);
        StringBuilder decodedMorseCode = new StringBuilder();
        for (String word : words) {
            String [] singleLetters = word.split(LETTER_SEPARATOR);
            for (String singleLetter: singleLetters) {
                decodedMorseCode.append(MorseCode.get(singleLetter));
            }
            decodedMorseCode.append(WORD_SEPARATOR);
        }
        return decodedMorseCode.toString().replaceAll(NON_MORSE_CODE_CHAR, "").trim();
    }
}
