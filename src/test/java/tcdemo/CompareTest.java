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

    public void test2_ignoreCase(){
        Assert.assertEquals(1, myComparer.compare("a", "A"));
    }

}
