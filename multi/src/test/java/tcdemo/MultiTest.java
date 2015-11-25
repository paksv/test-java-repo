package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class MultiTest {

    public void test1(){
        // test
    }


    public void test2_fail(){

        Assert.assertEquals(4, 1);
    }
}
