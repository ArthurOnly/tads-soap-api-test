package server.models;

import java.util.Vector;

public class User {
    private static int numUsers = 1;
    public static Vector<User> users = new Vector<User>();

    private int id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.id = numUsers += 1;
        this.name = name;
        this.email = email;
    }
    
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
}
