package ae.binarytree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class IterativeInorderTest {

    public List<Integer> testArray = new ArrayList<Integer>();

    public Void testCallback(IterativeInorder.BinaryTree tree) {
        if (tree == null) {
            return null;
        }
        testArray.add(tree.value);
        return null;
    }

    @Test
    public void TestCase1() {
        var root = new IterativeInorder.BinaryTree(1);
        root.left = new IterativeInorder.BinaryTree(2, root);
        root.left.left = new IterativeInorder.BinaryTree(4, root.left);
        root.left.left.right = new IterativeInorder.BinaryTree(9, root.left.left);
        root.right = new IterativeInorder.BinaryTree(3, root);
        root.right.left = new IterativeInorder.BinaryTree(6, root.right);
        root.right.right = new IterativeInorder.BinaryTree(7, root.right);

        this.testArray.clear();
        IterativeInorder.iterativeInOrderTraversal(root, this::testCallback);
        List<Integer> expected = Arrays.asList(new Integer[] {4, 9, 2, 1, 6, 3, 7});
        assertTrue(expected.equals(this.testArray));
    }

}