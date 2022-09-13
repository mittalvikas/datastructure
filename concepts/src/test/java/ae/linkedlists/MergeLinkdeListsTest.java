package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergeLinkdeListsTest extends LinkedListUtilTest{

    @Test
    public void TestCase1() {
        LinkedList list1 = new LinkedList(2);
        addMany(list1, new ArrayList<Integer>(Arrays.asList(6, 7, 8)));
        LinkedList list2 = new LinkedList(1);
        addMany(list2, new ArrayList<Integer>(Arrays.asList(3, 4, 5, 9, 10)));
        LinkedList output = MergeLinkdeLists.mergeLinkedLists(list1, list2);
        List<Integer> expectedNodes =
                new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

}