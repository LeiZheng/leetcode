package tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidateBinarySearchTreeTest {
    ValidateBinarySearchTree bst = new ValidateBinarySearchTree();
    @Test
    public void isValidBST() {
        boolean isValid = bst.isValidBST(new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(5))));

        assertThat(isValid, is(false));
    }

    @Test
    public void isValidBST2() {
        boolean isValid = bst.isValidBST2(new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(5))));

        assertThat(isValid, is(false));
    }
}