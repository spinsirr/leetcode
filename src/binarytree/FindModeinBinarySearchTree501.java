package binarytree;

import java.util.ArrayList;
import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Email: yunpenz3@uci.edu
 * @Date: 10/2/2023-10:07 PM
 */
public class FindModeinBinarySearchTree501 {
    
    TreeNode pre;
    int maxCount;
    int count;
    ArrayList<Integer> resList;
    
    public int[] findMode(TreeNode root) {
        resList = new ArrayList<>();
        pre = null;
        maxCount = 0;
        count = 0;
        recursive(root);
        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }
    
    private void recursive(TreeNode cur) {
        if (cur == null) {
            return;
        }
        
        recursive(cur.left);
        if (pre == null || cur.val != pre.val) {
            count = 1;
        } else {
            count++;
        }
        
        if (count > maxCount) {
            resList.clear();
            resList.add(cur.val);
            maxCount = count;
        } else if (count == maxCount) {
            resList.add(cur.val);
        }
        pre = cur;
        
        recursive(cur.right);
    }
    
}
