package leetcode.second;

import leetcode.first.Solution;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void reverse() {
        Assert.assertEquals(321, ReverseInteger.reverse(123));
        Assert.assertEquals(-321, ReverseInteger.reverse(-123));
        Assert.assertEquals(21, ReverseInteger.reverse(120));
    }
}