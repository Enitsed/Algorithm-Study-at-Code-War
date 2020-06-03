package programmerSkillCheck;

import org.junit.Test;

import static org.junit.Assert.*;

public class SummerCoding1Test {

    @Test
    public void solution() {
        assertEquals(2013, SummerCoding1.solution(1987));
        assertEquals(2016, SummerCoding1.solution(2015));
    }
}