package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class NextPermutationTest {
    NextPermutation inst = new NextPermutation();
    @Test
    public void nextPermutation() {
        int[] nums = new int[] {2,3, 1};
        inst.nextPermutation(nums);
        assertThat(nums, is(new int[]{3,1,2}));
    }
    @Test
    public void nextPermutation2() {
        int[] nums = new int[] {1,2, 3};
        inst.nextPermutation(nums);
        assertThat(nums, is(new int[]{1,3,2}));
    }
}