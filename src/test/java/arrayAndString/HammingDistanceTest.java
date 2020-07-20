package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class HammingDistanceTest {
    HammingDistance inst = new HammingDistance();
    @Test
    public void hammingDistance() {
        int ret = inst.hammingDistance(1, 4);
        assertThat(ret, is(2));
    }
}