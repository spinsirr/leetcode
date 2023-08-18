package binarytree;

import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;

public class BinaryTreeInorderTraversal94 {
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traversal(root, res);
        return res;
    }
    
    void traversal(TreeNode cur, List<Integer> list) {
        if (cur == null) {
            return;
        }
        traversal(cur.left, list);
        list.add(cur.val);
        traversal(cur.right, list);
    }
}
