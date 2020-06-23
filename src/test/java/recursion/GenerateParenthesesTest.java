package recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GenerateParenthesesTest {
    GenerateParentheses inst = new GenerateParentheses();
    @Test
    public void generateParenthesis() {
        List<String> list = inst.generateParenthesis(3);
        assertThat(list, is(Arrays.asList("((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()")));
    }
    @Test
    public void generateParenthesisEmpty() {
        List<String> list = inst.generateParenthesis(0);
        assertThat(list, is(Arrays.asList("")));
    }

    @Test
    public void generateParenthesisWihtOptimize() {
        List<String> list = inst.generateParenthesisWihtOptimize(3);
        assertThat(list, is(Arrays.asList("((()))",
                "(()())",
                "(())()",
                "()(())",
                "()()()")));
    }
    @Test
    public void generateParenthesisEmptyWihtOptimize() {
        List<String> list = inst.generateParenthesisWihtOptimize(0);
        assertThat(list, is(Arrays.asList("")));
    }


}