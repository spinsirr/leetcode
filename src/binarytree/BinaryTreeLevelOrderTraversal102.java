package binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;

public class BinaryTreeLevelOrderTraversal102 {
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayDeque<TreeNode> deque = new ArrayDeque<>();
        List<List<Integer>> res = new ArrayList<>();
        if (root != null) {
            deque.push(root);
        }
        while (!deque.isEmpty()) {
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            while (size > 0) {
                TreeNode node = deque.pollFirst();
                list.add(node.val);
                if (node.left != null) {
                    deque.offer(node.left);
                }
                if (node.right != null) {
                    deque.offer(node.right);
                }
                size--;
            }
            res.add(list);
        }
        return res;
    }
}
