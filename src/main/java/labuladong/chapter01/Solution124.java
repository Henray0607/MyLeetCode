package labuladong.chapter01;

import labuladong.model.TreeNode;

/**
 * @author Henray_0607
 * @version 1.0
 * @className Solution124
 * @description 递归 + 后序遍历
 * @date 2024/11/18
 */
public class Solution124 {
    int count = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        traverse(root);
        return count;
    }
    public int traverse(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftMax = Math.max(0, traverse(node.left));
        int rightMax = Math.max(0, traverse(node.right));
        count = Math.max(count, leftMax + rightMax + node.val);
        return Math.max(leftMax, rightMax) + node.val;
    }
}
