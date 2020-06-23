package tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinaryTreeMaximumPathSumTest {
    BinaryTreeMaximumPathSum inst = new BinaryTreeMaximumPathSum();
    @Test
    public void testMaxPathSum1() {
        int maxSum = inst.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3)));
        assertThat(maxSum, is(6));
    }

    @Test
    public void testMaxPathSum2() {
        int maxSum = inst.maxPathSum(new TreeNode(-10, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        assertThat(maxSum, is(42));
    }
}