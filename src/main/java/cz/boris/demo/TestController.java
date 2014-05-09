package cz.boris.demo;

import cz.boris.data.DatabaseMock;
import cz.boris.data.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Boris on 22.4.2014.
 */

@RestController
public class TestController {

    public static final String TEST = "/test";
    public static final String USERS = "/users";

    @Autowired
    DatabaseMock databaseMock;

    @RequestMapping(value= TEST, method= RequestMethod.GET)
    public TestModel model() {
        TestModel td = new TestModel();
        td.setAmount(100);
        td.setName("Apple Mac Book");
        return td;
    }

    @RequestMapping(value = USERS, method = RequestMethod.GET)
    public List<User> users() {
        return databaseMock.getUsers();
    }
}
