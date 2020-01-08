package test12;

import org.junit.Assert;
import org.junit.Test;


public class FractsTest {
    @Test
    public void test_fractions() throws Exception {
        long[][] lst;
        lst = new long[][] { {1, 2}, {1, 3}, {1, 4} };
        Assert.assertEquals("(6,12)(4,12)(3,12)", Fracts.convertFrac(lst));
    }
}
