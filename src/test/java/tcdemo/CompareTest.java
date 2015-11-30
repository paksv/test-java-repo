package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CompareTest {

    private LinuxPathComparer myComparer;

    @BeforeMethod
    public void setUp(){
        myComparer = new LinuxPathComparer();
    }

    public void test2_equals(){
        Assert.assertEquals(0, myComparer.compare("a", "a"));
    }
}
