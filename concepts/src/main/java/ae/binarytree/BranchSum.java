package ae.binarytree;

import java.util.*;

/**
 * Write a function that taken in binary tree root and returns list of its branch sums ordered from leftmost branch sum to right most branch sum.
 * A branch sum is sum of all values in binary tree branch . A binary tree branch is a path of nodes in a tree that starts at the root node and ends at the leaf node.
 */

public class BranchSum {
    // This is the class of the input root. Do not edit it.
    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        BinaryTree(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> branchSums(BinaryTree root) {
        List<Integer> sums = new ArrayList<Integer>();
        DFS(root, 0, sums);
        return sums;
    }

    private static void DFS(BinaryTree node, int prevSum, List<Integer> sums) {
        if (node == null) {
            return;
        }

        int curSum = prevSum + node.value;

        if (node.left == null && node.right == null) {
            sums.add(curSum);
            return;
        }

        DFS(node.left, curSum, sums);
        DFS(node.right, curSum, sums);

    }
}



