package recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LetterCombinationsOfPhoneNumberTest {
    LetterCombinationsOfPhoneNumber inst = new LetterCombinationsOfPhoneNumber();
    @Test
    public void letterCombinations() {
        List<String> combins = inst.letterCombinations("23");
        assertThat(combins, is(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }

    @Test
    public void letterCombinationsWithPattern() {
        List<String> combins = inst.letterCombinationsWithPattern("23");
        assertThat(combins, is(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
    }
}