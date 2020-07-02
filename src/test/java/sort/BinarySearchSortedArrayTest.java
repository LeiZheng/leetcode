package sort;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinarySearchSortedArrayTest {
    BinarySearchSortedArray inst = new BinarySearchSortedArray();
    @Test
    public void search() {
        int targetIndex = inst.search(new int[]{1, 2, 4, 5, 7, 9}, 4);
        assertThat(targetIndex, is(2));
    }
}