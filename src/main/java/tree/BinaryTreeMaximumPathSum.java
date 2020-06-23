package tree;

public class BinaryTreeMaximumPathSum {
    int maxValue = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxPathSumRecursive(root);
        return maxValue;
    }

    private int maxPathSumRecursive(TreeNode root) {
        if(root == null) return 0;
        int leftValue = maxPathSumRecursive(root.left);
        int rightValue = maxPathSumRecursive(root.right);
        int nodeSum = Math.max(0,leftValue) + Math.max(0, rightValue) + root.val;
        maxValue = Math.max(nodeSum, maxValue);
        return nodeSum;
    }
}
