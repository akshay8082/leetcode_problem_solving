package com.leetcode.practice.problems.servicenow;

public class KthSmallestInBST {
    private int count = 0;
    private int result = -1;

    public int kthSmallest(TreeNode root, int k) {
        count = 0;
        result = -1;
        inorderTraversal(root, k);
        return result;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if (node == null || count >= k) {
            return;
        }

        // Traverse the left subtree
        inorderTraversal(node.left, k);

        // Process the current node
        count++;
        if (count == k) {
            result = node.val;
            return;
        }

        // Traverse the right subtree
        inorderTraversal(node.right, k);
    }

    public static void main(String[] args) {
        // Construct a sample BST
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        KthSmallestInBST kthSmallestFinder = new KthSmallestInBST();
        int k = 2;
        int kthSmallest = kthSmallestFinder.kthSmallest(root, k);

        System.out.println("The " + k + "-th smallest element in the BST is: " + kthSmallest);
    }
}

