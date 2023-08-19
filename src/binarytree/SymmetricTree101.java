package binarytree;

import utils.TreeNode;

public class SymmetricTree101 {
    
    public boolean isSymmetric(TreeNode root) {
        return compare(root.left, root.right);
    }
    
    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return false;
        } else if (left != null && right == null) {
            return false;
        } else if (left == null) {
            return true;
        } else if (left.val != right.val) {
            return false;
        }
        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right, right.left);
        return outside && inside;
    }
}
