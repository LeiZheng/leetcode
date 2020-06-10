package amazon.arrayAndString;

import java.util.HashMap;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        if(t.length() == 0) return "";
        HashMap<Character, Integer> targetCharCountMap = getCharacterIntegerHashMap(t);
        HashMap<Character, Integer> checkingCharCountMap = new HashMap<>();
        int[] pos = new int[] {0,0};
        for(int i = 0; i < s.length(); i ++) {
            checkingCharCountMap.clear();
            for(int endIndex = i; endIndex < s.length(); endIndex ++) {
                int charCount = checkingCharCountMap.getOrDefault(s.charAt(endIndex), 0);
                charCount += 1;
                checkingCharCountMap.put(s.charAt(endIndex), charCount);
                boolean isMatched = targetCharCountMap.entrySet().stream()
                        .allMatch(entry -> (entry.getValue() - checkingCharCountMap.getOrDefault(entry.getKey(), 0)) <= 0);
                if(isMatched ) {
                    if(pos[1] - pos[0] == 0) {
                        pos[0] = i;
                        pos[1] = endIndex + 1;
                    }
                    else if(pos[1] - pos[0] > endIndex - i) {
                        pos[0] = i;
                        pos[1] = endIndex + 1;
                    }
                    break;
                }
            }
        }
        return s.substring(pos[0], pos[1]);
    }

    private HashMap<Character, Integer> getCharacterIntegerHashMap(String s) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            int charCount = charCountMap.getOrDefault(s.charAt(i), 0);
            charCount++;
            charCountMap.put(s.charAt(i), charCount);
        }
        return charCountMap;
    }
}
