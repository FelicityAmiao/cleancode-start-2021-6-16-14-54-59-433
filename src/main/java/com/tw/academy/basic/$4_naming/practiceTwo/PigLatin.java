package com.tw.academy.basic.$4_naming.practiceTwo;

public class PigLatin {
    //Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
    public static String pigIt(String str) {
        String[] punctuation={".",",","-",":",";","!","?"};
        String[] word = str.split(" ");
        char c;
        boolean keepOriginChar = true;

        for (int i = 0; i < word.length; i++){
            for (int j = 0; j < punctuation.length; j++)
                if(word[i].contains(punctuation[j]) == true)
                    keepOriginChar = false;

            if (keepOriginChar){
                c = word[i].charAt(0);
                word[i] = word[i].substring(1, word[i].length());
                word[i] = word[i].replace(word[i], word[i] + c + "ay");
            }
            keepOriginChar = true;
        }

        return String.join(" ", word);
    }
}
