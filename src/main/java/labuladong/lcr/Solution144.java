package labuladong.lcr;

import labuladong.model.TreeNode;

/**
 * @author Henray_0607
 * @version 1.0
 * @className Solution144
 * @description LCR 144. 翻转二叉树
 * @date 2024/11/25
 */
public class Solution144 {
    public TreeNode flipTree(TreeNode root) {
        traverse(root);
        return root;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        traverse(root.left);
        traverse(root.right);
    }
}
