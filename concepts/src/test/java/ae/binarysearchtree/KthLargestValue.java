package ae.binarysearchtree;

public class KthLargestValue {

    private static int n;
    private static int ans;
    public int findKthLargestValueInBst(BST tree, int k) {
        n = 0;
        ans = -1;
        RNL(tree,k);
        return ans;
    }


    private static void RNL(BST root,int k){

        if(root == null || n >= k) return;

        RNL(root.right,k);
        if(n<k){
            n++;
            ans=root.value;
        }
        RNL(root.left,k);


    }
}
