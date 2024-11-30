package labuladong.chapter03;

import labuladong.model.TreeNode;

/**
 * @author Henray_0607
 * @version 1.0
 * @className Solution114
 * @description 114. 二叉树展开为链表 F
 * @date 2024/11/20
 */
public class Solution114 {
    TreeNode head = new TreeNode(-1);
    TreeNode p = head;

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
