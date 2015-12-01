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
	System.getProperties().store(System.out, "Hello");
    }

    public void myTest(){
        boolean isCaseSensitive = Boolean.getBoolean("caseSensitive");
        Assert.assertEquals(isCaseSensitive, myComparer.compare("a", "A") != 0);
    }

}
