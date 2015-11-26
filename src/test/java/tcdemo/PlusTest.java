package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class PlusTest {

    private PlusAction myAction;

    @BeforeMethod
    public void setUp(){
        myAction = new PlusAction();
    }

    public void test2_plus_2(){
        Assert.assertEquals(4, myAction.action(2, 2));
    }


    public void test2_plus_3(){
        Assert.assertEquals(4, myAction.action(2, 3));
    }
}
