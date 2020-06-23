package arrayAndString;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class ThreeSumTest {
    ThreeSum inst = new ThreeSum();
    @Test
    public void threeSumWithoutSortOk() {
        List<List<Integer>> result = inst.threeSumWithoutSort(new int[]{-1, 0, 1, 2, -1, -4});
        assertThat(result.size(), is(2));
    }
    @Test
    public void threeSumWithSortOk() {
        List<List<Integer>> result = inst.threeSumWithSort(new int[]{-1, 0, 1, 2, -1, -4});
        assertThat(result.size(), is(2));
    }
    @Test
    public void threeSumWithSortAllZeroOk() {
        List<List<Integer>> result = inst.threeSumWithSort(new int[]{0, 0, 0, 0});
        assertThat(result.size(), is(1));
    }
}