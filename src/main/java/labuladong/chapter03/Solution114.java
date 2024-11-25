package labuladong.chapter03;

import labuladong.model.TreeNode;

/**
 * @author Henray_0607
 * @version 1.0
 * @className Solution114
 * @description
 * @date 2024/11/20
 */
public class Solution114 {
    TreeNode dummy = new TreeNode(-1);
    TreeNode p = dummy;

    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        // 前序位置
        p.right = new TreeNode(root.val);
        p = p.right;

        flatten(root.left);
        flatten(root.right);
    }
}
