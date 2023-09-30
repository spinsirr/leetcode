package binarytree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import utils.TreeNode;

public class BinaryTreePaths257 {
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        List<Integer> paths = new ArrayList<>();
        traversal(root, paths, res);
        return res;
    }
    
    private void traversal(TreeNode node, List<Integer> path, List<String> result) {
        path.add(node.val);
        if (node.left == null && node.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));
            result.add(sb.toString());
            return;
        }
        if (node.left != null) {
            traversal(node.left, path, result);
            path.remove(path.size() - 1);
        }
        if (node.right != null) {
            traversal(node.right, path, result);
            path.remove(path.size() - 1);
        }
    }
}
