package ae.graphs;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingleCycleCheckTest {
    @Test
    public void TestCase1() {
        assertTrue(SingleCycleCheck.hasSingleCycle(new int[] {2, 3, 1, -4, -4, 2}));
    }

}