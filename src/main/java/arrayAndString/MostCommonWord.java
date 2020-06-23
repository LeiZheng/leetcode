package arrayAndString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        List<String> words = Arrays.asList(paragraph.toLowerCase().split("[!?',;.\\s]"));
        List<String> bandedWords = Arrays.asList(banned);

        Map<String, Long> wordCountMap = words.stream().parallel().filter(s -> s.length() > 0 && !bandedWords.contains(s)).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        long maxCount = 0;
        String mostCommandWord = null;
        for(var entry : wordCountMap.entrySet()) {
            if(entry.getValue() > maxCount) {
                mostCommandWord = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        return mostCommandWord;
    }
}
