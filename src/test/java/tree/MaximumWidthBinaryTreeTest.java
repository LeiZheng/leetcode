package tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MaximumWidthBinaryTreeTest {
    MaximumWidthBinaryTree inst = new MaximumWidthBinaryTree();
    @Test
    public void widthOfBinaryTree() {
        int ret = inst.widthOfBinaryTree(new TreeNode(1, new TreeNode(3, new TreeNode(5), new TreeNode(3)), new TreeNode(2, null, new TreeNode(9))));
        assertThat(ret, is(4));
    }
}