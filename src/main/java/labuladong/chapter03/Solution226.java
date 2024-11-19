package labuladong.chapter03;

import labuladong.model.TreeNode;

/**
 * @author Henray_0607
 * @version 1.0
 * @className Solution226
 * @description 226.翻转二叉树
 * @date 2024/11/20
 */
public class Solution226 {
    // 通过递归函数
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;
        return root;
    }

    // 通过递归函数
    public TreeNode invertTree2(TreeNode root) {
        traverse(root);
        return root;
    }
    private void traverse(TreeNode node) {
        if (node == null) {
            return;
        }
        // 前序位置
        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;

        traverse(node.left);
        traverse(node.right);
    }
}
