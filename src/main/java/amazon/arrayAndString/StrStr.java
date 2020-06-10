package amazon.arrayAndString;

import java.util.HashMap;
import java.util.Map;

public class StrStr {
    public int strStrSlow(String haystack, String needle) {
        int index = -1;
        if(needle.length() == 0) return 0;
        for(int i = 0; i < haystack.length(); i ++) {
            boolean isMatched = true;
            for(int j = 0; j < needle.length(); j ++) {
                if((i + j) >= haystack.length() || haystack.charAt(i + j) != needle.charAt(j)) {
                    isMatched = false;
                }
            }
            if(isMatched) {
                index = i;
                break;
            }
        }
        return index;
    }
    public int strStrFast(String haystack, String needle) {
        int index = -1;
        if(needle.length() == 0) return 0;
        int needleLength = needle.length();
        Map<Character, Integer> valueIndexMap = new HashMap();
        for(int i = 0; i < haystack.length();) {
            valueIndexMap.clear();
            int j = 0;
            while(j < needleLength && (i + j) < haystack.length() && haystack.charAt(i + j) == needle.charAt(j) ) {
                valueIndexMap.putIfAbsent(needle.charAt(j), i +j);
                j ++;
            }
            if(j == needleLength) {
                index = i;
                break;
            }
            else {
                int nextFirstValIndex = valueIndexMap.getOrDefault(needle.charAt(0), -1);
                if(nextFirstValIndex > i) {
                    i = nextFirstValIndex;
                }
                else {
                    i ++;
                }
            }
        }
        return index;
    }
    private static long MOD_NUM = Long.MAX_VALUE / 27;
    public int strStrFastCachedWithHashCode(String haystack, String needle) {
        int index = -1;
        if(needle.length() == 0) return 0;
        if(haystack.length() == 0) return -1;
        if(haystack.length() < needle.length()) return -1;
        char preChar = haystack.charAt(0);
        long needleCode = encode(needle);
        long initCode = encode(haystack.substring(0, needle.length()));
        if(initCode == needleCode) return 0;

        for(int i = needle.length(); i < haystack.length(); i ++) {
            int startIndex = i - needle.length() + 1;
            initCode -= char2Int(preChar) * Math.pow(27, needle.length() -1) % MOD_NUM;
            initCode *= 27;
            initCode = initCode % MOD_NUM;
            initCode += char2Int(haystack.charAt(i));
            if(initCode == needleCode) {
                return startIndex;
            }
            preChar = haystack.charAt(startIndex);
        }

        return index;
    }

    private int char2Int(char preChar) {
        return preChar-'a' + 1;
    }

    private long encode(String text) {
        if(text.length() == 0) {
            return 0;
        }
        long sum =0;
        for(int i = 0; i < text.length(); i ++) {
            sum *= 27;
            sum += (char2Int(text.charAt(i))) % MOD_NUM ;
        }
        return sum;
    }
}
