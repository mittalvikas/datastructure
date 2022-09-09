package ae.binarytree;


/**
 * A binary tree is hight balanced if for each node in the tree , the difference between the heights of its left subtree and height of right subtree is not more than 1.
 */
public class BalancedHightTree {
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    private static boolean res;
    public boolean heightBalancedBinaryTree(BinaryTree tree) {
        res = true;
        DFS(tree,0);
        return res;
    }

    private static int DFS(BinaryTree root,int height){

        if(root==null){
            return 0;
        }

        int left = DFS(root.left,height+1);
        int right = DFS(root.right,height+1);
        if(Math.abs(left-right) > 1) res = false;
        return 1 + Math.max(left,right);
    }
}
