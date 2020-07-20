package arrayAndString;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> letterMap = new HashMap<Character,Character>();
        if(s.length() != t.length()) return false;
        for(int i = 0; i < s.length(); i ++) {
            char srcChar = s.charAt(i);
            char toChar = t.charAt(i);
            Character cachedMapChar = letterMap.get(srcChar);
            if(cachedMapChar == null) {
                letterMap.put(srcChar, toChar);
            }
            else{
                if(cachedMapChar != toChar) {
                    return false;
                }
            }

        }
        return true;
    }
}
