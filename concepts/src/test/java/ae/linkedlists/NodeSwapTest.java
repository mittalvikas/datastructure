package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class NodeSwapTest extends LinkedListUtilTest{

    @Test
    public void TestCase1() {
        LinkedList linkedList = new LinkedList(0);
        addMany(linkedList, new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 0, 3, 2, 5, 4));
        var actual = new NodeSwap().nodeSwap(linkedList);
        assertTrue(getNodesInArray(actual).equals(expectedNodes));
    }

}