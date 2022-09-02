package ae.binarytree;

import org.junit.Test;


public class InorderSuccessorTest {
    @Test
    public void TestCase1() {
        InorderSuccessor.BinaryTree root = new InorderSuccessor.BinaryTree(1);
        root.left = new InorderSuccessor.BinaryTree(2);
        root.left.parent = root;
        root.right = new InorderSuccessor.BinaryTree(3);
        root.right.parent = root;
        root.left.left = new InorderSuccessor.BinaryTree(4);
        root.left.left.parent = root.left;
        root.left.right = new InorderSuccessor.BinaryTree(5);
        root.left.right.parent = root.left;
        root.left.left.left = new InorderSuccessor.BinaryTree(6);
        root.left.left.left.parent = root.left.left;
        InorderSuccessor.BinaryTree node = root.left.right;
        InorderSuccessor.BinaryTree expected = root;
        InorderSuccessor.BinaryTree output = new InorderSuccessor().findSuccessor(root, node);
        assert (expected == output);
    }

}