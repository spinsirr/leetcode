package binarytree;

import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;

public class BinaryTreePreorderTraversal144 {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
    
    void traversal(TreeNode cur, List<Integer> list) {
        if (cur == null) {
            return;
        }
        list.add(cur.val);
        traversal(cur.left, list);
        traversal(cur.right, list);
    }
    
}
