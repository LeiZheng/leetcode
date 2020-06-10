package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CompareVersionNumbersTest {
    CompareVersionNumbers inst = new CompareVersionNumbers();
    @Test
    public void compareVersionTest0() {
        int ret = inst.compareVersion("0.1", "1.1");
        assertThat(ret, is(-1));
    }
    @Test
    public void compareVersionTest1() {
        int ret = inst.compareVersion("1.0.1", "1");
        assertThat(ret, is(1));
    }

    @Test
    public void compareVersionTest2() {
        int ret = inst.compareVersion("7.5.2.4", "7.5.3");
        assertThat(ret, is(-1));
    }

    @Test
    public void compareVersionTest3() {
        int ret = inst.compareVersion("1.01", "1.001");
        assertThat(ret, is(0));
    }

    @Test
    public void compareVersionTest4() {
        int ret = inst.compareVersion("1.0", "1.0.0");
        assertThat(ret, is(0));
    }
    @Test
    public void compareVersionTest5() {
        int ret = inst.compareVersion("1", "1.1");
        assertThat(ret, is(-1));
    }
}