package leetcode.first;

import org.junit.Assert;
import org.junit.Test;
import test12.Fracts;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void romanToInt() {
        Assert.assertEquals(3, Solution.romanToInt("III"));
        Assert.assertEquals(4, Solution.romanToInt("IV"));
        Assert.assertEquals(9, Solution.romanToInt("IX"));
        Assert.assertEquals(58, Solution.romanToInt("LVIII"));
        Assert.assertEquals(1994, Solution.romanToInt("MCMXCIV"));
    }
}