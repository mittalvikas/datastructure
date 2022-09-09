package ae.binarytree;

/**
 * The Diameter of the binary tree is defined as length of longest path , even if that path doesn't pass through the root of the tree.
 * The length of the path is the number of edges between the path's first node and its last node.
 */
public class BinaryTreeDiameter {
        // This is an input class. Do not edit.
        static class BinaryTree {
            public int value;
            public BinaryTree left = null;
            public BinaryTree right = null;

            public BinaryTree(int value) {
                this.value = value;
            }
        }

        private static int max;
        public int binaryTreeDiameter(BinaryTree tree) {
            max = -1;
            DFS(tree);
            return max;
        }

        public static int DFS(BinaryTree root){

            if(root == null){
                return 0;
            }

            int left = DFS(root.left);
            int right = DFS(root.right);

            max = Math.max(max,left+right+1);
            return Math.max(left,right)+1;

        }





}

