package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ZipLinkedListTest extends LinkedListUtilTest {

    @Test
    public void TestCase1() {
        LinkedList head = new LinkedList(1);
        addMany(head,new int[] {2, 3, 4, 5, 6});
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(1, 6, 2, 5, 3, 4));
        var actual = getNodesInArray(new ZipLinkedList().zipLinkedList(head));
        assertTrue(expected.equals(actual));
    }


}