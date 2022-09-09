package ae.heaps;

import org.junit.Test;

import static org.junit.Assert.*;

public class ContinousMedianTest {

    @Test
    public void TestCase1() {
        ContinousMedian handler = new ContinousMedian();
        handler.insert(5);
        handler.insert(10);
        assertTrue(handler.getMedian() == 7.5);
        handler.insert(100);
        assertTrue(handler.getMedian() == 10);
    }

}