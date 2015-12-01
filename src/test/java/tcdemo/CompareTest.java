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
	System.getProperties().store(System.out, "Hello");
    }

    public void test2_ignoreCase(){
        Assert.assertEquals(1, myComparer.compare("a", "A"));
    }

}
