package ae.binarytree;

/**
 * Write a function that takes the root of the Binary tree and inverts it.
 * Invert means : A function should swap every left node in the tree for its corresponding right node.
 */
public class InvertBinaryTree {

        public static void invertBinaryTree(BinaryTree tree) {
            // Write your code here.


            DFS(tree);


        }

        public static BinaryTree DFS(BinaryTree tree){
            if(tree == null)return tree;

            BinaryTree left = DFS(tree.left);
            BinaryTree right = DFS(tree.right);

            tree.left = right;
            tree.right = left;

            return tree;
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


