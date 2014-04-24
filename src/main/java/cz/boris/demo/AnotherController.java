package cz.boris.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Boris on 23.4.2014.
 */

@RestController
public class AnotherController {

    @RequestMapping(value = "/another", method = RequestMethod.GET)
    public String data() {
        return "Another data";
    }

}
