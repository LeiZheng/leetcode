package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class FirstUniqueCharacterTest {
    FirstUniqueCharacter inst = new FirstUniqueCharacter();
    @Test
    public void firstUniqChar1() {
        int result = inst.firstUniqChar("leetcode");
        assertThat(result, is(0));
    }
    @Test
    public void loveleetcode2() {
        int result = inst.firstUniqChar("loveleetcode");
        assertThat(result, is(2));
    }

}