package server.serializers;

import java.util.Vector;

import server.models.User;

public class UserSerializer {
    public static String serialize(Vector<User> users){
        String result = "[";
        if (users.size() > 0) {
            for (User user : users)
                result += UserSerializer.serialize(user) + ",";
            result = result.substring(0, result.length() - 1);  
        }
        return result + "]";
    }

    public static String serialize(User user) {
        return String.format("{id: '%s', name: '%s', email: '%s'}", user.getId(), user.getName(), user.getEmail());
    }
}
