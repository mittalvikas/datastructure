package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveKthNodeFromEndTest extends LinkedListUtilTest {

    @Test
    public void TestCase1() {
        LinkedList test = new LinkedList(0);
        addMany(test,new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9)));
        int[] expected = {0, 1, 2, 3, 4, 5, 7, 8, 9};
        RemoveKthNodeFromEnd.removeKthNodeFromEnd(test, 4);
        assertTrue(compare(getNodesInArray(test), expected));
    }



}