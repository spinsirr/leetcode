package binarytree;

import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Date: 9/29/2023 10:30 PM
 * @Email: yunpenz3@uci.edu
 * @Description: TODO
 */
public class MaximumBinaryTree654 {
    
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return recursive(nums, 0, nums.length);
    }
    
    public TreeNode recursive(int[] nums, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex < 1) {
            return null;
        }
        if (rightIndex - leftIndex == 1) {
            return new TreeNode(nums[leftIndex]);
        }
        int maxIndex = leftIndex;
        int maxVal = nums[maxIndex];
        for (int i = leftIndex + 1; i < rightIndex; i++) {
            if (nums[i] > maxVal) {
                maxVal = nums[i];
                maxIndex = i;
            }
        }
        TreeNode root = new TreeNode(maxVal);
        root.left = recursive(nums, leftIndex, maxIndex);
        root.right = recursive(nums, maxIndex + 1, rightIndex);
        return root;
    }
}
