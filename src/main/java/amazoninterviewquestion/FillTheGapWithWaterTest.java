package amazoninterviewquestion;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FillTheGapWithWaterTest {

    @Test
    public void checkIfPossible() {
        Assert.assertEquals(6, FillTheGapWithWater.checkIfPossible(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}