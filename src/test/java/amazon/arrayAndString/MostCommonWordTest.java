package amazon.arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MostCommonWordTest {
    MostCommonWord inst = new MostCommonWord();
    @Test
    public void mostCommonWord1() {
        String ret = inst.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit", new String[]{"hit"});
        assertThat(ret, is("ball"));
    }
    @Test
    public void mostCommonWord2() {
        String ret = inst.mostCommonWord("Bob. hIt, baLl", new String[]{"bob", "hit"});
        assertThat(ret, is("ball"));
    }

}