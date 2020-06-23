package tree;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class SymmetricTreeTest {
    SymmetricTree inst = new SymmetricTree();
    @Test
    public void isSymmetric() {
        boolean isSymmetric = inst.isSymmetric(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))));
        assertThat(isSymmetric, is(false));
    }
    @Test
    public void isSymmetric2() {
        boolean isSymmetric = inst.isSymmetric(new TreeNode(1, new TreeNode(2, new TreeNode(2), null), new TreeNode(2, new TreeNode(2),null)));
        assertThat(isSymmetric, is(false));
    }
    @Test
    public void isSymmetric3() {
        boolean isSymmetric = inst.isSymmetric(new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(4))));
        assertThat(isSymmetric, is(false));
    }

    @Test
    public void isSymmetricIter1() {
        boolean isSymmetric = inst.isSymmetricIteration(new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), new TreeNode(2, null, new TreeNode(3))));
        assertThat(isSymmetric, is(false));
    }
    @Test
    public void isSymmetricIter2() {
        boolean isSymmetric = inst.isSymmetricIteration(new TreeNode(1, new TreeNode(2, new TreeNode(2), null), new TreeNode(2, new TreeNode(2),null)));
        assertThat(isSymmetric, is(false));
    }
    @Test
    public void isSymmetricIter3() {
        boolean isSymmetric = inst.isSymmetricIteration(new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(5)), new TreeNode(3, null, new TreeNode(4))));
        assertThat(isSymmetric, is(false));
    }
}