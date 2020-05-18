package test14;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NthSeriesTest {

    @Test
    public void seriesSum() {
        assertEquals("1.57", NthSeries.seriesSum(5));
        assertEquals("1.77", NthSeries.seriesSum(9));
        assertEquals("1.94", NthSeries.seriesSum(15));
    }
}