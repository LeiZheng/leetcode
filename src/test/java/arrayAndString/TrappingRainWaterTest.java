package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class TrappingRainWaterTest {
    TrappingRainWater inst = new TrappingRainWater();
    @Test
    public void trap() {
        assertThat(inst.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}), is(6));
    }
    @Test
    public void trap2() {
        assertThat(inst.trap(new int[] {0,2,0}), is(0));
    }
    @Test
    public void trap3() {
        assertThat(inst.trap(new int[] {9,6,8,8,5,6,3}), is(3));
    }
}