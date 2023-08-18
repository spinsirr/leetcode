package binarytree;

import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;

public class BinaryTreePostorderTraversal145 {
    
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
    
    void traversal(TreeNode cur, List<Integer> list) {
        if (cur == null) {
            return;
        }
        traversal(cur.left, list);
        traversal(cur.right, list);
        list.add(cur.val);
    }
    
}
