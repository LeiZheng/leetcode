package arrayAndString;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class kSimilarityTest {
    kSimilarity inst = new kSimilarity();
    @Test
    public void kSimilarity() {
        int k = inst.kSimilarity("aabbccddee", "dcacbedbae");
        assertThat(k, is(6));
    }
}