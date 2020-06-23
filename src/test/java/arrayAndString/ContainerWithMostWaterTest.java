package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ContainerWithMostWaterTest {
    ContainerWithMostWater inst = new ContainerWithMostWater();
    @Test
    public void maxArea() {
        assertThat(inst.maxArea(new int[]{1,8,6,2,5,4,8,3,7}), is(49));
    }
}