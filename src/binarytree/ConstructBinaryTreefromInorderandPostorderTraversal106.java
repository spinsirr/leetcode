package binarytree;

import java.util.HashMap;
import java.util.Map;
import utils.TreeNode;

/**
 * @Author: Spencer Zhao
 * @Date: 9/28/2023 11:16 PM
 * @Email: yunpenz3@uci.edu
 * @Description: TODO
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal106 {
    
    Map<Integer, Integer> map;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        
        return findNode(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }
    
    public TreeNode findNode(int[] inorder, int inBegin, int inEnd, int[] postorder, int postBegin,
        int postEnd) {
        if (inBegin >= inEnd || postBegin >= postEnd) {
            return null;
        }
        int rootIndex = map.get(postorder[postEnd - 1]);
        TreeNode root = new TreeNode(inorder[rootIndex]);
        int lenOfLeft = rootIndex - inBegin;
        root.left = findNode(inorder, inBegin, rootIndex, postorder, postBegin,
            postBegin + lenOfLeft);
        root.right = findNode(inorder, rootIndex + 1, inEnd, postorder, postBegin + lenOfLeft,
            postEnd - 1);
        return root;
    }
    
    
}
