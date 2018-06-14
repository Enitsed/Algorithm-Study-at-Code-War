package test10;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SolutionTest {
    @Test
  public void sampleTests() {
    assertEquals(Long.valueOf(42L), PaperFolder.fold(new Double(384000000)));
    assertEquals(Long.valueOf(0L), PaperFolder.fold(new Double(0.00005)));
  }
}