package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class StrStrTest {

    private StrStr inst = new StrStr();

    @Test
    public void strStrOk() {
        assertThat(inst.strStrSlow("hello", "ll"), is(2));
    }
    @Test
    public void strStrNotFound() {
        assertThat(inst.strStrSlow("aaaaa", "bba"), is(-1));
    }

    @Test
    public void strStrFastOk() {
        assertThat(inst.strStrFast("hello", "ll"), is(2));
    }
    @Test
    public void strStrNotFastFound() {
        assertThat(inst.strStrFast("aaa", "aaaa"), is(-1));
    }
    @Test
    public void strStrFastCachedWithHashCodeOk() {
        assertThat(inst.strStrFastCachedWithHashCode("hello", "ll"), is(2));
    }
    @Test
    public void strStrFastCachedWithHashCodeOk1() {
        assertThat(inst.strStrFastCachedWithHashCode("ll", "ll"), is(0));
    }
    @Test
    public void strStrFastCachedWithHashCodeOk2() {
        assertThat(inst.strStrFastCachedWithHashCode("all", "ll"), is(1));
    }
    @Test
    public void strStrFastCachedWithHashCodeOk3() {
        assertThat(inst.strStrFastCachedWithHashCode("ababcaababcaabc", "ababcaabc"), is(6));
    }
    @Test
    public void strStrFastCachedWithHashCodeFound() {
        assertThat(inst.strStrFastCachedWithHashCode("aaa", "aaaa"), is(-1));
    }
}