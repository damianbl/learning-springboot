package pl.kubsoft.unit.controller;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.kubsoft.springboot.controller.MyController;

/**
 * Created by IntelliJ IDEA.
 * User: damian.blazejewski
 * Date: 2014-08-16
 */
public class MyControllerUnitTest {
    private static final String HELLO_FROM_MY_CONTROLLER = "Hello from MyController";
    private MyController sut;

    @Before
    public void before() {
        sut = new MyController();
    }

    @Test
    public void homeShouldReturnString() {
        Assert.assertEquals(sut.home(), HELLO_FROM_MY_CONTROLLER);
    }
}
