package binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;

public class BinaryTreePreorderTraversal144 {
    
    // recursive solution
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
    
    void traversal(TreeNode cur, List<Integer> list) {
        if (cur == null) {
            return;
        }
        list.add(cur.val);
        traversal(cur.left, list);
        traversal(cur.right, list);
    }
    
    // iterative solution (using stack)
    List<Integer> inorderTraversalStack(TreeNode root) {
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.peek();
            stack.pop();
            if (node != null) {
                res.add(node.val); // 中间节点
            } else {
                continue;
            }
            stack.push(node.right); // 放入右孩子
            stack.push(node.left);  // 放入左孩子
        }
        return res;
    }
    
}
