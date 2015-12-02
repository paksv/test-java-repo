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
    }

    public void myTest(){
        Assert.fail("I'm failing");
        boolean isCaseSensitive = Boolean.getBoolean("caseSensitive");
        final int compareResult = myComparer.compare("a", "A");
        System.out.printf("isCaseSensitive: %b, compareResult: %d", isCaseSensitive, compareResult);
        Assert.assertEquals(isCaseSensitive, compareResult != 0);
    }

}
