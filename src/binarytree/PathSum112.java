package binarytree;

import utils.TreeNode;

public class PathSum112 {
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return traversal(root, targetSum);
        
    }
    
    private boolean traversal(TreeNode node, int count) {
        if (node.left == null && node.right == null && count == 0) {
            return true;
        }
        if (node.left == null && node.right == null) {
            return false;
        }
        if (node.left != null) {
            count -= node.left.val;
            if (traversal(node.left, count)) {
                return true;
            }
            count += node.left.val;
        }
        if (node.right != null) {
            count -= node.right.val;
            if (traversal(node.right, count)) {
                return true;
            }
            count += node.right.val;
        }
        return false;
    }
    
}
