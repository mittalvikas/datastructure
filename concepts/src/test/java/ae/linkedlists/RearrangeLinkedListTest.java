package ae.linkedlists;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class RearrangeLinkedListTest extends LinkedListUtilTest{

    @Test
    public void TestCase1() {
        var head = new LinkedList(3);
        head.next = new LinkedList(0);
        head.next.next = new LinkedList(5);
        head.next.next.next = new LinkedList(2);
        head.next.next.next.next = new LinkedList(1);
        head.next.next.next.next.next = new LinkedList(4);
        var result = RearrangeLinkedList.rearrangeLinkedList(head, 3);
        var array = getNodesInArray(result);

        var expected = Arrays.asList(new Integer[] {0, 2, 1, 3, 5, 4});
        assertTrue(expected.equals(array));
    }

}