package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CompareTest {

    private WindowsPathComparer myComparer;

    @BeforeMethod
    public void setUp(){
        myComparer = new WindowsPathComparer();
    }

    public void test2_ignoreCase(){
        Assert.assertEquals(0, myComparer.compare("a", "A"));
    }

}
