package binarytree;

import utils.TreeNode;

public class MinimumDepthofBinaryTree111 {
    
    public int minDepth(TreeNode root) {
        return getHeight(root);
    }
    
    int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        if (node.left == null && node.right != null) {
            return 1 + rightHeight;
        }
        if (node.left != null && node.right == null) {
            return 1 + leftHeight;
        }
        return 1 + Math.min(leftHeight, rightHeight);
    }
}
