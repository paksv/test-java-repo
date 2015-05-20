package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.Test;

@Test
public class DemoTest {
    public void test1(){
        // test
    }

    public void test2_fail(){
        Assert.fail();
    }
}
