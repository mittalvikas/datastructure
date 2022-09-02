package ae.binarysearchtree;

import org.junit.Test;

import static org.junit.Assert.*;

public class KthLargestValueTest {

    @Test
    public void TestCase1() {
        BST root = new BST(15);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.left.right = new BST(3);
        root.left.right = new BST(5);
        root.right = new BST(20);
        root.right.left = new BST(17);
        root.right.right = new BST(22);
        int k = 3;
        int expected = 17;
        var actual = new KthLargestValue().findKthLargestValueInBst(root, k);
        assertTrue(expected == actual);
    }

}