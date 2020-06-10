package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MinimumWindowSubstringTest {
    MinimumWindowSubstring inst = new MinimumWindowSubstring();
    @Test
    public void minWindow() {
        String result = inst.minWindow("ADOBECODEBANC","ABC");
        assertThat(result, is("BANC"));
    }
    @Test
    public void minWindow2() {
        String result = inst.minWindow("a","b");
        assertThat(result, is(""));
    }
    @Test
    public void minWindow3() {
        String result = inst.minWindow("a","a");
        assertThat(result, is("a"));
    }
}