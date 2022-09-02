package ae.binarysearchtree;

public class FindClosestValue {
    public static int findClosestValueInBst(BST tree, int target) {
        return findClosesValueInBST(tree, target, tree.value);
    }

    static int findClosesValueInBST(BST tree, int target, int closest) {
        BST current = tree;
        while (current != null) {
            if (Math.abs(target - closest) > Math.abs(target - current.value)) {
                closest = current.value;
            }
            if (target < current.value) {
                current = current.left;
            } else if (target > current.value) {
                current = current.right;
            } else {
                break;
            }
        }
        return closest;
    }


}
