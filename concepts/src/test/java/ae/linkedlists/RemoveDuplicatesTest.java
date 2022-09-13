package ae.linkedlists;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class RemoveDuplicatesTest extends LinkedListUtilTest {


    @Test
    public void TestCase1() {
        LinkedList input = new LinkedList(1);
        addMany(input, new ArrayList<Integer>(Arrays.asList(1, 3, 4, 4, 4, 5, 6, 6)));
        List<Integer> expectedNodes = new ArrayList<Integer>(Arrays.asList(1, 3, 4, 5, 6));
        LinkedList output = new RemoveDuplicates().removeDuplicatesFromLinkedList(input);
        assertTrue(getNodesInArray(output).equals(expectedNodes));
    }

}