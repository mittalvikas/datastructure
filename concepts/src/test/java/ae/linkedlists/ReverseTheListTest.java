package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReverseTheListTest extends LinkedListUtilTest{

    @Test
    public void TestCase1() {
        LinkedList test = newLinkedList(new int[] {0, 1, 2, 3, 4, 5});
        List<Integer> result = getNodesInArray(ReverseTheList.reverseLinkedList(test));
        int[] expected = new int[] {5, 4, 3, 2, 1, 0};
        assertTrue(compare(result, expected));
    }



}