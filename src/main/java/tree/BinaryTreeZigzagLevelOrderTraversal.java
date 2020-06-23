package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
        if(deep % 2 == 0) {
            levelValues.add(root.val);
        }
        else {
            levelValues.add(0, root.val);
        }

        leverOrderRecursive(root.left, deep + 1, result);
        leverOrderRecursive(root.right, deep + 1, result);
    }
}
