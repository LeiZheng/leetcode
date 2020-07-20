package recursion;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.is;

public class SubsetsTest {
    Subsets inst = new Subsets();
    @Test
    public void subsets2() {
        List<List<Integer>> ret = inst.subsets2(new int[]{1, 2, 3});
        assertThat(ret, is(Arrays.asList(Arrays.asList(),
                Arrays.asList(1),
                Arrays.asList(2),
                Arrays.asList(3),
                Arrays.asList(1,2),
                Arrays.asList(1,3),
                Arrays.asList(2,3),
                Arrays.asList(1,2,3)
                )));
    }
}