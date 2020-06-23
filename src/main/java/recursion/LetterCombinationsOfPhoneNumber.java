package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LetterCombinationsOfPhoneNumber {
    private static Map<Character, char[]> letterToStrings = Map.ofEntries(
            Map.entry('2', "abc".toCharArray()),
            Map.entry('3', "def".toCharArray()),
            Map.entry('4', "ghi".toCharArray()),
            Map.entry('5', "jkl".toCharArray()),
            Map.entry('6', "mno".toCharArray()),
            Map.entry('7', "pqrs".toCharArray()),
            Map.entry('8', "tuv".toCharArray()),
            Map.entry('9', "wxyz".toCharArray())
    );
    public List<String> letterCombinations(String digits) {
        List<String> combins = new ArrayList<>();
        if(digits.length() == 0) {
            return combins;
        }
        List<char[]> letterLists = digits.chars().mapToObj(c -> letterToStrings.get((char)c)).collect(Collectors.toList());
        letterCombinationsRecursion(letterLists, "", combins);
        return combins;
    }

    private void letterCombinationsRecursion(List<char[]> letterLists, String value, List<String> combins) {
        if(value.length() == letterLists.size()) {
            combins.add(value);
            return;
        }
        char[] letterList = letterLists.get(value.length());
        for(int i = 0; i < letterList.length; i ++) {
            letterCombinationsRecursion(letterLists, value + letterList[i], combins);
        }
    }

    public List<String> letterCombinationsWithPattern(String digits) {
        List<String> combins = new ArrayList<>();
        if(digits.length() == 0) {
            return combins;
        }
        List<char[]> letterLists = digits.chars().mapToObj(c -> letterToStrings.get((char)c)).collect(Collectors.toList());
        int[] marks = new int[letterLists.size()];
        letterCombinationsRecursionWithPattern(letterLists, marks, 0 , combins);
        return combins;
    }

    private void letterCombinationsRecursionWithPattern(List<char[]> letterLists, int[] marks, int deep, List<String> combins) {
        if(deep == letterLists.size()) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < marks.length; i ++) {
                sb.append(letterLists.get(i)[marks[i]]);
            }
            combins.add(sb.toString());
            return;
        }
        char[] letterList = letterLists.get(deep);
        for(int i = 0; i < letterList.length; i ++) {
            marks[deep] = i;
            letterCombinationsRecursionWithPattern(letterLists, marks, deep + 1, combins);
        }
    }
}
