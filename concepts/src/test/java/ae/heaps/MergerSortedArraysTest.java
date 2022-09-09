package ae.heaps;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MergerSortedArraysTest {
    @Test
    public void TestCase1() {
        List<List<Integer>> arrays = new ArrayList<List<Integer>>();
        arrays.add(Arrays.asList(new Integer[] {1, 5, 9, 21}));
        arrays.add(Arrays.asList(new Integer[] {-1, 0}));
        arrays.add(Arrays.asList(new Integer[] {-124, 81, 121}));
        arrays.add(Arrays.asList(new Integer[] {3, 6, 12, 20, 150}));
        var actual = MergerSortedArrays.mergeSortedArrays(arrays);
        var expected =
                Arrays.asList(new Integer[] {-124, -1, 0, 1, 3, 5, 6, 9, 12, 20, 21, 81, 121, 150});
        assertTrue(actual.equals(expected));
    }
}