package pl.kubsoft.integration.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;
import pl.kubsoft.configuration.TestConfig;
import pl.kubsoft.springboot.App;

/**
 * Created by IntelliJ IDEA.
 * User: damian.blazejewski
 * Date: 2014-08-16
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
@IntegrationTest("server.port:" + TestConfig.PORT)
public class MyControllerIntegrationTest {

    private static final String HELLO_FROM_MY_CONTROLLER = "Hello from MyController";
    private static final String HTTP_LOCALHOST = TestConfig.PROTOCOL + TestConfig.HOST + ":" + TestConfig.PORT + "/";

    @Test
    public void homeShouldReturnString() {
        RestTemplate restTemplate = new TestRestTemplate();
        String response = restTemplate.getForObject(HTTP_LOCALHOST, String.class);

        org.junit.Assert.assertEquals(response, HELLO_FROM_MY_CONTROLLER);
    }
}
