package dynamicprom;

import org.junit.Test;
import recursion.WordSearch;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WordBreakTest {
    WordBreak inst = new WordBreak();
    @Test
    public void wordBreak() {
        boolean ret = inst.wordBreakDynamic2("leetcode", Arrays.asList("leet", "code"));
        assertThat(ret, is(true));
    }

    @Test
    public void wordBreak2() {
        boolean ret = inst.wordBreakDynamic("catsandog", Arrays.asList("cats","dog","sand","and","cat"));
        assertThat(ret, is(false));
    }
}