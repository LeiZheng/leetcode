package arrayAndString;

public class NumberSubstringsWith1 {
    public int numSub(String s) {
        String[] subStrs = s.split("0");
        int count = 0;
        for(int i = 0; i < subStrs.length; i ++) {
            int len = subStrs[i].length();
            count += (1 + len) * len / 2;
        }
        return count % 1000000007;
    }
}
