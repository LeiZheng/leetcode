package tree;

import java.util.HashMap;
import java.util.Map;

public class MaximumWidthBinaryTree {
    int maxCount = 0;
    Map<Integer, Integer> startPos = new HashMap<>();
    public int widthOfBinaryTree(TreeNode root) {
        widthOfBinaryTreeRecur(root, 0,0);
        return maxCount + 1;
    }

    private void widthOfBinaryTreeRecur(TreeNode root, int deep, int order) {
        if(root == null) return;
        if(startPos.containsKey(deep)) {
            maxCount = Math.max(maxCount, order - startPos.get(deep));
        }
        else {
            startPos.put(deep, order);
        }

        widthOfBinaryTreeRecur(root.left, deep + 1, order * 2);
        widthOfBinaryTreeRecur(root.right, deep + 1, order * 2 + 1);
    }
}
