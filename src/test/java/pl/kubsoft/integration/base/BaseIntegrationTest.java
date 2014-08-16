package pl.kubsoft.integration.base;

import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
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
public class BaseIntegrationTest {
}
