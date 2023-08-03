package com.practice.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Prasenjit Kumar Das
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

public class TreeFromPreAndIn {
    static TreeNode buildTree(int[] preorder, int[] inorder) {
        Map< Integer, Integer > inMap = new HashMap< Integer, Integer >();

        for (int i = 0; i < inorder.length; i++) {
            inMap.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preorder.length - 1, inorder, 0,
                inorder.length - 1, inMap);
        return root;
    }

    static TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[]
            inorder, int inStart, int inEnd, Map < Integer, Integer > inMap) {
        if (preStart > preEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(preorder[preStart]);
        int inRoot = inMap.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(preorder, preStart + 1, preStart + numsLeft, inorder,
                inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + numsLeft + 1, preEnd, inorder,
                inRoot + 1, inEnd, inMap);

        return root;
    }
    public static void main(String args[]) {

        int preorder[] = {1, 2, 4, 7, 3};
        int inorder[] = {4, 2, 7, 1, 3};
        TreeNode root = buildTree(preorder, inorder);
    }

}
