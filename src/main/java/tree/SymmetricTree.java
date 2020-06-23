package tree;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class SymmetricTree {
    // the post-visit is same between left->right and right -> left
    public boolean isSymmetric(TreeNode root) {

        List<Integer> leftAcceHistory = new ArrayList<>();
        List<Integer> rightAcceHistory = new ArrayList<>();

        travelInOrderLeft2Right(root, root, leftAcceHistory);
        travelInOrderRight2Left(root, root, rightAcceHistory);

        String leftString = leftAcceHistory.stream().map(String::valueOf).collect(Collectors.joining(","));
        String rightString = rightAcceHistory.stream().map(String::valueOf).collect(Collectors.joining(","));

        return leftString.equalsIgnoreCase(rightString);
    }

    private void travelInOrderRight2Left(TreeNode root, TreeNode top, List<Integer> rightAcceHistory) {
        if(root == null) {
            rightAcceHistory.add(null);
            return;
        }
        rightAcceHistory.add(root.val);
        travelInOrderRight2Left(root.right, top, rightAcceHistory);
        if(root != top) {
            travelInOrderRight2Left(root.left, top, rightAcceHistory);
        }

    }

    private void travelInOrderLeft2Right(TreeNode root, TreeNode top, List<Integer> leftAcceHistory) {
        if(root == null) {
            leftAcceHistory.add(null);
            return;
        }
        leftAcceHistory.add(root.val);
        travelInOrderLeft2Right(root.left, top, leftAcceHistory);
        if(root != top) {
            travelInOrderLeft2Right(root.right, top, leftAcceHistory);
        }
    }

    public boolean isSymmetricIteration(TreeNode root) {
        //preorder visit
        TreeNode leftCurr = root;
        TreeNode rightCurr = root;
        Stack<TreeNode> leftStack = new Stack<>();
        Stack<TreeNode> rightStack = new Stack<>();
        for(; !leftStack.isEmpty() || leftCurr != null
               || !rightStack.isEmpty() || rightCurr != null ;) {
            while(leftCurr != null && rightCurr != null) {
                if(leftCurr.val != rightCurr.val) {
                    return false;
                }
                leftStack.add(leftCurr);
                leftCurr = leftCurr.left;
                rightStack.add(rightCurr);
                rightCurr = rightCurr.right;
            }
            if(leftCurr == null && rightCurr != null || leftCurr != null && rightCurr == null) {
                return false;
            }

            leftCurr = leftStack.pop().right;
            rightCurr = rightStack.pop().left;
        }
        return true;
    }

}
