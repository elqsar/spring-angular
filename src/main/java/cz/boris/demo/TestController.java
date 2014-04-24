package cz.boris.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Boris on 22.4.2014.
 */

@RestController
public class TestController {

    public static final String TEST = "/test";
    public static final String FOO = "/foo";

    @RequestMapping(value= TEST, method= RequestMethod.GET)
    public TestModel model() {
        TestModel td = new TestModel();
        td.setAmount(100);
        td.setName("Apple Mac Book");
        return td;
    }

    @RequestMapping(value = FOO, method = RequestMethod.GET)
    public String test() {
        return "Test";
    }
}
