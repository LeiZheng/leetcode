package tree;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BinaryTreeLevelOrderTest {
    BinaryTreeLevelOrder inst = new BinaryTreeLevelOrder();
    @Test
    public void levelOrder() {
        List<List<Integer>> levelValuesList = inst.levelOrder(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        assertThat(levelValuesList.get(0), is(Arrays.asList(3)));
        assertThat(levelValuesList.get(1), is(Arrays.asList(9, 20)));
        assertThat(levelValuesList.get(2), is(Arrays.asList(15,7)));
    }

    @Test
    public void levelOrderIter() {
        List<List<Integer>> levelValuesList = inst.levelOrderIter(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        assertThat(levelValuesList.get(0), is(Arrays.asList(3)));
        assertThat(levelValuesList.get(1), is(Arrays.asList(9, 20)));
        assertThat(levelValuesList.get(2), is(Arrays.asList(15,7)));
    }
}