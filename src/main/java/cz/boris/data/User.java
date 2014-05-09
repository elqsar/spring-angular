package cz.boris.data;

/**
 * Created by Boris on 24.4.2014.
 */
public class User {

    String name;
    String password;
    int points;

    User(String name, String password, int points) {
        this.name = name;
        this.password = password;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
}
