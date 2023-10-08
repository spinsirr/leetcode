package binarytree;

import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/4/2023-10:53 PM
 */
public class LowestCommonAncestorofaBinarySearchTree235 {
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return recursion(root, p, q);
    }
    
    private TreeNode recursion(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (root.val > p.val && root.val > q.val) {
            TreeNode left = recursion(root.left, p, q);
            if (left != null) {
                return left;
            }
        }
        if (root.val < p.val && root.val < q.val) {
            TreeNode right = recursion(root.right, p, q);
            if (right != null) {
                return right;
            }
        }
        return root;
    }
}
