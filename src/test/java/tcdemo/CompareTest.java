package tcdemo;

import junit.framework.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class CompareTest {

    private CompareAction myAction;

    @BeforeMethod
    public void setUp(){
        myAction = new CompareAction();
    }

}
