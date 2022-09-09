package ae.binarytree;

/**
 *
 * A path is a collection of connected nodes in a Binary tree, where no node is connected to more than two other nodes;
 * a path sum is the sum of the values of the nodes in a particular path..
 */
public class MaxPathSum {
    private static int max;
    public static int maxPathSum(BinaryTree tree) {
        max = Integer.MIN_VALUE;
        DFS(tree);
        return max;
    }

    private static int DFS(BinaryTree root){

        if(root == null){
            return 0;
        }

        int left = Math.max(DFS(root.left),0);
        int right = Math.max(DFS(root.right),0);

        max = Math.max(max,left+right+root.value);

        return Math.max(left,right)+root.value;

    }

    static class BinaryTree {
        public int value;
        public BinaryTree left;
        public BinaryTree right;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
