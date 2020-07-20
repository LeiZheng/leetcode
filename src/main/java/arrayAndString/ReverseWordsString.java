package arrayAndString;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseWordsString {
    public String reverseWords(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        Collections.reverse(words);
        return words.stream().filter(str -> !"".equalsIgnoreCase(str)).collect(Collectors.joining(" "));
    }
}
