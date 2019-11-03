/*

Since this exercise has a difficulty of > 4 it doesn't come
with any starter implementation.
This is so that you get to practice creating classes and methods
which is an important part of programming in Java.

Please remove this comment when submitting your solution.

*/

import java.security.PrivateKey;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class PigLatinTranslator {
    private String word;
    private Pattern pattern;
    private Matcher matcher;

    public PigLatinTranslator() {
    }

    public String translate(String word) {
//        if (word.startsWith("a") || word.startsWith("e") || word.startsWith("i") || word.startsWith("o")
//                || word.startsWith("u"))
        if(isVowel(word)) {
            return word + "ay";
        }

        else {
            // consonant
            // check if consonant is followed by qu
            if(isConsFollowedByQU(word)) {
                return word.substring(3) + word.substring(0,1) + "qu" + "ay";
            }
            int idx = findStartingVowelIndex(word);
            String cluster = word.substring(0, idx);
            return word.substring(idx) + cluster + "ay";
        }



        //return null;
    }

    private boolean isVowel(String word) {
        //Pattern pattern = new Pattern();
        String p = "^[aeiou]|xr|yt";
        pattern = Pattern.compile(p);

        //return Pattern.matches(p, word);
//        if(word.matches(pattern)) {
//            System.out.println("Vowel");
//            return true;
//        }
//
//        return false;

        matcher = pattern.matcher(word);
        return matcher.find();
    }

    private int findStartingVowelIndex(String word) {
        String p = "[aeiou]|xr|yt";
        pattern = Pattern.compile(p);
        matcher = pattern.matcher(word);
//        while(m.find()) {
//            // get starting index of first match
//            return m.start();
//        }
//        return -1;

        return matcher.find() ? matcher.start() : -1;
    }

    private boolean isConsFollowedByQU(String word) {
        String p = "[^a|e|i|o|u|xr|yt]qu";
        pattern = Pattern.compile(p);
        matcher = pattern.matcher(word);
        return matcher.find();

    }
}