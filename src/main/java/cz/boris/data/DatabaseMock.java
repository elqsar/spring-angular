package cz.boris.data;

import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.util.concurrent.ListenableFutureTask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Boris on 23.4.2014.
 */
@Service
public class DatabaseMock {

    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Boris", "111", 0));
        users.add(new User("Sebik", "222", 0));
        users.add(new User("Ilonka", "333", 0));
        return users;
    }
}
