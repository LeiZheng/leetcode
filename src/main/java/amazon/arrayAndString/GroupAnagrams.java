package amazon.arrayAndString;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> codeToList = new HashMap<>();
        for(String s : strs) {
            String stringCode = stringToCode(s);
            List<String> stringList = codeToList.get(stringCode);
            if(stringList == null) {
                stringList = new ArrayList<>();
                codeToList.put(stringCode, stringList);
            }
            stringList.add(s);
        }
        return codeToList.values().stream().collect(Collectors.toList());
    }

    private String stringToCode(String s) {
        int[] charCount = new int[26];
        for(char letter : s.toCharArray()) {
            charCount[letter - 'a'] ++;
        }
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < charCount.length; i ++) {
            if(charCount[i] > 0) {
                sb.append(i).append(":").append(charCount[i]).append(",");
            }
        }
        return sb.toString();
    }
}
