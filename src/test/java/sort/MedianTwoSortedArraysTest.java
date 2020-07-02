package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MedianTwoSortedArraysTest {
    MedianTwoSortedArrays inst = new MedianTwoSortedArrays();
    @Test
    public void findMedianSortedArrays() {
        double media = inst.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        assertThat(media, is(2.5));
    }
    @Test
    public void findMedianSortedArrays2() {
        double media = inst.findMedianSortedArrays(new int[]{0,0}, new int[]{0, 0});
        assertThat(media, is(0.0));
    }
}