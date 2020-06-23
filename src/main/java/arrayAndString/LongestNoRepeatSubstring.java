package arrayAndString;

import java.util.HashMap;
import java.util.Map;

public class LongestNoRepeatSubstring {
    // slide windows
    public int solution2(String s) {
        int maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap();
        for(int i = 0, j = 0; j < s.length(); j ++) {
            Integer index = charIndexMap.get(s.charAt(j));
            if(index != null) {
                i = Math.max(i, charIndexMap.get(s.charAt(j)) + 1);
            }
            charIndexMap.put(s.charAt(j), j);
            maxLength = Math.max(maxLength, j - i + 1);
        }
        return  maxLength;
    }
}
