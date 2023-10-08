package binarytree;

import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/7/2023-11:34 PM
 */
public class ConvertBSTtoGreaterTree538 {
    
    int pre;
    
    public TreeNode convertBST(TreeNode root) {
        pre = 0;
        recurrence(root);
        return root;
    }
    
    private void recurrence(TreeNode cur) {
        if (cur == null) {
            return;
        }
        recurrence(cur.right);
        cur.val += pre;
        pre = cur.val;
        recurrence(cur.left);
    }
}
