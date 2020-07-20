package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTreeLevelOrderTraversal2 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> levelNumsList = new ArrayList<>();
        levelOrderBottomRecur(root, levelNumsList, 0);
        Collections.reverse(levelNumsList);
        return levelNumsList;
    }

    private void levelOrderBottomRecur(TreeNode root, List<List<Integer>> levelNumsList, int deep) {
        if(root == null) return;
        if(deep >= levelNumsList.size()) {
            levelNumsList.add(deep, new ArrayList<>());
        }

        levelNumsList.get(deep).add(root.val);
        levelOrderBottomRecur(root.left, levelNumsList, deep + 1);
        levelOrderBottomRecur(root.right, levelNumsList, deep + 1);
    }
}
