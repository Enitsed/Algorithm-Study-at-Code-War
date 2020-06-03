package programmerHash;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindIncompleteOneTest {

    @Test
    public void solution() {
        assertEquals("leo", FindIncompleteOne.solution(new String[] {"leo", "kiki", "eden"}, new String[] {"kiki", "eden"}));
        assertEquals("vinko", FindIncompleteOne.solution(new String[] {"marina", "josipa", "nikola", "vinko", "filipa"}, new String[] {"marina", "josipa", "nikola", "filipa"}));
        assertEquals("mislav", FindIncompleteOne.solution(new String[] {"mislav", "stanko", "mislav", "ana"}, new String[] {"stanko", "ana", "mislav"}));
    }
}