package ae.binarytree;

public class FindSuccessor {

    public BinaryTree findSuccessor(BinaryTree tree, BinaryTree node) {
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
    static class BinaryTree {
        public int value;
        public BinaryTree left = null;
        public BinaryTree right = null;
        public BinaryTree parent = null;

        public BinaryTree(int value) {
            this.value = value;
        }
    }

}

