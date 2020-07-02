package dynamicprom;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {
    LongestPalindromicSubstring inst = new LongestPalindromicSubstring();
    @Test
    public void longestPalindrome() {
        String ret = inst.longestPalindrome("babad");
        assertThat(ret, is("bab"));

    }
}