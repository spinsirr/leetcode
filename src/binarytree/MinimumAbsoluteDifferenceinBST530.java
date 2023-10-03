package binarytree;

import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/2/2023-9:00 PM
 */
public class MinimumAbsoluteDifferenceinBST530 {
    
    int res = Integer.MAX_VALUE;
    TreeNode pre = null;
    
    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traversal(root);
        return res;
    }
    
    void traversal(TreeNode cur) {
        if (cur == null) {
            return;
        }
        traversal(cur.left);
        if (pre != null) {
            res = Math.min(res, cur.val - pre.val);
        }
        pre = cur;
        traversal(cur.right);
    }
}
