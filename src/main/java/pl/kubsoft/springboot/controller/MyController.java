package pl.kubsoft.springboot.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * User: damian.blazejewski
 * Date: 2014-08-15
 */

@Controller
@EnableAutoConfiguration
public class MyController {

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello from MyController";
    }

}
