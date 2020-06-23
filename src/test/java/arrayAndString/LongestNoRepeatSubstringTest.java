package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LongestNoRepeatSubstringTest {
    LongestNoRepeatSubstring inst = new LongestNoRepeatSubstring();

    @Test
    public void lengthOfLongestSubstringSolution2() {
//        assertThat(inst.solution2("abcabcbb"), is(3));
//        assertThat(inst.solution2("bbbbb"), is(1));
//        assertThat(inst.solution2("pwwkew"), is(3));
        assertThat(inst.solution2("abba"), is(2));
    }
}