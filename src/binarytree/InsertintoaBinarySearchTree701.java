package binarytree;

import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/6/2023-12:05 AM
 */
public class InsertintoaBinarySearchTree701 {
    
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
            
        } else {
            root.right = insertIntoBST(root.right, val);
            
        }
        return root;
    }
    
}
