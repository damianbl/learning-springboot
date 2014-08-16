package pl.kubsoft.integration.controller;

import org.junit.Test;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.web.client.RestTemplate;
import pl.kubsoft.configuration.TestConfig;
import pl.kubsoft.integration.base.BaseIntegrationTest;

/**
 * Created by IntelliJ IDEA.
 * User: damian.blazejewski
 * Date: 2014-08-16
 */


public class MyControllerIntegrationTest extends BaseIntegrationTest {
    private static final String HELLO_FROM_MY_CONTROLLER = "Hello from MyController";
    private static final String HTTP_LOCALHOST = TestConfig.PROTOCOL + TestConfig.HOST + ":" + TestConfig.PORT + "/";

    @Test
    public void homeShouldReturnString() {
        RestTemplate restTemplate = new TestRestTemplate();
        String response = restTemplate.getForObject(HTTP_LOCALHOST, String.class);

        org.junit.Assert.assertEquals(response, HELLO_FROM_MY_CONTROLLER);
    }
}
