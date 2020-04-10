package programmerSkillCheck;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question1Test {

    @Test
    public void solution() {
        Assert.assertArrayEquals(new int[] {5,4,3,2,1}, Question1.solution(12345));
    }
}