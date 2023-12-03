package dynamicprogramming;

import java.util.Arrays;
import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 11/30/2023-1:13 PM
 */
public class HouseRobberIII337 {
    
    public int rob(TreeNode root) {
        int[] result = robAct(root);
        return Math.max(result[0], result[1]);
    }
    
    public int[] robAct(TreeNode root) {
        if (root == null) {
            return new int[]{0, 0};
        }
        int[] left = robAct(root.left);
        int[] right = robAct(root.right);
        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        int rob = root.val + left[0] + right[0];
        return new int[]{notRob, rob};
    }
}
