package binarytree;

import utils.TreeNode;

public class CountCompleteTreeNodes222 {
    
    public int countNodes(TreeNode root) {
        return getNum(root);
    }
    
    private int getNum(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftNum = getNum(node.left);
        int rightNum = getNum(node.right);
        int res = leftNum + rightNum + 1;
        return res;
    }
}
