package tree;

import java.util.Stack;

public class DiameterOfBinaryTree {
    int maxPathNum = Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        diameterOfBinaryTreeRecusive(root);
        return maxPathNum - 1;
    }

    private int diameterOfBinaryTreeRecusive(TreeNode root) {

        if(root == null) return 0;
        int leftNum = diameterOfBinaryTreeRecusive(root.left);
        int rightNum = diameterOfBinaryTreeRecusive(root.right);
        maxPathNum = Math.max(maxPathNum, 1 + leftNum + rightNum);
        return 1 + Math.max(leftNum, rightNum);
    }
}
