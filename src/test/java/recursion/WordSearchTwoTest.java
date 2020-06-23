package recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WordSearchTwoTest {
    WordSearchTwo inst = new WordSearchTwo();
    @Test
    public void findWords() {
        char[][] board = new char[][] {
                {'o','a','a','n'}
                ,{'e','t','a','e'}
                ,{'i','h','k','r'}
                ,{'i','f','l','v'}
        };
        List<String> foundList = inst.findWords(board, new String[]{"oath", "pea", "eat", "rain"});
        assertThat(foundList, is(Arrays.asList("eat","oath")));
    }
}