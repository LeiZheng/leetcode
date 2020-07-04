package dynamicprom;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CoinChangeTest {
    CoinChange inst = new CoinChange();
    @Test
    public void coinChange() {
        int ret = inst.coinChange3(new int[]{1, 3, 5}, 11);
        assertThat(ret, is(3));
    }
    @Test
    public void coinChange2() {
        int ret = inst.coinChange3(new int[]{186,419,83,408}, 6249);
        assertThat(ret, is(20));
    }
}