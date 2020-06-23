package tree;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class LowestCommonAncestor {

    /**
     * solution 1: get the node path and compare the common nodes.
     */
    List<List<TreeNode>> paths = new ArrayList<>();
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> path = new Stack<>();
        if(p.val == q.val) return p;
        lowestCommonAncestorRecrusive(root, p, q, path);
        int i = 0;
        for(i = 0; i < paths.get(0).size() && i < paths.get(1).size(); i ++) {
            if(paths.get(0).get(i) != paths.get(1).get(i)){
                break;
            }
        }
        return paths.get(0).get( i- 1);
    }

    private void lowestCommonAncestorRecrusive(TreeNode root, TreeNode p, TreeNode q, Stack<TreeNode> path) {
        if(root == null) return;
        path.push(root);
        if(root.val == p.val) {
            paths.add(path.stream().collect(Collectors.toList()));
        }
        else if(root.val == q.val){
            paths.add(path.stream().collect(Collectors.toList()));
        }

        if(paths.size() == 2) return;
        lowestCommonAncestorRecrusive(root.left, p, q, path);
        lowestCommonAncestorRecrusive(root.right, p, q, path);
        path.pop();
    }

    /**
     * solution 2:
     */

    TreeNode commandAncestor;
    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> path = new Stack<>();
        commandAncestor = root;
        lowestCommonAncestorRecrusive2(root, p, q);
        return commandAncestor;
    }
    private boolean lowestCommonAncestorRecrusive2(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return false;
        if(p == null && q == null) return false;
        if(p != null && root.val == p.val ) {
            commandAncestor = root;
            if(lowestCommonAncestorRecrusive2(root.left, null, q) || lowestCommonAncestorRecrusive2(root.right, null, q)) {

                return true;
            }
        }
        else if(q != null && root.val == q.val ) {
            commandAncestor = root;
            if(lowestCommonAncestorRecrusive2(root.left, p, null) || lowestCommonAncestorRecrusive2(root.right, p, null)) {

                return true;
            }
        }
        return false;
    }
}
