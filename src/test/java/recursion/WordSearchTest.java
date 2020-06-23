package recursion;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class WordSearchTest {
    WordSearch inst = new WordSearch();
    @Test
    public void existForABCCED() {
        char[][] board = new char[][] {
                {'A','B','C','E'}
                ,{'S','F','C','S'}
                ,{'A','D','E','E'}
        };
        boolean isFound = inst.exist(board, "ABCCED");
        assertThat(true, is(isFound));
    }
    @Test
    public void existForSEE() {
        char[][] board = new char[][] {
                {'A','B','C','E'}
                ,{'S','F','C','S'}
                ,{'A','D','E','E'}
        };
        boolean isFound = inst.exist(board, "SEE");
        assertThat(true, is(isFound));
    }

    @Test
    public void existForABCB() {
        char[][] board = new char[][] {
                {'A','B','C','E'}
                ,{'S','F','C','S'}
                ,{'A','D','E','E'}
        };
        boolean isFound = inst.exist(board, "ABCB");
        assertThat(false, is(isFound));
    }
}