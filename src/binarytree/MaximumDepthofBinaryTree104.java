package binarytree;

import utils.TreeNode;

public class MaximumDepthofBinaryTree104 {
    
    public int maxDepth(TreeNode root) {
        return getHeight(root);
    }
    
    int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
}
