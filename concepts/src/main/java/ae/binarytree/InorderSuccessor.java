package ae.binarytree;

/**
 * Given a binary search tree and a node in it, find the in-order successor of that node in the BST.
 *
 * The successor of a node p is the node with the smallest key greater than p.val.
 *
 */
public class InorderSuccessor {

    // This is an input class. Do not edit.
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
        // Write your code here.
        // case 1: if node has right sub tree then left most child will be successor

        // case 2 : if node is left chiled of parent then parent is successor
        //else find the succeessor of parent of node

        //case :1
        if(node.right!=null){
            return findLeftmostChild(node.right);
        }

        //case 2
        while(node!=null && node.parent!=null && node.parent.left!=node){
            node = node.parent;
        }
        return node.parent;
    }

    public static BinaryTree findLeftmostChild(BinaryTree root){
        BinaryTree node = root;

        while(node.left!=null)node=node.left;

        return node;

    }
}

