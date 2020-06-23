package tree;

import com.sun.source.tree.Tree;

import java.util.*;
import java.util.stream.Collectors;

public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        TreeMap<Integer, List<Integer>> result = new TreeMap<>();
        leverOrderRecursive(root, 0, result);
        return result.values().stream().collect(Collectors.toList());
    }

    private void leverOrderRecursive(TreeNode root, int deep, TreeMap<Integer, List<Integer>> result) {
        if(root == null) return;

        List<Integer> levelValues = result.get(deep);
        if(levelValues == null) {
            levelValues = new ArrayList<Integer>();
            result.put(deep, levelValues);
        }
        levelValues.add(root.val);
        leverOrderRecursive(root.left, deep + 1, result);
        leverOrderRecursive(root.right, deep + 1, result);
    }

    public List<List<Integer>> levelOrderIter(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        TreeNode currNode = root;
        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> deepStack = new Stack<>();
        int deep = 0;
        for(;currNode != null || !stack.isEmpty();){
            while(currNode!=null) {
                if(deep >= result.size()) {
                    List<Integer> values = new ArrayList<>();
                    values.add(currNode.val);
                    result.add(values);
                }
                else {
                    result.get(deep).add(currNode.val);
                }
                stack.push(currNode);
                deepStack.push(deep);
                currNode = currNode.left;
                deep ++;
            }
            currNode = stack.pop();
            deep = deepStack.pop() + 1;
            currNode = currNode.right;


        }
        return result;
    }

}
