package cz.boris.data;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import java.util.List;

/**
 * Created by Boris on 23.4.2014.
 */
public class DatabaseMock {

    static class User {
        String name;
        String age;
    }

    public List<User> getUsers() {

        return null;
    }
}
