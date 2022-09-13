package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FindLoopTest extends LinkedListUtilTest{
    @Test
    public void TestCase1() {
        LinkedList test = new LinkedList(0);
        addMany(test, new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9});
        getNthNode(test,10).next = getNthNode(test,5);
        assertTrue(FindLoop.findLoop(test) == getNthNode(test,5));
    }




}