package ae.linkedlists;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListPalindromeTest {

    @Test
    public void TestCase1() {
        var head = new LinkedList(0);
        head.next = new LinkedList(1);
        head.next.next = new LinkedList(2);
        head.next.next.next = new LinkedList(2);
        head.next.next.next.next = new LinkedList(1);
        head.next.next.next.next.next = new LinkedList(0);
        var expected = true;
        var actual = new LinkedListPalindrome().linkedListPalindrome(head);
        assertTrue(expected == actual);
    }

}