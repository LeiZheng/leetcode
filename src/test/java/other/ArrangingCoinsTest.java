package other;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ArrangingCoinsTest {
    ArrangingCoins inst = new ArrangingCoins();
    @Test
    public void arrangeCoins() {
       int ret = inst.arrangeCoins(8);
       assertThat(ret, is(3));
    }
}