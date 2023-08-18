package binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import utils.TreeNode;

public class BinaryTreeInorderTraversal94 {
    
    // recursive solution
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
    
    void traversal(TreeNode cur, List<Integer> list) {
        if (cur == null) {
            return;
        }
        traversal(cur.left, list);
        list.add(cur.val);
        traversal(cur.right, list);
    }
    
    // iterative solution (using stack)
    List<Integer> inorderTraversalStack(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        
        return res;
    }
}
