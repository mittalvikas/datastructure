package ae.binarysearchtree;

public class BST {
    public int value;
    public BST left;
    public BST right;

    public BST(int value) {
        this.value = value;
    }
    public BST insert(int value) {
        return insertNode(this,value);
    }

    private static BST insertNode(BST root,int val){
        if(root == null){
            return new BST(val);
        }

        if(val < root.value){
            root.left = insertNode(root.left,val);
        }else {
            root.right = insertNode(root.right,val);
        }

        return root;

    }

    public boolean contains(int value) {
        BST root = this;

        boolean found = false;
        while(root!=null){

            if(root.value==value){
                found = true;
                break;
            }else if(value < root.value){
                root = root.left;
            }else{
                root = root.right;
            }


        }

        return found;
    }


    public BST remove(int value) {
        BST root =  delete(this,value);
        if(root!=null) {
            this.value = root.value;
            this.left = root.left;
            this.right = root.right;

        }
        return this;
    }

    private static BST delete(BST root,int value){


        if(root == null)
            return root;

        if(value<root.value){
            root.left = delete(root.left,value);
        }else if(value > root.value){
            root.right = delete(root.right,value);
        }else{

            if(root.left==null && root.right == null){
                return null;
            }
            if(root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.value = minValue(root.right);

            root.right = delete(root.right,root.value);

        }

        return root;


    }

    private static int minValue(BST root){
        int minValue = root.value;


        while(root!=null){
            minValue = Math.min(minValue,root.value);
            root = root.left;
        }

        return minValue;

    }
}
