package binarytree;

import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/2/2023-10:32 PM
 */
public class LowestCommonAncestorofaBinaryTree236 {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return recursion(root, p, q);
    }
    
    private TreeNode recursion(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        
        TreeNode left = recursion(root.left, p, q);
        TreeNode right = recursion(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left == null && right != null) {
            return right;
        } else if (left != null && right == null) {
            return left;
        } else {
            return null;
        }
    }
}
