package ae.binarytree;

/**
 * The distance between a node in a Binary tree and tree's root is called the node's depth.
 * Write a function that takes in a binary tree and returns the sum of its node's depth.
 */

public class NodeDepth {
    private static int depth;
    public static int nodeDepths(BinaryTree root) {
        // Write your code here
        depth =0;
        DFS(root,0);
        return depth;
    }

    private static void DFS(BinaryTree root,int level){

        if(root==null){
            return;
        }
        depth+=level;
        DFS(root.left,level+1);
        DFS(root.right,level+1);

    }

    static class BinaryTree {
        int value;
        BinaryTree left;
        BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }
}
