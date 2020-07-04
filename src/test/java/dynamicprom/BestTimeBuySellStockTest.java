package dynamicprom;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BestTimeBuySellStockTest {
    BestTimeBuySellStock inst = new BestTimeBuySellStock();
    @Test
    public void maxProfit() {
        int ret = inst.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        assertThat(ret, is(5));
    }
}