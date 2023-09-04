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
        TreeNode left = node.left;
        TreeNode right = node.right;
        int leftDepth = 0;
        int rightDepth = 0;
        while (left != null) {
            left = left.left;
            leftDepth++;
        }
        while (right != null) {
            right = right.right;
            rightDepth++;
        }
        if (leftDepth == rightDepth) {
            return (2 << leftDepth) - 1;
        }
        int leftNum = getNum(node.left);
        int rightNum = getNum(node.right);
        int res = leftNum + rightNum + 1;
        return res;
    }
}
