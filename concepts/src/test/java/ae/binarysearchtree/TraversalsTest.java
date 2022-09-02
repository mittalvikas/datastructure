package ae.binarysearchtree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TraversalsTest {

    @Test
    public void TestCase1() {
        var root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.right = new BST(15);
        root.right.right = new BST(22);

        List<Integer> inOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 10, 15, 22});
        List<Integer> preOrder = Arrays.asList(new Integer[] {10, 5, 2, 1, 5, 15, 22});
        List<Integer> postOrder = Arrays.asList(new Integer[] {1, 2, 5, 5, 22, 15, 10});

        assertTrue(Traversals.inOrderTraverse(root, new ArrayList<Integer>()).equals(inOrder));
        assertTrue(Traversals.preOrderTraverse(root, new ArrayList<Integer>()).equals(preOrder));
        assertTrue(Traversals.postOrderTraverse(root, new ArrayList<Integer>()).equals(postOrder));
    }
}