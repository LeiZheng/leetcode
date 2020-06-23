package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Sum3ClosestTest {
    Sum3Closest inst = new Sum3Closest();

    @Test
    public void threeSumClosest() {
        int ret = inst.threeSumClosest(new int[] {-1,2,1,-4}, 1);
        assertThat(ret, is(2));
    }
}