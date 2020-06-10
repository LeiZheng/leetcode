package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidParenthesesTest {
    ValidParentheses inst = new ValidParentheses();
    @Test
    public void isValid1() {
        boolean ret = inst.isValid("()");
        assertThat(ret, is(true));
    }
    @Test
    public void isValid2() {
        boolean ret = inst.isValid("()[]{}");
        assertThat(ret, is(true));
    }

    @Test
    public void isValid3() {
        boolean ret = inst.isValid("(]");
        assertThat(ret, is(false));
    }
    @Test
    public void isValid4() {
        boolean ret = inst.isValid("([)]");
        assertThat(ret, is(false));
    }

    @Test
    public void isValid5() {
        boolean ret = inst.isValid("{[]}");
        assertThat(ret, is(true));
    }


}