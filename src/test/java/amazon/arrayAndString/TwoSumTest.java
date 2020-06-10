package amazon.arrayAndString;

import org.junit.Test;

import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TwoSumTest {
    private static Logger logger = Logger.getLogger(TwoSumTest.class.getName());
    TwoSum inst = new TwoSum();
    @Test
    public void solution1Test() {
        int[] pairIndexs = inst.Solution1(new int[] {3, 4, 5, 6, 2}, 10);
        assertThat(pairIndexs.length, is(2));
        assertThat(pairIndexs[0], is(1));
        assertThat(pairIndexs[1], is(3));
    }

    @Test
    public void solution2Test() {
        int[] pairIndexs = inst.Solution2(new int[] {3, 2, 4}, 6);
        assertThat(pairIndexs.length, is(2));
        assertThat(pairIndexs[0], is(1));
        assertThat(pairIndexs[1], is(2));
    }

}