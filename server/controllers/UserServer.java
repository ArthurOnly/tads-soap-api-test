package server.controllers;

import javax.jws.WebService;

import server.interfaces.IUserServer;
import server.models.User;
import server.serializers.UserSerializer;

@WebService(endpointInterface = "server.interfaces.IUserServer")
public class UserServer implements IUserServer {

    @Override
    public String index() {
        return UserSerializer.serialize(User.users);
    }

    @Override
    public String create(String nome, String email) {
        User user = new User(nome, email);
        User.users.add(user);
        return UserSerializer.serialize(user);
    }

    @Override
    public String delete(int id) {
        User toDelete = null;
        for (User user : User.users){
            if (user.getId() == id) {
                toDelete = user;
                break;
            }
        }
        if (toDelete != null) {
            User.users.remove(toDelete);
            return "Removido";
        }
        return "Não encontrado";
    }


}