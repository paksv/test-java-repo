package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class MultiTest {

    private MultiAction myAction;

    @BeforeMethod
    public void setUp(){
        myAction = new MultiAction();
    }

    public void test2_multi_2(){
        Assert.assertEquals(4, myAction.action(2, 2));
    }

    public void test2_multi_3(){
        Assert.assertEquals(4, myAction.action(2, 3));
    }
}
