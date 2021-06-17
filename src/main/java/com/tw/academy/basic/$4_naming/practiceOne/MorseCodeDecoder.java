package com.tw.academy.basic.$4_naming.practiceOne;

public class MorseCodeDecoder {
    public static String decode(String input) {
        String[] words = input.split("\\s{2,}");
        StringBuilder decodedMorseCode = new StringBuilder();
        for (String word : words) {
            String [] singleLetters = word.split(" ");
            for (String singleLetter: singleLetters) {
                decodedMorseCode.append(MorseCode.get(singleLetter));
            }
            decodedMorseCode.append(" ");
        }
        return decodedMorseCode.toString().replaceAll("null", "").trim();
    }
}
