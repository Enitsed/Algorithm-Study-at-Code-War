package test13;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class MakeComplementTest {

    @Test
    public void makeComplement() {
        Assert.assertEquals("TAACG", MakeComplement.makeComplement("ATTGC"));
        Assert.assertEquals("CATA", MakeComplement.makeComplement("GTAT"));
        Assert.assertEquals("TTTT", MakeComplement.makeComplement("AAAA"));
    }
}