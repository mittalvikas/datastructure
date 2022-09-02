package ae.binarysearchtree;

public class ValidateBST {
    public static boolean validateBst(BST tree) {

        return validate(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }


    private static boolean validate(BST root,int min,int max){
        if(root == null){
            return true;
        }

        if(root.value <  min || root.value >=max ){
            return false;
        }


        return validate(root.left,min,root.value) && validate(root.right,root.value,max);

    }
}
