package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CompareTest {

    private WindowsPathComparer myComparer;

    @BeforeMethod
    public void setUp() throws java.io.IOException{
        myComparer = new WindowsPathComparer();
    }

    public void myTest(){
        Assert.fail("haha");
        boolean isCaseSensitive = Boolean.getBoolean("caseSensitive");
        final int compareResult = myComparer.compare("a", "A");
        System.out.printf("isCaseSensitive: %b, compareResult: %d", isCaseSensitive, compareResult);
        Assert.assertEquals(isCaseSensitive, compareResult != 0);
    }

}
