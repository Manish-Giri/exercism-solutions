import java.util.Arrays;
import java.util.HashSet;

class IsogramChecker {
    boolean isIsogram(String phrase) {
        String word = phrase.replaceAll("[-\\s]", "");
        return phrase.isEmpty() ||
                word.length() == new HashSet<>(Arrays.asList(word.toLowerCase().split("")))
                        .size();
    }
}
