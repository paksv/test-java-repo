package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CompareTest {

    private LinuxPathComparer myComparer;

    @BeforeMethod
    public void setUp() throws java.io.IOException{
        myComparer = new LinuxPathComparer();
	    System.getProperties().store(System.out, "Hello");
    }

    public void myTest(){
/*
        final String val1 = "a";
        boolean isCaseSensitive = Boolean.getBoolean("caseSensitive");
        final String val2 = isCaseSensitive ? "a" : "A";
        Assert.assertEquals(0, myComparer.compare(val1, val2));
*/
    }

}
