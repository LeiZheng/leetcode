package arrayAndString;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        Map<Character, Integer> charIndexMap = new HashMap<>();
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i ++) {
            if(charIndexMap.containsKey(chars[i])) {
                charIndexMap.put(chars[i], -1);
            }
            else {
                charIndexMap.put(chars[i], i);
            }
        }
        return charIndexMap.values().stream().filter(x -> x >= 0).mapToInt(x -> x).min().orElse(-1);
    }
}
