package ae.binarytree;


/**
 * A flatten binary tree is identical to doubly linked list , where nodes follow the original trees left to right order.
 */
public class FlattenBinaryTree {
    private static BinaryTree head;
    private static BinaryTree prev;
    public static BinaryTree flattenBinaryTree(BinaryTree root) {
        head = null;
        prev = null;

        Inorder(root);

        return head;
    }

    private static void Inorder(BinaryTree root){

        if(root == null){
            return ;
        }else{

        //inorder traversal
            Inorder(root.left);
            if(prev == null){
                head = root;

            } else {
                prev.right = root;
                root.left = prev;

            }
            prev = root;
            Inorder(root.right);

        }

    }

    // This is the class of the input root. Do not edit it.
    static class BinaryTree {
        int value;
        BinaryTree left = null;
        BinaryTree right = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }
}
