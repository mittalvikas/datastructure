package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumOfLinkedListsTest extends LinkedListUtilTest{

    @Test
    public void TestCase1() {
        LinkedList ll1 = addMany(new LinkedList(2), new ArrayList<Integer>(Arrays.asList(4, 7, 1)));
        LinkedList ll2 = addMany(new LinkedList(9), new ArrayList<Integer>(Arrays.asList(4, 5)));
        LinkedList expected = addMany(new LinkedList(1), new ArrayList<Integer>(Arrays.asList(9, 2, 2)));
        var actual = new SumOfLinkedLists().sumOfLinkedLists(ll1, ll2);
        assertTrue(getNodesInArray(expected).equals(getNodesInArray(actual)));
    }

}