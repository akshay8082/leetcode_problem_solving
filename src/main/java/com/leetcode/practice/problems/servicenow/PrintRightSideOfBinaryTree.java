package com.leetcode.practice.problems.servicenow;

public class PrintRightSideOfBinaryTree {
    public static void printRightSide(TreeNode root) {
        printRightSideHelper(root, 0, new int[] { -1 });
    }

    private static void printRightSideHelper(TreeNode node, int currentLevel, int[] maxLevel) {
        if (node == null) {
            return;
        }

        if (currentLevel > maxLevel[0]) {
            System.out.println(node.val);
            maxLevel[0] = currentLevel;
        }

        // Traverse the right subtree first to print the right side.
        printRightSideHelper(node.right, currentLevel + 1, maxLevel);
        printRightSideHelper(node.left, currentLevel + 1, maxLevel);
    }

    public static void main(String[] args) {
        // Create a sample binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.left.left = new TreeNode(100);
        root.right.right = new TreeNode(4);

        System.out.println("Right side of the binary tree:");
        printRightSide(root);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
