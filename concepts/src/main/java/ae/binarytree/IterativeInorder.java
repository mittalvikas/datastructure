package ae.binarytree;

import java.util.Stack;
import java.util.function.Function;

public class IterativeInorder {
    public static void iterativeInOrderTraversal(
            BinaryTree tree, Function<BinaryTree, Void> callback) {

        Stack<BinaryTree> stack = new Stack<>();

        while (tree != null || !stack.isEmpty()) {
            if (tree != null) {
                stack.push(tree);
                tree = tree.left; // add left node
            } else  {
                BinaryTree node = stack.pop(); // if none exists, then we can start popping and check if right node exists and then iterate on it
                callback.apply(node);
                if (node.right  != null) {
                    tree = node.right;
                }
            }
        }




    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;
        public BinaryTree parent;

        public BinaryTree(int value) {
            this.value = value;
        }

        public BinaryTree(int value, BinaryTree parent) {
            this.value = value;
            this.parent = parent;
        }
    }
}
