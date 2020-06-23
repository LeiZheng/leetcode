package tree;


/**
 * the purpose: understand the different order traversal for tree.
 * Most of algorithm come from traversal variations
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        List<Integer> values = new ArrayList<>();
        return isvalidBSTRecursively(root,values);
    }

    private boolean isvalidBSTRecursively(TreeNode root, List<Integer> values) {
        if(root == null) return true;
        if(root.left != null) {
            if(!isvalidBSTRecursively(root.left, values)){
                return false;
            }
        }
        if(values.size() > 0 && values.get(values.size() - 1) >= root.val) {
            return false;
        }
        values.add(root.val);
        if(root.right != null) {
            if(!isvalidBSTRecursively(root.right, values)) {
                return false;
            }
        }
        return true;
    }

    public boolean isValidBST2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        boolean isValid = true;
        TreeNode curr = root;
        int lastVisNum = Integer.MIN_VALUE;
        for(;!stack.isEmpty() || curr != null;) {
            for(;curr != null;) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            if(curr.val <= lastVisNum) {
                isValid = false;
                break;
            }

            lastVisNum = curr.val;
            curr = curr.right;
        }

        return isValid;
    }
}


