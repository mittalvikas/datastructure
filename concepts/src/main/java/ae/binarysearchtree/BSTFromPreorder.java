package ae.binarysearchtree;

import java.util.List;

/**
 * Re construct BST from pre-order traversal of its
 */
public class BSTFromPreorder {

    public BST reconstructBst(List<Integer> preOrderTraversalValues) {

        if(preOrderTraversalValues.size()==0){
            return null;
        }

        int rootValue = preOrderTraversalValues.get(0);
        int rightRootIndex = preOrderTraversalValues.size();

        // finding root of right subtree
        for(int index=1;index<preOrderTraversalValues.size();index++){
            if(preOrderTraversalValues.get(index)>=rootValue){
                rightRootIndex = index;
                break;
            }
        }

        BST left = reconstructBst(preOrderTraversalValues.subList(1,rightRootIndex));
        BST right = reconstructBst(preOrderTraversalValues.subList(rightRootIndex,preOrderTraversalValues.size()));
        BST bst = new BST(rootValue);
        bst.left = left;
        bst.right = right;
        return bst;
    }
}
