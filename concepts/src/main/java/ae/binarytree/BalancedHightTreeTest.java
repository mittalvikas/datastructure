package ae.binarytree;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BalancedHightTreeTest {

    @Test
    public void TestCase1() {
        BalancedHightTree.BinaryTree root = new BalancedHightTree.BinaryTree(1);
        root = new BalancedHightTree.BinaryTree(1);
        root.left = new BalancedHightTree.BinaryTree(2);
        root.right = new BalancedHightTree.BinaryTree(3);
        root.left.left = new BalancedHightTree.BinaryTree(4);
        root.left.right = new BalancedHightTree.BinaryTree(5);
        root.right.right = new BalancedHightTree.BinaryTree(6);
        root.left.right.left = new BalancedHightTree.BinaryTree(7);
        root.left.right.right = new BalancedHightTree.BinaryTree(8);
        boolean expected = true;
        boolean actual = new BalancedHightTree().heightBalancedBinaryTree(root);
        assertTrue(expected == actual);
    }

}