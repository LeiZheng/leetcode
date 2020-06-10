package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StringtoIntegerTest {
    StringtoInteger inst = new StringtoInteger();
    @Test
    public void solutionTest1() {
        assertThat(inst.solution1("-91283472332"), is(-2147483648));

    }
    @Test
    public void solutionTest2() {
        assertThat(inst.solution1("words and 987"), is(0));

    }
    @Test
    public void solutionTest3() {
        assertThat(inst.solution1("4193 with words"), is(4193));

    }
    @Test
    public void solutionTest4() {
        assertThat(inst.solution1("   -42"), is(-42));

    }

    @Test
    public void solutionTest5() {
        assertThat(inst.solution1("-000000000000001"), is(-1));

    }
    @Test
    public void solutionTest6() {
        assertThat(inst.solution1("+-2"), is(0));
    }
    @Test
    public void solutionTest7() {
        assertThat(inst.solution1("  -0012a42"), is(-12));
    }
    @Test
    public void solutionTest8() {
        assertThat(inst.solution1("-2147483647"), is(-2147483647));
    }
    @Test
    public void solutionTest9() {
        assertThat(inst.solution1("2147483648"), is(2147483647));
    }
    @Test
    public void solutionTest10() {
        assertThat(inst.solution1("-6147483648"), is(-2147483648));
    }
}