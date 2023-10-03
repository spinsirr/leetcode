package binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/2/2023-1:40 PM
 */
public class ValidateBinarySearchTree98 {
    
    TreeNode max;
    
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        
        if (max != null && root.val <= max.val) {
            return false;
        }
        max = root;
        
        return isValidBST(root.right);
    }
    
}
